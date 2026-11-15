package benchmark;

import static benchmark.GoldenMaster.combinations;
import static benchmark.GoldenMaster.verify;

import org.junit.jupiter.api.Test;

/**
 * B1 golden master for {@link InvoiceProcessor}.
 * Input rule: realistic invoice strings a user would type (customer types x countries x a few
 * line sets) and the two flags; malformed inputs added as simple edge cases. The whole report
 * text is recorded.
 */
class InvoiceProcessorGoldenMasterTest {

    private static final String[] CUSTOMERS = {"B2C", "B2B", "VIP", "gold", ""};
    private static final String[] COUNTRIES = {"SK", "DE", "HU", "CH", "FR", ""};
    private static final String[] LINES = {
        "Widget,2,10.00",
        "Widget,2,10.00;Gadget,12,9.50",
        "Server,1,900.00,25",
        "Bolt,100,12.00",
        "Pin,60,1.00",
        "Thing,1,20000",
        "x,1,5;bad;y,abc,1;z,0,1,0",
        ""};
    private static final Boolean[] FLAGS = {false, true};

    @Test
    void process() {
        InvoiceProcessor processor = new InvoiceProcessor();
        verify(getClass(), "process", combinations(
                a -> {
                    String input = a[0] + "|" + a[1] + "|" + a[2];
                    return "\n" + processor.process(input, (Boolean) a[3], (Boolean) a[4]);
                },
                CUSTOMERS, COUNTRIES, LINES, FLAGS, FLAGS));
    }

    @Test
    void malformedInput() {
        InvoiceProcessor processor = new InvoiceProcessor();
        verify(getClass(), "malformedInput", combinations(
                a -> processor.process((String) a[0], true, false),
                new String[] {null, "", "|", "a|b", "a|b|c|d", "B2C|SK|;;", "B2C|SK| , , "}));
    }
}
