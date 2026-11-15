package benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import benchmark.CustomerRepository.Customer;
import benchmark.CustomerRepository.DataAccessException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Hand-written reference suite (human baseline) for {@link CustomerRepository}.
 *
 * <p>The DAO opens its own connections from a system property, so the test redirects it to an
 * in-memory H2 database, creates the schema, and keeps one connection open so the database
 * survives between the DAO's connect/close cycles.
 */
class CustomerRepositoryReferenceTest {

    private static final String URL = "jdbc:h2:mem:customers_ref;DB_CLOSE_DELAY=-1";

    private final CustomerRepository repository = new CustomerRepository();
    private Connection keepAlive;

    @BeforeEach
    void setUpDatabase() throws SQLException {
        System.setProperty(CustomerRepository.URL_PROPERTY, URL);
        keepAlive = DriverManager.getConnection(URL);
        try (Statement s = keepAlive.createStatement()) {
            s.execute("DROP TABLE IF EXISTS CUSTOMER");
            s.execute("CREATE TABLE CUSTOMER (ID BIGINT PRIMARY KEY, NAME VARCHAR(100) NOT NULL, "
                    + "STATUS VARCHAR(20) NOT NULL, CREDIT_LIMIT INT NOT NULL)");
            s.execute("INSERT INTO CUSTOMER VALUES (1, 'Zoe', 'ACTIVE', 1000), (2, 'Adam', 'ACTIVE', 5000), "
                    + "(3, 'Mia', 'BLOCKED', 9000), (4, 'Bob', 'ACTIVE', 500), (5, 'Eve', 'NEW', 0)");
        }
    }

    @AfterEach
    void tearDown() throws SQLException {
        try (Statement s = keepAlive.createStatement()) {
            s.execute("DROP TABLE IF EXISTS CUSTOMER");
        }
        keepAlive.close();
        System.clearProperty(CustomerRepository.URL_PROPERTY);
    }

    @Test
    void findByIdMapsAllColumns() {
        Customer c = repository.findById(3);
        assertEquals(3L, c.getId());
        assertEquals("Mia", c.getName());
        assertEquals("BLOCKED", c.getStatus());
        assertEquals(9000, c.getCreditLimit());
        assertEquals("Customer{3, Mia, BLOCKED, 9000}", c.toString());
    }

    @Test
    void findByIdReturnsNullForUnknownAndRejectsNonPositive() {
        assertNull(repository.findById(999));
        assertThrows(IllegalArgumentException.class, () -> repository.findById(0));
        assertThrows(IllegalArgumentException.class, () -> repository.findById(-1));
    }

    @Test
    void findActiveWithCreditAtLeastFiltersAndOrdersByName() {
        List<Customer> all = repository.findActiveWithCreditAtLeast(0);
        assertEquals(3, all.size());
        assertEquals("Adam", all.get(0).getName());
        assertEquals("Bob", all.get(1).getName());
        assertEquals("Zoe", all.get(2).getName());
        List<Customer> rich = repository.findActiveWithCreditAtLeast(1000);
        assertEquals(2, rich.size());
        assertEquals("Adam", rich.get(0).getName());
        assertEquals("Zoe", rich.get(1).getName());
        assertTrue(repository.findActiveWithCreditAtLeast(5001).isEmpty());
    }

    @Test
    void saveInsertsTrimmedNameAndDefaultsStatus() {
        assertEquals(1, repository.save(new Customer(10, "  Nora ", null, 250)));
        Customer saved = repository.findById(10);
        assertEquals("Nora", saved.getName());
        assertEquals("NEW", saved.getStatus());
        assertEquals(250, saved.getCreditLimit());
        assertEquals(1, repository.save(new Customer(11, "Omar", "ACTIVE", 0)));
        assertEquals("ACTIVE", repository.findById(11).getStatus());
    }

    @Test
    void saveValidation() {
        assertThrows(IllegalArgumentException.class, () -> repository.save(null));
        assertThrows(IllegalArgumentException.class, () -> repository.save(new Customer(12, null, "NEW", 1)));
        assertThrows(IllegalArgumentException.class, () -> repository.save(new Customer(12, "  ", "NEW", 1)));
        assertThrows(IllegalArgumentException.class, () -> repository.save(new Customer(12, "X", "NEW", -1)));
    }

    @Test
    void saveDuplicateIdIsWrappedAsDataAccessException() {
        DataAccessException e = assertThrows(DataAccessException.class,
                () -> repository.save(new Customer(1, "Dup", "NEW", 1)));
        assertEquals("save failed for Dup", e.getMessage());
        assertTrue(e.getCause() instanceof SQLException);
    }

    @Test
    void countByStatusIsCaseInsensitiveViaUpperCase() {
        assertEquals(3, repository.countByStatus("ACTIVE"));
        assertEquals(3, repository.countByStatus("active"));
        assertEquals(1, repository.countByStatus("blocked"));
        assertEquals(0, repository.countByStatus("GONE"));
        assertThrows(IllegalArgumentException.class, () -> repository.countByStatus(null));
    }

    @Test
    void countByStatusIsOpenToSqlInjection() {
        // legacy behaviour documented, not endorsed: the status is concatenated into the SQL
        assertEquals(5, repository.countByStatus("x' OR '1'='1"));
    }

    @Test
    void raiseCreditForActiveUpdatesOnlyActiveRows() {
        assertEquals(3, repository.raiseCreditForActive(10));
        assertEquals(1100, repository.findById(1).getCreditLimit());
        assertEquals(5500, repository.findById(2).getCreditLimit());
        assertEquals(9000, repository.findById(3).getCreditLimit());
        assertEquals(550, repository.findById(4).getCreditLimit());
        assertEquals(0, repository.findById(5).getCreditLimit());
    }

    @Test
    void raiseCreditPercentBounds() {
        assertEquals(3, repository.raiseCreditForActive(1));
        assertEquals(3, repository.raiseCreditForActive(100));
        assertThrows(IllegalArgumentException.class, () -> repository.raiseCreditForActive(0));
        assertThrows(IllegalArgumentException.class, () -> repository.raiseCreditForActive(101));
    }

    @Test
    void missingTableIsWrappedAsDataAccessException() throws SQLException {
        try (Statement s = keepAlive.createStatement()) {
            s.execute("DROP TABLE CUSTOMER");
        }
        DataAccessException e = assertThrows(DataAccessException.class, () -> repository.findById(1));
        assertEquals("findById failed for 1", e.getMessage());
        assertThrows(DataAccessException.class, () -> repository.findActiveWithCreditAtLeast(0));
        assertThrows(DataAccessException.class, () -> repository.countByStatus("ACTIVE"));
        assertThrows(DataAccessException.class, () -> repository.raiseCreditForActive(5));
    }

    @Test
    void unreachableDatabaseIsWrappedAsDataAccessException() {
        System.setProperty(CustomerRepository.URL_PROPERTY, "jdbc:nosuchdriver://nowhere/db");
        DataAccessException e = assertThrows(DataAccessException.class, () -> repository.findById(1));
        assertEquals("cannot connect to jdbc:nosuchdriver://nowhere/db", e.getMessage());
    }
}
