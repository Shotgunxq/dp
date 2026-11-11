package benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import benchmark.ExceptionHeavy.ConfigException;
import org.junit.jupiter.api.Test;

/** Hand-written reference suite (human baseline) for {@link ExceptionHeavy}. */
class ExceptionHeavyReferenceTest {

    private final ExceptionHeavy parser = new ExceptionHeavy();

    private static Map<String, String> config(String... keyValues) {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < keyValues.length; i += 2) {
            map.put(keyValues[i], keyValues[i + 1]);
        }
        return map;
    }

    @Test
    void parseRejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> parser.parse(null));
    }

    @Test
    void parseBlankInputGivesEmptyMap() throws ConfigException {
        assertTrue(parser.parse("").isEmpty());
        assertTrue(parser.parse("   ").isEmpty());
    }

    @Test
    void parseKeepsOrderAndTrimsWhitespace() throws ConfigException {
        Map<String, String> expected = new LinkedHashMap<String, String>();
        expected.put("a", "1");
        expected.put("b", "2");
        Map<String, String> actual = parser.parse(" a = 1 ; ; b=2 ;");
        assertEquals(expected, actual);
        assertEquals("[a, b]", actual.keySet().toString());
    }

    @Test
    void parseAllowsEmptyValueAndEqualsSignInValue() throws ConfigException {
        assertEquals(Collections.singletonMap("a", ""), parser.parse("a="));
        assertEquals(Collections.singletonMap("url", "x=y"), parser.parse("url=x=y"));
    }

    @Test
    void parseReportsMissingSeparatorWithPosition() {
        ConfigException e = assertThrows(ConfigException.class, () -> parser.parse("a=1;broken"));
        assertEquals("missing '=' in entry: broken", e.getMessage());
        assertEquals(1, e.getPosition());
    }

    @Test
    void positionCountsSkippedEmptyEntries() {
        ConfigException e = assertThrows(ConfigException.class, () -> parser.parse("a=1;;b"));
        assertEquals(2, e.getPosition());
    }

    @Test
    void parseRejectsEmptyKey() {
        ConfigException e = assertThrows(ConfigException.class, () -> parser.parse("=5"));
        assertEquals("empty key", e.getMessage());
        assertEquals(0, e.getPosition());
    }

    @Test
    void parseRejectsDuplicateKey() {
        ConfigException e = assertThrows(ConfigException.class, () -> parser.parse("a=1; a=2"));
        assertEquals("duplicate key: a", e.getMessage());
        assertEquals(1, e.getPosition());
    }

    @Test
    void getIntWithinInclusiveRange() throws ConfigException {
        Map<String, String> config = config("low", "1", "mid", "5", "high", "10");
        assertEquals(1, parser.getInt(config, "low", 1, 10));
        assertEquals(5, parser.getInt(config, "mid", 1, 10));
        assertEquals(10, parser.getInt(config, "high", 1, 10));
    }

    @Test
    void getIntMissingKey() {
        ConfigException e = assertThrows(ConfigException.class,
                () -> parser.getInt(config(), "port", 1, 10));
        assertEquals("missing key: port", e.getMessage());
        assertEquals(-1, e.getPosition());
    }

    @Test
    void getIntWrapsNumberFormatException() {
        ConfigException e = assertThrows(ConfigException.class,
                () -> parser.getInt(config("port", "abc"), "port", 1, 10));
        assertEquals("not a number: port", e.getMessage());
        assertTrue(e.getCause() instanceof NumberFormatException);
    }

    @Test
    void getIntOutOfRange() {
        assertThrows(ConfigException.class, () -> parser.getInt(config("n", "0"), "n", 1, 10));
        ConfigException e = assertThrows(ConfigException.class,
                () -> parser.getInt(config("n", "11"), "n", 1, 10));
        assertEquals("out of range: n", e.getMessage());
    }

    @Test
    void getIntWithNullConfigThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> parser.getInt(null, "n", 1, 10));
    }

    @Test
    void getFlagDefaultsWhenMissing() {
        assertTrue(parser.getFlag(config(), "debug", true));
        assertFalse(parser.getFlag(config(), "debug", false));
    }

    @Test
    void getFlagTrueValues() {
        assertTrue(parser.getFlag(config("f", "TRUE"), "f", false));
        assertTrue(parser.getFlag(config("f", "yes"), "f", false));
        assertTrue(parser.getFlag(config("f", "1"), "f", false));
    }

    @Test
    void getFlagFalseValues() {
        assertFalse(parser.getFlag(config("f", "False"), "f", true));
        assertFalse(parser.getFlag(config("f", "NO"), "f", true));
        assertFalse(parser.getFlag(config("f", "0"), "f", true));
    }

    @Test
    void getFlagRejectsUnknownValue() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> parser.getFlag(config("f", "maybe"), "f", true));
        assertEquals("invalid flag value for f: maybe", e.getMessage());
    }
}
