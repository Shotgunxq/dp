package benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import benchmark.ShippingPolicy.LockerShipping;
import benchmark.ShippingPolicy.StandardShipping;
import org.junit.jupiter.api.Test;

/** Hand-written reference suite (human baseline) for {@link ShippingPolicy} and its subclasses. */
class ShippingPolicyReferenceTest {

    private static final double D = 0.0001;

    private final ShippingPolicy standard = new StandardShipping();
    private final ShippingPolicy locker = new LockerShipping();

    @Test
    void namesAndDefaults() {
        assertEquals("standard", standard.getName());
        assertEquals("locker", locker.getName());
    }

    @Test
    void standardFlatRateUpToTwoKilograms() {
        assertEquals(4.90, standard.shippingCost(50, 0, false), D);
        assertEquals(4.90, standard.shippingCost(50, 2.0, false), D);
        assertEquals(6.40, standard.shippingCost(50, 2.1, false), D);
        assertEquals(6.40, standard.shippingCost(50, 3.0, false), D);
        assertEquals(7.90, standard.shippingCost(50, 3.01, false), D);
    }

    @Test
    void standardExpressDoublesTheRate() {
        assertEquals(9.80, standard.shippingCost(50, 1, true), D);
        assertEquals(27.80, standard.shippingCost(50, 7.5, true), D);
    }

    @Test
    void freeShippingFromThresholdUnlessExpress() {
        assertEquals(0.0, standard.shippingCost(100, 30, false), D);
        assertEquals(4.90, standard.shippingCost(99.99, 1, false), D);
        assertEquals(93.80, standard.shippingCost(100, 30, true), D);
        assertEquals(0.0, locker.shippingCost(99.99 + 0.01, 10, false), D);
    }

    @Test
    void lockerRatesAndSmallerExpressFactor() {
        assertEquals(2.90, locker.shippingCost(50, 5.0, false), D);
        assertEquals(3.90, locker.shippingCost(50, 5.01, false), D);
        assertEquals(5.85, locker.shippingCost(50, 5.01, true), D);
        assertEquals(4.35, locker.shippingCost(50, 1, true), D);
    }

    @Test
    void weightLimitsPerPolicy() {
        assertEquals(0.0, standard.shippingCost(100, 30.0, false), D);
        assertThrows(IllegalArgumentException.class, () -> standard.shippingCost(100, 30.01, false));
        assertEquals(3.90, locker.shippingCost(50, 10.0, false), D);
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> locker.shippingCost(50, 10.01, false));
        assertEquals("too heavy for locker: 10.01 kg", e.getMessage());
    }

    @Test
    void negativeInputsAreRejected() {
        assertThrows(IllegalArgumentException.class, () -> standard.shippingCost(-0.01, 1, false));
        assertThrows(IllegalArgumentException.class, () -> standard.shippingCost(10, -1, false));
    }

    @Test
    void customSubclassUsesTheTemplate() {
        ShippingPolicy drone = new ShippingPolicy("drone") {
            @Override
            protected double baseRate(double weightKg) {
                return 20.0;
            }

            @Override
            protected double maxWeightKg() {
                return 2.0;
            }

            @Override
            protected double expressFactor() {
                return 1.0;
            }
        };
        assertEquals("drone", drone.getName());
        assertEquals(20.0, drone.shippingCost(10, 1, false), D);
        assertEquals(20.0, drone.shippingCost(10, 1, true), D);
        assertEquals(0.0, drone.shippingCost(100, 1, false), D);
        assertThrows(IllegalArgumentException.class, () -> drone.shippingCost(10, 2.5, false));
    }

    @Test
    void subclassNameIsRequired() {
        assertThrows(IllegalArgumentException.class, () -> new ShippingPolicy(null) {
            @Override
            protected double baseRate(double weightKg) {
                return 0;
            }
        });
        assertThrows(IllegalArgumentException.class, () -> new ShippingPolicy("") {
            @Override
            protected double baseRate(double weightKg) {
                return 0;
            }
        });
    }
}
