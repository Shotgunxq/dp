package benchmark;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HardWiredServiceRandoopTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test01");
        double double0 = benchmark.HardWiredService.VAT_RATE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.2d + "'", double0 == 0.2d);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test02");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test03");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test04");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test05");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        java.lang.Class<?> wildcardClass1 = hardWiredService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test06");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test07");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test08");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test09");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test10");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test11");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test12");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test13");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test14");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", 10, false);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test15");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test16");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test17");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test18");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test19");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test20");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test21");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", 100, false);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test22");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test23");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test24");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test25");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test26");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test27");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test28");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test29");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test30");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test31");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test32");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test33");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test34");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test35");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test36");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test37");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test38");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test39");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test40");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test41");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test42");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test43");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test44");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test45");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test46");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test47");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test48");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test49");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test50");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test51");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test52");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test53");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test54");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test55");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", 1, true);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test56");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test57");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test58");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test59");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test60");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test61");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test62");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test63");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test64");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test65");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test66");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test67");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test68");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test69");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test70");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test71");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test72");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", 100, true);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test73");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", 1, false);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test74");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test75");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test76");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test77");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test78");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("hi!", 10, true);
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: price database unavailable: /opt/legacy-shop/prices.csv");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HardWiredServiceRandoopTest0.test79");
        benchmark.HardWiredService hardWiredService0 = new benchmark.HardWiredService();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = hardWiredService0.finalPrice("", (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: productId required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

