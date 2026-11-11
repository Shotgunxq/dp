package benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

/** Hand-written reference suite (human baseline) for {@link BranchyValidator}. */
class BranchyValidatorReferenceTest {

    private static final String CUSTOMER = "AB123456";

    private final BranchyValidator validator = new BranchyValidator();

    private List<String> errors(String customer, int quantity, double price, String country,
                                boolean express) {
        return validator.validate(customer, quantity, price, country, express);
    }

    private static List<String> only(String code) {
        return Collections.singletonList(code);
    }

    @Test
    void validOrderHasNoErrors() {
        assertEquals(Collections.<String>emptyList(), errors(CUSTOMER, 5, 10.0, "SK", false));
        assertTrue(validator.isValid(CUSTOMER, 5, 10.0, "SK", false));
    }

    @Test
    void customerChecks() {
        assertEquals(only("CUSTOMER_MISSING"), errors(null, 5, 10.0, "SK", false));
        assertEquals(only("CUSTOMER_FORMAT"), errors("AB12345", 5, 10.0, "SK", false));
        assertEquals(only("CUSTOMER_FORMAT"), errors("AB1234567", 5, 10.0, "SK", false));
        assertEquals(only("CUSTOMER_BLOCKED"), errors("X1234567", 5, 10.0, "SK", false));
    }

    @Test
    void quantityBoundaries() {
        assertEquals(only("QUANTITY_TOO_LOW"), errors(CUSTOMER, 0, 10.0, "SK", false));
        assertTrue(errors(CUSTOMER, 1, 10.0, "SK", false).isEmpty());
        assertTrue(errors(CUSTOMER, BranchyValidator.MAX_QUANTITY, 10.0, "SK", false).isEmpty());
        assertEquals(only("QUANTITY_TOO_HIGH"),
                errors(CUSTOMER, BranchyValidator.MAX_QUANTITY + 1, 10.0, "SK", false));
    }

    @Test
    void priceBoundaries() {
        assertEquals(only("PRICE_NOT_POSITIVE"), errors(CUSTOMER, 5, 0.0, "SK", false));
        assertTrue(errors(CUSTOMER, 5, 0.01, "SK", false).isEmpty());
        assertTrue(errors(CUSTOMER, 5, 10000.0, "SK", false).isEmpty());
        assertEquals(only("PRICE_SUSPICIOUS"), errors(CUSTOMER, 5, 10000.01, "SK", false));
    }

    @Test
    void countryChecks() {
        assertEquals(only("COUNTRY_MISSING"), errors(CUSTOMER, 5, 10.0, null, false));
        assertEquals(only("COUNTRY_UNSUPPORTED"), errors(CUSTOMER, 5, 10.0, "FR", false));
        assertTrue(errors(CUSTOMER, 5, 10.0, "US", false).isEmpty());
    }

    @Test
    void expressChecks() {
        assertTrue(errors(CUSTOMER, 100, 10.0, "SK", true).isEmpty());
        assertEquals(only("EXPRESS_UNAVAILABLE"), errors(CUSTOMER, 5, 10.0, "US", true));
        assertEquals(only("EXPRESS_TOO_LARGE"), errors(CUSTOMER, 101, 10.0, "SK", true));
        assertTrue(errors(CUSTOMER, 101, 10.0, "SK", false).isEmpty());
    }

    @Test
    void multipleErrorsAreReportedInOrder() {
        assertEquals(
                Arrays.asList("CUSTOMER_MISSING", "QUANTITY_TOO_LOW", "PRICE_NOT_POSITIVE",
                        "COUNTRY_MISSING"),
                errors(null, 0, 0.0, null, false));
        assertFalse(validator.isValid(null, 0, 0.0, null, false));
    }
}
