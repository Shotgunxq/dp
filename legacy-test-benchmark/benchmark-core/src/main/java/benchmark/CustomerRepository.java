package benchmark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * B15 - Legacy JDBC data access.
 *
 * <p>A classic DAO: it opens its own connection through {@link DriverManager} with a URL from a
 * system property, builds SQL by string concatenation in one place, maps {@link ResultSet} rows by
 * hand and wraps every {@link SQLException} in an unchecked exception. There is no connection
 * pool, no injected data source and no interface. Testing it means either mocking the JDBC
 * classes or providing a real database at the configured URL.
 */
public class CustomerRepository {

    public static final String URL_PROPERTY = "benchmark.jdbc.url";
    public static final String DEFAULT_URL = "jdbc:legacy://db.internal:1521/CRM";

    /** A customer row. */
    public static final class Customer {
        private final long id;
        private final String name;
        private final String status;
        private final int creditLimit;

        public Customer(long id, String name, String status, int creditLimit) {
            this.id = id;
            this.name = name;
            this.status = status;
            this.creditLimit = creditLimit;
        }

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getStatus() {
            return status;
        }

        public int getCreditLimit() {
            return creditLimit;
        }

        @Override
        public String toString() {
            return "Customer{" + id + ", " + name + ", " + status + ", " + creditLimit + "}";
        }
    }

    /** Thrown for any database problem; the SQLException is the cause. */
    public static class DataAccessException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        public DataAccessException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    private Connection connect() {
        String url = System.getProperty(URL_PROPERTY, DEFAULT_URL);
        try {
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            throw new DataAccessException("cannot connect to " + url, e);
        }
    }

    /** Returns the customer, or null if there is no such id. */
    public Customer findById(long id) {
        if (id <= 0) {
            throw new IllegalArgumentException("id must be positive");
        }
        Connection connection = connect();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, NAME, STATUS, CREDIT_LIMIT FROM CUSTOMER WHERE ID = ?");
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return map(rs);
        } catch (SQLException e) {
            throw new DataAccessException("findById failed for " + id, e);
        } finally {
            close(connection);
        }
    }

    /** Active customers with at least the given credit limit, ordered by name. */
    public List<Customer> findActiveWithCreditAtLeast(int minCredit) {
        Connection connection = connect();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, NAME, STATUS, CREDIT_LIMIT FROM CUSTOMER "
                    + "WHERE STATUS = 'ACTIVE' AND CREDIT_LIMIT >= ? ORDER BY NAME");
            statement.setInt(1, minCredit);
            ResultSet rs = statement.executeQuery();
            List<Customer> result = new ArrayList<Customer>();
            while (rs.next()) {
                result.add(map(rs));
            }
            return result;
        } catch (SQLException e) {
            throw new DataAccessException("findActiveWithCreditAtLeast failed", e);
        } finally {
            close(connection);
        }
    }

    /** Inserts a customer and returns the number of affected rows (1). */
    public int save(Customer customer) {
        if (customer == null || customer.getName() == null || customer.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("customer with a name required");
        }
        if (customer.getCreditLimit() < 0) {
            throw new IllegalArgumentException("credit limit must not be negative");
        }
        Connection connection = connect();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO CUSTOMER (ID, NAME, STATUS, CREDIT_LIMIT) VALUES (?, ?, ?, ?)");
            statement.setLong(1, customer.getId());
            statement.setString(2, customer.getName().trim());
            statement.setString(3, customer.getStatus() == null ? "NEW" : customer.getStatus());
            statement.setInt(4, customer.getCreditLimit());
            return statement.executeUpdate();
        } catch (SQLException e) {
            throw new DataAccessException("save failed for " + customer.getName(), e);
        } finally {
            close(connection);
        }
    }

    /** Number of customers with the status; the status is concatenated into the SQL (legacy!). */
    public int countByStatus(String status) {
        if (status == null) {
            throw new IllegalArgumentException("status required");
        }
        Connection connection = connect();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(
                    "SELECT COUNT(*) FROM CUSTOMER WHERE STATUS = '" + status.toUpperCase() + "'");
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            throw new DataAccessException("countByStatus failed for " + status, e);
        } finally {
            close(connection);
        }
    }

    /** Raises the credit limit by the given percentage for all active customers; returns rows changed. */
    public int raiseCreditForActive(int percent) {
        if (percent <= 0 || percent > 100) {
            throw new IllegalArgumentException("percent must be between 1 and 100");
        }
        Connection connection = connect();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE CUSTOMER SET CREDIT_LIMIT = CREDIT_LIMIT + CREDIT_LIMIT * ? / 100 "
                    + "WHERE STATUS = 'ACTIVE'");
            statement.setInt(1, percent);
            return statement.executeUpdate();
        } catch (SQLException e) {
            throw new DataAccessException("raiseCreditForActive failed", e);
        } finally {
            close(connection);
        }
    }

    private static Customer map(ResultSet rs) throws SQLException {
        return new Customer(rs.getLong("ID"), rs.getString("NAME"), rs.getString("STATUS"),
                rs.getInt("CREDIT_LIMIT"));
    }

    private static void close(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            // legacy: closing problems are ignored
        }
    }
}
