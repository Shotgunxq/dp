package benchmark;

/**
 * B01 - Pure logic, few branches.
 *
 * <p>No dependencies, no state, no I/O. This is the "easy" case and serves as the
 * upper bound: every tool should reach (almost) full coverage here.
 */
public final class PureCalculator {

    private PureCalculator() {
    }

    /** Annuity loan: fixed monthly payment, rounded to cents. */
    public static double monthlyPayment(double principal, double annualRatePercent, int months) {
        if (principal <= 0) {
            throw new IllegalArgumentException("principal must be positive");
        }
        if (months <= 0) {
            throw new IllegalArgumentException("months must be positive");
        }
        if (annualRatePercent < 0) {
            throw new IllegalArgumentException("annual rate must not be negative");
        }
        if (annualRatePercent == 0) {
            return roundToCents(principal / months);
        }
        double monthlyRate = annualRatePercent / 100.0 / 12.0;
        double factor = Math.pow(1 + monthlyRate, months);
        return roundToCents(principal * monthlyRate * factor / (factor - 1));
    }

    /** Total interest paid over the whole loan. */
    public static double totalInterest(double principal, double annualRatePercent, int months) {
        double payment = monthlyPayment(principal, annualRatePercent, months);
        return roundToCents(payment * months - principal);
    }

    /** Integer percentage, truncated towards zero. */
    public static int percentOf(int value, int percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("percent must be between 0 and 100");
        }
        return value * percent / 100;
    }

    public static double roundToCents(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
