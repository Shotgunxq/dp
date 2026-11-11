package benchmark;

import static benchmark.GoldenMaster.call;
import static benchmark.GoldenMaster.combinations;
import static benchmark.GoldenMaster.verify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

/**
 * B1 golden master for {@link InjectedService}.
 * The dependencies are replaced by a fixed in-memory catalogue and a recording audit sink;
 * the recorded output contains both the price and the audit message.
 */
class InjectedServiceGoldenMasterTest {

    private static final Map<String, Double> CATALOGUE = new HashMap<String, Double>();

    static {
        CATALOGUE.put("P1", 10.0);
        CATALOGUE.put("P2", 20.5);
        CATALOGUE.put("FREE", 0.0);
    }

    private static String priceWithAudit(String product, int quantity, boolean vip) {
        List<String> audit = new ArrayList<String>();
        InjectedService service = new InjectedService(
                id -> CATALOGUE.containsKey(id) ? CATALOGUE.get(id) : -1, audit::add);
        return call(() -> service.finalPrice(product, quantity, vip)) + " | audit=" + audit;
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
    void constructor() {
        verify(getClass(), "constructor", combinations(
                a -> new InjectedService(
                        Boolean.TRUE.equals(a[0]) ? (id -> 1.0) : null,
                        Boolean.TRUE.equals(a[1]) ? (m -> { }) : null) != null,
                new Boolean[] {false, true},
                new Boolean[] {false, true}));
    }
}
