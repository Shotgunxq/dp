package benchmark.support;

/** Receives audit messages. */
public interface AuditSink {

    void record(String message);
}
