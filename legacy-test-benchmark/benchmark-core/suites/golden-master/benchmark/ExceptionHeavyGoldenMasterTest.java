package benchmark;

import static benchmark.GoldenMaster.combinations;
import static benchmark.GoldenMaster.verify;

import java.util.Map;

import benchmark.ExceptionHeavy.ConfigException;
import org.junit.jupiter.api.Test;

/**
 * B1 golden master for {@link ExceptionHeavy}.
 * Input rule: typical configuration strings + simple malformed/edge inputs, chosen without
 * analysing branches. ConfigException's position is recorded as part of the output.
 */
class ExceptionHeavyGoldenMasterTest {

    private final ExceptionHeavy parser = new ExceptionHeavy();

    /** Adds the position to ConfigExceptions, so it becomes part of the golden master. */
    private static Object withPosition(GoldenMaster.Call call) throws Exception {
        try {
            return call.run();
        } catch (ConfigException e) {
            return "ConfigException(" + e.getMessage() + ", position=" + e.getPosition() + ")";
        }
    }

    @Test
    void parse() {
        verify(getClass(), "parse", combinations(
                a -> withPosition(() -> parser.parse((String) a[0])),
                new String[] {null, "", "   ", "a=1", "a=1;b=2", " a = 1 ; ; b=2 ;", "a=", "url=x=y",
                        "a=1;broken", "=5", "a=1;a=2", "a=1;;b", "port=8080;host=localhost;debug=true"}));
    }

    @Test
    void getInt() throws Exception {
        Map<String, String> config = parser.parse("port=8080;timeout=30;name=abc;neg=-5;zero=0;big=99999999999");
        verify(getClass(), "getInt", combinations(
                a -> withPosition(() -> parser.getInt(config, (String) a[0], (Integer) a[1], (Integer) a[2])),
                new String[] {"port", "timeout", "name", "neg", "zero", "big", "missing"},
                new Integer[] {0, 1},
                new Integer[] {100, 65535}));
    }

    @Test
    void getIntWithoutConfig() {
        verify(getClass(), "getIntWithoutConfig", combinations(
                a -> withPosition(() -> parser.getInt(null, (String) a[0], 0, 10)),
                new String[] {"port"}));
    }

    @Test
    void getFlag() {
        verify(getClass(), "getFlag", combinations(
                a -> {
                    Map<String, String> config = parser.parse(a[0] == null ? "" : "f=" + a[0]);
                    return parser.getFlag(config, "f", (Boolean) a[1]);
                },
                new String[] {null, "true", "TRUE", "yes", "1", "false", "NO", "0", "maybe", ""},
                new Boolean[] {false, true}));
    }
}
