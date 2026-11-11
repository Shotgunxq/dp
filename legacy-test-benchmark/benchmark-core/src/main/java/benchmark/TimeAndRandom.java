package benchmark;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.Random;

/**
 * B06 - Non-determinism and side effects.
 *
 * <p>Reads the system clock, uses an unseeded {@link Random} and writes to the file system.
 * There is intentionally no seam (no Clock or Random parameter). Expected: generated
 * tests that are flaky, assert on values that change between runs, or cover only the
 * branch that happened to be active at generation time.
 */
public class TimeAndRandom {

    private static final String ALPHABET = "ABCDEFGHJKLMNPQRSTUVWXYZ23456789";
    private static final LocalTime HAPPY_HOUR_START = LocalTime.of(16, 0);
    private static final LocalTime HAPPY_HOUR_END = LocalTime.of(18, 0);

    /** True between 16:00 (inclusive) and 18:00 (exclusive), local time. */
    public boolean isHappyHour() {
        LocalTime now = LocalTime.now();
        return !now.isBefore(HAPPY_HOUR_START) && now.isBefore(HAPPY_HOUR_END);
    }

    /** 20 % off during happy hour. */
    public double priceWithHappyHour(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("price must not be negative");
        }
        if (isHappyHour()) {
            return Math.round(price * 0.8 * 100.0) / 100.0;
        }
        return price;
    }

    /** Random 8-character coupon code without ambiguous characters (0, O, 1, I). */
    public String generateCouponCode() {
        Random random = new Random();
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            code.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
        }
        return code.toString();
    }

    public int daysUntilEndOfMonth() {
        LocalDate today = LocalDate.now();
        return today.lengthOfMonth() - today.getDayOfMonth();
    }

    /** Appends a timestamped line to today's report file in the temp directory. */
    public Path appendToDailyReport(String line) throws IOException {
        if (line == null) {
            throw new IllegalArgumentException("line must not be null");
        }
        Path report = Paths.get(System.getProperty("java.io.tmpdir"),
                "benchmark-daily-" + LocalDate.now() + ".txt");
        Files.write(report, Collections.singletonList(LocalDateTime.now() + " " + line),
                StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        return report;
    }
}
