package benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import benchmark.support.AuditSink;
import benchmark.support.PriceRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Hand-written reference suite (human baseline) for {@link InjectedService}.
 *
 * <p>Uses simple hand-written fakes instead of a mocking library: because the dependencies
 * are injected, no special tooling is needed.
 */
class InjectedServiceReferenceTest {

    private final Map<String, Double> catalogue = new HashMap<String, Double>();
    private final List<String> auditMessages = new ArrayList<String>();
    private InjectedService service;

    @BeforeEach
    void setUp() {
        catalogue.put("P1", 10.0);
        catalogue.put("P2", 20.0);
        catalogue.put("FREE", 0.0);
        catalogue.put("ODD", 0.333);
        PriceRepository prices = id -> catalogue.containsKey(id) ? catalogue.get(id) : -1;
        AuditSink audit = auditMessages::add;
        service = new InjectedService(prices, audit);
    }

    @Test
    void constructorRejectsMissingDependencies() {
        assertThrows(IllegalArgumentException.class, () -> new InjectedService(null, m -> { }));
        assertThrows(IllegalArgumentException.class, () -> new InjectedService(id -> 1.0, null));
    }

    @Test
    void singleItemIncludesVat() {
        assertEquals(12.0, service.finalPrice("P1", 1, false), 0.0001);
        assertEquals(Collections.singletonList("PRICE P1 x1 = 12.0"), auditMessages);
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
        assertTrue(auditMessages.isEmpty());
    }

    @Test
    void unknownProduct() {
        IllegalStateException e = assertThrows(IllegalStateException.class,
                () -> service.finalPrice("NOPE", 1, false));
        assertEquals("unknown product: NOPE", e.getMessage());
        assertTrue(auditMessages.isEmpty());
    }
}
