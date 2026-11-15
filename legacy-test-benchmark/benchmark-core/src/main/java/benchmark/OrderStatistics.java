package benchmark;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * B13 - Collections and generics.
 *
 * <p>Inputs are object graphs (orders with lines) rather than primitives, so a tool has to build
 * realistic lists, maps and nested objects. Edge cases: empty collections, null elements, ties
 * when sorting, and a map whose iteration order is part of the contract.
 */
public class OrderStatistics {

    /** One order line; quantity x unit price in cents. */
    public static final class Line {
        private final String sku;
        private final int quantity;
        private final long unitPriceCents;

        public Line(String sku, int quantity, long unitPriceCents) {
            if (sku == null || sku.isEmpty()) {
                throw new IllegalArgumentException("sku required");
            }
            if (quantity <= 0 || unitPriceCents < 0) {
                throw new IllegalArgumentException("bad quantity or price");
            }
            this.sku = sku;
            this.quantity = quantity;
            this.unitPriceCents = unitPriceCents;
        }

        public String getSku() {
            return sku;
        }

        public int getQuantity() {
            return quantity;
        }

        public long getUnitPriceCents() {
            return unitPriceCents;
        }

        public long totalCents() {
            return quantity * unitPriceCents;
        }
    }

    /** An order: customer plus lines. */
    public static final class Order {
        private final String customer;
        private final List<Line> lines;

        public Order(String customer, List<Line> lines) {
            if (customer == null) {
                throw new IllegalArgumentException("customer required");
            }
            this.customer = customer;
            this.lines = lines == null ? Collections.<Line>emptyList() : new ArrayList<Line>(lines);
        }

        public String getCustomer() {
            return customer;
        }

        public List<Line> getLines() {
            return Collections.unmodifiableList(lines);
        }

        public long totalCents() {
            long sum = 0;
            for (Line line : lines) {
                sum += line.totalCents();
            }
            return sum;
        }
    }

    /** Revenue per customer, customers sorted by revenue descending, then by name. */
    public Map<String, Long> revenueByCustomer(Collection<Order> orders) {
        Map<String, Long> totals = new HashMap<String, Long>();
        for (Order order : orders) {
            if (order == null) {
                continue;
            }
            Long current = totals.get(order.getCustomer());
            totals.put(order.getCustomer(), (current == null ? 0 : current) + order.totalCents());
        }
        List<Map.Entry<String, Long>> entries = new ArrayList<Map.Entry<String, Long>>(totals.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Long>>() {
            @Override
            public int compare(Map.Entry<String, Long> a, Map.Entry<String, Long> b) {
                int byRevenue = b.getValue().compareTo(a.getValue());
                return byRevenue != 0 ? byRevenue : a.getKey().compareTo(b.getKey());
            }
        });
        Map<String, Long> result = new LinkedHashMap<String, Long>();
        for (Map.Entry<String, Long> e : entries) {
            result.put(e.getKey(), e.getValue());
        }
        return result;
    }

    /** The n best-selling SKUs by quantity; fewer if there are not enough. */
    public List<String> topSkus(Collection<Order> orders, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }
        Map<String, Integer> quantities = new HashMap<String, Integer>();
        for (Order order : orders) {
            if (order == null) {
                continue;
            }
            for (Line line : order.getLines()) {
                Integer q = quantities.get(line.getSku());
                quantities.put(line.getSku(), (q == null ? 0 : q) + line.getQuantity());
            }
        }
        List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>(quantities.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                int byQuantity = b.getValue().compareTo(a.getValue());
                return byQuantity != 0 ? byQuantity : a.getKey().compareTo(b.getKey());
            }
        });
        List<String> top = new ArrayList<String>();
        Iterator<Map.Entry<String, Integer>> it = entries.iterator();
        while (it.hasNext() && top.size() < n) {
            top.add(it.next().getKey());
        }
        return top;
    }

    /** Average order value in cents, rounded down; 0 for no orders. Null orders are ignored. */
    public long averageOrderCents(Collection<Order> orders) {
        long sum = 0;
        int count = 0;
        for (Order order : orders) {
            if (order != null) {
                sum += order.totalCents();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    /** Orders worth at least the threshold, largest first; the input list is not modified. */
    public List<Order> largeOrders(List<Order> orders, long thresholdCents) {
        List<Order> large = new ArrayList<Order>();
        for (Order order : orders) {
            if (order != null && order.totalCents() >= thresholdCents) {
                large.add(order);
            }
        }
        Collections.sort(large, new Comparator<Order>() {
            @Override
            public int compare(Order a, Order b) {
                return Long.compare(b.totalCents(), a.totalCents());
            }
        });
        return large;
    }
}
