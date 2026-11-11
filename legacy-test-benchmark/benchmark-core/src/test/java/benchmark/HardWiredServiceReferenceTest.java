package benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import benchmark.support.AuditLog;
import benchmark.support.DatabasePriceRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Hand-written reference suite (human baseline) for {@link HardWiredService}.
 *
 * <p>Same scenarios as {@link InjectedServiceReferenceTest}, but without seams the test has
 * to create a real price file, redirect the "database" through a global system property and
 * reset a global singleton. This extra set-up is the cost of the hard-wired design.
 */
class HardWiredServiceReferenceTest {

    private final HardWiredService service = new HardWiredService();
    private Path pricesFile;

    @BeforeEach
    void setUp() throws IOException {
        pricesFile = Files.createTempFile("prices", ".csv");
        Files.write(pricesFile, Arrays.asList(
                "# product,price",
                "P1,10.0",
                "P2, 20",
                "FREE,0",
                "ODD,0.333",
                "",
                "broken row without price"), StandardCharsets.UTF_8);
        System.setProperty(DatabasePriceRepository.LOCATION_PROPERTY, pricesFile.toString());
        AuditLog.getInstance().clear();
    }

    @AfterEach
    void tearDown() throws IOException {
        System.clearProperty(DatabasePriceRepository.LOCATION_PROPERTY);
        AuditLog.getInstance().clear();
        Files.deleteIfExists(pricesFile);
    }

    @Test
    void singleItemIncludesVat() {
        assertEquals(12.0, service.finalPrice("P1", 1, false), 0.0001);
        List<String> entries = AuditLog.getInstance().getEntries();
        assertEquals(1, entries.size());
        assertTrue(entries.get(0).endsWith(" PRICE P1 x1 = 12.0"));
    }

    @Test
    void volumeDiscountStartsAtTenItems() {
        assertEquals(216.0, service.finalPrice("P2", 9, false), 0.0001);
        assertEquals(216.0, service.finalPrice("P2", 10, false), 0.0001);
        assertEquals(237.6, service.finalPrice("P2", 11, false), 0.0001);
    }

    @Test
    void vipDiscount() {
        assertEquals(11.4, service.finalPrice("P1", 1, true), 0.0001);
    }

    @Test
    void vipAndVolumeDiscountCombine() {
        assertEquals(102.6, service.finalPrice("P1", 10, true), 0.0001);
    }

    @Test
    void resultIsRoundedToCents() {
        assertEquals(0.4, service.finalPrice("ODD", 1, false), 0.0001);
    }

    @Test
    void zeroPriceIsAllowed() {
        assertEquals(0.0, service.finalPrice("FREE", 3, false), 0.0001);
    }

    @Test
    void rejectsInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> service.finalPrice(null, 1, false));
        assertThrows(IllegalArgumentException.class, () -> service.finalPrice("", 1, false));
        assertThrows(IllegalArgumentException.class, () -> service.finalPrice("P1", 0, false));
        assertTrue(AuditLog.getInstance().getEntries().isEmpty());
    }

    @Test
    void unknownProductAndMalformedRows() {
        IllegalStateException e = assertThrows(IllegalStateException.class,
                () -> service.finalPrice("NOPE", 1, false));
        assertEquals("unknown product: NOPE", e.getMessage());
        assertThrows(IllegalStateException.class,
                () -> service.finalPrice("broken row without price", 1, false));
    }

    @Test
    void failsWhenDatabaseIsUnavailable() {
        System.setProperty(DatabasePriceRepository.LOCATION_PROPERTY,
                pricesFile.resolveSibling("does-not-exist-" + System.nanoTime()).toString());
        assertThrows(UncheckedIOException.class, () -> service.finalPrice("P1", 1, false));
    }
}
