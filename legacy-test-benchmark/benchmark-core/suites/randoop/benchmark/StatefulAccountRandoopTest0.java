package benchmark;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StatefulAccountRandoopTest0 {

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
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("", (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: owner required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test002");
        benchmark.StatefulAccount.State state0 = benchmark.StatefulAccount.State.CLOSED;
        java.lang.Class<?> wildcardClass1 = state0.getClass();
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state0.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test003");
        benchmark.StatefulAccount.State state0 = benchmark.StatefulAccount.State.OPEN;
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state0.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test004");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test005");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test006");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test007");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test008");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test009");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test010");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test011");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test012");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test013");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("", (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: owner required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: overdraft limit must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test016");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("", 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: owner required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("", (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: owner required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test019");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state5.equals(benchmark.StatefulAccount.State.FROZEN));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test020");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("", 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: owner required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test021");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        java.lang.String str4 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test022");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: insufficient funds");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test023");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test024");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) 10);
        java.lang.Class<?> wildcardClass6 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test025");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass6 = state5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test026");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        java.lang.String str4 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test027");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass6 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state5.equals(benchmark.StatefulAccount.State.FROZEN));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test028");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        java.lang.Class<?> wildcardClass6 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test029");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test030");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test031");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: balance must be zero to close the account");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test032");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test033");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        java.lang.Class<?> wildcardClass6 = strList5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test034");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test035");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test036");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test037");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        java.lang.String str4 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: owner required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test039");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test040");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test041");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        java.lang.Class<?> wildcardClass6 = statefulAccount2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test042");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        long long6 = statefulAccount2.getBalanceCents();
        java.lang.Class<?> wildcardClass7 = statefulAccount2.getClass();
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test043");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test044");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state5.equals(benchmark.StatefulAccount.State.FROZEN));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test045");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test046");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: insufficient funds");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test047");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: insufficient funds");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test048");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        java.lang.Class<?> wildcardClass5 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test049");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        java.lang.String str4 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test050");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        statefulAccount2.freeze();
        long long6 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test051");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) 10);
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: balance must be zero to close the account");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test052");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: owner required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test053");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) (byte) 10);
        statefulAccount2.deposit((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test054");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 1L);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test055");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass5 = state4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test056");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test057");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: owner required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test058");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        statefulAccount2.unfreeze();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass7 = state6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test059");
        benchmark.StatefulAccount.State state0 = benchmark.StatefulAccount.State.FROZEN;
        java.lang.Class<?> wildcardClass1 = state0.getClass();
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state0.equals(benchmark.StatefulAccount.State.FROZEN));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test060");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test061");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass5 = statefulAccount2.getClass();
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test062");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test063");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        long long3 = statefulAccount2.getBalanceCents();
        java.lang.Class<?> wildcardClass4 = statefulAccount2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test064");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        long long6 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass8 = statefulAccount2.getClass();
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test065");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) 1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test066");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test067");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        java.lang.String str6 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test068");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.String str7 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test069");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        java.lang.String str6 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test070");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test071");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test072");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test073");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state5.equals(benchmark.StatefulAccount.State.FROZEN));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test074");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test075");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.util.List<java.lang.String> strList3 = statefulAccount2.getHistory();
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test076");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test077");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: owner required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test078");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        long long6 = statefulAccount2.getBalanceCents();
        long long7 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test079");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        statefulAccount2.freeze();
        java.lang.Class<?> wildcardClass7 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test080");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test081");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (byte) 0);
        benchmark.StatefulAccount.State state3 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: insufficient funds");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state3.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test082");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: overdraft limit must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test083");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        long long6 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        long long8 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test084");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: owner required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test085");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        statefulAccount2.freeze();
        long long6 = statefulAccount2.getBalanceCents();
        statefulAccount2.close();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test086");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("", (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: owner required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test087");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        statefulAccount2.close();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        long long7 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test088");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        java.lang.String str4 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        long long6 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state5.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test089");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.util.List<java.lang.String> strList3 = statefulAccount2.getHistory();
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test090");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state5.equals(benchmark.StatefulAccount.State.FROZEN));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test091");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        java.lang.Class<?> wildcardClass8 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test092");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) 10);
        statefulAccount2.freeze();
        long long7 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test093");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.freeze();
        statefulAccount2.close();
        java.lang.Class<?> wildcardClass5 = statefulAccount2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test094");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        java.lang.Class<?> wildcardClass6 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test095");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (byte) 0);
        benchmark.StatefulAccount.State state3 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        long long5 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state3.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test096");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        long long3 = statefulAccount2.getBalanceCents();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test097");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        java.lang.String str7 = statefulAccount2.getOwner();
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test098");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test099");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        long long6 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test100");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) '4');
        java.util.List<java.lang.String> strList3 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test101");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long6 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test102");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.freeze();
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test103");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test104");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        long long6 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        long long8 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test105");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("", (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: owner required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test106");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test107");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 1L);
        benchmark.StatefulAccount.State state3 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state3.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test108");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        statefulAccount2.deposit((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: balance must be zero to close the account");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test109");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: insufficient funds");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test110");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test111");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        java.lang.String str4 = statefulAccount2.getOwner();
        java.lang.Class<?> wildcardClass5 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test112");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test113");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        statefulAccount2.deposit((long) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test114");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test115");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.String str7 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state9 = statefulAccount2.getState();
        statefulAccount2.close();
        benchmark.StatefulAccount.State state11 = statefulAccount2.getState();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + state9 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state9.equals(benchmark.StatefulAccount.State.FROZEN));
        org.junit.Assert.assertTrue("'" + state11 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state11.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test116");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        statefulAccount2.freeze();
        java.lang.Class<?> wildcardClass6 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test117");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        java.lang.String str6 = statefulAccount2.getOwner();
        statefulAccount2.close();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test118");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass7 = state6.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test119");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        statefulAccount2.freeze();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state7.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test120");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        statefulAccount2.unfreeze();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test121");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state7.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test122");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        java.lang.String str6 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state5.equals(benchmark.StatefulAccount.State.FROZEN));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test123");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        java.lang.String str4 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state5.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test124");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        statefulAccount2.close();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test125");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        statefulAccount2.close();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state5.equals(benchmark.StatefulAccount.State.FROZEN));
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test126");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        statefulAccount2.unfreeze();
        java.lang.Class<?> wildcardClass6 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test127");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test128");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.freeze();
        statefulAccount2.unfreeze();
        statefulAccount2.withdraw(1L);
        java.lang.Class<?> wildcardClass7 = statefulAccount2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test129");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        long long3 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test130");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        java.lang.String str6 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test131");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        statefulAccount2.close();
        java.lang.Class<?> wildcardClass8 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test132");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test133");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test134");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) ' ');
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test135");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("", (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: owner required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test136");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test137");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        long long6 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state7.equals(benchmark.StatefulAccount.State.FROZEN));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test138");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.freeze();
        statefulAccount2.unfreeze();
        statefulAccount2.withdraw(1L);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test139");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.String str7 = statefulAccount2.getOwner();
        java.lang.String str8 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test140");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass7 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test141");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        java.lang.String str4 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw(110L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state5.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test142");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (byte) 0);
        long long3 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test143");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        statefulAccount2.deposit((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test144");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        statefulAccount2.close();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass8 = state7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test145");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        java.lang.String str8 = statefulAccount2.getOwner();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test146");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        statefulAccount2.unfreeze();
        statefulAccount2.deposit((long) (byte) 10);
        java.util.List<java.lang.String> strList8 = statefulAccount2.getHistory();
        long long9 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test147");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        statefulAccount2.close();
        java.lang.String str7 = statefulAccount2.getOwner();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state5.equals(benchmark.StatefulAccount.State.FROZEN));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test148");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        statefulAccount2.close();
        long long8 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw(110L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test149");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) '4');
        benchmark.StatefulAccount.State state3 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: insufficient funds");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state3.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test150");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        statefulAccount2.freeze();
        long long7 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test151");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test152");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test153");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) (byte) 10);
        statefulAccount2.deposit((long) (byte) 100);
        java.lang.String str8 = statefulAccount2.getOwner();
        java.lang.Class<?> wildcardClass9 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test154");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) '4');
        java.util.List<java.lang.String> strList3 = statefulAccount2.getHistory();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test155");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) (byte) 10);
        statefulAccount2.deposit((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test156");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        long long5 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test157");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        long long6 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state7.equals(benchmark.StatefulAccount.State.FROZEN));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test158");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test159");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        long long6 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test160");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        long long6 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass8 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state7.equals(benchmark.StatefulAccount.State.FROZEN));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test161");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        java.lang.String str4 = statefulAccount2.getOwner();
        long long5 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit(110L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test162");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) (byte) 10);
        statefulAccount2.deposit((long) (byte) 100);
        benchmark.StatefulAccount.State state8 = statefulAccount2.getState();
        long long9 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state8.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test163");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) '4');
        benchmark.StatefulAccount.State state3 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass4 = statefulAccount2.getClass();
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state3.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test164");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        long long5 = statefulAccount2.getBalanceCents();
        long long6 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test165");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test166");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        long long5 = statefulAccount2.getBalanceCents();
        java.lang.String str6 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test167");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (byte) 0);
        benchmark.StatefulAccount.State state3 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: insufficient funds");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state3.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test168");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.freeze();
        long long4 = statefulAccount2.getBalanceCents();
        long long5 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test169");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        statefulAccount2.close();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        java.lang.Class<?> wildcardClass8 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test170");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) '4');
        benchmark.StatefulAccount.State state3 = statefulAccount2.getState();
        statefulAccount2.freeze();
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state3.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test171");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state7.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test172");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        java.lang.Class<?> wildcardClass5 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test173");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        statefulAccount2.close();
        long long6 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test174");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        statefulAccount2.unfreeze();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass7 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test175");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        statefulAccount2.close();
        java.lang.String str8 = statefulAccount2.getOwner();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test176");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state8 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass9 = state8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state8.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test177");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test178");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        statefulAccount2.close();
        long long6 = statefulAccount2.getBalanceCents();
        long long7 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test179");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        statefulAccount2.freeze();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state8 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state9 = statefulAccount2.getState();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state8.equals(benchmark.StatefulAccount.State.FROZEN));
        org.junit.Assert.assertTrue("'" + state9 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state9.equals(benchmark.StatefulAccount.State.FROZEN));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test180");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        long long5 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state7.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test181");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        statefulAccount2.freeze();
        java.lang.String str7 = statefulAccount2.getOwner();
        statefulAccount2.unfreeze();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test182");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.String str7 = statefulAccount2.getOwner();
        java.lang.String str8 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long10 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test183");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        statefulAccount2.close();
        java.lang.String str7 = statefulAccount2.getOwner();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test184");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 1L);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test185");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test186");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        statefulAccount2.unfreeze();
        statefulAccount2.deposit((long) (byte) 10);
        java.lang.String str8 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test187");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test188");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.String str7 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test189");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 1L);
        benchmark.StatefulAccount.State state3 = statefulAccount2.getState();
        statefulAccount2.freeze();
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state3.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test190");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test191");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        long long5 = statefulAccount2.getBalanceCents();
        long long6 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test192");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        long long6 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        long long8 = statefulAccount2.getBalanceCents();
        java.lang.String str9 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test193");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test194");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.util.List<java.lang.String> strList3 = statefulAccount2.getHistory();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        java.lang.Class<?> wildcardClass5 = statefulAccount2.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test195");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        statefulAccount2.unfreeze();
        statefulAccount2.deposit((long) (byte) 10);
        java.lang.String str8 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList9 = statefulAccount2.getHistory();
        java.lang.String str10 = statefulAccount2.getOwner();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test196");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        statefulAccount2.close();
        long long8 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test197");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        long long5 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test198");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.String str7 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state9 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state10 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + state9 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state9.equals(benchmark.StatefulAccount.State.FROZEN));
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state10.equals(benchmark.StatefulAccount.State.FROZEN));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test199");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        long long3 = statefulAccount2.getBalanceCents();
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test200");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        long long5 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test201");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        statefulAccount2.deposit((long) 100);
        java.util.List<java.lang.String> strList8 = statefulAccount2.getHistory();
        java.lang.Class<?> wildcardClass9 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test202");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        statefulAccount2.close();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test203");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.util.List<java.lang.String> strList3 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass5 = statefulAccount2.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test204");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) (byte) 10);
        java.lang.Class<?> wildcardClass6 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test205");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.close();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test206");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.util.List<java.lang.String> strList3 = statefulAccount2.getHistory();
        statefulAccount2.freeze();
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test207");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        statefulAccount2.withdraw(1L);
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass8 = state7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state7.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test208");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) (byte) 10);
        statefulAccount2.deposit((long) (byte) 100);
        benchmark.StatefulAccount.State state8 = statefulAccount2.getState();
        long long9 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state10 = statefulAccount2.getState();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state8.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state10.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test209");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        statefulAccount2.freeze();
        long long6 = statefulAccount2.getBalanceCents();
        long long7 = statefulAccount2.getBalanceCents();
        java.lang.Class<?> wildcardClass8 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test210");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        java.lang.String str6 = statefulAccount2.getOwner();
        java.lang.String str7 = statefulAccount2.getOwner();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test211");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("", (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: owner required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test212");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) '4');
        statefulAccount2.freeze();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        statefulAccount2.unfreeze();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test213");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long6 = statefulAccount2.getBalanceCents();
        statefulAccount2.unfreeze();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test214");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        statefulAccount2.close();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        long long8 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test215");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) '4');
        statefulAccount2.freeze();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        statefulAccount2.close();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test216");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.String str7 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state9 = statefulAccount2.getState();
        statefulAccount2.close();
        java.util.List<java.lang.String> strList11 = statefulAccount2.getHistory();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + state9 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state9.equals(benchmark.StatefulAccount.State.FROZEN));
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test217");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test218");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        java.lang.String str7 = statefulAccount2.getOwner();
        long long8 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test219");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        statefulAccount2.deposit((long) 100);
        java.util.List<java.lang.String> strList8 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test220");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.String str7 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList8 = statefulAccount2.getHistory();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test221");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        statefulAccount2.close();
        long long8 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test222");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        long long5 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test223");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test224");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        long long6 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state7.equals(benchmark.StatefulAccount.State.FROZEN));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test225");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        statefulAccount2.deposit((long) 1);
        long long8 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test226");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.util.List<java.lang.String> strList3 = statefulAccount2.getHistory();
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test227");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        java.lang.String str6 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test228");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test229");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        statefulAccount2.close();
        long long6 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state8 = statefulAccount2.getState();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state8.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test230");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        long long3 = statefulAccount2.getBalanceCents();
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test231");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.withdraw((long) 10);
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        java.lang.Class<?> wildcardClass8 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test232");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        statefulAccount2.unfreeze();
        statefulAccount2.deposit((long) (byte) 10);
        java.util.List<java.lang.String> strList8 = statefulAccount2.getHistory();
        java.lang.Class<?> wildcardClass9 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test233");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test234");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        statefulAccount2.close();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test235");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test236");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state5.equals(benchmark.StatefulAccount.State.FROZEN));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test237");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass7 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test238");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test239");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) '4');
        statefulAccount2.freeze();
        long long4 = statefulAccount2.getBalanceCents();
        statefulAccount2.unfreeze();
        long long6 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test240");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        statefulAccount2.close();
        benchmark.StatefulAccount.State state8 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state8.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test241");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.withdraw((long) 10);
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test242");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 1L);
        statefulAccount2.close();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test243");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test244");
        // The following exception was thrown during execution in test generation
        try {
            benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("", (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: owner required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test245");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        long long6 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        java.lang.String str8 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test246");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) '4');
        statefulAccount2.freeze();
        long long4 = statefulAccount2.getBalanceCents();
        statefulAccount2.unfreeze();
        long long6 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state7.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test247");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        java.lang.String str6 = statefulAccount2.getOwner();
        long long7 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state5.equals(benchmark.StatefulAccount.State.FROZEN));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test248");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 100L);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test249");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) (byte) 10);
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test250");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        long long6 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        long long8 = statefulAccount2.getBalanceCents();
        java.lang.String str9 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList10 = statefulAccount2.getHistory();
        java.util.List<java.lang.String> strList11 = statefulAccount2.getHistory();
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test251");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test252");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 110L);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test253");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        java.lang.String str6 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test254");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) '4');
        statefulAccount2.deposit(110L);
        statefulAccount2.withdraw((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test255");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        statefulAccount2.deposit((long) 1);
        statefulAccount2.freeze();
        java.util.List<java.lang.String> strList9 = statefulAccount2.getHistory();
        java.util.List<java.lang.String> strList10 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test256");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        long long7 = statefulAccount2.getBalanceCents();
        java.lang.String str8 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state9 = statefulAccount2.getState();
        java.lang.String str10 = statefulAccount2.getOwner();
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + state9 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state9.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test257");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        java.lang.String str4 = statefulAccount2.getOwner();
        long long5 = statefulAccount2.getBalanceCents();
        java.lang.String str6 = statefulAccount2.getOwner();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test258");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        long long7 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test259");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) '4');
        statefulAccount2.freeze();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test260");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) '4');
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test261");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        statefulAccount2.close();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        long long8 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList9 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test262");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.util.List<java.lang.String> strList3 = statefulAccount2.getHistory();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test263");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        long long7 = statefulAccount2.getBalanceCents();
        long long8 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test264");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 100);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test265");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) '4');
        statefulAccount2.deposit(110L);
        long long5 = statefulAccount2.getBalanceCents();
        long long6 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test266");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test267");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        long long3 = statefulAccount2.getBalanceCents();
        statefulAccount2.close();
        java.lang.Class<?> wildcardClass5 = statefulAccount2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test268");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        statefulAccount2.unfreeze();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.String str7 = statefulAccount2.getOwner();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test269");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) 10);
        statefulAccount2.freeze();
        long long7 = statefulAccount2.getBalanceCents();
        java.lang.String str8 = statefulAccount2.getOwner();
        java.lang.String str9 = statefulAccount2.getOwner();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test270");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        long long7 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test271");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.util.List<java.lang.String> strList3 = statefulAccount2.getHistory();
        statefulAccount2.deposit(1L);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test272");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (byte) 0);
        statefulAccount2.freeze();
        java.lang.Class<?> wildcardClass4 = statefulAccount2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test273");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state5.equals(benchmark.StatefulAccount.State.FROZEN));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test274");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        java.lang.String str6 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test275");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        long long6 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test276");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        long long3 = statefulAccount2.getBalanceCents();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        java.lang.String str6 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test277");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 1);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test278");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) 10);
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test279");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) (byte) 10);
        statefulAccount2.freeze();
        java.lang.String str7 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test280");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass7 = statefulAccount2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test281");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) (byte) 10);
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state7.equals(benchmark.StatefulAccount.State.FROZEN));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test282");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.freeze();
        statefulAccount2.close();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        java.lang.Class<?> wildcardClass8 = state7.getClass();
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state5.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test283");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        long long6 = statefulAccount2.getBalanceCents();
        java.lang.String str7 = statefulAccount2.getOwner();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test284");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        statefulAccount2.freeze();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state8 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state8.equals(benchmark.StatefulAccount.State.FROZEN));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test285");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: account already closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state7.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test286");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        java.lang.String str7 = statefulAccount2.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test287");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (byte) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test288");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 100);
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test289");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        statefulAccount2.unfreeze();
        statefulAccount2.withdraw((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test290");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        statefulAccount2.deposit((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state7.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test291");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        java.util.List<java.lang.String> strList5 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        java.lang.Class<?> wildcardClass8 = statefulAccount2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test292");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        java.lang.String str5 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList6 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state7.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test293");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        statefulAccount2.close();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test294");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 100);
        java.lang.String str3 = statefulAccount2.getOwner();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test295");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        java.lang.String str4 = statefulAccount2.getOwner();
        long long5 = statefulAccount2.getBalanceCents();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test296");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        statefulAccount2.close();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.withdraw((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state CLOSED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state4.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test297");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.close();
        benchmark.StatefulAccount.State state4 = statefulAccount2.getState();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state4.equals(benchmark.StatefulAccount.State.CLOSED));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.CLOSED + "'", state6.equals(benchmark.StatefulAccount.State.CLOSED));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test298");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) '4');
        statefulAccount2.close();
        long long4 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test299");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        long long5 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test300");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        long long3 = statefulAccount2.getBalanceCents();
        statefulAccount2.freeze();
        java.lang.Class<?> wildcardClass5 = statefulAccount2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test301");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.lang.String str4 = statefulAccount2.getOwner();
        statefulAccount2.withdraw((long) (short) 1);
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test302");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) '4');
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.deposit((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test303");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.util.List<java.lang.String> strList3 = statefulAccount2.getHistory();
        statefulAccount2.freeze();
        java.lang.String str5 = statefulAccount2.getOwner();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test304");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        statefulAccount2.freeze();
        benchmark.StatefulAccount.State state7 = statefulAccount2.getState();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + benchmark.StatefulAccount.State.FROZEN + "'", state7.equals(benchmark.StatefulAccount.State.FROZEN));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test305");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 1L);
        benchmark.StatefulAccount.State state3 = statefulAccount2.getState();
        java.lang.String str4 = statefulAccount2.getOwner();
        long long5 = statefulAccount2.getBalanceCents();
        java.lang.String str6 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList7 = statefulAccount2.getHistory();
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state3.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test306");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.String str7 = statefulAccount2.getOwner();
        java.lang.String str8 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state9 = statefulAccount2.getState();
        statefulAccount2.close();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + state9 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state9.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test307");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        statefulAccount2.unfreeze();
        statefulAccount2.deposit((long) (byte) 10);
        java.util.List<java.lang.String> strList8 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state9 = statefulAccount2.getState();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + state9 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state9.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test308");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        benchmark.StatefulAccount.State state5 = statefulAccount2.getState();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        java.lang.String str7 = statefulAccount2.getOwner();
        java.lang.String str8 = statefulAccount2.getOwner();
        benchmark.StatefulAccount.State state9 = statefulAccount2.getState();
        long long10 = statefulAccount2.getBalanceCents();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state5.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + state9 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state9.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test309");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.deposit((long) (byte) 10);
        statefulAccount2.deposit((long) (byte) 100);
        statefulAccount2.freeze();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test310");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        statefulAccount2.withdraw(1L);
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.unfreeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state OPEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test311");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 0L);
        java.util.List<java.lang.String> strList3 = statefulAccount2.getHistory();
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test312");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        statefulAccount2.freeze();
        statefulAccount2.unfreeze();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        statefulAccount2.close();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test313");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (short) 10);
        statefulAccount2.freeze();
        // The following exception was thrown during execution in test generation
        try {
            statefulAccount2.freeze();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: operation not allowed in state FROZEN");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test314");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", (long) (byte) 0);
        statefulAccount2.freeze();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatefulAccountRandoopTest0.test315");
        benchmark.StatefulAccount statefulAccount2 = new benchmark.StatefulAccount("hi!", 10L);
        java.lang.String str3 = statefulAccount2.getOwner();
        java.util.List<java.lang.String> strList4 = statefulAccount2.getHistory();
        long long5 = statefulAccount2.getBalanceCents();
        benchmark.StatefulAccount.State state6 = statefulAccount2.getState();
        statefulAccount2.close();
        java.lang.Class<?> wildcardClass8 = statefulAccount2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + benchmark.StatefulAccount.State.OPEN + "'", state6.equals(benchmark.StatefulAccount.State.OPEN));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

