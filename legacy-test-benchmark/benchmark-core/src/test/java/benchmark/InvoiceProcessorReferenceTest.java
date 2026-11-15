package benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Hand-written reference suite (human baseline) for {@link InvoiceProcessor}.
 * There is only one entry point, so every rule is driven through crafted input strings.
 */
class InvoiceProcessorReferenceTest {

    private final InvoiceProcessor processor = new InvoiceProcessor();

    private static String total(String report) {
        int i = report.indexOf("TOTAL=");
        return report.substring(i + 6).split(" ")[0];
    }

    @Test
    void inputErrors() {
        assertEquals("ERROR: no input", processor.process(null, true, false));
        assertEquals("ERROR: expected 3 parts, got 1", processor.process("", true, false));
        assertEquals("ERROR: expected 3 parts, got 4", processor.process("a|b|c|d", true, false));
        assertEquals("ERROR: unknown customer type GOLD", processor.process("gold|SK|x,1,1", true, false));
        assertEquals("ERROR: country missing", processor.process("B2C||x,1,1", true, false));
        assertEquals("ERROR: no lines", processor.process("B2C|SK|", true, false));
        assertEquals("ERROR: no valid lines (2 skipped)", processor.process("B2C|SK|bad;x,0,1", true, false));
        assertEquals("ERROR: no valid lines (0 skipped)", processor.process("B2C|SK| ; ", true, false));
    }

    @Test
    void simpleSlovakConsumerInvoice() {
        String report = processor.process("B2C|SK|Widget,2,10.00", true, false);
        assertEquals("INVOICE B2C/SK\n  Widget x2 = 20.00\n"
                + "items=2 net=20.00 shipping=3.90 tax=5.50 TOTAL=29.40", report);
        assertEquals("29.50", total(processor.process("B2C|SK|Widget,2,10.00", true, true)));
    }

    @Test
    void quantityDiscountAndFreeShippingAtHundred() {
        String withDiscount = processor.process("B2C|SK|Widget,2,10.00;Gadget,12,9.50", true, false);
        assertTrue(withDiscount.contains("Gadget x12 = 108.30"));
        assertTrue(withDiscount.contains("net=128.30 shipping=0.00 tax=29.51 TOTAL=157.81"));
        String without = processor.process("B2C|SK|Widget,2,10.00;Gadget,12,9.50", false, true);
        assertTrue(without.contains("Gadget x12 = 114.00"));
        assertEquals("165.00", total(without));
        assertTrue(processor.process("B2C|SK|x,1,99.99", false, false).contains("shipping=3.90"));
        assertTrue(processor.process("B2C|SK|x,1,100", false, false).contains("shipping=0.00"));
    }

    @Test
    void vipDiscountsAndHeavyParcelShipping() {
        String vip = processor.process("VIP|DE|Server,1,900.00,25", true, false);
        assertTrue(vip.contains("Server x1 = 875.00"));
        assertTrue(vip.contains("discount=87.50 shipping=29.90 tax=155.31 TOTAL=972.71"));
        assertEquals("1106.50", total(processor.process("VIP|DE|Server,1,900.00,25", false, true)));
        assertTrue(processor.process("VIP|DE|Server,1,500.00", true, false).contains("Server x1 = 500.00"));
        assertTrue(processor.process("VIP|DE|Server,1,500.01", true, false).contains("Server x1 = 475.01"));
        // heaviest line decides the heavy-parcel rate, lighter lines after it do not reset it
        assertTrue(processor.process("B2C|DE|Rack,1,50,21;Cable,2,5,0.1", false, false).contains("shipping=29.90"));
        assertTrue(processor.process("B2C|DE|Rack,1,50,20;Cable,2,5,0.1", false, false).contains("shipping=9.90"));
    }

    @Test
    void businessCustomersPayNoShippingAndNoForeignVat() {
        String de = processor.process("B2B|DE|Bolt,100,12.00", true, false);
        assertTrue(de.contains("discount=57.00 shipping=0.00 tax=0.00 TOTAL=1083.00"));
        String sk = processor.process("B2B|SK|Bolt,100,12.00", true, false);
        assertTrue(sk.contains("tax=249.09 TOTAL=1332.09"));
        assertTrue(processor.process("B2B|DE|Bolt,1,1000", true, false).contains("net=1000.00 shipping"));
        assertTrue(processor.process("B2B|DE|Bolt,1,1000.01", true, false).contains("discount=50.00"));
    }

    @Test
    void bulkDiscountCapAndCountryRates() {
        String hu = processor.process("B2C|HU|A,60,1.00", true, false);
        assertTrue(hu.contains("discount=15.00 shipping=9.90 tax=14.01 TOTAL=65.91"));
        assertEquals("89.00", total(processor.process("B2C|HU|A,60,1.00", false, true)));
        String capped = processor.process("B2C|AT|A,51,0.50", true, false);
        assertTrue(capped.contains("discount=7.27"));
        assertTrue(processor.process("B2C|CH|T,1,50", false, false).contains("tax=4.85"));
        assertTrue(processor.process("B2C|FR|T,1,50", false, false).contains("tax=11.98"));
    }

    @Test
    void reviewFlagAboveTenThousand() {
        String big = processor.process("B2C|CH|Thing,1,20000", true, false);
        assertTrue(big.endsWith("TOTAL=21620.00 [REVIEW]"));
        String small = processor.process("B2C|CH|Thing,1,9000", true, false);
        assertTrue(small.endsWith("TOTAL=9729.00"));
    }

    @Test
    void skippedLinesAreReported() {
        String report = processor.process("B2C|FR|x,1,5;bad;y,abc,1;z,0,1,0;w,1,1,-1", true, false);
        assertEquals("INVOICE B2C/FR\n  x x1 = 5.00\n"
                + "  line 2: skipped (needs name,qty,price[,kg])\n"
                + "  line 3: skipped (not a number)\n"
                + "  line 4: skipped (negative or zero)\n"
                + "  line 5: skipped (negative or zero)\n"
                + "items=1 skipped=4 net=5.00 shipping=9.90 tax=2.98 TOTAL=17.88", report);
        assertEquals("18.00", total(processor.process("B2C|FR|x,1,5;bad", true, true)));
        // empty segments between semicolons are ignored, not counted as skipped
        assertEquals(processor.process("B2C|FR|x,1,5", true, false),
                processor.process("B2C|FR|;x,1,5;;", true, false));
    }

    @Test
    void inputIsTrimmedAndCaseInsensitive() {
        assertEquals(processor.process("B2C|SK|Widget,2,10.00", true, false),
                processor.process(" b2c | sk | Widget , 2 , 10.00 ", true, false));
    }
}
