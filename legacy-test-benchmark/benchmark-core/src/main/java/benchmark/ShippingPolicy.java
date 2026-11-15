package benchmark;

/**
 * B11 - Inheritance: an abstract base class with a template method, two concrete subclasses and
 * an overridden hook. The base class cannot be instantiated, so a tool has to pick (or write) a
 * subclass; some logic is reachable only through the subclasses' overrides, and one branch only
 * through an anonymous or custom subclass.
 */
public abstract class ShippingPolicy {

    public static final double FREE_SHIPPING_THRESHOLD = 100.0;

    private final String name;

    protected ShippingPolicy(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name required");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /** Template method: validation and free-shipping rule here, the rate in the subclass. */
    public final double shippingCost(double orderValue, double weightKg, boolean express) {
        if (orderValue < 0 || weightKg < 0) {
            throw new IllegalArgumentException("negative order value or weight");
        }
        if (weightKg > maxWeightKg()) {
            throw new IllegalArgumentException("too heavy for " + name + ": " + weightKg + " kg");
        }
        if (orderValue >= FREE_SHIPPING_THRESHOLD && !express) {
            return 0.0;
        }
        double cost = baseRate(weightKg);
        if (express) {
            cost = cost * expressFactor();
        }
        return Math.round(cost * 100.0) / 100.0;
    }

    /** Cost before the express surcharge. */
    protected abstract double baseRate(double weightKg);

    /** Heaviest parcel this policy accepts; subclasses may override. */
    protected double maxWeightKg() {
        return 30.0;
    }

    /** Express multiplier; subclasses may override. */
    protected double expressFactor() {
        return 2.0;
    }

    /** Flat rate up to 2 kg, then per started kilogram. */
    public static final class StandardShipping extends ShippingPolicy {

        public StandardShipping() {
            super("standard");
        }

        @Override
        protected double baseRate(double weightKg) {
            if (weightKg <= 2.0) {
                return 4.90;
            }
            return 4.90 + Math.ceil(weightKg - 2.0) * 1.50;
        }
    }

    /** Parcel lockers: cheap, light parcels only, smaller express surcharge. */
    public static final class LockerShipping extends ShippingPolicy {

        public LockerShipping() {
            super("locker");
        }

        @Override
        protected double baseRate(double weightKg) {
            return weightKg <= 5.0 ? 2.90 : 3.90;
        }

        @Override
        protected double maxWeightKg() {
            return 10.0;
        }

        @Override
        protected double expressFactor() {
            return 1.5;
        }
    }
}
