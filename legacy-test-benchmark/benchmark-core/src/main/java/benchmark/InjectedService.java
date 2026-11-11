package benchmark;

import benchmark.support.AuditSink;
import benchmark.support.PriceRepository;

/**
 * B04 - Testable design: dependencies are passed in through the constructor.
 *
 * <p>The business logic is IDENTICAL to {@link HardWiredService}. Only the way the
 * dependencies are obtained differs, so any difference in test generation results between
 * B04 and B05 is caused by testability alone.
 */
public class InjectedService {

    static final double VAT_RATE = 0.20;

    private final PriceRepository prices;
    private final AuditSink audit;

    public InjectedService(PriceRepository prices, AuditSink audit) {
        if (prices == null || audit == null) {
            throw new IllegalArgumentException("dependencies must not be null");
        }
        this.prices = prices;
        this.audit = audit;
    }

    /** Final gross price including volume discount, VIP discount and VAT. */
    public double finalPrice(String productId, int quantity, boolean vipCustomer) {
        if (productId == null || productId.isEmpty()) {
            throw new IllegalArgumentException("productId required");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("quantity must be positive");
        }
        double unitPrice = prices.priceOf(productId);
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
        audit.record("PRICE " + productId + " x" + quantity + " = " + gross);
        return gross;
    }
}
