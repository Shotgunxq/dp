package benchmark;

import static benchmark.GoldenMaster.call;
import static benchmark.GoldenMaster.combinations;
import static benchmark.GoldenMaster.verify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import benchmark.OrderStatistics.Line;
import benchmark.OrderStatistics.Order;
import org.junit.jupiter.api.Test;

/**
 * B1 golden master for {@link OrderStatistics}.
 * A handful of order sets a user would build (empty, one order, several customers, nulls),
 * each run through every statistic.
 */
class OrderStatisticsGoldenMasterTest {

    private final OrderStatistics stats = new OrderStatistics();

    private static Order order(String customer, Line... lines) {
        return new Order(customer, Arrays.asList(lines));
    }

    private static String describe(List<Order> orders) {
        StringBuilder sb = new StringBuilder("[");
        for (Order o : orders) {
            sb.append(o == null ? "null" : o.getCustomer() + ":" + o.totalCents()).append(' ');
        }
        return sb.toString().trim() + "]";
    }

    @Test
    void statistics() {
        Order a1 = order("alice", new Line("A", 2, 1000), new Line("B", 1, 500));
        Order b1 = order("bob", new Line("A", 1, 1000));
        Order a2 = order("alice", new Line("C", 3, 100));
        Order c1 = order("carol", new Line("B", 5, 560));
        Order empty = new Order("dave", null);
        List<List<Order>> sets = new ArrayList<List<Order>>();
        sets.add(Collections.<Order>emptyList());
        sets.add(Collections.singletonList(b1));
        sets.add(Arrays.asList(a1, b1, a2, c1));
        sets.add(Arrays.asList(null, b1, null));
        sets.add(Arrays.asList(a1, empty, c1));
        sets.add(Arrays.asList(c1, c1, c1));

        StringBuilder out = new StringBuilder();
        for (List<Order> set : sets) {
            out.append("orders=").append(describe(set)).append('\n');
            out.append("  revenueByCustomer => ").append(call(() -> stats.revenueByCustomer(set))).append('\n');
            out.append("  averageOrderCents => ").append(call(() -> stats.averageOrderCents(set))).append('\n');
            for (int n : new int[] {-1, 0, 1, 2, 10}) {
                out.append("  topSkus(").append(n).append(") => ").append(call(() -> stats.topSkus(set, n))).append('\n');
            }
            for (long t : new long[] {0, 1000, 2800, 100000}) {
                out.append("  largeOrders(").append(t).append(") => ")
                        .append(call(() -> describe(stats.largeOrders(set, t)))).append('\n');
            }
        }
        verify(getClass(), "statistics", out.toString());
    }

    @Test
    void lineAndOrderConstruction() {
        verify(getClass(), "lineConstruction", combinations(
                a -> {
                    Line line = new Line((String) a[0], (Integer) a[1], (Long) a[2]);
                    return line.getSku() + " x" + line.getQuantity() + " @" + line.getUnitPriceCents()
                            + " = " + line.totalCents();
                },
                new String[] {null, "", "SKU-1"},
                new Integer[] {-1, 0, 1, 1000},
                new Long[] {-1L, 0L, 250L}));
    }
}
