package benchmark;

import static benchmark.GoldenMaster.combinations;
import static benchmark.GoldenMaster.verify;

import org.junit.jupiter.api.Test;

/**
 * B1 golden master for {@link PureCalculator}.
 * Input rule (same for all classes): typical domain values + simple edge values
 * (null/empty, 0, negative, very large), chosen without analysing the code's branches.
 */
class PureCalculatorGoldenMasterTest {

    @Test
    void monthlyPayment() {
        verify(getClass(), "monthlyPayment", combinations(
                a -> PureCalculator.monthlyPayment((Double) a[0], (Double) a[1], (Integer) a[2]),
                new Double[] {-1.0, 0.0, 1000.0, 200000.0},
                new Double[] {-1.0, 0.0, 3.5, 12.0},
                new Integer[] {-1, 0, 1, 12, 360}));
    }

    @Test
    void totalInterest() {
        verify(getClass(), "totalInterest", combinations(
                a -> PureCalculator.totalInterest((Double) a[0], (Double) a[1], (Integer) a[2]),
                new Double[] {-1.0, 0.0, 1000.0, 200000.0},
                new Double[] {-1.0, 0.0, 3.5, 12.0},
                new Integer[] {-1, 0, 1, 12, 360}));
    }

    @Test
    void percentOf() {
        verify(getClass(), "percentOf", combinations(
                a -> PureCalculator.percentOf((Integer) a[0], (Integer) a[1]),
                new Integer[] {-7, 0, 7, 55, 200, Integer.MAX_VALUE},
                new Integer[] {-1, 0, 15, 50, 100, 101}));
    }

    @Test
    void roundToCents() {
        verify(getClass(), "roundToCents", combinations(
                a -> PureCalculator.roundToCents((Double) a[0]),
                new Double[] {-1.234, -0.005, 0.0, 0.004, 1.005, 12.344, 12.346, 99999.999}));
    }
}
