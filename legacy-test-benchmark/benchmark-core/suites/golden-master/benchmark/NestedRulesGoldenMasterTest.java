package benchmark;

import static benchmark.GoldenMaster.combinations;
import static benchmark.GoldenMaster.verify;

import org.junit.jupiter.api.Test;

/**
 * B1 golden master for {@link NestedRules}.
 * Input rule: typical domain values + simple edge values, chosen without analysing branches.
 */
class NestedRulesGoldenMasterTest {

    @Test
    void premium() {
        NestedRules rules = new NestedRules();
        verify(getClass(), "premium", combinations(
                a -> rules.premium((Integer) a[0], (Boolean) a[1], (Integer) a[2], (String) a[3], (Boolean) a[4]),
                new Integer[] {16, 18, 21, 30, 45, 70, 75, 90},
                new Boolean[] {false, true},
                new Integer[] {0, 1, 2, 5},
                new String[] {null, "CAR", "SPORT", "VAN"},
                new Boolean[] {false, true}));
    }
}
