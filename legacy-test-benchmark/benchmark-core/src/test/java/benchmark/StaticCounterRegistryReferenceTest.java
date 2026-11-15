package benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Hand-written reference suite (human baseline) for {@link StaticCounterRegistry}.
 * Every test resets the shared static state before and after; without that, the ids and
 * counts would depend on test order.
 */
class StaticCounterRegistryReferenceTest {

    @BeforeEach
    @AfterEach
    void resetSharedState() {
        StaticCounterRegistry.reset();
    }

    @Test
    void freshRegistryIsEmptyAndOpen() {
        assertEquals(0, StaticCounterRegistry.total());
        assertEquals(0, StaticCounterRegistry.countOf("A"));
        assertFalse(StaticCounterRegistry.isClosed());
        assertTrue(StaticCounterRegistry.hasRoom("A"));
        assertTrue(StaticCounterRegistry.history().isEmpty());
    }

    @Test
    void idsStartAtOneAndCountUpAcrossCategories() {
        assertEquals(1, StaticCounterRegistry.register("A"));
        assertEquals(2, StaticCounterRegistry.register("B"));
        assertEquals(3, StaticCounterRegistry.register("A"));
        assertEquals(2, StaticCounterRegistry.countOf("A"));
        assertEquals(1, StaticCounterRegistry.countOf("B"));
        assertEquals(3, StaticCounterRegistry.total());
        assertEquals(Arrays.asList("1:A", "2:B", "3:A"), StaticCounterRegistry.history());
    }

    @Test
    void categoryIsFullAfterMaxRegistrations() {
        for (int i = 0; i < StaticCounterRegistry.MAX_PER_CATEGORY; i++) {
            assertTrue(StaticCounterRegistry.hasRoom("A"));
            StaticCounterRegistry.register("A");
        }
        assertFalse(StaticCounterRegistry.hasRoom("A"));
        IllegalStateException e = assertThrows(IllegalStateException.class,
                () -> StaticCounterRegistry.register("A"));
        assertEquals("category full: A", e.getMessage());
        assertTrue(StaticCounterRegistry.hasRoom("B"));
        assertEquals(3, StaticCounterRegistry.total());
    }

    @Test
    void failedRegistrationDoesNotConsumeAnId() {
        StaticCounterRegistry.register("A");
        assertThrows(IllegalArgumentException.class, () -> StaticCounterRegistry.register(null));
        assertThrows(IllegalArgumentException.class, () -> StaticCounterRegistry.register("  "));
        assertEquals(2, StaticCounterRegistry.register("B"));
    }

    @Test
    void closedRegistryRejectsRegistrations() {
        StaticCounterRegistry.register("A");
        StaticCounterRegistry.close();
        assertTrue(StaticCounterRegistry.isClosed());
        assertFalse(StaticCounterRegistry.hasRoom("A"));
        IllegalStateException e = assertThrows(IllegalStateException.class,
                () -> StaticCounterRegistry.register("B"));
        assertEquals("registry closed", e.getMessage());
        assertEquals(Arrays.asList("1:A", "CLOSED"), StaticCounterRegistry.history());
        assertEquals(1, StaticCounterRegistry.total());
    }

    @Test
    void resetClearsEverything() {
        StaticCounterRegistry.register("A");
        StaticCounterRegistry.close();
        StaticCounterRegistry.reset();
        assertFalse(StaticCounterRegistry.isClosed());
        assertEquals(0, StaticCounterRegistry.total());
        assertEquals(1, StaticCounterRegistry.register("A"));
    }

    @Test
    void historyIsASnapshot() {
        StaticCounterRegistry.register("A");
        java.util.List<String> snapshot = StaticCounterRegistry.history();
        StaticCounterRegistry.register("A");
        assertEquals(1, snapshot.size());
        assertThrows(UnsupportedOperationException.class, () -> snapshot.add("x"));
    }
}
