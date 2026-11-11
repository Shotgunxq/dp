package benchmark;

import static benchmark.GoldenMaster.call;
import static benchmark.GoldenMaster.combinations;
import static benchmark.GoldenMaster.verify;

import org.junit.jupiter.api.Test;

/**
 * B1 golden master for {@link StatefulAccount}.
 * Behaviour depends on call order, so instead of single calls every sequence of three
 * operations is recorded (6 operations ^ 3 steps x 2 overdraft limits = 432 scenarios),
 * with the state after each step and the final history.
 */
class StatefulAccountGoldenMasterTest {

    private static final String[] OPERATIONS =
            {"deposit 100", "withdraw 50", "withdraw 500", "freeze", "unfreeze", "close"};

    private static String apply(StatefulAccount account, String op) {
        return call(() -> {
            switch (op) {
                case "deposit 100": account.deposit(100); break;
                case "withdraw 50": account.withdraw(50); break;
                case "withdraw 500": account.withdraw(500); break;
                case "freeze": account.freeze(); break;
                case "unfreeze": account.unfreeze(); break;
                case "close": account.close(); break;
                default: throw new IllegalArgumentException(op);
            }
            return account.getState() + " " + account.getBalanceCents();
        });
    }

    @Test
    void operationSequences() {
        verify(getClass(), "operationSequences", combinations(
                a -> {
                    StatefulAccount account = new StatefulAccount("Alice", (Integer) a[0]);
                    StringBuilder out = new StringBuilder();
                    for (int i = 1; i < a.length; i++) {
                        out.append(a[i]).append(" -> ").append(apply(account, (String) a[i])).append(" | ");
                    }
                    return out + "history=" + account.getHistory();
                },
                new Integer[] {0, 100}, OPERATIONS, OPERATIONS, OPERATIONS));
    }

    @Test
    void constructor() {
        verify(getClass(), "constructor", combinations(
                a -> {
                    StatefulAccount account = new StatefulAccount((String) a[0], (Integer) a[1]);
                    return account.getOwner() + " " + account.getState() + " " + account.getBalanceCents();
                },
                new String[] {null, "", "   ", "Alice"},
                new Integer[] {-1, 0, 100}));
    }
}
