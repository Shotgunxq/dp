package benchmark;

/**
 * B03 - Deep nesting, high cognitive complexity.
 *
 * <p>Roughly the same number of decisions as {@link BranchyValidator}, but nested up to
 * four levels deep. Comparing B02 and B03 shows whether nesting (cognitive complexity)
 * hurts test generation more than the raw number of branches (cyclomatic complexity).
 */
public class NestedRules {

    public static final int BASE_PREMIUM = 500;

    /** Yearly car insurance premium in EUR. */
    public int premium(int age, boolean smoker, int claims, String vehicleType, boolean garage) {
        if (age < 18 || vehicleType == null) {
            throw new IllegalArgumentException("invalid applicant");
        }
        int premium = BASE_PREMIUM;
        if (age < 25) {
            if (smoker) {
                if (claims > 0) {
                    premium += 400;
                } else {
                    premium += 250;
                }
            } else {
                if (claims > 2) {
                    premium += 300;
                } else {
                    premium += 100;
                }
            }
        } else if (age > 70) {
            if (claims > 0) {
                if ("SPORT".equals(vehicleType)) {
                    premium += 500;
                } else {
                    premium += 200;
                }
            } else {
                premium += 80;
            }
        } else {
            if ("SPORT".equals(vehicleType)) {
                if (claims == 0) {
                    if (garage) {
                        premium += 50;
                    } else {
                        premium += 120;
                    }
                } else {
                    premium += 200 + 50 * claims;
                }
            } else if ("VAN".equals(vehicleType)) {
                if (garage) {
                    premium -= 30;
                } else {
                    premium += 40;
                }
            } else {
                if (claims > 3) {
                    premium += 150;
                } else if (smoker) {
                    premium += 20;
                }
            }
        }
        return premium;
    }
}
