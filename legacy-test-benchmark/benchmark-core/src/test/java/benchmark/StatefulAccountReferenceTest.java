package benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import benchmark.StatefulAccount.State;
import org.junit.jupiter.api.Test;

/** Hand-written reference suite (human baseline) for {@link StatefulAccount}. */
class StatefulAccountReferenceTest {

    @Test
    void newAccountIsOpenAndEmpty() {
        StatefulAccount account = new StatefulAccount("Alice", 100);
        assertEquals("Alice", account.getOwner());
        assertEquals(0L, account.getBalanceCents());
        assertEquals(State.OPEN, account.getState());
        assertTrue(account.getHistory().isEmpty());
    }

    @Test
    void constructorValidation() {
        assertThrows(IllegalArgumentException.class, () -> new StatefulAccount(null, 0));
        assertThrows(IllegalArgumentException.class, () -> new StatefulAccount("   ", 0));
        assertThrows(IllegalArgumentException.class, () -> new StatefulAccount("Bob", -1));
    }

    @Test
    void depositAndWithdraw() {
        StatefulAccount account = new StatefulAccount("Alice", 0);
        account.deposit(500);
        account.withdraw(200);
        assertEquals(300L, account.getBalanceCents());
        assertEquals(Arrays.asList("DEPOSIT 500", "WITHDRAW 200"), account.getHistory());
    }

    @Test
    void amountsMustBePositive() {
        StatefulAccount account = new StatefulAccount("Alice", 0);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(0));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(0));
    }

    @Test
    void overdraftUpToLimit() {
        StatefulAccount account = new StatefulAccount("Alice", 100);
        account.withdraw(100);
        assertEquals(-100L, account.getBalanceCents());
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> account.withdraw(1));
        assertEquals("insufficient funds", e.getMessage());
        assertEquals(-100L, account.getBalanceCents());
    }

    @Test
    void frozenAccountRejectsMoneyOperations() {
        StatefulAccount account = new StatefulAccount("Alice", 0);
        account.deposit(100);
        account.freeze();
        assertEquals(State.FROZEN, account.getState());
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> account.deposit(1));
        assertEquals("operation not allowed in state FROZEN", e.getMessage());
        assertThrows(IllegalStateException.class, () -> account.withdraw(1));
        assertThrows(IllegalStateException.class, account::freeze);
    }

    @Test
    void unfreezeReturnsToOpen() {
        StatefulAccount account = new StatefulAccount("Alice", 0);
        assertThrows(IllegalStateException.class, account::unfreeze);
        account.freeze();
        account.unfreeze();
        assertEquals(State.OPEN, account.getState());
        account.deposit(10);
        assertEquals(Arrays.asList("FREEZE", "UNFREEZE", "DEPOSIT 10"), account.getHistory());
    }

    @Test
    void closeRequiresZeroBalance() {
        StatefulAccount account = new StatefulAccount("Alice", 0);
        account.deposit(50);
        IllegalStateException e = assertThrows(IllegalStateException.class, account::close);
        assertEquals("balance must be zero to close the account", e.getMessage());
        account.withdraw(50);
        account.close();
        assertEquals(State.CLOSED, account.getState());
    }

    @Test
    void closedAccountRejectsEverything() {
        StatefulAccount account = new StatefulAccount("Alice", 0);
        account.close();
        IllegalStateException e = assertThrows(IllegalStateException.class, account::close);
        assertEquals("account already closed", e.getMessage());
        e = assertThrows(IllegalStateException.class, () -> account.deposit(1));
        assertEquals("operation not allowed in state CLOSED", e.getMessage());
    }

    @Test
    void frozenAccountWithZeroBalanceCanBeClosed() {
        StatefulAccount account = new StatefulAccount("Alice", 0);
        account.freeze();
        account.close();
        assertEquals(State.CLOSED, account.getState());
        assertEquals(Arrays.asList("FREEZE", "CLOSE"), account.getHistory());
    }

    @Test
    void historyIsAReadOnlySnapshot() {
        StatefulAccount account = new StatefulAccount("Alice", 0);
        List<String> snapshot = account.getHistory();
        account.deposit(1);
        assertTrue(snapshot.isEmpty());
        assertThrows(UnsupportedOperationException.class, () -> account.getHistory().add("HACK"));
    }
}
