package benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/** Hand-written reference suite (human baseline) for {@link PureCalculator}. */
class PureCalculatorReferenceTest {

    private static final double DELTA = 0.0001;

    @Test
    void monthlyPaymentForShortLoan() {
        assertEquals(860.66, PureCalculator.monthlyPayment(10000, 6, 12), DELTA);
    }

    @Test
    void monthlyPaymentForMortgage() {
        assertEquals(898.09, PureCalculator.monthlyPayment(200000, 3.5, 360), DELTA);
    }

    @Test
    void monthlyPaymentWithZeroRateIsPrincipalDividedByMonths() {
        assertEquals(100.0, PureCalculator.monthlyPayment(1200, 0, 12), DELTA);
        assertEquals(333.33, PureCalculator.monthlyPayment(1000, 0, 3), DELTA);
    }

    @Test
    void monthlyPaymentRejectsInvalidArguments() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> PureCalculator.monthlyPayment(0, 5, 12));
        assertEquals("principal must be positive", e.getMessage());
        assertThrows(IllegalArgumentException.class, () -> PureCalculator.monthlyPayment(-1, 5, 12));

        e = assertThrows(IllegalArgumentException.class,
                () -> PureCalculator.monthlyPayment(1000, 5, 0));
        assertEquals("months must be positive", e.getMessage());

        e = assertThrows(IllegalArgumentException.class,
                () -> PureCalculator.monthlyPayment(1000, -0.1, 12));
        assertEquals("annual rate must not be negative", e.getMessage());
    }

    @Test
    void totalInterest() {
        assertEquals(327.92, PureCalculator.totalInterest(10000, 6, 12), DELTA);
        assertEquals(0.0, PureCalculator.totalInterest(1200, 0, 12), DELTA);
    }

    @Test
    void percentOfTruncatesTowardsZero() {
        assertEquals(30, PureCalculator.percentOf(200, 15));
        assertEquals(3, PureCalculator.percentOf(7, 50));
        assertEquals(-3, PureCalculator.percentOf(-7, 50));
    }

    @Test
    void percentOfAcceptsBoundaries() {
        assertEquals(0, PureCalculator.percentOf(55, 0));
        assertEquals(55, PureCalculator.percentOf(55, 100));
    }

    @Test
    void percentOfRejectsOutOfRangePercent() {
        assertThrows(IllegalArgumentException.class, () -> PureCalculator.percentOf(10, -1));
        assertThrows(IllegalArgumentException.class, () -> PureCalculator.percentOf(10, 101));
    }

    @Test
    void roundToCents() {
        assertEquals(12.34, PureCalculator.roundToCents(12.344), DELTA);
        assertEquals(12.35, PureCalculator.roundToCents(12.346), DELTA);
        assertEquals(-1.23, PureCalculator.roundToCents(-1.234), DELTA);
    }
}
