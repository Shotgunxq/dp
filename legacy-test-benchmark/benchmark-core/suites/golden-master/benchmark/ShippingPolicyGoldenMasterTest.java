package benchmark;

import static benchmark.GoldenMaster.combinations;
import static benchmark.GoldenMaster.verify;

import org.junit.jupiter.api.Test;

/**
 * B1 golden master for {@link ShippingPolicy}.
 * Input rule: typical domain values + simple edge values, chosen without analysing branches.
 * Only the two shipped subclasses are exercised; a golden master records existing behaviour and
 * does not invent new subclasses.
 */
class ShippingPolicyGoldenMasterTest {

    private static final Double[] ORDER_VALUES = {-1.0, 0.0, 25.0, 99.99, 100.0, 500.0};
    private static final Double[] WEIGHTS = {-1.0, 0.0, 0.5, 2.0, 5.0, 10.0, 12.0, 30.0, 31.0};
    private static final Boolean[] EXPRESS = {false, true};

    @Test
    void standard() {
        ShippingPolicy policy = new ShippingPolicy.StandardShipping();
        verify(getClass(), "standard", "name=" + policy.getName() + "\n" + combinations(
                a -> policy.shippingCost((Double) a[0], (Double) a[1], (Boolean) a[2]),
                ORDER_VALUES, WEIGHTS, EXPRESS));
    }

    @Test
    void locker() {
        ShippingPolicy policy = new ShippingPolicy.LockerShipping();
        verify(getClass(), "locker", "name=" + policy.getName() + "\n" + combinations(
                a -> policy.shippingCost((Double) a[0], (Double) a[1], (Boolean) a[2]),
                ORDER_VALUES, WEIGHTS, EXPRESS));
    }
}
