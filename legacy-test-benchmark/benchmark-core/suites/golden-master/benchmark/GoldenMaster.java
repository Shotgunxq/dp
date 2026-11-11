package benchmark;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Minimal golden-master (approval) helper. Same principle as ApprovalTests' CombinationApprovals:
 * run the code for many inputs, write everything it returns or throws to a text file, approve
 * that file once, and fail whenever the output changes afterwards.
 *
 * <p>Approved files are read from the test classpath (so the tests work the same in Surefire,
 * in PIT and in the copied suites that run_iteration.py measures). They are written only in
 * approve mode: {@code -Dgolden.approve=true -Dgolden.dir=<suite folder>}
 * (use scripts/approve_golden_master.sh).
 */
final class GoldenMaster {

    private GoldenMaster() {
    }

    /** A call to the code under test; may throw anything. */
    interface Fn {
        Object apply(Object[] args) throws Exception;
    }

    /** A call without parameters. */
    interface Call {
        Object run() throws Exception;
    }

    /** Runs fn for every combination of the parameter values; one line "[args] => result" each. */
    static String combinations(Fn fn, Object[]... params) {
        StringBuilder out = new StringBuilder();
        for (Object[] p : params) {
            if (p.length == 0) {
                return "";
            }
        }
        int[] idx = new int[params.length];
        while (true) {
            final Object[] args = new Object[params.length];
            StringBuilder label = new StringBuilder("[");
            for (int i = 0; i < params.length; i++) {
                args[i] = params[i][idx[i]];
                label.append(i == 0 ? "" : ", ").append(format(args[i]));
            }
            out.append(label).append("] => ").append(call(() -> fn.apply(args))).append('\n');
            int k = params.length - 1;
            while (k >= 0 && ++idx[k] == params[k].length) {
                idx[k] = 0;
                k--;
            }
            if (k < 0) {
                return out.toString();
            }
        }
    }

    /** Result of a call as text; an exception becomes "EXCEPTION type: message". */
    static String call(Call c) {
        try {
            return format(c.run());
        } catch (Exception e) {
            return "EXCEPTION " + e.getClass().getName() + ": " + e.getMessage();
        }
    }

    static String format(Object value) {
        return value instanceof String ? "\"" + value + "\"" : String.valueOf(value);
    }

    /** Compares the output with the approved file "<TestClass>.<name>.approved.txt". */
    static void verify(Class<?> testClass, String name, String actual) {
        String file = testClass.getSimpleName() + "." + name + ".approved.txt";
        String normalized = actual.replace("\r\n", "\n");
        if (Boolean.getBoolean("golden.approve")) {
            approve(testClass, file, normalized);
            return;
        }
        String approved;
        try (InputStream in = testClass.getResourceAsStream(file)) {
            if (in == null) {
                fail("No approved golden master '" + file + "'. Record it first: bash scripts/approve_golden_master.sh");
                return;
            }
            approved = read(in).replace("\r\n", "\n");
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        if (!approved.equals(normalized)) {
            fail(firstDifference(file, approved, normalized));
        }
    }

    private static void approve(Class<?> testClass, String file, String content) {
        String dir = System.getProperty("golden.dir", "");
        if (dir.isEmpty()) {
            fail("golden.approve=true needs -Dgolden.dir=<golden-master suite folder>");
        }
        Path target = Paths.get(dir, testClass.getPackage().getName().replace('.', '/'), file);
        try {
            Files.createDirectories(target.getParent());
            Files.write(target, content.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new IllegalStateException("cannot write " + target, e);
        }
    }

    private static String firstDifference(String file, String approved, String actual) {
        String[] a = approved.split("\n", -1);
        String[] b = actual.split("\n", -1);
        int n = Math.min(a.length, b.length);
        for (int i = 0; i < n; i++) {
            if (!a[i].equals(b[i])) {
                return "Golden master " + file + " changed at line " + (i + 1)
                        + "\n  approved: " + a[i] + "\n  actual:   " + b[i];
            }
        }
        return "Golden master " + file + " changed: " + a.length + " approved lines, " + b.length + " actual";
    }

    private static String read(InputStream in) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        byte[] chunk = new byte[8192];
        int n;
        while ((n = in.read(chunk)) != -1) {
            buffer.write(chunk, 0, n);
        }
        return new String(buffer.toByteArray(), StandardCharsets.UTF_8);
    }
}
