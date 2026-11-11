package benchmark;

import static benchmark.GoldenMaster.call;
import static benchmark.GoldenMaster.combinations;
import static benchmark.GoldenMaster.verify;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * B1 golden master for {@link TimeAndRandom}.
 *
 * <p>The raw output changes with the clock and the random generator, so a plain golden master
 * would fail on every run. As usual in golden-master testing, non-deterministic parts are
 * "scrubbed" (replaced by placeholders) before comparing. Only the branch that is active at
 * test time (e.g. happy hour or not) is exercised - there is no seam to control it.
 */
class TimeAndRandomGoldenMasterTest {

    private final TimeAndRandom subject = new TimeAndRandom();

    @Test
    void couponCodes() {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            out.append(call(subject::generateCouponCode).replaceAll("\"[A-HJ-NP-Z2-9]{8}\"", "<CODE>")).append('\n');
        }
        verify(getClass(), "couponCodes", out.toString());
    }

    @Test
    void priceWithHappyHour() {
        verify(getClass(), "priceWithHappyHour", combinations(
                a -> {
                    double price = (Double) a[0];
                    double result = subject.priceWithHappyHour(price);
                    double happy = Math.round(price * 0.8 * 100.0) / 100.0;
                    return result == price ? "<FULL OR HAPPY-HOUR PRICE>"
                            : result == happy ? "<FULL OR HAPPY-HOUR PRICE>" : result;
                },
                new Double[] {-1.0, -0.01, 0.0, 10.0, 99.99}));
    }

    @Test
    void daysUntilEndOfMonth() {
        String days = call(subject::daysUntilEndOfMonth);
        verify(getClass(), "daysUntilEndOfMonth", days.matches("[0-9]|[12][0-9]|30") ? "<DAYS 0-30>\n" : days + "\n");
    }

    @Test
    void appendToDailyReport() {
        verify(getClass(), "appendToDailyReport", combinations(
                a -> {
                    Path report = subject.appendToDailyReport((String) a[0]);
                    List<String> lines = Files.readAllLines(report, StandardCharsets.UTF_8);
                    return scrub(report.getFileName() + " | last line: " + lines.get(lines.size() - 1));
                },
                new String[] {null, "", "order 42 shipped"}));
    }

    private static String scrub(String text) {
        return text.replaceAll("\\d{4}-\\d{2}-\\d{2}T[0-9:.]+", "<TIMESTAMP>")
                .replaceAll("\\d{4}-\\d{2}-\\d{2}", "<DATE>");
    }
}
