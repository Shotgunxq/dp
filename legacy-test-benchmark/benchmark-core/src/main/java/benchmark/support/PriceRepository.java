package benchmark.support;

/** Source of product prices. Returns -1 for an unknown product (legacy sentinel value). */
public interface PriceRepository {

    double priceOf(String productId);
}
