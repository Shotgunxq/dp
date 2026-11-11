package benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/** Hand-written reference suite (human baseline) for {@link NestedRules}. */
class NestedRulesReferenceTest {

    private final NestedRules rules = new NestedRules();

    @Test
    void rejectsMinorsAndMissingVehicle() {
        assertThrows(IllegalArgumentException.class, () -> rules.premium(17, false, 0, "CAR", false));
        assertThrows(IllegalArgumentException.class, () -> rules.premium(30, false, 0, null, false));
    }

    @Test
    void youngDrivers() {
        assertEquals(750, rules.premium(18, true, 0, "CAR", false));
        assertEquals(900, rules.premium(20, true, 1, "CAR", false));
        assertEquals(800, rules.premium(20, false, 3, "CAR", false));
        assertEquals(600, rules.premium(20, false, 2, "CAR", false));
        assertEquals(600, rules.premium(24, false, 0, "CAR", false));
    }

    @Test
    void seniorDrivers() {
        assertEquals(1000, rules.premium(71, false, 1, "SPORT", false));
        assertEquals(700, rules.premium(71, false, 1, "CAR", false));
        assertEquals(580, rules.premium(71, false, 0, "SPORT", false));
    }

    @Test
    void ageBoundariesFallIntoMiddleGroup() {
        assertEquals(500, rules.premium(25, false, 0, "CAR", false));
        assertEquals(500, rules.premium(70, false, 0, "CAR", false));
    }

    @Test
    void middleAgedSportCars() {
        assertEquals(550, rules.premium(40, false, 0, "SPORT", true));
        assertEquals(620, rules.premium(40, false, 0, "SPORT", false));
        assertEquals(750, rules.premium(40, false, 1, "SPORT", false));
        assertEquals(800, rules.premium(40, false, 2, "SPORT", false));
    }

    @Test
    void middleAgedVans() {
        assertEquals(470, rules.premium(40, false, 0, "VAN", true));
        assertEquals(540, rules.premium(40, false, 0, "VAN", false));
    }

    @Test
    void middleAgedOtherVehicles() {
        assertEquals(650, rules.premium(40, false, 4, "CAR", false));
        assertEquals(520, rules.premium(40, true, 3, "CAR", false));
        assertEquals(500, rules.premium(40, false, 3, "CAR", false));
    }
}
