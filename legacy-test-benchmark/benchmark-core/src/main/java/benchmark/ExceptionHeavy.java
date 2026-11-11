package benchmark;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * B08 - Edge cases, null handling and exceptions.
 *
 * <p>Parses a "key=value;key2=value2" configuration string. Most of the logic is about
 * rejecting bad input: a custom checked exception, a wrapped NumberFormatException,
 * an unchecked exception for invalid flags, and an implicit NullPointerException
 * (legacy code that never checks its map argument).
 */
public class ExceptionHeavy {

    /** Checked exception with the index of the offending entry (-1 if not applicable). */
    public static class ConfigException extends Exception {

        private static final long serialVersionUID = 1L;

        private final int position;

        public ConfigException(String message, int position) {
            super(message);
            this.position = position;
        }

        public int getPosition() {
            return position;
        }
    }

    public Map<String, String> parse(String text) throws ConfigException {
        if (text == null) {
            throw new IllegalArgumentException("text must not be null");
        }
        Map<String, String> result = new LinkedHashMap<String, String>();
        if (text.trim().isEmpty()) {
            return result;
        }
        String[] entries = text.split(";");
        for (int i = 0; i < entries.length; i++) {
            String entry = entries[i].trim();
            if (entry.isEmpty()) {
                continue;
            }
            int separator = entry.indexOf('=');
            if (separator < 0) {
                throw new ConfigException("missing '=' in entry: " + entry, i);
            }
            String key = entry.substring(0, separator).trim();
            String value = entry.substring(separator + 1).trim();
            if (key.isEmpty()) {
                throw new ConfigException("empty key", i);
            }
            if (result.containsKey(key)) {
                throw new ConfigException("duplicate key: " + key, i);
            }
            result.put(key, value);
        }
        return result;
    }

    public int getInt(Map<String, String> config, String key, int min, int max)
            throws ConfigException {
        String raw = config.get(key);
        if (raw == null) {
            throw new ConfigException("missing key: " + key, -1);
        }
        int value;
        try {
            value = Integer.parseInt(raw);
        } catch (NumberFormatException e) {
            ConfigException wrapped = new ConfigException("not a number: " + key, -1);
            wrapped.initCause(e);
            throw wrapped;
        }
        if (value < min || value > max) {
            throw new ConfigException("out of range: " + key, -1);
        }
        return value;
    }

    public boolean getFlag(Map<String, String> config, String key, boolean defaultValue) {
        String raw = config.get(key);
        if (raw == null) {
            return defaultValue;
        }
        if ("true".equalsIgnoreCase(raw) || "yes".equalsIgnoreCase(raw) || "1".equals(raw)) {
            return true;
        }
        if ("false".equalsIgnoreCase(raw) || "no".equalsIgnoreCase(raw) || "0".equals(raw)) {
            return false;
        }
        throw new IllegalArgumentException("invalid flag value for " + key + ": " + raw);
    }
}
