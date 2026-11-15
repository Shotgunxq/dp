package benchmark;

import java.util.ArrayList;
import java.util.List;

/**
 * B14 - The "God method".
 *
 * <p>One 100+ line method that parses, validates, calculates and formats in a single pass, with
 * flags that change behaviour halfway through, magic numbers, mutable locals reused for different
 * purposes and early returns. Nothing is extracted, so there are no small units to test: every
 * path has to be driven through the one entry point. This is the classic legacy smell.
 */
public class InvoiceProcessor {

    /** Processes one invoice given as "customerType|country|line;line;..." and returns a report. */
    public String process(String input, boolean applyDiscounts, boolean roundToFiftyCents) {
        if (input == null) {
            return "ERROR: no input";
        }
        String[] head = input.split("\\|", -1);
        if (head.length != 3) {
            return "ERROR: expected 3 parts, got " + head.length;
        }
        String customerType = head[0].trim().toUpperCase();
        String country = head[1].trim().toUpperCase();
        String linesPart = head[2].trim();
        if (!customerType.equals("B2B") && !customerType.equals("B2C") && !customerType.equals("VIP")) {
            return "ERROR: unknown customer type " + customerType;
        }
        double vat;
        if (country.equals("SK")) {
            vat = 0.23;
        } else if (country.equals("DE") || country.equals("AT")) {
            vat = 0.19;
        } else if (country.equals("HU")) {
            vat = 0.27;
        } else if (country.equals("CH")) {
            vat = 0.081;
        } else if (country.isEmpty()) {
            return "ERROR: country missing";
        } else {
            vat = 0.20;
        }
        if (linesPart.isEmpty()) {
            return "ERROR: no lines";
        }
        String[] lines = linesPart.split(";");
        List<String> report = new ArrayList<String>();
        double net = 0;
        int items = 0;
        int skipped = 0;
        double heaviest = 0;
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();
            if (line.isEmpty()) {
                continue;
            }
            String[] f = line.split(",");
            if (f.length < 3) {
                skipped++;
                report.add("  line " + (i + 1) + ": skipped (needs name,qty,price[,kg])");
                continue;
            }
            int qty;
            double price;
            double kg = 0;
            try {
                qty = Integer.parseInt(f[1].trim());
                price = Double.parseDouble(f[2].trim());
                if (f.length > 3) {
                    kg = Double.parseDouble(f[3].trim());
                }
            } catch (NumberFormatException e) {
                skipped++;
                report.add("  line " + (i + 1) + ": skipped (not a number)");
                continue;
            }
            if (qty <= 0 || price < 0 || kg < 0) {
                skipped++;
                report.add("  line " + (i + 1) + ": skipped (negative or zero)");
                continue;
            }
            double lineNet = qty * price;
            if (applyDiscounts && qty >= 10) {
                lineNet = lineNet * 0.95;
            }
            if (applyDiscounts && customerType.equals("VIP") && lineNet > 500) {
                lineNet = lineNet - 25;
            }
            net += lineNet;
            items += qty;
            if (kg * qty > heaviest) {
                heaviest = kg * qty;
            }
            report.add("  " + f[0].trim() + " x" + qty + " = " + String.format("%.2f", lineNet));
        }
        if (items == 0) {
            return "ERROR: no valid lines (" + skipped + " skipped)";
        }
        double shipping;
        if (customerType.equals("B2B")) {
            shipping = 0;
        } else if (heaviest > 20) {
            shipping = 29.90;
        } else if (net >= 100) {
            shipping = 0;
        } else {
            shipping = country.equals("SK") ? 3.90 : 9.90;
        }
        double discount = 0;
        if (applyDiscounts) {
            if (customerType.equals("VIP")) {
                discount = net * 0.10;
            } else if (customerType.equals("B2B") && net > 1000) {
                discount = net * 0.05;
            } else if (items > 50) {
                discount = 15;
            }
            if (discount > net * 0.30) {
                discount = net * 0.30;
            }
        }
        double taxable = net - discount + shipping;
        double tax = customerType.equals("B2B") && !country.equals("SK") ? 0 : taxable * vat;
        double gross = taxable + tax;
        if (roundToFiftyCents) {
            gross = Math.round(gross * 2) / 2.0;
        } else {
            gross = Math.round(gross * 100) / 100.0;
        }
        StringBuilder out = new StringBuilder();
        out.append("INVOICE ").append(customerType).append('/').append(country).append('\n');
        for (String r : report) {
            out.append(r).append('\n');
        }
        out.append("items=").append(items);
        if (skipped > 0) {
            out.append(" skipped=").append(skipped);
        }
        out.append(" net=").append(String.format("%.2f", net));
        if (discount > 0) {
            out.append(" discount=").append(String.format("%.2f", discount));
        }
        out.append(" shipping=").append(String.format("%.2f", shipping));
        out.append(" tax=").append(String.format("%.2f", tax));
        out.append(" TOTAL=").append(String.format("%.2f", gross));
        if (gross > 10000) {
            out.append(" [REVIEW]");
        }
        return out.toString();
    }
}
