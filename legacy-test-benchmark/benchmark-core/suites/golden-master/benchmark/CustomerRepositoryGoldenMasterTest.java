package benchmark;

import static benchmark.GoldenMaster.call;
import static benchmark.GoldenMaster.combinations;
import static benchmark.GoldenMaster.verify;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import benchmark.CustomerRepository.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * B1 golden master for {@link CustomerRepository}.
 * Without seams, the "database" has to be provided: the DAO is redirected to an in-memory H2
 * database with a fixed data set that is rebuilt before every scenario. The SQLException
 * message inside DataAccessException is not recorded, because it belongs to the driver.
 */
class CustomerRepositoryGoldenMasterTest {

    private static final String URL = "jdbc:h2:mem:customers_gm;DB_CLOSE_DELAY=-1";

    private final CustomerRepository repository = new CustomerRepository();
    private Connection keepAlive;

    @BeforeEach
    void setUp() throws SQLException {
        System.setProperty(CustomerRepository.URL_PROPERTY, URL);
        keepAlive = DriverManager.getConnection(URL);
        rebuild();
    }

    @AfterEach
    void tearDown() throws SQLException {
        try (Statement s = keepAlive.createStatement()) {
            s.execute("DROP TABLE IF EXISTS CUSTOMER");
        }
        keepAlive.close();
        System.clearProperty(CustomerRepository.URL_PROPERTY);
    }

    private void rebuild() throws SQLException {
        try (Statement s = keepAlive.createStatement()) {
            s.execute("DROP TABLE IF EXISTS CUSTOMER");
            s.execute("CREATE TABLE CUSTOMER (ID BIGINT PRIMARY KEY, NAME VARCHAR(100) NOT NULL, "
                    + "STATUS VARCHAR(20) NOT NULL, CREDIT_LIMIT INT NOT NULL)");
            s.execute("INSERT INTO CUSTOMER VALUES (1, 'Zoe', 'ACTIVE', 1000), (2, 'Adam', 'ACTIVE', 5000), "
                    + "(3, 'Mia', 'BLOCKED', 9000), (4, 'Bob', 'ACTIVE', 500), (5, 'Eve', 'NEW', 0)");
        }
    }

    @Test
    void reads() {
        StringBuilder out = new StringBuilder();
        out.append(combinations(a -> repository.findById((Long) a[0]), new Long[] {-1L, 0L, 1L, 3L, 5L, 6L, 999L}));
        out.append(combinations(a -> repository.findActiveWithCreditAtLeast((Integer) a[0]),
                new Integer[] {-1, 0, 500, 501, 1000, 5000, 5001}));
        out.append(combinations(a -> repository.countByStatus((String) a[0]),
                new String[] {null, "", "ACTIVE", "active", "Blocked", "NEW", "GONE", "x' OR '1'='1"}));
        verify(getClass(), "reads", out.toString());
    }

    @Test
    void writes() throws SQLException {
        StringBuilder out = new StringBuilder();
        Object[][] customers = {
            {null}, {new Customer(10, "Nora", null, 250)}, {new Customer(10, "  Nora ", "ACTIVE", 250)},
            {new Customer(1, "Dup", "NEW", 1)}, {new Customer(11, "", "NEW", 1)}, {new Customer(12, "Neg", "NEW", -1)}};
        for (Object[] c : customers) {
            rebuild();
            Customer customer = (Customer) c[0];
            out.append("save(").append(customer).append(") => ").append(call(() -> repository.save(customer)));
            if (customer != null) {
                out.append(" | stored=").append(call(() -> repository.findById(customer.getId())));
            }
            out.append('\n');
        }
        for (int percent : new int[] {-5, 0, 1, 10, 100, 101}) {
            rebuild();
            out.append("raiseCreditForActive(").append(percent).append(") => ")
                    .append(call(() -> repository.raiseCreditForActive(percent)))
                    .append(" | active=").append(call(() -> repository.findActiveWithCreditAtLeast(0))).append('\n');
        }
        verify(getClass(), "writes", out.toString());
    }

    @Test
    void databaseProblems() throws SQLException {
        StringBuilder out = new StringBuilder();
        try (Statement s = keepAlive.createStatement()) {
            s.execute("DROP TABLE CUSTOMER");
        }
        out.append("no table: findById => ").append(type(call(() -> repository.findById(1)))).append('\n');
        out.append("no table: count => ").append(type(call(() -> repository.countByStatus("ACTIVE")))).append('\n');
        System.setProperty(CustomerRepository.URL_PROPERTY, "jdbc:nosuchdriver://nowhere/db");
        out.append("bad url: findById => ").append(call(() -> repository.findById(1))).append('\n');
        verify(getClass(), "databaseProblems", out.toString());
    }

    /** Keeps only the exception type and the DAO's own message; driver texts vary between versions. */
    private static String type(String result) {
        int cut = result.indexOf(": ");
        return cut < 0 ? result : result.substring(0, result.indexOf(": ", cut + 2) < 0 ? result.length()
                : result.indexOf(": ", cut + 2));
    }
}
