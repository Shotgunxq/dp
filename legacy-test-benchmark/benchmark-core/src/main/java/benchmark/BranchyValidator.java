package benchmark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * B02 - High cyclomatic complexity, low nesting.
 *
 * <p>A flat sequence of independent guard clauses. Cyclomatic complexity is deliberately
 * close to {@link NestedRules}, but cognitive complexity is much lower because nothing is
 * nested. Several branches need exact string constants ("SK", "US", the "X" prefix),
 * which is hard for purely random input generation.
 */
public class BranchyValidator {

    public static final int MAX_QUANTITY = 1000;
    public static final double SUSPICIOUS_PRICE = 10000.0;

    private static final Set<String> SUPPORTED_COUNTRIES = Collections.unmodifiableSet(
            new HashSet<String>(Arrays.asList("SK", "CZ", "HU", "AT", "DE", "PL", "US")));

    /** Returns a list of error codes; an empty list means the order is valid. */
    public List<String> validate(String customerId, int quantity, double unitPrice,
                                 String countryCode, boolean express) {
        List<String> errors = new ArrayList<String>();
        if (customerId == null) {
            errors.add("CUSTOMER_MISSING");
        }
        if (customerId != null && customerId.length() != 8) {
            errors.add("CUSTOMER_FORMAT");
        }
        if (customerId != null && customerId.startsWith("X")) {
            errors.add("CUSTOMER_BLOCKED");
        }
        if (quantity <= 0) {
            errors.add("QUANTITY_TOO_LOW");
        }
        if (quantity > MAX_QUANTITY) {
            errors.add("QUANTITY_TOO_HIGH");
        }
        if (unitPrice <= 0) {
            errors.add("PRICE_NOT_POSITIVE");
        }
        if (unitPrice > SUSPICIOUS_PRICE) {
            errors.add("PRICE_SUSPICIOUS");
        }
        if (countryCode == null) {
            errors.add("COUNTRY_MISSING");
        }
        if (countryCode != null && !SUPPORTED_COUNTRIES.contains(countryCode)) {
            errors.add("COUNTRY_UNSUPPORTED");
        }
        if (express && "US".equals(countryCode)) {
            errors.add("EXPRESS_UNAVAILABLE");
        }
        if (express && quantity > 100) {
            errors.add("EXPRESS_TOO_LARGE");
        }
        return errors;
    }

    public boolean isValid(String customerId, int quantity, double unitPrice,
                           String countryCode, boolean express) {
        return validate(customerId, quantity, unitPrice, countryCode, express).isEmpty();
    }
}
