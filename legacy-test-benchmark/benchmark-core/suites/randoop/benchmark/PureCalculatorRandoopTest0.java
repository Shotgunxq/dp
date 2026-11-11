package benchmark;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PureCalculatorRandoopTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (-1), (double) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test002");
        double double1 = benchmark.PureCalculator.roundToCents((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test003");
        double double1 = benchmark.PureCalculator.roundToCents((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test004");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test005");
        double double1 = benchmark.PureCalculator.roundToCents((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test006");
        double double1 = benchmark.PureCalculator.roundToCents(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test007");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (-1.0f), (double) 10L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(1.0d, (double) (-1L), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test010");
        int int2 = benchmark.PureCalculator.percentOf((int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (short) 100, 0.0d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test012");
        int int2 = benchmark.PureCalculator.percentOf((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test013");
        double double3 = benchmark.PureCalculator.monthlyPayment(100.0d, (double) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.05d + "'", double3 == 10.05d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) (short) 0, (double) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test015");
        double double1 = benchmark.PureCalculator.roundToCents((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test016");
        double double1 = benchmark.PureCalculator.roundToCents((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test017");
        double double3 = benchmark.PureCalculator.totalInterest((double) 10.0f, (double) 1L, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.67d + "'", double3 == 0.67d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 0, (double) (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (-1.0f), (-1.0d), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test020");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = benchmark.PureCalculator.percentOf((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: percent must be between 0 and 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test021");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 0L, (double) 1.0f, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test022");
        int int2 = benchmark.PureCalculator.percentOf(0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 100.0f, (double) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test024");
        double double3 = benchmark.PureCalculator.totalInterest((double) 100L, 1.0d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.0d + "'", double3 == 4.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test025");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.67d, (double) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test026");
        double double1 = benchmark.PureCalculator.roundToCents((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 100.0f, (double) 100L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test028");
        int int2 = benchmark.PureCalculator.percentOf((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test029");
        double double3 = benchmark.PureCalculator.totalInterest((double) 10, 0.67d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test030");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 100, (double) 100, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.13d + "'", double3 == 15.13d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test031");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 10, (double) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1d + "'", double3 == 0.1d);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test032");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) (short) 1, (double) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test033");
        double double3 = benchmark.PureCalculator.totalInterest(0.1d, (double) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.1d) + "'", double3 == (-0.1d));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((-1.0d), 0.0d, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 100.0f, (double) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test036");
        double double1 = benchmark.PureCalculator.roundToCents(10.05d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.05d + "'", double1 == 10.05d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test037");
        int int2 = benchmark.PureCalculator.percentOf(100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(52.0d, (double) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test039");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (short) 10, 0.01d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test040");
        double double1 = benchmark.PureCalculator.roundToCents((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test041");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) '4', 10.05d, 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.86d + "'", double3 == 1.86d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test042");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = benchmark.PureCalculator.percentOf(32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: percent must be between 0 and 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test043");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(4.0d, (double) 100.0f, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test045");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test046");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 0, (double) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test047");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 1L, (double) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test048");
        double double1 = benchmark.PureCalculator.roundToCents(1.86d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.86d + "'", double1 == 1.86d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test049");
        double double1 = benchmark.PureCalculator.roundToCents((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test050");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.0d, 0.0d, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test051");
        int int2 = benchmark.PureCalculator.percentOf((int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test052");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(100.0d, (-0.1d), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 32, (-1.0d), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test054");
        double double3 = benchmark.PureCalculator.totalInterest((double) (byte) 10, (double) 100, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.83d + "'", double3 == 0.83d);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test055");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 10L, (double) 10L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test056");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((-0.1d), (double) (-1L), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test057");
        double double1 = benchmark.PureCalculator.roundToCents(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 0, (double) 0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test059");
        double double1 = benchmark.PureCalculator.roundToCents((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test060");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) (short) -1, (double) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test061");
        double double1 = benchmark.PureCalculator.roundToCents((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test062");
        int int2 = benchmark.PureCalculator.percentOf((int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test063");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((-0.1d), 32.0d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) ' ', (double) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test065");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (byte) 1, (double) (-1L), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (-1.0f), (double) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test067");
        double double3 = benchmark.PureCalculator.totalInterest((double) 10.0f, (double) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.1d + "'", double3 == 6.1d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test068");
        int int2 = benchmark.PureCalculator.percentOf(1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.0d, (double) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test070");
        int int2 = benchmark.PureCalculator.percentOf((int) 'a', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test071");
        double double1 = benchmark.PureCalculator.roundToCents(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test072");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (-1), (double) 32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test073");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) (short) 0, (double) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test074");
        double double3 = benchmark.PureCalculator.totalInterest(0.01d, (double) 97, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test075");
        double double1 = benchmark.PureCalculator.roundToCents((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test076");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 'a', (double) 0L, 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test077");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 10L, 15.13d, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test078");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (-1), 0.83d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.01d, (double) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test080");
        int int2 = benchmark.PureCalculator.percentOf(32, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test081");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) '4', (double) 97, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 56.2d + "'", double3 == 56.2d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test082");
        double double1 = benchmark.PureCalculator.roundToCents(6.1d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.1d + "'", double1 == 6.1d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (short) 1, (double) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test084");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 0.0f, (double) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test085");
        double double3 = benchmark.PureCalculator.totalInterest((double) 100, 1.86d, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9d + "'", double3 == 0.9d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test086");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((-1.0d), 0.0d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test087");
        double double1 = benchmark.PureCalculator.roundToCents((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test088");
        int int2 = benchmark.PureCalculator.percentOf((int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test089");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.9d, 0.1d, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test090");
        double double1 = benchmark.PureCalculator.roundToCents(0.83d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.83d + "'", double1 == 0.83d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test091");
        double double3 = benchmark.PureCalculator.totalInterest(1.86d, 0.02d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test092");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.9d, (double) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.94d + "'", double3 == 0.94d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test093");
        double double3 = benchmark.PureCalculator.totalInterest((double) (short) 100, 6.1d, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 28.0d + "'", double3 == 28.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test094");
        double double1 = benchmark.PureCalculator.roundToCents(0.02d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02d + "'", double1 == 0.02d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test095");
        double double1 = benchmark.PureCalculator.roundToCents((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test096");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (byte) 100, (double) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test097");
        double double3 = benchmark.PureCalculator.totalInterest((double) (short) 1, (double) 32, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6d + "'", double3 == 0.6d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 0L, (double) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test099");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) (short) 0, (double) (-1L), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test100");
        int int2 = benchmark.PureCalculator.percentOf(1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test101");
        double double3 = benchmark.PureCalculator.monthlyPayment(52.0d, 100.0d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.33d + "'", double3 == 4.33d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test102");
        double double1 = benchmark.PureCalculator.roundToCents((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test103");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test104");
        double double3 = benchmark.PureCalculator.monthlyPayment(28.0d, (double) 10L, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 28.23d + "'", double3 == 28.23d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test105");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (short) 0, (double) 'a', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test106");
        int int2 = benchmark.PureCalculator.percentOf(100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test107");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) (short) 100, (double) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test108");
        int int2 = benchmark.PureCalculator.percentOf(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test109");
        int int2 = benchmark.PureCalculator.percentOf((int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test110");
        double double1 = benchmark.PureCalculator.roundToCents(56.2d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.2d + "'", double1 == 56.2d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test111");
        double double1 = benchmark.PureCalculator.roundToCents((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test112");
        double double1 = benchmark.PureCalculator.roundToCents(0.6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6d + "'", double1 == 0.6d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test113");
        double double1 = benchmark.PureCalculator.roundToCents(0.1d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1d + "'", double1 == 0.1d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test114");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(10.0d, 0.9d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test115");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) (short) 10, 1.0d, 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.11d + "'", double3 == 0.11d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test116");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 'a', (double) 1L, 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.07d + "'", double3 == 3.07d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test117");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) (-1L), 28.23d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test118");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = benchmark.PureCalculator.percentOf(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: percent must be between 0 and 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test119");
        double double3 = benchmark.PureCalculator.totalInterest((double) 1L, (double) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.04d) + "'", double3 == (-0.04d));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test120");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.0d, 28.0d, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test121");
        double double3 = benchmark.PureCalculator.totalInterest(6.1d, (double) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.49d + "'", double3 == 0.49d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test122");
        double double1 = benchmark.PureCalculator.roundToCents((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test123");
        double double1 = benchmark.PureCalculator.roundToCents((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test124");
        double double1 = benchmark.PureCalculator.roundToCents((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test125");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.94d, 0.0d, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.94d + "'", double3 == 0.94d);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test126");
        double double3 = benchmark.PureCalculator.monthlyPayment(28.23d, 97.0d, 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.49d + "'", double3 == 2.49d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test127");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) (short) 0, (double) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test128");
        int int2 = benchmark.PureCalculator.percentOf((int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test129");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 0L, (double) 31, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test130");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) (byte) 1, 56.2d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.05d + "'", double3 == 0.05d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test131");
        double double1 = benchmark.PureCalculator.roundToCents((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test132");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.49d, (double) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test133");
        int int2 = benchmark.PureCalculator.percentOf(10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test134");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 0, 0.02d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test135");
        int int2 = benchmark.PureCalculator.percentOf((int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test136");
        double double3 = benchmark.PureCalculator.monthlyPayment(2.49d, 100.0d, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.7d + "'", double3 == 2.7d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test137");
        double double1 = benchmark.PureCalculator.roundToCents(4.33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.33d + "'", double1 == 4.33d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test138");
        double double1 = benchmark.PureCalculator.roundToCents(15.13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.13d + "'", double1 == 15.13d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test139");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(1.86d, (double) 100.0f, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test140");
        int int2 = benchmark.PureCalculator.percentOf((int) '#', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test141");
        int int2 = benchmark.PureCalculator.percentOf(97, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test142");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 10.0f, (double) (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test143");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) (short) 1, 0.1d, 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test144");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.11d, (double) (-1L), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test145");
        double double1 = benchmark.PureCalculator.roundToCents(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test146");
        double double1 = benchmark.PureCalculator.roundToCents((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test147");
        double double1 = benchmark.PureCalculator.roundToCents(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test148");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) '#', (double) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 10, (double) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test150");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 10, (-0.04d), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test151");
        int int2 = benchmark.PureCalculator.percentOf((-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test152");
        int int2 = benchmark.PureCalculator.percentOf(1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test153");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((-1.0d), (double) (short) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test154");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 10, (double) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.83d + "'", double3 == 0.83d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test155");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test156");
        int int2 = benchmark.PureCalculator.percentOf(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test157");
        int int2 = benchmark.PureCalculator.percentOf(100, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test158");
        double double1 = benchmark.PureCalculator.roundToCents((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (-1.0f), (double) 100L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test160");
        double double3 = benchmark.PureCalculator.totalInterest((double) 10.0f, 0.05d, 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.08d) + "'", double3 == (-0.08d));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test161");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(2.49d, 0.94d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test162");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 97, 0.02d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test163");
        int int2 = benchmark.PureCalculator.percentOf(32, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test164");
        double double1 = benchmark.PureCalculator.roundToCents((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test165");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test166");
        double double3 = benchmark.PureCalculator.monthlyPayment(10.0d, (double) 100L, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.85d + "'", double3 == 0.85d);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test167");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((-0.1d), 28.0d, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test168");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test169");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (byte) 0, 0.02d, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test170");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test171");
        double double3 = benchmark.PureCalculator.monthlyPayment(2.7d, 0.05d, 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03d + "'", double3 == 0.03d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test172");
        double double3 = benchmark.PureCalculator.totalInterest(0.03d, (double) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test173");
        int int2 = benchmark.PureCalculator.percentOf(97, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test174");
        double double3 = benchmark.PureCalculator.monthlyPayment(2.7d, (double) 0L, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.27d + "'", double3 == 0.27d);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test175");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) (short) 10, 56.2d, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.47d + "'", double3 == 10.47d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test176");
        int int2 = benchmark.PureCalculator.percentOf((int) (short) 10, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test177");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (-1L), (double) 1.0f, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test178");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = benchmark.PureCalculator.percentOf(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: percent must be between 0 and 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test179");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) (byte) 1, 0.11d, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test180");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 100.0f, 100.0d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.34d + "'", double3 == 8.34d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test181");
        double double3 = benchmark.PureCalculator.monthlyPayment(1.86d, 4.33d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test182");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 0, (double) 31, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test183");
        double double3 = benchmark.PureCalculator.totalInterest(0.94d, 52.0d, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.26d + "'", double3 == 0.26d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test184");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.94d, 0.6d, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test185");
        double double1 = benchmark.PureCalculator.roundToCents(0.49d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49d + "'", double1 == 0.49d);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test186");
        double double3 = benchmark.PureCalculator.totalInterest(0.03d, 0.27d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.03d) + "'", double3 == (-0.03d));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test187");
        int int2 = benchmark.PureCalculator.percentOf((int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test188");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(52.0d, 0.9d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test189");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 1, (double) (short) 0, 31);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03d + "'", double3 == 0.03d);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test190");
        int int2 = benchmark.PureCalculator.percentOf(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test191");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(6.1d, 0.1d, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test192");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 0.0f, (double) 31, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test193");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 3, 32.0d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test194");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (-1.0f), (double) 32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test195");
        double double3 = benchmark.PureCalculator.totalInterest((double) 1, (double) 0L, 31);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.07d) + "'", double3 == (-0.07d));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test196");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((-0.07d), (double) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test197");
        int int2 = benchmark.PureCalculator.percentOf(94, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test198");
        double double1 = benchmark.PureCalculator.roundToCents((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test199");
        double double3 = benchmark.PureCalculator.totalInterest((double) 100.0f, (double) 100.0f, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 51.3d + "'", double3 == 51.3d);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test200");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.11d, 0.11d, 94);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test201");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 100, (double) 94, 31);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.67d + "'", double3 == 8.67d);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test202");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 97, (double) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test203");
        int int2 = benchmark.PureCalculator.percentOf(10, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test204");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 100, (-0.08d), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test205");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 1, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test206");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((-0.07d), (double) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test207");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test208");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test209");
        double double1 = benchmark.PureCalculator.roundToCents(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test210");
        int int2 = benchmark.PureCalculator.percentOf((int) '4', 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test211");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.94d, (double) (-1.0f), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test212");
        double double3 = benchmark.PureCalculator.monthlyPayment(4.0d, (double) 97, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.32d + "'", double3 == 4.32d);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test213");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = benchmark.PureCalculator.percentOf((int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: percent must be between 0 and 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test214");
        double double3 = benchmark.PureCalculator.monthlyPayment(51.3d, (double) 11, 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.54d + "'", double3 == 10.54d);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test215");
        double double3 = benchmark.PureCalculator.totalInterest(2.7d, 15.13d, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03d + "'", double3 == 0.03d);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test216");
        double double3 = benchmark.PureCalculator.totalInterest((double) 3, (double) 0L, 31);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1d + "'", double3 == 0.1d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test217");
        int int2 = benchmark.PureCalculator.percentOf(100, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test218");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 0.0f, (double) (-1.0f), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test219");
        int int2 = benchmark.PureCalculator.percentOf(1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test220");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((-0.03d), 8.34d, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test221");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.05d, 0.67d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test222");
        double double1 = benchmark.PureCalculator.roundToCents(0.11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11d + "'", double1 == 0.11d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test223");
        double double1 = benchmark.PureCalculator.roundToCents((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test224");
        double double3 = benchmark.PureCalculator.totalInterest(51.3d, (double) '4', 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 167.92d + "'", double3 == 167.92d);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test225");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.01d, (double) 100L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test226");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.0d, (-0.04d), 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test227");
        int int2 = benchmark.PureCalculator.percentOf(97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test228");
        double double3 = benchmark.PureCalculator.totalInterest(2.49d, 52.0d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.11d + "'", double3 == 0.11d);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test229");
        int int2 = benchmark.PureCalculator.percentOf(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test230");
        int int2 = benchmark.PureCalculator.percentOf((int) ' ', 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test231");
        int int2 = benchmark.PureCalculator.percentOf(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test232");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) (short) 1, 0.26d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1d + "'", double3 == 0.1d);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test233");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.0d, (double) (-1L), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test234");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (short) 0, 0.0d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test235");
        double double1 = benchmark.PureCalculator.roundToCents(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test236");
        double double3 = benchmark.PureCalculator.totalInterest((double) 9, 0.83d, 9);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test237");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.0d, (-0.04d), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test238");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 0, (double) 1L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test239");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = benchmark.PureCalculator.percentOf((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: percent must be between 0 and 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test240");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = benchmark.PureCalculator.percentOf((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: percent must be between 0 and 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test241");
        double double3 = benchmark.PureCalculator.totalInterest(2.7d, (double) 0, 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test242");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(3.07d, (-1.0d), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test243");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((-0.04d), (double) 1L, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test244");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 31, (double) (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test245");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.94d, 1.86d, 9);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.11d + "'", double3 == 0.11d);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test246");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 9, (double) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.01d + "'", double3 == 9.01d);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test247");
        double double3 = benchmark.PureCalculator.monthlyPayment(1.0d, 0.26d, 9);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.11d + "'", double3 == 0.11d);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test248");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (short) -1, 97.0d, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test249");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.26d, (double) 10.0f, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test250");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = benchmark.PureCalculator.percentOf(32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: percent must be between 0 and 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test251");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.1d, (double) 0L, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test252");
        int int2 = benchmark.PureCalculator.percentOf(5, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test253");
        int int2 = benchmark.PureCalculator.percentOf(3, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test254");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test255");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 1.0f, 52.0d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test256");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.0d, 28.23d, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test257");
        double double3 = benchmark.PureCalculator.totalInterest(4.0d, 2.7d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test258");
        int int2 = benchmark.PureCalculator.percentOf(5, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test259");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.0d, 0.0d, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test260");
        double double1 = benchmark.PureCalculator.roundToCents((-0.04d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04d) + "'", double1 == (-0.04d));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test261");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (short) -1, (double) (byte) -1, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test262");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.01d, 0.03d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test263");
        int int2 = benchmark.PureCalculator.percentOf(100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test264");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(4.32d, (double) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test265");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.0d, 3.0d, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test266");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) (byte) 10, (-0.08d), 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test267");
        double double3 = benchmark.PureCalculator.totalInterest(1.86d, 52.0d, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.08d + "'", double3 == 0.08d);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test268");
        int int2 = benchmark.PureCalculator.percentOf((int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test269");
        double double1 = benchmark.PureCalculator.roundToCents((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test270");
        double double1 = benchmark.PureCalculator.roundToCents(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test271");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((-0.1d), 100.0d, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test272");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) (short) 0, (double) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test273");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) (-1.0f), (double) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test274");
        int int2 = benchmark.PureCalculator.percentOf(9, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test275");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 5, 0.08d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.05d + "'", double3 == 0.05d);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test276");
        double double3 = benchmark.PureCalculator.totalInterest(9.01d, 6.1d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.99d + "'", double3 == 2.99d);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test277");
        int int2 = benchmark.PureCalculator.percentOf(3, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test278");
        int int2 = benchmark.PureCalculator.percentOf(33, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test279");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(10.0d, 0.27d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test280");
        double double3 = benchmark.PureCalculator.monthlyPayment(4.32d, 0.11d, 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04d + "'", double3 == 0.04d);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test281");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 33, 0.49d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test282");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 100L, (-0.1d), 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test283");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test284");
        double double3 = benchmark.PureCalculator.totalInterest((double) 32, 0.02d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test285");
        double double3 = benchmark.PureCalculator.totalInterest(0.67d, (double) 0L, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test286");
        double double1 = benchmark.PureCalculator.roundToCents(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test287");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 100, 56.2d, 3);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 36.5d + "'", double3 == 36.5d);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test288");
        double double1 = benchmark.PureCalculator.roundToCents((double) 9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test289");
        double double3 = benchmark.PureCalculator.totalInterest(2.49d, (double) 97, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.2d + "'", double3 == 0.2d);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test290");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(5.0d, 10.47d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test291");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.27d, 97.0d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test292");
        double double3 = benchmark.PureCalculator.totalInterest(0.94d, (double) 1.0f, 94);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test293");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.0d, 4.33d, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test294");
        double double3 = benchmark.PureCalculator.totalInterest((double) 100, 0.0d, 3);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.01d) + "'", double3 == (-0.01d));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test295");
        int int2 = benchmark.PureCalculator.percentOf((int) '#', 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test296");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.9d, 1.0d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test297");
        int int2 = benchmark.PureCalculator.percentOf(94, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test298");
        double double3 = benchmark.PureCalculator.totalInterest((double) 9, (double) 1.0f, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test299");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.05d, (double) 5, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test300");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) (byte) -1, (double) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test301");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = benchmark.PureCalculator.percentOf((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: percent must be between 0 and 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test302");
        double double3 = benchmark.PureCalculator.monthlyPayment(51.3d, (double) 10L, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.76d + "'", double3 == 0.76d);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test303");
        double double1 = benchmark.PureCalculator.roundToCents(2.49d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.49d + "'", double1 == 2.49d);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test304");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) '4', 8.67d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.38d + "'", double3 == 52.38d);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test305");
        int int2 = benchmark.PureCalculator.percentOf((-1), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test306");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.27d, 0.26d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test307");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.85d, (double) '#', 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03d + "'", double3 == 0.03d);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test308");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 0, (double) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test309");
        double double3 = benchmark.PureCalculator.totalInterest((double) 'a', 10.47d, 31);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13.98d + "'", double3 == 13.98d);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test310");
        int int2 = benchmark.PureCalculator.percentOf(1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test311");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((-0.04d), 4.0d, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test312");
        int int2 = benchmark.PureCalculator.percentOf(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test313");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(10.54d, 28.0d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test314");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test315");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(15.13d, (double) (-1L), 94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test316");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.05d, (double) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test317");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(10.0d, (double) (-1L), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test318");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test319");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((-0.01d), 10.05d, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test320");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 9, 2.49d, 33);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.28d + "'", double3 == 0.28d);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test321");
        int int2 = benchmark.PureCalculator.percentOf((int) (short) 100, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test322");
        double double3 = benchmark.PureCalculator.totalInterest((double) '4', (double) 10, 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3d + "'", double3 == 1.3d);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test323");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = benchmark.PureCalculator.percentOf((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: percent must be between 0 and 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test324");
        double double3 = benchmark.PureCalculator.totalInterest(0.67d, (double) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.03d) + "'", double3 == (-0.03d));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test325");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.0d, (double) 33, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test326");
        double double1 = benchmark.PureCalculator.roundToCents((-0.01d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01d) + "'", double1 == (-0.01d));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test327");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 10.0f, (double) (short) -1, 94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test328");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.26d, 28.0d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test329");
        double double3 = benchmark.PureCalculator.totalInterest(1.3d, 0.0d, 11);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test330");
        double double1 = benchmark.PureCalculator.roundToCents(36.5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.5d + "'", double1 == 36.5d);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test331");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 0L, (double) (byte) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test332");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.67d, 0.03d, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test333");
        double double1 = benchmark.PureCalculator.roundToCents(0.67d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.67d + "'", double1 == 0.67d);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test334");
        double double3 = benchmark.PureCalculator.totalInterest((double) 94, 0.11d, 3);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test335");
        double double1 = benchmark.PureCalculator.roundToCents(10.47d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.47d + "'", double1 == 10.47d);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test336");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) (byte) 100, (double) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.03d + "'", double3 == 1.03d);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test337");
        double double1 = benchmark.PureCalculator.roundToCents(1.3d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3d + "'", double1 == 1.3d);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test338");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) (byte) -1, 4.32d, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test339");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 1.0f, 52.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test340");
        double double3 = benchmark.PureCalculator.totalInterest(9.0d, 0.9d, 33);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.24d + "'", double3 == 0.24d);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test341");
        double double1 = benchmark.PureCalculator.roundToCents((double) 31);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test342");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) (short) 1, (double) 94, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.08d + "'", double3 == 0.08d);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test343");
        double double3 = benchmark.PureCalculator.totalInterest(2.49d, 1.03d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.07d + "'", double3 == 0.07d);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test344");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(10.0d, 167.92d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test345");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.6d, 8.34d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06d + "'", double3 == 0.06d);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test346");
        double double3 = benchmark.PureCalculator.monthlyPayment(3.0d, 10.47d, 94);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.05d + "'", double3 == 0.05d);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test347");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(32.0d, 28.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test348");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(6.1d, (double) 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test349");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 33, 0.03d, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test350");
        double double3 = benchmark.PureCalculator.totalInterest(0.05d, (double) 0.0f, 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test351");
        double double3 = benchmark.PureCalculator.totalInterest((double) 2, 167.92d, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.28d + "'", double3 == 0.28d);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test352");
        int int2 = benchmark.PureCalculator.percentOf(94, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test353");
        double double3 = benchmark.PureCalculator.totalInterest((double) (short) 10, 0.0d, 11);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test354");
        int int2 = benchmark.PureCalculator.percentOf(97, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test355");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((-0.08d), (double) 'a', 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test356");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 1, (double) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1d + "'", double3 == 0.1d);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test357");
        double double3 = benchmark.PureCalculator.totalInterest((double) ' ', 8.34d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.22d + "'", double3 == 0.22d);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test358");
        int int2 = benchmark.PureCalculator.percentOf((int) '#', 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test359");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(32.0d, (double) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test360");
        int int2 = benchmark.PureCalculator.percentOf((int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test361");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.0d, (double) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test362");
        double double3 = benchmark.PureCalculator.totalInterest(0.04d, (double) ' ', 2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test363");
        int int2 = benchmark.PureCalculator.percentOf((int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test364");
        double double1 = benchmark.PureCalculator.roundToCents((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test365");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = benchmark.PureCalculator.percentOf((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: percent must be between 0 and 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test366");
        double double3 = benchmark.PureCalculator.monthlyPayment(5.0d, 2.7d, 50);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.11d + "'", double3 == 0.11d);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test367");
        double double1 = benchmark.PureCalculator.roundToCents(0.05d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05d + "'", double1 == 0.05d);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test368");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.1d, (double) 1, 31);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test369");
        double double3 = benchmark.PureCalculator.totalInterest((double) 100L, 0.9d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.07d + "'", double3 == 0.07d);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test370");
        int int2 = benchmark.PureCalculator.percentOf(31, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test371");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.0d, (double) (-1), 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test372");
        int int2 = benchmark.PureCalculator.percentOf(10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test373");
        double double1 = benchmark.PureCalculator.roundToCents((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test374");
        int int2 = benchmark.PureCalculator.percentOf(94, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test375");
        double double3 = benchmark.PureCalculator.monthlyPayment(2.99d, (double) 5, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06d + "'", double3 == 0.06d);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test376");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 10, 2.7d, 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.11d + "'", double3 == 0.11d);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test377");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 0, (double) 33, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test378");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 100, 0.24d, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.87d + "'", double3 == 2.87d);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test379");
        double double1 = benchmark.PureCalculator.roundToCents(0.22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22d + "'", double1 == 0.22d);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test380");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((-1.0d), 0.02d, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test381");
        double double3 = benchmark.PureCalculator.totalInterest(36.5d, (double) 94, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.86d + "'", double3 == 2.86d);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test382");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.83d, (double) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test383");
        int int2 = benchmark.PureCalculator.percentOf(94, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test384");
        int int2 = benchmark.PureCalculator.percentOf(50, 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test385");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(56.2d, 2.87d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test386");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 47, 2.99d, 47);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.06d + "'", double3 == 1.06d);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test387");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((-0.08d), (double) 47, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test388");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 100.0f, 2.99d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test389");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 5, (-0.1d), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test390");
        double double3 = benchmark.PureCalculator.monthlyPayment(36.5d, (double) 0, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 36.5d + "'", double3 == 36.5d);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test391");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(8.34d, (double) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test392");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((-0.01d), (double) 11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test393");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.05d, (double) 11, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test394");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 0.0f, 6.1d, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test395");
        double double3 = benchmark.PureCalculator.totalInterest((double) 50, (double) 1.0f, 94);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7d + "'", double3 == 1.7d);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test396");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.0d, 2.49d, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test397");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 1, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test398");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.0d, 6.1d, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test399");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((-0.1d), (double) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test400");
        double double1 = benchmark.PureCalculator.roundToCents((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test401");
        double double3 = benchmark.PureCalculator.totalInterest(1.03d, (double) 100L, 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.27d + "'", double3 == 0.27d);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test402");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.6d, (double) 50, 31);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03d + "'", double3 == 0.03d);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test403");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.0d, (double) 100L, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test404");
        double double1 = benchmark.PureCalculator.roundToCents(0.85d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.85d + "'", double1 == 0.85d);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test405");
        double double1 = benchmark.PureCalculator.roundToCents((-0.08d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08d) + "'", double1 == (-0.08d));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test406");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 0, 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test407");
        int int2 = benchmark.PureCalculator.percentOf(32, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test408");
        double double1 = benchmark.PureCalculator.roundToCents(167.92d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 167.92d + "'", double1 == 167.92d);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test409");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(28.23d, (-0.08d), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test410");
        int int2 = benchmark.PureCalculator.percentOf(3, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test411");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test412");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (byte) -1, 1.7d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test413");
        double double1 = benchmark.PureCalculator.roundToCents(0.2d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2d + "'", double1 == 0.2d);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test414");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) (short) 10, (double) (byte) 10, 33);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.35d + "'", double3 == 0.35d);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test415");
        double double3 = benchmark.PureCalculator.totalInterest(5.0d, (double) '4', 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 16.34d + "'", double3 == 16.34d);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test416");
        int int2 = benchmark.PureCalculator.percentOf(33, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test417");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.24d, 0.28d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test418");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.85d, 4.33d, 50);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test419");
        int int2 = benchmark.PureCalculator.percentOf((int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test420");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((-0.08d), (double) 9, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test421");
        double double3 = benchmark.PureCalculator.monthlyPayment(36.5d, 52.38d, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.58d + "'", double3 == 4.58d);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test422");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) (byte) 0, 1.0d, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test423");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = benchmark.PureCalculator.percentOf((int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: percent must be between 0 and 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test424");
        double double3 = benchmark.PureCalculator.totalInterest(2.99d, (double) 47, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.71d + "'", double3 == 0.71d);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test425");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((double) 11, 8.67d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test426");
        double double3 = benchmark.PureCalculator.monthlyPayment(2.49d, 1.0d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.25d + "'", double3 == 0.25d);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test427");
        int int2 = benchmark.PureCalculator.percentOf(100, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test428");
        double double3 = benchmark.PureCalculator.totalInterest(0.28d, (double) 10L, 2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test429");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.0d, 4.0d, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test430");
        double double3 = benchmark.PureCalculator.monthlyPayment(3.07d, (double) 1.0f, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.31d + "'", double3 == 0.31d);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test431");
        int int2 = benchmark.PureCalculator.percentOf((int) '4', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test432");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 0, 0.0d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test433");
        double double3 = benchmark.PureCalculator.totalInterest(2.49d, 0.0d, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.04d) + "'", double3 == (-0.04d));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test434");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 2, (double) 10, 47);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.05d + "'", double3 == 0.05d);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test435");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest((-0.1d), (double) 47, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test436");
        double double3 = benchmark.PureCalculator.monthlyPayment(1.7d, 3.07d, 47);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04d + "'", double3 == 0.04d);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test437");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.0d, (double) 'a', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test438");
        double double1 = benchmark.PureCalculator.roundToCents(0.9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9d + "'", double1 == 0.9d);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test439");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.83d, (double) ' ', 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.18d + "'", double3 == 0.18d);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test440");
        int int2 = benchmark.PureCalculator.percentOf((-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test441");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.0d, 0.85d, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test442");
        double double1 = benchmark.PureCalculator.roundToCents(0.71d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.71d + "'", double1 == 0.71d);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test443");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(1.7d, 0.94d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test444");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) 47, (double) (short) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test445");
        double double3 = benchmark.PureCalculator.totalInterest(31.0d, 0.27d, 33);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test446");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 33, 2.99d, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.35d + "'", double3 == 3.35d);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test447");
        double double1 = benchmark.PureCalculator.roundToCents(9.01d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.01d + "'", double1 == 9.01d);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test448");
        double double3 = benchmark.PureCalculator.monthlyPayment(4.58d, (double) '#', 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.53d + "'", double3 == 0.53d);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test449");
        double double3 = benchmark.PureCalculator.totalInterest(0.02d, 10.0d, 94);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.02d) + "'", double3 == (-0.02d));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test450");
        double double1 = benchmark.PureCalculator.roundToCents(0.76d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.76d + "'", double1 == 0.76d);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test451");
        double double3 = benchmark.PureCalculator.monthlyPayment(10.47d, 32.0d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3d + "'", double3 == 0.3d);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test452");
        int int2 = benchmark.PureCalculator.percentOf(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test453");
        double double3 = benchmark.PureCalculator.totalInterest(4.32d, 16.34d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.68d + "'", double3 == 3.68d);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test454");
        double double3 = benchmark.PureCalculator.totalInterest(2.86d, 0.11d, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04d + "'", double3 == 0.04d);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test455");
        double double1 = benchmark.PureCalculator.roundToCents((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test456");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((-0.1d), 0.49d, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test457");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.67d, (-0.02d), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test458");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.0d, 1.86d, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test459");
        int int2 = benchmark.PureCalculator.percentOf(94, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test460");
        int int2 = benchmark.PureCalculator.percentOf(31, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test461");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) (-1L), (double) 100L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test462");
        int int2 = benchmark.PureCalculator.percentOf(94, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test463");
        double double3 = benchmark.PureCalculator.totalInterest((double) 9, 10.54d, 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.58d + "'", double3 == 4.58d);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test464");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 1, (double) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.08d + "'", double3 == 1.08d);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test465");
        int int2 = benchmark.PureCalculator.percentOf(94, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test466");
        double double3 = benchmark.PureCalculator.totalInterest((double) (byte) 10, 1.86d, 4);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04d + "'", double3 == 0.04d);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test467");
        double double1 = benchmark.PureCalculator.roundToCents(1.06d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.06d + "'", double1 == 1.06d);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test468");
        double double3 = benchmark.PureCalculator.monthlyPayment(4.33d, (double) 100L, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.39d + "'", double3 == 0.39d);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test469");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.35d, 0.27d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test470");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = benchmark.PureCalculator.percentOf((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: percent must be between 0 and 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test471");
        int int2 = benchmark.PureCalculator.percentOf((int) '4', 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test472");
        int int2 = benchmark.PureCalculator.percentOf(100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test473");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.24d, 4.0d, 47);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test474");
        double double3 = benchmark.PureCalculator.totalInterest((double) 3, 52.38d, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test475");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.totalInterest(0.26d, (-0.03d), 50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test476");
        int int2 = benchmark.PureCalculator.percentOf((int) 'a', 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test477");
        int int2 = benchmark.PureCalculator.percentOf(31, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test478");
        double double3 = benchmark.PureCalculator.monthlyPayment(1.7d, 0.27d, 48);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04d + "'", double3 == 0.04d);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test479");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = benchmark.PureCalculator.percentOf((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: percent must be between 0 and 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test480");
        double double3 = benchmark.PureCalculator.totalInterest(0.27d, 5.0d, 4);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test481");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) 10, 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test482");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(10.05d, (double) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test483");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.0d, 0.06d, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test484");
        int int2 = benchmark.PureCalculator.percentOf((int) (byte) -1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test485");
        int int2 = benchmark.PureCalculator.percentOf(2, 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test486");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(0.6d, (-0.1d), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test487");
        double double3 = benchmark.PureCalculator.monthlyPayment(0.67d, 13.98d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.68d + "'", double3 == 0.68d);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test488");
        double double1 = benchmark.PureCalculator.roundToCents((double) 33);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.0d + "'", double1 == 33.0d);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test489");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 100.0f, (double) 4, 31);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.4d + "'", double3 == 3.4d);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test490");
        double double1 = benchmark.PureCalculator.roundToCents(0.26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26d + "'", double1 == 0.26d);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test491");
        double double3 = benchmark.PureCalculator.totalInterest(31.0d, 8.67d, 50);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.0d + "'", double3 == 6.0d);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test492");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) ' ', 16.34d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.44d + "'", double3 == 3.44d);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test493");
        double double3 = benchmark.PureCalculator.monthlyPayment((double) 100, (double) 0.0f, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test494");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((double) (byte) 1, 8.34d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: months must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test495");
        int int2 = benchmark.PureCalculator.percentOf(1, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test496");
        int int2 = benchmark.PureCalculator.percentOf((int) (short) 10, 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test497");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = benchmark.PureCalculator.percentOf(1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: percent must be between 0 and 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test498");
        double double3 = benchmark.PureCalculator.totalInterest(28.0d, 0.0d, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.13d + "'", double3 == 0.13d);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test499");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment((-0.03d), 0.07d, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: principal must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PureCalculatorRandoopTest0.test500");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = benchmark.PureCalculator.monthlyPayment(32.0d, (-0.04d), 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: annual rate must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

