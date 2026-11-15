package benchmark;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * B10 - Static mutable state.
 *
 * <p>All state lives in static fields shared by every caller and every test. Results depend on
 * what ran before: the generated ids keep counting, the per-category counts keep growing and a
 * registry that was closed stays closed. Tests that do not reset the state interfere with each
 * other and become order-dependent or flaky.
 */
public final class StaticCounterRegistry {

    public static final int MAX_PER_CATEGORY = 3;

    private static int nextId = 1;
    private static final Map<String, Integer> countsByCategory = new HashMap<String, Integer>();
    private static final List<String> log = new ArrayList<String>();
    private static boolean closed;

    private StaticCounterRegistry() {
    }

    /** Registers an item and returns its id; ids are 1, 2, 3, ... for the lifetime of the JVM. */
    public static int register(String category) {
        if (closed) {
            throw new IllegalStateException("registry closed");
        }
        if (category == null || category.trim().isEmpty()) {
            throw new IllegalArgumentException("category required");
        }
        int count = countOf(category);
        if (count >= MAX_PER_CATEGORY) {
            throw new IllegalStateException("category full: " + category);
        }
        countsByCategory.put(category, count + 1);
        int id = nextId++;
        log.add(id + ":" + category);
        return id;
    }

    public static int countOf(String category) {
        Integer count = countsByCategory.get(category);
        return count == null ? 0 : count.intValue();
    }

    public static int total() {
        int sum = 0;
        for (int c : countsByCategory.values()) {
            sum += c;
        }
        return sum;
    }

    /** True while the category has free slots. */
    public static boolean hasRoom(String category) {
        return !closed && countOf(category) < MAX_PER_CATEGORY;
    }

    public static List<String> history() {
        return Collections.unmodifiableList(new ArrayList<String>(log));
    }

    public static void close() {
        closed = true;
        log.add("CLOSED");
    }

    public static boolean isClosed() {
        return closed;
    }

    /** Resets everything; the only way to get a clean state within one JVM. */
    public static void reset() {
        nextId = 1;
        countsByCategory.clear();
        log.clear();
        closed = false;
    }
}
