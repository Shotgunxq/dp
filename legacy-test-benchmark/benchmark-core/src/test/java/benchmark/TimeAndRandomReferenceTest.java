package benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/**
 * Hand-written reference suite (human baseline) for {@link TimeAndRandom}.
 *
 * <p>Without seams for the clock and the random generator, even a careful human can only
 * assert properties (ranges, formats, consistency with "now"), and can only cover the
 * happy-hour branch that is active at the moment the tests run. This limitation is part of
 * what the benchmark measures.
 */
class TimeAndRandomReferenceTest {

    private final TimeAndRandom subject = new TimeAndRandom();

    private static boolean happyHourNow() {
        LocalTime now = LocalTime.now();
        return !now.isBefore(LocalTime.of(16, 0)) && now.isBefore(LocalTime.of(18, 0));
    }

    @Test
    void happyHourMatchesCurrentTime() {
        boolean before = happyHourNow();
        boolean actual = subject.isHappyHour();
        boolean after = happyHourNow();
        if (before == after) { // skip the comparison if we crossed 16:00/18:00 during the test
            assertEquals(before, actual);
        }
    }

    @Test
    void priceWithHappyHourIsEitherFullOrDiscounted() {
        boolean happy = subject.isHappyHour();
        double price = subject.priceWithHappyHour(100.0);
        assertTrue(price == 100.0 || price == 80.0, "unexpected price " + price);
        if (happy == subject.isHappyHour()) {
            assertEquals(happy ? 80.0 : 100.0, price, 0.0001);
        }
    }

    @Test
    void priceWithHappyHourRejectsNegativePrice() {
        assertThrows(IllegalArgumentException.class, () -> subject.priceWithHappyHour(-0.01));
    }

    @Test
    void couponCodeHasExpectedFormat() {
        String code = subject.generateCouponCode();
        assertEquals(8, code.length());
        assertTrue(code.matches("[A-HJ-NP-Z2-9]{8}"), "unexpected code " + code);
    }

    @Test
    void couponCodesDiffer() {
        assertNotEquals(subject.generateCouponCode(), subject.generateCouponCode());
    }

    @Test
    void daysUntilEndOfMonth() {
        LocalDate today = LocalDate.now();
        int days = subject.daysUntilEndOfMonth();
        if (today.equals(LocalDate.now())) {
            assertEquals(today.lengthOfMonth() - today.getDayOfMonth(), days);
        }
        assertTrue(days >= 0 && days <= 30);
    }

    @Test
    void appendToDailyReportWritesLine() throws IOException {
        String marker = "line-" + UUID.randomUUID();
        Path report = subject.appendToDailyReport(marker);
        assertTrue(Files.exists(report));
        List<String> lines = Files.readAllLines(report, StandardCharsets.UTF_8);
        assertTrue(lines.get(lines.size() - 1).endsWith(" " + marker));
    }

    @Test
    void appendToDailyReportRejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> subject.appendToDailyReport(null));
    }
}
