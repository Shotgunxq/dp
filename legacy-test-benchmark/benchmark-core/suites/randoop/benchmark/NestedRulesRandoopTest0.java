package benchmark;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NestedRulesRandoopTest0 {

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
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test001");
        int int0 = benchmark.NestedRules.BASE_PREMIUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 500 + "'", int0 == 500);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test002");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        java.lang.Class<?> wildcardClass7 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test003");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = nestedRules0.premium(10, false, (int) (byte) 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test005");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        java.lang.Class<?> wildcardClass1 = nestedRules0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test006");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = nestedRules0.premium((int) (byte) -1, true, (int) (byte) -1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test007");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = nestedRules0.premium((int) (short) 10, false, (-1), "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test008");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        java.lang.Class<?> wildcardClass13 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test009");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = nestedRules0.premium((int) (byte) 10, false, (int) (short) 1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test010");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (byte) -1, false, 100, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test011");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 10, "hi!", false);
        java.lang.Class<?> wildcardClass13 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test012");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) 10, true, (int) ' ', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test013");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        java.lang.Class<?> wildcardClass13 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test014");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test015");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = nestedRules0.premium((int) (short) 10, false, (int) 'a', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test016");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium(0, false, (int) (short) 1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test017");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 10, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium(0, false, (int) (short) -1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test018");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test019");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        java.lang.Class<?> wildcardClass13 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test020");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) 1, false, 0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test021");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((-1), false, (int) (byte) -1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test022");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (short) -1, false, 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test023");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = nestedRules0.premium((int) (byte) 0, false, (int) (short) 1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test024");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 10, true, (int) (short) -1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test025");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test026");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 10, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (byte) 1, false, (int) (byte) 10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test027");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 1, false, (int) '4', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test028");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(650, false, (int) (byte) 1, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (byte) -1, true, 10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test029");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 10, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (byte) 1, true, (int) (short) 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test030");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 10, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium(0, true, (int) '4', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test031");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        java.lang.Class<?> wildcardClass7 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test032");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", true);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test033");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium(10, false, (int) (short) 100, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test034");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        java.lang.Class<?> wildcardClass13 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test035");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test036");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(650, false, (int) (byte) 1, "", true);
        java.lang.Class<?> wildcardClass13 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test037");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium(100, false, (int) (byte) 100, "", false);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test038");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test039");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(520, true, 1, "hi!", false);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test040");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium(650, false, (int) (short) -1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 1, false, (int) ' ', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test041");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(100, false, (int) (byte) 100, "hi!", false);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test042");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(10, false, 1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test043");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 650, "hi!", false);
        java.lang.Class<?> wildcardClass13 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test044");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 10, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((-1), true, 500, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test045");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(650, false, (int) (byte) 1, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium(1, false, 1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test046");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) 0, true, (int) '#', "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test047");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = nestedRules0.premium((int) (short) 10, false, (int) (byte) 0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test048");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(520, true, 1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) 0, false, (int) (short) 100, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test049");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(650, false, (int) (byte) 1, "", true);
        int int18 = nestedRules0.premium(100, false, 10, "", true);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test050");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium(700, true, 580, "", false);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test051");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (byte) 0, false, (int) 'a', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test052");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium(650, false, (int) (short) -1, "hi!", true);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test053");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(650, false, (int) (byte) 1, "", true);
        int int18 = nestedRules0.premium(100, false, 10, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) -1, true, (int) (byte) 0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test054");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(520, true, 1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(0, true, 580, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test055");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium(0, true, 0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test056");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium(650, true, (int) ' ', "hi!", false);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test057");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) ' ', true, (int) (byte) 1, "hi!", true);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520 + "'", int30 == 520);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test058");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 10, false, 1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test059");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 10, "hi!", false);
        int int18 = nestedRules0.premium(100, false, (int) (short) 100, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) -1, false, (int) (short) 1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test060");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (short) 1, false, 10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test061");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(0, false, 10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test062");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        java.lang.Class<?> wildcardClass37 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test063");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (byte) 0, true, (int) (byte) 0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test064");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium(0, false, 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test065");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(520, true, 1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 10, true, (int) (short) -1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test066");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) ' ', true, 0, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium((int) (short) 10, false, 10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520 + "'", int30 == 520);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test067");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium(0, false, (int) (byte) 100, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test068");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium((int) (short) 10, true, 700, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test069");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '#', true, 700, "hi!", true);
        java.lang.Class<?> wildcardClass13 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test070");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (byte) 10, false, (int) (short) 100, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test071");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium((int) ' ', false, 10, "hi!", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test072");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (byte) 1, false, 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test073");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 10, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (byte) 0, false, (int) (short) 1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test074");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 1, false, 700, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test075");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = nestedRules0.premium(0, true, 520, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test076");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium(0, true, (int) (short) 1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test077");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium(10, true, (int) 'a', "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test078");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (byte) 0, true, 10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test079");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) 'a', true, 700, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (byte) 0, false, (int) (short) -1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test080");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((-1), true, 10, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test081");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (short) 0, false, (int) (byte) 10, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test082");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (short) 100, true, (int) (byte) 10, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium(10, false, 650, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test083");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 1, true, (int) '#', "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test084");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 10, "hi!", false);
        int int18 = nestedRules0.premium(100, false, (int) (short) 100, "hi!", true);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test085");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (byte) 10, false, (int) (short) 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test086");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 10, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (byte) -1, true, (int) 'a', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test087");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium(580, false, (int) (byte) 0, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) 10, true, 1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test088");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium((int) 'a', false, (int) '4', "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (byte) 10, true, (int) (short) 1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test089");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium(580, true, (int) '#', "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test090");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium((int) (short) -1, false, (int) (short) 0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test091");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) 10, false, (int) (short) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test092");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (short) 100, true, (int) (byte) 10, "", false);
        java.lang.Class<?> wildcardClass13 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test093");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (byte) -1, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((-1), false, (int) (short) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 520 + "'", int18 == 520);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test094");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(0, true, (int) (short) 10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test095");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) 'a', true, 700, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (byte) 1, true, (int) (short) 10, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test096");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) '#', false, 100, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) 1, false, 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test097");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (short) 0, false, (int) (short) 10, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test098");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(650, false, (int) '#', "", false);
        java.lang.Class<?> wildcardClass13 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test099");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = nestedRules0.premium(0, false, 500, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test100");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(100, false, (int) (byte) 100, "hi!", false);
        int int24 = nestedRules0.premium(650, false, (int) '4', "hi!", false);
        int int30 = nestedRules0.premium((int) 'a', true, 520, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium(0, false, (int) (short) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test101");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium((int) 'a', false, (int) '4', "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test102");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test103");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium(700, true, 580, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (short) 10, true, 100, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test104");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium(100, false, (int) (byte) 100, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium(10, false, 500, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test105");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium(580, false, (int) (byte) 0, "hi!", false);
        int int24 = nestedRules0.premium(700, false, 1, "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test106");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) 'a', true, 700, "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test107");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test108");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test109");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium(580, false, (int) (byte) 0, "hi!", false);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test110");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 650, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (byte) 1, false, (int) (byte) 10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test111");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (byte) -1, "", true);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 520 + "'", int18 == 520);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test112");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '#', true, 700, "hi!", true);
        int int18 = nestedRules0.premium((int) (short) 100, false, 10, "", true);
        int int24 = nestedRules0.premium(500, false, 1, "hi!", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test113");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium(700, true, 580, "", false);
        int int30 = nestedRules0.premium(580, true, 1, "hi!", false);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test114");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '#', true, 700, "hi!", true);
        int int18 = nestedRules0.premium((int) (short) 100, false, 10, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) 0, true, 520, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test115");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) -1, true, 500, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test116");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(100, false, (int) (byte) 100, "hi!", false);
        int int24 = nestedRules0.premium(650, false, (int) '4', "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (byte) 0, false, (int) (short) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test117");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium(1, false, (int) (short) 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test118");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) ' ', true, 0, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium(0, true, 650, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520 + "'", int30 == 520);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test119");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(500, true, (int) 'a', "hi!", true);
        int int24 = nestedRules0.premium(100, true, 700, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium(0, false, (int) 'a', "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test120");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(100, true, (int) (short) 10, "hi!", true);
        java.lang.Class<?> wildcardClass37 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test121");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 10, "hi!", false);
        int int18 = nestedRules0.premium(100, false, (int) (short) 100, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(0, true, (int) (byte) -1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test122");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium(500, false, (int) (short) -1, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (short) 1, false, (int) 'a', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test123");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) 'a', true, (int) (byte) 100, "hi!", true);
        java.lang.Class<?> wildcardClass13 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test124");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '#', true, 700, "hi!", true);
        int int18 = nestedRules0.premium((int) (short) 100, false, 10, "", true);
        int int24 = nestedRules0.premium(500, false, 1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (byte) 10, false, 10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test125");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) ' ', true, 0, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium(0, false, (int) (byte) -1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520 + "'", int30 == 520);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test126");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(650, false, (int) (byte) 1, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium(0, false, (int) '#', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test127");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium(580, false, (int) (byte) 0, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) 1, false, (int) (byte) 10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test128");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium(650, true, (int) ' ', "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(0, false, 1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test129");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) ' ', true, 0, "", false);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520 + "'", int30 == 520);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test130");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (short) 1, true, 10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test131");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(500, false, (int) ' ', "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (short) 1, false, 500, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test132");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) '#', false, 100, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(0, true, (int) (short) -1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test133");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) ' ', true, (int) (byte) 1, "hi!", true);
        int int36 = nestedRules0.premium(500, false, (int) (short) 0, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium(0, false, (int) (short) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520 + "'", int30 == 520);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test134");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium(700, false, 10, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium(0, false, (int) (short) 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test135");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(500, true, (int) 'a', "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(0, false, (int) (byte) 10, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test136");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = nestedRules0.premium((-1), false, 580, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test137");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) '#', false, 100, "hi!", true);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test138");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(520, true, (int) '4', "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium((int) (short) -1, false, 10, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test139");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium(700, true, 580, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (short) 1, false, 0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test140");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(650, false, (int) '#', "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (short) -1, false, (int) 'a', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test141");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(500, false, (int) (byte) 1, "", true);
        java.lang.Class<?> wildcardClass37 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test142");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) ' ', true, (int) (byte) 1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium((int) (short) -1, false, (int) (byte) 1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520 + "'", int30 == 520);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test143");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(500, true, (int) (byte) 1, "hi!", false);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test144");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) (short) 100, false, 0, "hi!", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test145");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(500, true, (int) 'a', "hi!", true);
        int int24 = nestedRules0.premium(500, false, (int) (short) 1, "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test146");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 10, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (byte) -1, false, 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test147");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium((int) (short) 100, true, (int) (short) 100, "", false);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test148");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(650, false, (int) (byte) 0, "hi!", true);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test149");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(500, false, (int) (byte) 1, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium(1, false, (int) (short) -1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test150");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(500, false, (int) ' ', "", true);
        java.lang.Class<?> wildcardClass13 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test151");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(520, true, (int) '4', "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium((int) (short) 1, true, 10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test152");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (byte) -1, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) -1, false, (int) (short) 0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 520 + "'", int18 == 520);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test153");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(100, true, (int) (short) 10, "hi!", true);
        int int42 = nestedRules0.premium((int) (short) 100, false, 100, "", false);
        int int48 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "", true);
        java.lang.Class<?> wildcardClass49 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 700 + "'", int42 == 700);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 650 + "'", int48 == 650);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test154");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '#', true, 700, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((-1), true, 100, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test155");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((-1), true, (int) (short) 100, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test156");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test157");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium(500, false, (int) (short) -1, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium(0, false, 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test158");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(520, true, (int) '4', "hi!", true);
        java.lang.Class<?> wildcardClass37 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test159");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(700, true, 580, "hi!", true);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test160");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(500, true, (int) 'a', "hi!", true);
        int int24 = nestedRules0.premium(100, true, 700, "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test161");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium(580, false, (int) (byte) 0, "hi!", false);
        int int24 = nestedRules0.premium((int) ' ', false, 100, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (byte) 1, true, 580, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 650 + "'", int24 == 650);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test162");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(100, false, (int) (byte) 100, "hi!", false);
        int int24 = nestedRules0.premium(650, false, (int) '4', "hi!", false);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test163");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium(700, true, 580, "", false);
        int int30 = nestedRules0.premium(580, true, 1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium((int) (byte) -1, true, (-1), "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test164");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium((int) (short) 0, false, (int) (byte) 10, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test165");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        int int42 = nestedRules0.premium(650, false, (int) (short) -1, "", false);
        int int48 = nestedRules0.premium((int) (short) 100, false, (int) (byte) 100, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = nestedRules0.premium((int) (short) 10, false, 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 700 + "'", int48 == 700);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test166");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) 'a', true, (int) (short) -1, "", true);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test167");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        int int42 = nestedRules0.premium(650, false, (int) (short) -1, "", false);
        int int48 = nestedRules0.premium((int) (short) 100, false, (int) (byte) 100, "", false);
        java.lang.Class<?> wildcardClass49 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 700 + "'", int48 == 700);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test168");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium(580, true, (int) '#', "", true);
        int int30 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 0, "", true);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test169");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(500, true, (int) (short) 0, "hi!", true);
        java.lang.Class<?> wildcardClass37 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test170");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '#', true, 700, "hi!", true);
        int int18 = nestedRules0.premium((int) (short) 100, false, 10, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 10, true, 500, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test171");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium(500, false, (int) (short) -1, "", false);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test172");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium(580, false, (int) (byte) 0, "hi!", false);
        int int24 = nestedRules0.premium((int) ' ', false, 100, "", false);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 650 + "'", int24 == 650);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test173");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (byte) -1, "hi!", false);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 520 + "'", int18 == 520);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test174");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test175");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium(580, false, (int) (byte) 0, "hi!", false);
        int int24 = nestedRules0.premium((int) ' ', false, 100, "", false);
        int int30 = nestedRules0.premium((int) '4', false, (int) (byte) 10, "", false);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 650 + "'", int24 == 650);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 650 + "'", int30 == 650);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test176");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium(580, false, (int) (byte) 0, "hi!", false);
        int int24 = nestedRules0.premium(700, false, 1, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium(1, true, 580, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test177");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '#', true, 700, "hi!", true);
        int int18 = nestedRules0.premium((int) (short) 100, false, 10, "", true);
        int int24 = nestedRules0.premium(500, false, 1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium(0, true, 580, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test178");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) -1, false, 500, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test179");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium(500, true, 700, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium((int) (short) 1, true, (int) (byte) 1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test180");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (byte) -1, "", true);
        int int24 = nestedRules0.premium((int) '4', false, (int) (short) 0, "", false);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 520 + "'", int18 == 520);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 500 + "'", int24 == 500);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test181");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(500, true, (int) 'a', "hi!", true);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test182");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 10, true, 580, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test183");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        int int42 = nestedRules0.premium(650, false, (int) (short) -1, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = nestedRules0.premium((int) (short) 10, true, 700, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test184");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) (short) 100, false, 0, "hi!", true);
        int int30 = nestedRules0.premium(520, false, 580, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium(0, false, (int) (byte) 10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test185");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(100, true, (int) (short) 10, "hi!", true);
        int int42 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "", false);
        java.lang.Class<?> wildcardClass43 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test186");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) (short) 100, false, 0, "hi!", true);
        int int30 = nestedRules0.premium(520, false, 580, "hi!", false);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test187");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(100, false, (int) (byte) 100, "hi!", false);
        int int24 = nestedRules0.premium(650, false, (int) '4', "hi!", false);
        int int30 = nestedRules0.premium((int) 'a', true, 520, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium(10, true, 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test188");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) ' ', true, 0, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium((int) (short) 1, false, (int) (byte) 1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520 + "'", int30 == 520);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test189");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) -1, false, (int) (byte) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test190");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) '#', false, 100, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) 1, true, (int) (byte) 10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test191");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(500, true, (int) (byte) 1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(0, true, (int) (short) -1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test192");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(500, false, (int) ' ', "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (short) 10, true, (int) (byte) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test193");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test194");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) (short) 100, false, 0, "hi!", true);
        int int30 = nestedRules0.premium((int) 'a', true, 580, "", true);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test195");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) ' ', true, 0, "", false);
        int int36 = nestedRules0.premium(500, false, 500, "hi!", true);
        java.lang.Class<?> wildcardClass37 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520 + "'", int30 == 520);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test196");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(520, true, 1, "hi!", false);
        int int24 = nestedRules0.premium(580, true, (int) 'a', "", false);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test197");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) '#', false, 100, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, false, (int) '4', "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test198");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) '#', false, 100, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, false, (int) '4', "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium(1, true, (int) (byte) 100, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test199");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) ' ', true, 0, "", false);
        int int36 = nestedRules0.premium(500, false, 500, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium((int) (short) 1, false, (int) (short) 1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520 + "'", int30 == 520);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test200");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium(100, false, (int) (byte) 100, "hi!", true);
        int int24 = nestedRules0.premium((int) (short) 100, false, (int) (short) 1, "hi!", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test201");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        java.lang.Class<?> wildcardClass13 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test202");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(650, false, (int) (byte) 1, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (short) -1, false, 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test203");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium(500, true, 700, "", false);
        int int36 = nestedRules0.premium(100, true, (int) (byte) -1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium(0, false, (int) (short) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test204");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium(500, true, 700, "", false);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test205");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium(700, false, 10, "", false);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test206");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (byte) 100, "", false);
        java.lang.Class<?> wildcardClass13 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test207");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        int int42 = nestedRules0.premium(650, false, (int) (short) -1, "", false);
        int int48 = nestedRules0.premium((int) (short) 100, false, (int) (byte) 100, "", false);
        int int54 = nestedRules0.premium((int) '#', true, 100, "hi!", true);
        java.lang.Class<?> wildcardClass55 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 700 + "'", int48 == 700);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 650 + "'", int54 == 650);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test208");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium(700, false, 10, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium(0, false, 700, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test209");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(500, false, (int) ' ', "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium(0, true, 100, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test210");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        int int42 = nestedRules0.premium(650, false, (int) (short) -1, "", false);
        int int48 = nestedRules0.premium((int) (short) 100, false, (int) (byte) 100, "", false);
        int int54 = nestedRules0.premium((int) '#', true, 100, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = nestedRules0.premium(0, false, 0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 700 + "'", int48 == 700);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 650 + "'", int54 == 650);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test211");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (byte) 100, "", false);
        int int18 = nestedRules0.premium((int) '4', false, (-1), "", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test212");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(520, true, 1, "hi!", false);
        int int24 = nestedRules0.premium(650, false, (int) (short) 0, "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test213");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(500, false, (int) ' ', "", true);
        int int18 = nestedRules0.premium((int) ' ', false, 580, "hi!", false);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test214");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (short) -1, false, (int) (byte) 0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test215");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (short) 0, true, (int) (short) 0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test216");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium(580, false, (int) (byte) 0, "hi!", false);
        int int24 = nestedRules0.premium(700, false, 1, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium(0, false, 10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test217");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, false, 100, "", true);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test218");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) 'a', true, 700, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium(1, true, (int) (short) 100, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test219");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium(580, false, (int) (short) 10, "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test220");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        int int42 = nestedRules0.premium(650, false, (int) (short) -1, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = nestedRules0.premium(10, false, 500, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test221");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(100, true, (int) (short) 10, "hi!", true);
        int int42 = nestedRules0.premium((int) '#', true, (int) (short) 0, "", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 520 + "'", int42 == 520);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test222");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium(700, false, (int) '4', "", true);
        int int30 = nestedRules0.premium(520, true, (int) (short) 1, "hi!", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test223");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = nestedRules0.premium(0, false, (int) (short) 10, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test224");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium(0, true, (int) 'a', "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test225");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(520, true, (int) '4', "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium((int) (short) 10, false, 650, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test226");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium(500, true, 700, "", false);
        int int36 = nestedRules0.premium(100, true, (int) (byte) -1, "hi!", false);
        java.lang.Class<?> wildcardClass37 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test227");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium(100, false, (int) (byte) 100, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 1, true, (int) (short) -1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test228");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium((int) 'a', true, 580, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((-1), true, 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test229");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        int int42 = nestedRules0.premium((int) (short) 100, false, (int) 'a', "", true);
        java.lang.Class<?> wildcardClass43 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 700 + "'", int42 == 700);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test230");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (byte) 0, false, 0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test231");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(100, true, (int) (short) 10, "hi!", true);
        int int42 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "", false);
        int int48 = nestedRules0.premium((int) 'a', true, 1, "hi!", true);
        java.lang.Class<?> wildcardClass49 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 700 + "'", int48 == 700);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test232");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (byte) -1, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(10, true, 700, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 520 + "'", int18 == 520);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test233");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 10, "hi!", false);
        int int18 = nestedRules0.premium(100, false, (int) (short) 100, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, false, (-1), "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test234");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) '#', false, 100, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(0, true, 650, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test235");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) (short) 100, false, 0, "hi!", true);
        int int30 = nestedRules0.premium(520, false, 1, "hi!", false);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test236");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium(580, false, (int) (byte) 0, "hi!", false);
        int int24 = nestedRules0.premium((int) ' ', false, 100, "", false);
        int int30 = nestedRules0.premium((int) '4', false, (int) (byte) 10, "", false);
        int int36 = nestedRules0.premium(100, true, 1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium((int) (byte) 1, false, 520, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 650 + "'", int24 == 650);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 650 + "'", int30 == 650);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test237");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 10, "hi!", false);
        int int18 = nestedRules0.premium(100, false, (int) (short) 100, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 0, false, 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test238");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) 1, false, 100, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test239");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, false, 100, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) 0, false, (int) (short) -1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test240");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(650, false, (int) (byte) 0, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium((int) (byte) -1, true, (int) (byte) 1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test241");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (byte) -1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) 0, false, 650, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 520 + "'", int18 == 520);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test242");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) '#', false, 100, "hi!", true);
        int int24 = nestedRules0.premium((int) (short) 100, false, (int) (short) 1, "", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test243");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(500, false, (int) ' ', "", true);
        int int18 = nestedRules0.premium((int) ' ', false, 580, "hi!", false);
        int int24 = nestedRules0.premium((int) ' ', true, (-1), "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (short) 0, false, (-1), "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520 + "'", int24 == 520);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test244");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium(580, true, (int) '#', "", true);
        int int30 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 0, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium(10, true, (int) (byte) 1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test245");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium(700, true, 580, "", false);
        int int30 = nestedRules0.premium((int) '#', true, (int) '#', "", false);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 650 + "'", int30 == 650);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test246");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) (short) 100, false, 0, "hi!", true);
        int int30 = nestedRules0.premium((int) 'a', true, 580, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium(10, true, (int) (short) 10, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test247");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, false, 100, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) -1, false, 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test248");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium(700, false, (int) '4', "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test249");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium((int) 'a', false, (int) '4', "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium(10, false, (int) (byte) 100, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test250");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium(100, false, (int) (byte) 100, "hi!", true);
        int int24 = nestedRules0.premium(500, true, (int) (byte) -1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (byte) -1, false, (int) (byte) 100, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test251");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '#', true, 700, "hi!", true);
        int int18 = nestedRules0.premium((int) (short) 100, false, 10, "", true);
        int int24 = nestedRules0.premium(500, false, 1, "hi!", true);
        int int30 = nestedRules0.premium(520, false, (int) (byte) 1, "hi!", true);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test252");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium((int) ' ', false, (int) (byte) 100, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (short) -1, false, 0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 650 + "'", int24 == 650);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test253");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium((int) (short) 100, true, (int) (short) 100, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(0, true, (int) (byte) 100, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test254");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) '#', false, 100, "hi!", true);
        int int24 = nestedRules0.premium(700, true, (int) (byte) -1, "", false);
        int int30 = nestedRules0.premium((int) (short) 100, true, (int) (short) 1, "", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test255");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium(100, false, (int) (byte) 100, "hi!", true);
        int int24 = nestedRules0.premium(500, true, (int) (byte) -1, "hi!", false);
        int int30 = nestedRules0.premium((int) 'a', true, (-1), "", false);
        int int36 = nestedRules0.premium(580, true, (int) ' ', "hi!", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test256");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium((int) 'a', true, 580, "", true);
        int int30 = nestedRules0.premium(650, false, 0, "", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test257");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '#', true, 700, "hi!", true);
        int int18 = nestedRules0.premium((int) (short) 100, false, 10, "", true);
        int int24 = nestedRules0.premium(500, false, 1, "hi!", true);
        int int30 = nestedRules0.premium((int) (byte) 100, true, 650, "hi!", true);
        int int36 = nestedRules0.premium(650, false, 580, "", true);
        java.lang.Class<?> wildcardClass37 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test258");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(650, true, (int) (short) 1, "", true);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test259");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (byte) -1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(10, false, (int) '4', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 520 + "'", int18 == 520);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test260");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (byte) -1, "", true);
        int int24 = nestedRules0.premium((int) '4', false, (int) (short) 0, "", false);
        int int30 = nestedRules0.premium((int) (byte) 100, true, 10, "hi!", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 520 + "'", int18 == 520);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 500 + "'", int24 == 500);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test261");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) 'a', true, 10, "hi!", false);
        java.lang.Class<?> wildcardClass37 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test262");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(500, true, (int) 'a', "hi!", true);
        int int24 = nestedRules0.premium(500, false, (int) (short) 1, "", true);
        int int30 = nestedRules0.premium((int) '#', true, 650, "", true);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 650 + "'", int30 == 650);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test263");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) 'a', true, (int) (byte) 100, "hi!", true);
        int int18 = nestedRules0.premium((int) (short) 100, true, 10, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(10, true, 0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test264");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 650, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium(0, false, (int) '#', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test265");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) (short) 100, false, 0, "hi!", true);
        int int30 = nestedRules0.premium(520, false, 1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium(10, false, (int) '#', "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test266");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(520, true, 1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 1, true, 650, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test267");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium(100, false, (int) (byte) 100, "hi!", true);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test268");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium(580, false, (int) (byte) 0, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(10, true, (-1), "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test269");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium(520, true, (int) (byte) 10, "hi!", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test270");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        int int42 = nestedRules0.premium(650, false, (int) (short) -1, "", false);
        int int48 = nestedRules0.premium((int) (short) 100, false, (int) (byte) 100, "", false);
        int int54 = nestedRules0.premium((int) '4', false, 10, "hi!", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 700 + "'", int48 == 700);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 650 + "'", int54 == 650);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test271");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium(520, true, (int) (byte) 10, "hi!", true);
        int int30 = nestedRules0.premium(520, false, (int) (byte) 100, "", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test272");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(520, true, (int) '4', "hi!", true);
        int int42 = nestedRules0.premium(500, false, (int) (short) 1, "hi!", false);
        java.lang.Class<?> wildcardClass43 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 700 + "'", int42 == 700);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test273");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        int int42 = nestedRules0.premium((int) (short) 100, false, (int) 'a', "", true);
        int int48 = nestedRules0.premium(100, false, 580, "hi!", true);
        java.lang.Class<?> wildcardClass49 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 700 + "'", int42 == 700);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 700 + "'", int48 == 700);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test274");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        int int42 = nestedRules0.premium(650, false, (int) (short) -1, "", false);
        int int48 = nestedRules0.premium((int) (short) 100, false, (int) (byte) 100, "", false);
        int int54 = nestedRules0.premium(700, true, (int) '#', "", true);
        java.lang.Class<?> wildcardClass55 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 700 + "'", int48 == 700);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 700 + "'", int54 == 700);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test275");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (short) -1, false, 700, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test276");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(500, false, (int) ' ', "", true);
        int int18 = nestedRules0.premium((int) ' ', false, 580, "hi!", false);
        int int24 = nestedRules0.premium((int) ' ', true, (-1), "", false);
        int int30 = nestedRules0.premium(500, true, (int) (short) 1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium((int) (short) 1, false, (int) (byte) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520 + "'", int24 == 520);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test277");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(520, true, 1, "hi!", false);
        int int24 = nestedRules0.premium(580, true, (int) 'a', "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (byte) 1, true, 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test278");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium(500, true, 700, "", false);
        int int36 = nestedRules0.premium(100, true, (int) (byte) -1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium((int) (byte) 10, true, 500, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test279");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium((int) 'a', false, 0, "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test280");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(520, true, (int) '4', "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium((int) (short) 0, false, (int) (short) 100, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test281");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 650, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium((int) (byte) 0, true, 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test282");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) 'a', true, (int) (short) -1, "", true);
        int int36 = nestedRules0.premium(500, false, (int) (short) 0, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium(0, true, (int) (byte) 100, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test283");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium(650, true, (int) '4', "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(10, false, 10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test284");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) ' ', false, 700, "hi!", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 650 + "'", int30 == 650);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test285");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium(700, false, 10, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (byte) -1, false, (int) (byte) -1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test286");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) 10, false, (int) (byte) 100, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test287");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) '#', false, 100, "hi!", true);
        int int24 = nestedRules0.premium(700, true, (int) (byte) -1, "", false);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test288");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(500, true, (int) 'a', "hi!", true);
        int int24 = nestedRules0.premium(100, true, 700, "", true);
        int int30 = nestedRules0.premium((int) (short) 100, false, 500, "hi!", false);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test289");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(700, true, 580, "hi!", true);
        int int24 = nestedRules0.premium(650, false, (int) (short) 1, "hi!", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test290");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) ' ', true, (int) (byte) 1, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium((int) (byte) 10, true, 10, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520 + "'", int30 == 520);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test291");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium((int) ' ', true, (int) (short) -1, "hi!", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520 + "'", int30 == 520);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test292");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium(700, true, 580, "", false);
        int int30 = nestedRules0.premium((int) '#', true, (int) '#', "", false);
        int int36 = nestedRules0.premium(580, true, (-1), "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium((int) (short) -1, true, 580, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 650 + "'", int30 == 650);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test293");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(500, true, (int) 'a', "hi!", true);
        int int24 = nestedRules0.premium(100, true, 700, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium(1, false, (int) (short) 1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test294");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        int int42 = nestedRules0.premium(650, false, (int) (short) -1, "", false);
        java.lang.Class<?> wildcardClass43 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test295");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium(700, true, 580, "", false);
        int int30 = nestedRules0.premium((int) '#', true, (int) '#', "", false);
        int int36 = nestedRules0.premium(700, false, 100, "", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 650 + "'", int30 == 650);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test296");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        int int42 = nestedRules0.premium(650, false, (int) (short) -1, "", false);
        int int48 = nestedRules0.premium((int) (short) 100, false, (int) (byte) 100, "", false);
        int int54 = nestedRules0.premium((int) ' ', true, (int) (byte) 10, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = nestedRules0.premium((int) (byte) 10, true, (int) (byte) 100, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 700 + "'", int48 == 700);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 650 + "'", int54 == 650);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test297");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium((int) ' ', true, 0, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = nestedRules0.premium((-1), false, 580, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520 + "'", int30 == 520);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test298");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(650, false, (int) (byte) 0, "hi!", true);
        int int36 = nestedRules0.premium((int) (short) 100, false, 650, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium((int) (byte) 1, true, 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test299");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(650, false, (int) '#', "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nestedRules0.premium(10, true, 700, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test300");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (byte) -1, "", true);
        int int24 = nestedRules0.premium((int) '4', false, (int) (short) 0, "", false);
        int int30 = nestedRules0.premium(650, false, (int) (byte) 0, "", false);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 520 + "'", int18 == 520);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 500 + "'", int24 == 500);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test301");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) (short) 100, false, 0, "hi!", true);
        int int30 = nestedRules0.premium(520, false, 1, "hi!", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) -1, "", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test302");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 10, "hi!", false);
        int int18 = nestedRules0.premium((int) (short) 100, false, (int) (byte) 0, "hi!", true);
        java.lang.Class<?> wildcardClass19 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test303");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (byte) -1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 10, false, (int) '#', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 520 + "'", int18 == 520);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test304");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(500, true, (int) (byte) 1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium(0, true, 700, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test305");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(500, false, (int) ' ', "", true);
        int int18 = nestedRules0.premium((int) '#', true, (int) '#', "", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test306");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(500, true, (int) 'a', "hi!", true);
        int int24 = nestedRules0.premium(500, false, (int) (short) 1, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (byte) 10, true, (int) 'a', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test307");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium(100, false, (int) (byte) 100, "hi!", true);
        int int24 = nestedRules0.premium(500, true, (int) (byte) -1, "hi!", false);
        int int30 = nestedRules0.premium((int) 'a', true, (-1), "", false);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test308");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (byte) 100, "", false);
        int int18 = nestedRules0.premium(100, true, 10, "hi!", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test309");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(100, false, (int) (byte) 100, "hi!", false);
        int int24 = nestedRules0.premium(650, false, (int) '4', "hi!", false);
        int int30 = nestedRules0.premium((int) 'a', true, 520, "", true);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test310");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        int int42 = nestedRules0.premium(650, false, (int) (short) -1, "", false);
        int int48 = nestedRules0.premium((int) (short) 100, false, (int) (byte) 100, "", false);
        int int54 = nestedRules0.premium((int) '#', true, 100, "hi!", true);
        int int60 = nestedRules0.premium(500, true, 500, "", true);
        java.lang.Class<?> wildcardClass61 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 700 + "'", int48 == 700);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 650 + "'", int54 == 650);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 700 + "'", int60 == 700);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test311");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium(500, true, 700, "", false);
        int int36 = nestedRules0.premium(100, false, (int) (byte) 100, "hi!", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test312");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium(650, true, (int) ' ', "hi!", false);
        int int24 = nestedRules0.premium(580, true, (int) ' ', "hi!", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test313");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium(500, true, (int) 'a', "hi!", true);
        int int24 = nestedRules0.premium(500, false, (int) (short) 1, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", true);
        int int36 = nestedRules0.premium((int) '4', true, (-1), "", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 520 + "'", int36 == 520);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test314");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium((int) 'a', false, (int) '4', "", true);
        int int30 = nestedRules0.premium(700, false, 700, "hi!", true);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test315");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium(580, false, (int) (byte) 0, "hi!", false);
        int int24 = nestedRules0.premium((int) 'a', false, 500, "", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test316");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(520, true, (int) '4', "hi!", true);
        int int42 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) -1, "", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test317");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium(580, false, (int) (byte) 0, "hi!", false);
        int int24 = nestedRules0.premium((int) ' ', false, 100, "", false);
        int int30 = nestedRules0.premium((int) '4', false, (int) (byte) 10, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) -1, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = nestedRules0.premium(10, false, 500, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 650 + "'", int24 == 650);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 650 + "'", int30 == 650);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test318");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, false, 100, "", true);
        int int24 = nestedRules0.premium(500, false, 650, "hi!", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test319");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 650, "hi!", false);
        int int18 = nestedRules0.premium(500, true, (int) (short) 100, "", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test320");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) 'a', true, (int) (byte) 100, "hi!", true);
        int int18 = nestedRules0.premium((int) (short) 100, true, 10, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 1, false, 100, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test321");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium((int) ' ', false, (int) (byte) -1, "", true);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 500 + "'", int30 == 500);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test322");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium((int) 'a', true, 580, "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test323");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium(580, false, (int) (byte) 0, "hi!", false);
        int int24 = nestedRules0.premium(700, false, 1, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (short) -1, true, 500, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test324");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) 'a', true, (int) (byte) 100, "hi!", true);
        int int18 = nestedRules0.premium((int) (short) 100, true, 10, "", true);
        int int24 = nestedRules0.premium((int) (short) 100, true, (int) 'a', "hi!", false);
        int int30 = nestedRules0.premium(100, false, (int) (short) 0, "hi!", false);
        int int36 = nestedRules0.premium(500, false, 100, "", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test325");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        int int24 = nestedRules0.premium(700, false, (int) '4', "", true);
        int int30 = nestedRules0.premium((int) '#', false, (int) '4', "", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 650 + "'", int30 == 650);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test326");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) 'a', true, (int) (short) -1, "", true);
        int int36 = nestedRules0.premium(100, true, 1, "", true);
        java.lang.Class<?> wildcardClass37 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test327");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium(500, false, (int) (short) -1, "", false);
        int int30 = nestedRules0.premium((int) '#', true, 0, "hi!", true);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520 + "'", int30 == 520);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test328");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium(500, true, (int) '4', "hi!", true);
        int int24 = nestedRules0.premium(100, true, (int) (byte) 10, "hi!", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test329");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) (short) 100, false, 0, "hi!", true);
        int int30 = nestedRules0.premium(520, false, 580, "hi!", false);
        int int36 = nestedRules0.premium(100, false, 0, "hi!", true);
        java.lang.Class<?> wildcardClass37 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test330");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (short) 100, true, (int) (byte) 10, "", false);
        int int18 = nestedRules0.premium(500, true, (int) (short) 100, "", true);
        int int24 = nestedRules0.premium((int) '#', false, 580, "hi!", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 650 + "'", int24 == 650);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test331");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (short) 100, true, (int) (byte) 10, "", false);
        int int18 = nestedRules0.premium(500, true, (int) (short) 0, "", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test332");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 650, "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, (int) ' ', "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 10, true, 580, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test333");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium((int) 'a', true, 580, "", true);
        int int30 = nestedRules0.premium((int) '4', true, (-1), "", false);
        int int36 = nestedRules0.premium(500, true, (int) (byte) 0, "hi!", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520 + "'", int30 == 520);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test334");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium(580, false, (int) (short) 100, "", true);
        int int30 = nestedRules0.premium(100, true, (int) (byte) 0, "", true);
        int int36 = nestedRules0.premium(100, true, (int) (short) 10, "hi!", true);
        int int42 = nestedRules0.premium((int) (short) 100, false, 100, "", false);
        java.lang.Class<?> wildcardClass43 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 700 + "'", int42 == 700);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test335");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 650, "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, (int) (byte) 0, "", false);
        int int24 = nestedRules0.premium(100, true, 0, "", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test336");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(520, false, (int) (short) -1, "", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 580 + "'", int12 == 580);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test337");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium(500, false, (int) ' ', "", true);
        int int18 = nestedRules0.premium((int) ' ', false, 580, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (short) 1, true, (int) (byte) 100, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test338");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) '#', false, (int) (short) 1, "", true);
        int int24 = nestedRules0.premium((int) 'a', true, 700, "", true);
        int int30 = nestedRules0.premium((int) (byte) 100, false, (int) ' ', "hi!", true);
        int int36 = nestedRules0.premium(100, false, (int) (byte) 0, "", false);
        int int42 = nestedRules0.premium(650, false, (int) (short) 0, "hi!", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test339");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '#', true, 700, "hi!", true);
        int int18 = nestedRules0.premium((int) (short) 100, false, 10, "", true);
        int int24 = nestedRules0.premium(500, false, 1, "hi!", true);
        int int30 = nestedRules0.premium((int) ' ', true, 580, "", true);
        java.lang.Class<?> wildcardClass31 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 650 + "'", int30 == 650);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test340");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium((int) 'a', true, (int) (short) -1, "", true);
        int int36 = nestedRules0.premium((int) 'a', true, (int) (short) 100, "", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test341");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) '4', true, (int) (short) -1, "hi!", true);
        int int18 = nestedRules0.premium(100, true, 0, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nestedRules0.premium((int) (byte) 0, false, 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520 + "'", int12 == 520);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test342");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) '#', false, 100, "hi!", true);
        int int24 = nestedRules0.premium(700, true, (int) (byte) -1, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (byte) 1, false, 580, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test343");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int30 = nestedRules0.premium(700, false, (int) (byte) 0, "hi!", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 580 + "'", int30 == 580);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test344");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium(500, true, 700, "", false);
        int int36 = nestedRules0.premium((int) ' ', true, 10, "", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 650 + "'", int36 == 650);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test345");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium(650, true, 700, "hi!", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test346");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium(100, false, 100, "", false);
        int int36 = nestedRules0.premium((int) (byte) 100, false, (int) (byte) 0, "hi!", true);
        int int42 = nestedRules0.premium(650, false, (int) (short) -1, "", false);
        int int48 = nestedRules0.premium((int) (short) 100, false, (int) (byte) 100, "", false);
        int int54 = nestedRules0.premium((int) '#', true, 100, "hi!", true);
        int int60 = nestedRules0.premium(500, true, 500, "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int66 = nestedRules0.premium(10, false, (int) (byte) -1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 580 + "'", int42 == 580);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 700 + "'", int48 == 700);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 650 + "'", int54 == 650);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 700 + "'", int60 == 700);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test347");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium(100, true, (int) (byte) 1, "hi!", true);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (short) 100, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 10, "", true);
        int int30 = nestedRules0.premium((int) ' ', true, 10, "", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 650 + "'", int30 == 650);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test348");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium((int) (byte) 100, true, (int) (short) 100, "hi!", false);
        int int30 = nestedRules0.premium(500, true, 700, "", false);
        int int36 = nestedRules0.premium(100, true, (int) (byte) -1, "hi!", false);
        int int42 = nestedRules0.premium((int) '#', false, 700, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = nestedRules0.premium((int) (byte) 0, false, 650, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580 + "'", int36 == 580);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 650 + "'", int42 == 650);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test349");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium(700, false, (int) (short) 0, "hi!", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) (byte) 100, "hi!", false);
        int int18 = nestedRules0.premium((int) ' ', true, (int) (byte) -1, "hi!", false);
        int int24 = nestedRules0.premium((int) (byte) 100, true, 100, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium((int) (short) 10, false, (int) (short) 1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 520 + "'", int18 == 520);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test350");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) (byte) 100, true, (int) '#', "hi!", false);
        int int18 = nestedRules0.premium((int) 'a', false, 0, "", true);
        int int24 = nestedRules0.premium((int) ' ', false, (int) (byte) 100, "", true);
        java.lang.Class<?> wildcardClass25 = nestedRules0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 700 + "'", int12 == 700);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 580 + "'", int18 == 580);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 650 + "'", int24 == 650);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NestedRulesRandoopTest0.test351");
        benchmark.NestedRules nestedRules0 = new benchmark.NestedRules();
        int int6 = nestedRules0.premium((int) ' ', false, (int) (short) 100, "", true);
        int int12 = nestedRules0.premium((int) '4', true, 500, "hi!", false);
        int int18 = nestedRules0.premium(700, true, (int) (short) 1, "hi!", true);
        int int24 = nestedRules0.premium(520, true, 0, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = nestedRules0.premium(1, false, (int) '4', "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid applicant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 650 + "'", int6 == 650);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 650 + "'", int12 == 650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 580 + "'", int24 == 580);
    }
}

