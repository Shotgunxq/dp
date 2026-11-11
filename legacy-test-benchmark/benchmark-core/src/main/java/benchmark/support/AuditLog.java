package benchmark.support;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Legacy singleton with global mutable state. Entries carry a wall-clock timestamp,
 * so their exact content is not deterministic.
 */
public final class AuditLog implements AuditSink {

    private static AuditLog instance;

    private final List<String> entries = new ArrayList<String>();

    private AuditLog() {
    }

    public static synchronized AuditLog getInstance() {
        if (instance == null) {
            instance = new AuditLog();
        }
        return instance;
    }

    @Override
    public synchronized void record(String message) {
        entries.add(System.currentTimeMillis() + " " + message);
    }

    public synchronized List<String> getEntries() {
        return Collections.unmodifiableList(new ArrayList<String>(entries));
    }

    public synchronized void clear() {
        entries.clear();
    }
}
