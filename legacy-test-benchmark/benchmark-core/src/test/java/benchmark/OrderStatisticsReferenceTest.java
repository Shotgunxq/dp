package benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import benchmark.OrderStatistics.Line;
import benchmark.OrderStatistics.Order;
import org.junit.jupiter.api.Test;

/** Hand-written reference suite (human baseline) for {@link OrderStatistics}. */
class OrderStatisticsReferenceTest {

    private final OrderStatistics stats = new OrderStatistics();

    private static Order order(String customer, Line... lines) {
        return new Order(customer, Arrays.asList(lines));
    }

    private final Order alice1 = order("alice", new Line("A", 2, 1000), new Line("B", 1, 500));   // 2500
    private final Order bob1 = order("bob", new Line("A", 1, 1000));                               // 1000
    private final Order alice2 = order("alice", new Line("C", 3, 100));                            // 300
    private final Order carol = order("carol", new Line("B", 5, 560));                             // 2800

    @Test
    void lineAndOrderTotals() {
        Line line = new Line("A", 2, 1000);
        assertEquals("A", line.getSku());
        assertEquals(2, line.getQuantity());
        assertEquals(1000L, line.getUnitPriceCents());
        assertEquals(2000L, line.totalCents());
        assertEquals("alice", alice1.getCustomer());
        assertEquals(2500L, alice1.totalCents());
        assertEquals(0L, new Order("x", null).totalCents());
        assertTrue(new Order("x", null).getLines().isEmpty());
    }

    @Test
    void lineAndOrderValidation() {
        assertThrows(IllegalArgumentException.class, () -> new Line(null, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> new Line("", 1, 1));
        assertThrows(IllegalArgumentException.class, () -> new Line("A", 0, 1));
        assertThrows(IllegalArgumentException.class, () -> new Line("A", 1, -1));
        assertThrows(IllegalArgumentException.class, () -> new Order(null, null));
        assertEquals(0L, new Line("A", 1, 0).totalCents());
    }

    @Test
    void orderLinesAreDefensivelyCopiedAndReadOnly() {
        List<Line> lines = new ArrayList<Line>();
        lines.add(new Line("A", 1, 100));
        Order order = new Order("x", lines);
        lines.add(new Line("B", 1, 100));
        assertEquals(1, order.getLines().size());
        assertThrows(UnsupportedOperationException.class, () -> order.getLines().add(new Line("C", 1, 1)));
    }

    @Test
    void revenueByCustomerSortedByRevenueThenName() {
        Map<String, Long> revenue = stats.revenueByCustomer(Arrays.asList(alice1, bob1, alice2, carol));
        // alice and carol tie at 2800, so the tie is broken by name
        assertEquals(Arrays.asList("alice", "carol", "bob"), new ArrayList<String>(revenue.keySet()));
        assertEquals(Long.valueOf(2800), revenue.get("carol"));
        assertEquals(Long.valueOf(2800), revenue.get("alice"));
        assertEquals(Long.valueOf(1000), revenue.get("bob"));
    }

    @Test
    void revenueByCustomerIgnoresNullOrdersAndHandlesEmptyInput() {
        assertTrue(stats.revenueByCustomer(Collections.<Order>emptyList()).isEmpty());
        Map<String, Long> revenue = stats.revenueByCustomer(Arrays.asList(null, bob1, null));
        assertEquals(Collections.singletonMap("bob", 1000L), revenue);
    }

    @Test
    void topSkusByQuantityWithTiesBrokenByName() {
        List<Order> orders = Arrays.asList(alice1, bob1, alice2, carol);
        assertEquals(Arrays.asList("B", "A", "C"), stats.topSkus(orders, 3));
        assertEquals(Arrays.asList("B"), stats.topSkus(orders, 1));
        assertEquals(Arrays.asList("B", "A", "C"), stats.topSkus(orders, 10));
        assertTrue(stats.topSkus(orders, 0).isEmpty());
        assertTrue(stats.topSkus(Collections.<Order>emptyList(), 5).isEmpty());
        assertEquals(Arrays.asList("A"), stats.topSkus(Arrays.asList(null, bob1), 5));
    }

    @Test
    void topSkusWithEqualQuantitiesSortsByName() {
        Order o = order("x", new Line("Z", 2, 1), new Line("M", 2, 1), new Line("A", 1, 1));
        assertEquals(Arrays.asList("M", "Z", "A"), stats.topSkus(Collections.singletonList(o), 3));
    }

    @Test
    void topSkusRejectsNegativeN() {
        assertThrows(IllegalArgumentException.class, () -> stats.topSkus(Collections.<Order>emptyList(), -1));
    }

    @Test
    void averageOrderRoundsDownAndSkipsNulls() {
        assertEquals(0L, stats.averageOrderCents(Collections.<Order>emptyList()));
        assertEquals(0L, stats.averageOrderCents(Arrays.asList((Order) null)));
        assertEquals(1750L, stats.averageOrderCents(Arrays.asList(alice1, bob1)));
        assertEquals(1266L, stats.averageOrderCents(Arrays.asList(alice1, bob1, alice2, null)));
    }

    @Test
    void largeOrdersSortedLargestFirstWithoutModifyingInput() {
        List<Order> input = new ArrayList<Order>(Arrays.asList(bob1, alice1, null, carol, alice2));
        List<Order> large = stats.largeOrders(input, 1000);
        assertEquals(Arrays.asList(carol, alice1, bob1), large);
        assertEquals(Arrays.asList(bob1, alice1, null, carol, alice2), input);
        assertTrue(stats.largeOrders(input, 2801).isEmpty());
        assertEquals(Arrays.asList(carol), stats.largeOrders(input, 2800));
    }
}
