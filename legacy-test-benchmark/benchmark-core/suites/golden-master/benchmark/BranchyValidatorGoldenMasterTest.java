package benchmark;

import static benchmark.GoldenMaster.combinations;
import static benchmark.GoldenMaster.verify;

import org.junit.jupiter.api.Test;

/**
 * B1 golden master for {@link BranchyValidator}.
 * Input rule: typical domain values + simple edge values, chosen without analysing branches
 * (e.g. no customer id starting with "X" - nothing tells a user that such ids are special).
 */
class BranchyValidatorGoldenMasterTest {

    private static final String[] CUSTOMERS = {null, "", "AB12", "AB123456", "ZZ999999"};
    private static final Integer[] QUANTITIES = {-1, 0, 1, 10, 500, 5000};
    private static final Double[] PRICES = {0.0, 9.99, 250.0, 50000.0};
    private static final String[] COUNTRIES = {null, "SK", "DE", "US", "FR"};
    private static final Boolean[] EXPRESS = {false, true};

    @Test
    void validate() {
        BranchyValidator validator = new BranchyValidator();
        verify(getClass(), "validate", combinations(
                a -> validator.validate((String) a[0], (Integer) a[1], (Double) a[2], (String) a[3], (Boolean) a[4]),
                CUSTOMERS, QUANTITIES, PRICES, COUNTRIES, EXPRESS));
    }

    @Test
    void isValid() {
        BranchyValidator validator = new BranchyValidator();
        verify(getClass(), "isValid", combinations(
                a -> validator.isValid((String) a[0], (Integer) a[1], (Double) a[2], (String) a[3], (Boolean) a[4]),
                CUSTOMERS, QUANTITIES, PRICES, COUNTRIES, EXPRESS));
    }
}
