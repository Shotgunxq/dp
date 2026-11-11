package benchmark.support;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Legacy "database" access. The constructor performs I/O against a fixed location, so
 * creating this object fails on any machine where the database is not available.
 *
 * <p>The location can only be changed through a global system property, which is
 * exactly the kind of hidden, global configuration typical for legacy code.
 */
public class DatabasePriceRepository implements PriceRepository {

    public static final String LOCATION_PROPERTY = "benchmark.prices.file";
    public static final String DEFAULT_LOCATION = "/opt/legacy-shop/prices.csv";

    private final Map<String, Double> prices = new HashMap<String, Double>();

    public DatabasePriceRepository() {
        Path file = Paths.get(System.getProperty(LOCATION_PROPERTY, DEFAULT_LOCATION));
        List<String> lines;
        try {
            lines = Files.readAllLines(file, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new UncheckedIOException("price database unavailable: " + file, e);
        }
        for (String line : lines) {
            String trimmed = line.trim();
            if (trimmed.isEmpty() || trimmed.startsWith("#")) {
                continue;
            }
            String[] parts = trimmed.split(",");
            if (parts.length != 2) {
                continue; // legacy behaviour: malformed rows are silently ignored
            }
            prices.put(parts[0].trim(), Double.valueOf(parts[1].trim()));
        }
    }

    @Override
    public double priceOf(String productId) {
        Double price = prices.get(productId);
        return price == null ? -1 : price.doubleValue();
    }
}
