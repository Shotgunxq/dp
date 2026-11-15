package benchmark;

import static benchmark.GoldenMaster.call;
import static benchmark.GoldenMaster.combinations;
import static benchmark.GoldenMaster.verify;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * B1 golden master for {@link StaticCounterRegistry}.
 * The state is static, so every scenario starts from a reset and records the full history;
 * sequences of operations are recorded, not single calls.
 */
class StaticCounterRegistryGoldenMasterTest {

    private static final String[] OPS = {"reg A", "reg B", "reg ''", "close", "reset"};

    @BeforeEach
    @AfterEach
    void reset() {
        StaticCounterRegistry.reset();
    }

    private static String apply(String op) {
        return call(() -> {
            switch (op) {
                case "reg A": return "id=" + StaticCounterRegistry.register("A");
                case "reg B": return "id=" + StaticCounterRegistry.register("B");
                case "reg ''": return "id=" + StaticCounterRegistry.register("");
                case "close": StaticCounterRegistry.close(); return "closed";
                case "reset": StaticCounterRegistry.reset(); return "reset";
                default: throw new IllegalArgumentException(op);
            }
        });
    }

    @Test
    void operationSequences() {
        verify(getClass(), "operationSequences", combinations(
                a -> {
                    StaticCounterRegistry.reset();
                    StringBuilder out = new StringBuilder();
                    for (Object op : a) {
                        out.append(op).append(" -> ").append(apply((String) op)).append(" | ");
                    }
                    return out + "total=" + StaticCounterRegistry.total()
                            + " roomA=" + StaticCounterRegistry.hasRoom("A")
                            + " closed=" + StaticCounterRegistry.isClosed()
                            + " history=" + StaticCounterRegistry.history();
                },
                OPS, OPS, OPS, OPS));
    }

    @Test
    void fullCategory() {
        StaticCounterRegistry.reset();
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            out.append(apply("reg A")).append(" room=").append(StaticCounterRegistry.hasRoom("A"))
                    .append(" count=").append(StaticCounterRegistry.countOf("A")).append('\n');
        }
        verify(getClass(), "fullCategory", out.toString());
    }
}
