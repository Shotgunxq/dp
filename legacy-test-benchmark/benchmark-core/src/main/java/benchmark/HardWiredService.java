package benchmark;

import benchmark.support.AuditLog;
import benchmark.support.DatabasePriceRepository;

/**
 * B05 - Legacy design: dependencies are hard-wired.
 *
 * <p>Same business logic as {@link InjectedService}, but the price source is created with
 * {@code new} inside the method (and does file I/O in its constructor) and auditing goes
 * through a global singleton. Nothing can be replaced from a test without changing the
 * code, mocking constructors, or manipulating global state.
 *
 * <p>This class is also the input for the refactoring experiment: can a tool or an LLM
 * turn it into {@link InjectedService} without changing behaviour?
 */
public class HardWiredService {

    static final double VAT_RATE = 0.20;

    /** Final gross price including volume discount, VIP discount and VAT. */
    public double finalPrice(String productId, int quantity, boolean vipCustomer) {
        if (productId == null || productId.isEmpty()) {
            throw new IllegalArgumentException("productId required");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("quantity must be positive");
        }
        double unitPrice = new DatabasePriceRepository().priceOf(productId);
        if (unitPrice < 0) {
            throw new IllegalStateException("unknown product: " + productId);
        }
        double net = unitPrice * quantity;
        if (quantity >= 10) {
            net = net * 0.90;
        }
        if (vipCustomer) {
            net = net * 0.95;
        }
        double gross = Math.round(net * (1 + VAT_RATE) * 100.0) / 100.0;
        AuditLog.getInstance().record("PRICE " + productId + " x" + quantity + " = " + gross);
        return gross;
    }
}
