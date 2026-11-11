package benchmark;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * B07 - Behaviour depends on object state and call order.
 *
 * <p>A small state machine (OPEN -> FROZEN -> OPEN, OPEN -> CLOSED). Reaching some branches
 * requires a specific sequence of calls, e.g. deposit, withdraw to zero, then close.
 */
public class StatefulAccount {

    public enum State { OPEN, FROZEN, CLOSED }

    private final String owner;
    private final long overdraftLimitCents;
    private final List<String> history = new ArrayList<String>();
    private long balanceCents;
    private State state = State.OPEN;

    public StatefulAccount(String owner, long overdraftLimitCents) {
        if (owner == null || owner.trim().isEmpty()) {
            throw new IllegalArgumentException("owner required");
        }
        if (overdraftLimitCents < 0) {
            throw new IllegalArgumentException("overdraft limit must not be negative");
        }
        this.owner = owner;
        this.overdraftLimitCents = overdraftLimitCents;
    }

    public void deposit(long amountCents) {
        requireState(State.OPEN);
        if (amountCents <= 0) {
            throw new IllegalArgumentException("amount must be positive");
        }
        balanceCents += amountCents;
        history.add("DEPOSIT " + amountCents);
    }

    public void withdraw(long amountCents) {
        requireState(State.OPEN);
        if (amountCents <= 0) {
            throw new IllegalArgumentException("amount must be positive");
        }
        if (balanceCents - amountCents < -overdraftLimitCents) {
            throw new IllegalStateException("insufficient funds");
        }
        balanceCents -= amountCents;
        history.add("WITHDRAW " + amountCents);
    }

    public void freeze() {
        requireState(State.OPEN);
        state = State.FROZEN;
        history.add("FREEZE");
    }

    public void unfreeze() {
        requireState(State.FROZEN);
        state = State.OPEN;
        history.add("UNFREEZE");
    }

    public void close() {
        if (state == State.CLOSED) {
            throw new IllegalStateException("account already closed");
        }
        if (balanceCents != 0) {
            throw new IllegalStateException("balance must be zero to close the account");
        }
        state = State.CLOSED;
        history.add("CLOSE");
    }

    public String getOwner() {
        return owner;
    }

    public long getBalanceCents() {
        return balanceCents;
    }

    public State getState() {
        return state;
    }

    public List<String> getHistory() {
        return Collections.unmodifiableList(new ArrayList<String>(history));
    }

    private void requireState(State expected) {
        if (state != expected) {
            throw new IllegalStateException("operation not allowed in state " + state);
        }
    }
}
