package benchmark;

import static benchmark.GoldenMaster.call;
import static benchmark.GoldenMaster.combinations;
import static benchmark.GoldenMaster.verify;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import benchmark.support.AuditLog;
import benchmark.support.DatabasePriceRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * B1 golden master for {@link HardWiredService}.
 * Same inputs as the InjectedService golden master. Without seams, the "database" file has to
 * be created and redirected via a system property, and the global AuditLog has to be reset.
 * Audit timestamps are scrubbed, because they change on every run.
 */
class HardWiredServiceGoldenMasterTest {

    private Path pricesFile;

    @BeforeEach
    void setUp() throws IOException {
        pricesFile = Files.createTempFile("golden-prices", ".csv");
        Files.write(pricesFile, Arrays.asList("P1,10.0", "P2,20.5", "FREE,0"), StandardCharsets.UTF_8);
        System.setProperty(DatabasePriceRepository.LOCATION_PROPERTY, pricesFile.toString());
        AuditLog.getInstance().clear();
    }

    @AfterEach
    void tearDown() throws IOException {
        System.clearProperty(DatabasePriceRepository.LOCATION_PROPERTY);
        AuditLog.getInstance().clear();
        Files.deleteIfExists(pricesFile);
    }

    private static String priceWithAudit(String product, int quantity, boolean vip) {
        AuditLog.getInstance().clear();
        String result = call(() -> new HardWiredService().finalPrice(product, quantity, vip));
        List<String> audit = new ArrayList<String>();
        for (String entry : AuditLog.getInstance().getEntries()) {
            audit.add(entry.replaceFirst("^\\d+ ", "<TIME> "));   // scrub the timestamp
        }
        return result + " | audit=" + audit;
    }

    @Test
    void finalPrice() {
        verify(getClass(), "finalPrice", combinations(
                a -> priceWithAudit((String) a[0], (Integer) a[1], (Boolean) a[2]),
                new String[] {null, "", "P1", "P2", "FREE", "UNKNOWN"},
                new Integer[] {-1, 0, 1, 5, 10, 50},
                new Boolean[] {false, true}));
    }

    @Test
    void databaseUnavailable() {
        System.setProperty(DatabasePriceRepository.LOCATION_PROPERTY, "/does/not/exist/prices.csv");
        verify(getClass(), "databaseUnavailable",
                call(() -> new HardWiredService().finalPrice("P1", 1, false)) + "\n");
    }
}
