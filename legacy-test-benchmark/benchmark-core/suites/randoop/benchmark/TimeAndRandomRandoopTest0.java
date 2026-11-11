package benchmark;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TimeAndRandomRandoopTest0 {

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
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test001");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour(1.0d);
        java.lang.Class<?> wildcardClass3 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test002");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.lang.Class<?> wildcardClass6 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "1) test002(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7M7RN44R" + "'", str2, "7M7RN44R");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test003");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        java.lang.Class<?> wildcardClass6 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test004");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = timeAndRandom0.priceWithHappyHour((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "2) test004(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XVSB75AG" + "'", str2, "XVSB75AG");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test005");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.Class<?> wildcardClass4 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test006");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.lang.Class<?> wildcardClass6 = path5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "3) test006(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAK3LHL3" + "'", str2, "JAK3LHL3");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test007");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("SK8S366L");
        java.lang.Class<?> wildcardClass8 = path7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test008");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.Class<?> wildcardClass4 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "4) test008(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "W5RFV3BY" + "'", str2, "W5RFV3BY");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test009");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        java.lang.Class<?> wildcardClass5 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "5) test009(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9SPDMZFY" + "'", str2, "9SPDMZFY");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "1) test009(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQDBHEHW" + "'", str4, "MQDBHEHW");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test010");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        double double4 = timeAndRandom0.priceWithHappyHour((double) 10);
        java.lang.Class<?> wildcardClass5 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "6) test010(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3ZQDT6PZ" + "'", str2, "3ZQDT6PZ");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test011");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("9TFK9MFE");
        // The following exception was thrown during execution in test generation
        try {
            double double7 = timeAndRandom0.priceWithHappyHour((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "7) test011(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z8GH6VVX" + "'", str2, "Z8GH6VVX");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test012");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = timeAndRandom0.priceWithHappyHour((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "8) test012(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TSLHVNT7" + "'", str2, "TSLHVNT7");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test013");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.lang.Class<?> wildcardClass3 = path2.getClass();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test014");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test015");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = timeAndRandom0.priceWithHappyHour((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test016");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        int int1 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.Class<?> wildcardClass2 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test017");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WM7PDVP7");
        boolean boolean6 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("hi!");
        double double10 = timeAndRandom0.priceWithHappyHour((double) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test018");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
// flaky "9) test018(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HT4RLHZE" + "'", str4, "HT4RLHZE");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test019");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "10) test019(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Y9FXGNLG" + "'", str2, "Y9FXGNLG");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(path5);
// flaky "2) test019(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "XM6ENT2R" + "'", str6, "XM6ENT2R");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test020");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        double double5 = timeAndRandom0.priceWithHappyHour((double) ' ');
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        double double8 = timeAndRandom0.priceWithHappyHour((double) 10);
        boolean boolean9 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "11) test020(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UZLD8YCS" + "'", str3, "UZLD8YCS");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
// flaky "3) test020(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JK7HW9ZW" + "'", str6, "JK7HW9ZW");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test021");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.lang.Class<?> wildcardClass6 = path5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "12) test021(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "QCWJ4VLU" + "'", str2, "QCWJ4VLU");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test022");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        double double5 = timeAndRandom0.priceWithHappyHour((double) ' ');
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.Class<?> wildcardClass7 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "13) test022(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "W43AHYZ5" + "'", str3, "W43AHYZ5");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test023");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        java.lang.Class<?> wildcardClass6 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "14) test023(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BWY8H4T5" + "'", str2, "BWY8H4T5");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test024");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        java.lang.Class<?> wildcardClass4 = path3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test025");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("DYZ4GANX");
        java.lang.Class<?> wildcardClass8 = path7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "15) test025(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PPK52R4L" + "'", str2, "PPK52R4L");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test026");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.lang.Class<?> wildcardClass6 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "16) test026(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "VN7PC698" + "'", str2, "VN7PC698");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test027");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (short) 0);
        double double9 = timeAndRandom0.priceWithHappyHour((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double11 = timeAndRandom0.priceWithHappyHour((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test028");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        double double4 = timeAndRandom0.priceWithHappyHour(35.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "17) test028(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LGLBTAWP" + "'", str2, "LGLBTAWP");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test029");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        // The following exception was thrown during execution in test generation
        try {
            double double9 = timeAndRandom0.priceWithHappyHour((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "18) test029(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RLPR4VNC" + "'", str2, "RLPR4VNC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test030");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        double double5 = timeAndRandom0.priceWithHappyHour((double) (byte) 10);
        java.lang.Class<?> wildcardClass6 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "19) test030(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6FJLDRH9" + "'", str2, "6FJLDRH9");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test031");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        double double4 = timeAndRandom0.priceWithHappyHour((double) 10);
        boolean boolean5 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "20) test031(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "YATM7E6Q" + "'", str2, "YATM7E6Q");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test032");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        double double7 = timeAndRandom0.priceWithHappyHour((double) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "21) test032(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RH7P33WW" + "'", str2, "RH7P33WW");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test033");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("ALH582J9");
        java.lang.String str10 = timeAndRandom0.generateCouponCode();
        java.lang.Class<?> wildcardClass11 = timeAndRandom0.getClass();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(path9);
// flaky "22) test033(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Q9HQBGEH" + "'", str10, "Q9HQBGEH");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test034");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        double double8 = timeAndRandom0.priceWithHappyHour(19.0d);
        java.nio.file.Path path10 = timeAndRandom0.appendToDailyReport("SKR65SR2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 19.0d + "'", double8 == 19.0d);
        org.junit.Assert.assertNotNull(path10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test035");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("EGU9EUDX");
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        int int9 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "23) test035(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "G7TP4U7B" + "'", str2, "G7TP4U7B");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test036");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        java.lang.Class<?> wildcardClass4 = path3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test037");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        java.lang.Class<?> wildcardClass6 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test038");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.Class<?> wildcardClass5 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test039");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        double double8 = timeAndRandom0.priceWithHappyHour(19.0d);
        java.lang.Class<?> wildcardClass9 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 19.0d + "'", double8 == 19.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test040");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        double double5 = timeAndRandom0.priceWithHappyHour((double) ' ');
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        double double8 = timeAndRandom0.priceWithHappyHour((double) 10);
        int int9 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "24) test040(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GV8PKP73" + "'", str3, "GV8PKP73");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
// flaky "4) test040(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LKH6LNGQ" + "'", str6, "LKH6LNGQ");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test041");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("ALH582J9");
        java.lang.String str10 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path12 = timeAndRandom0.appendToDailyReport("");
        java.lang.Class<?> wildcardClass13 = timeAndRandom0.getClass();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(path9);
// flaky "25) test041(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JUZCLBBL" + "'", str10, "JUZCLBBL");
        org.junit.Assert.assertNotNull(path12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test042");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.Class<?> wildcardClass7 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "26) test042(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "VMEYQEHS" + "'", str2, "VMEYQEHS");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "5) test042(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SWJ3NFPL" + "'", str4, "SWJ3NFPL");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test043");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        double double9 = timeAndRandom0.priceWithHappyHour(0.0d);
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test044");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        double double7 = timeAndRandom0.priceWithHappyHour((double) (byte) 0);
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        java.lang.Class<?> wildcardClass10 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "27) test044(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3XJRGNSG" + "'", str2, "3XJRGNSG");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test045");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.Class<?> wildcardClass5 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "28) test045(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "J2ZW8824" + "'", str2, "J2ZW8824");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test046");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        // The following exception was thrown during execution in test generation
        try {
            double double7 = timeAndRandom0.priceWithHappyHour((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "29) test046(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UBM2W48P" + "'", str2, "UBM2W48P");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test047");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        double double6 = timeAndRandom0.priceWithHappyHour((double) 100);
        java.lang.Class<?> wildcardClass7 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "30) test047(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6HJS3HLQ" + "'", str2, "6HJS3HLQ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "6) test047(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TEG5S6Z8" + "'", str4, "TEG5S6Z8");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test048");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        // The following exception was thrown during execution in test generation
        try {
            double double7 = timeAndRandom0.priceWithHappyHour((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "31) test048(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "E2HWGJ7C" + "'", str2, "E2HWGJ7C");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(path5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test049");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        double double10 = timeAndRandom0.priceWithHappyHour((double) (byte) 100);
        java.lang.Class<?> wildcardClass11 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "32) test049(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FHN5XJGB" + "'", str2, "FHN5XJGB");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test050");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        double double4 = timeAndRandom0.priceWithHappyHour((double) 10);
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.Class<?> wildcardClass6 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "33) test050(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "R7E7MKRB" + "'", str2, "R7E7MKRB");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test051");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (short) 0);
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("6FJLDRH9");
        int int10 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test052");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = timeAndRandom0.priceWithHappyHour((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "34) test052(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N2BJX943" + "'", str2, "N2BJX943");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
// flaky "7) test052(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "388NPJFQ" + "'", str6, "388NPJFQ");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test053");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        double double9 = timeAndRandom0.priceWithHappyHour(19.0d);
        java.lang.Class<?> wildcardClass10 = timeAndRandom0.getClass();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 19.0d + "'", double9 == 19.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test054");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("ALH582J9");
        java.lang.String str10 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path12 = timeAndRandom0.appendToDailyReport("");
        boolean boolean13 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(path9);
// flaky "35) test054(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5MPQYSW3" + "'", str10, "5MPQYSW3");
        org.junit.Assert.assertNotNull(path12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test055");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path10 = timeAndRandom0.appendToDailyReport("57E7HYHE");
        java.lang.Class<?> wildcardClass11 = path10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "36) test055(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7L3HJC9X" + "'", str2, "7L3HJC9X");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "8) test055(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "VNS5U2DS" + "'", str8, "VNS5U2DS");
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test056");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        java.lang.Class<?> wildcardClass4 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "37) test056(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DYSLA36U" + "'", str3, "DYSLA36U");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test057");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        double double6 = timeAndRandom0.priceWithHappyHour((double) 100);
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("RGGYKCSU");
        int int9 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "38) test057(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8SERLNN6" + "'", str2, "8SERLNN6");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "9) test057(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "M8ML9KKU" + "'", str4, "M8ML9KKU");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test058");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str5 = timeAndRandom0.generateCouponCode();
        java.lang.Class<?> wildcardClass6 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "39) test058(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LW5J5BRV" + "'", str2, "LW5J5BRV");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
// flaky "10) test058(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2RR592XC" + "'", str5, "2RR592XC");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test059");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.lang.Class<?> wildcardClass6 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "40) test059(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DR8VFGWP" + "'", str2, "DR8VFGWP");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test060");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("ALH582J9");
        java.lang.String str10 = timeAndRandom0.generateCouponCode();
        boolean boolean11 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(path9);
// flaky "41) test060(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Z9TUZ6UH" + "'", str10, "Z9TUZ6UH");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test061");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("ZD7QV8FC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNotNull(path5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test062");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        double double5 = timeAndRandom0.priceWithHappyHour((double) ' ');
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        double double8 = timeAndRandom0.priceWithHappyHour((double) 10);
        double double10 = timeAndRandom0.priceWithHappyHour((double) 0);
        java.lang.String str11 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "42) test062(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SGESSQWY" + "'", str3, "SGESSQWY");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
// flaky "11) test062(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H6ATSY5P" + "'", str6, "H6ATSY5P");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
// flaky "1) test062(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "XAHL3CP9" + "'", str11, "XAHL3CP9");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test063");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        double double5 = timeAndRandom0.priceWithHappyHour((double) ' ');
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        java.lang.Class<?> wildcardClass7 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "43) test063(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "M3QEA8GP" + "'", str3, "M3QEA8GP");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
// flaky "12) test063(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DPNWE4P3" + "'", str6, "DPNWE4P3");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test064");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WM7PDVP7");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("ALH582J9");
        double double9 = timeAndRandom0.priceWithHappyHour((double) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test065");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WM7PDVP7");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("ALH582J9");
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("TRZTLH98");
        java.lang.Class<?> wildcardClass10 = path9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test066");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "44) test066(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "37NHDWKG" + "'", str2, "37NHDWKG");
// flaky "13) test066(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9MG7FRTN" + "'", str3, "9MG7FRTN");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test067");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        double double6 = timeAndRandom0.priceWithHappyHour((double) 100);
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("RGGYKCSU");
        java.nio.file.Path path10 = timeAndRandom0.appendToDailyReport("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "45) test067(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NAQUMQSE" + "'", str2, "NAQUMQSE");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "14) test067(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "QUTWFQ4E" + "'", str4, "QUTWFQ4E");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertNotNull(path10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test068");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        double double10 = timeAndRandom0.priceWithHappyHour(35.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "46) test068(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8H6G635J" + "'", str2, "8H6G635J");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "15) test068(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RZSTHFE5" + "'", str8, "RZSTHFE5");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test069");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (short) 0);
        double double9 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("5QUQ3FGD");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(path11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test070");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        int int1 = timeAndRandom0.daysUntilEndOfMonth();
        double double3 = timeAndRandom0.priceWithHappyHour(97.0d);
        java.lang.Class<?> wildcardClass4 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test071");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("NPQNJHP3");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("");
        boolean boolean8 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test072");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path6 = timeAndRandom0.appendToDailyReport("H6ATSY5P");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(path6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test073");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        double double5 = timeAndRandom0.priceWithHappyHour((double) (byte) 10);
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("W9F6AJFJ");
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("KAZDPHJR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "47) test073(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Y92YPW43" + "'", str2, "Y92YPW43");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertNotNull(path9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test074");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("");
        boolean boolean8 = timeAndRandom0.isHappyHour();
        java.lang.String str9 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "48) test074(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N8B4FLYQ" + "'", str2, "N8B4FLYQ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "16) test074(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8ZXTJ83G" + "'", str9, "8ZXTJ83G");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test075");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        boolean boolean5 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
// flaky "49) test075(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KN2ZDDJN" + "'", str4, "KN2ZDDJN");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test076");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        double double7 = timeAndRandom0.priceWithHappyHour(0.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "50) test076(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "22R3LWBG" + "'", str2, "22R3LWBG");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test077");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        double double5 = timeAndRandom0.priceWithHappyHour((double) ' ');
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        double double8 = timeAndRandom0.priceWithHappyHour((double) 10);
        double double10 = timeAndRandom0.priceWithHappyHour((double) 0);
        java.nio.file.Path path12 = timeAndRandom0.appendToDailyReport("M8ML9KKU");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "51) test077(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KCNBH5MP" + "'", str3, "KCNBH5MP");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
// flaky "17) test077(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CKRU7F6D" + "'", str6, "CKRU7F6D");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(path12);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test078");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        java.lang.Class<?> wildcardClass4 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test079");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        double double5 = timeAndRandom0.priceWithHappyHour((double) (byte) 10);
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        int int7 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.Class<?> wildcardClass8 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "52) test079(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PBZHVC44" + "'", str2, "PBZHVC44");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test080");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        double double9 = timeAndRandom0.priceWithHappyHour(97.0d);
        int int10 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "53) test080(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MABJK37C" + "'", str2, "MABJK37C");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test081");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.lang.Class<?> wildcardClass8 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "54) test081(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7SGBMGRP" + "'", str2, "7SGBMGRP");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test082");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        boolean boolean6 = timeAndRandom0.isHappyHour();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.Class<?> wildcardClass9 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "55) test082(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JAP9TMX4" + "'", str7, "JAP9TMX4");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test083");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        java.lang.String str5 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
// flaky "56) test083(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GUVJ55K8" + "'", str5, "GUVJ55K8");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test084");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        java.lang.Class<?> wildcardClass10 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky "57) test084(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SVLHHY79" + "'", str6, "SVLHHY79");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test085");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        java.lang.Class<?> wildcardClass6 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test086");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path10 = timeAndRandom0.appendToDailyReport("57E7HYHE");
        double double12 = timeAndRandom0.priceWithHappyHour((double) (byte) 10);
        double double14 = timeAndRandom0.priceWithHappyHour((double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "58) test086(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UVG4UT29" + "'", str2, "UVG4UT29");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "18) test086(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LJZHPQPB" + "'", str8, "LJZHPQPB");
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test087");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("ALH582J9");
        boolean boolean10 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test088");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("NPQNJHP3");
        boolean boolean6 = timeAndRandom0.isHappyHour();
        double double8 = timeAndRandom0.priceWithHappyHour((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test089");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("NPQNJHP3");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("");
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test090");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        double double7 = timeAndRandom0.priceWithHappyHour((double) 10);
        java.lang.Class<?> wildcardClass8 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "59) test090(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "V2L2BWPV" + "'", str2, "V2L2BWPV");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test091");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        double double5 = timeAndRandom0.priceWithHappyHour((double) (byte) 10);
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        int int7 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean8 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "60) test091(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "897KHCLT" + "'", str2, "897KHCLT");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test092");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("");
        boolean boolean8 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path10 = timeAndRandom0.appendToDailyReport("PHL7CLXB");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "61) test092(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KBE4XLS6" + "'", str2, "KBE4XLS6");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(path10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test093");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        double double8 = timeAndRandom0.priceWithHappyHour((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "62) test093(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "X8JFWGR5" + "'", str2, "X8JFWGR5");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "19) test093(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "R9AHZ2QE" + "'", str4, "R9AHZ2QE");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test094");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        int int7 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("9G8J75WH");
        // The following exception was thrown during execution in test generation
        try {
            double double11 = timeAndRandom0.priceWithHappyHour((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertNotNull(path9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test095");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (short) 0);
        double double9 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("PPK52R4L");
        java.lang.String str12 = timeAndRandom0.generateCouponCode();
        boolean boolean13 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(path11);
// flaky "63) test095(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "VUE9MKCJ" + "'", str12, "VUE9MKCJ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test096");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("BWY8H4T5");
        double double10 = timeAndRandom0.priceWithHappyHour((double) '#');
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test097");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (short) 0);
        boolean boolean8 = timeAndRandom0.isHappyHour();
        double double10 = timeAndRandom0.priceWithHappyHour((double) '4');
        java.lang.String str11 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
// flaky "64) test097(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9DQQ3T5F" + "'", str11, "9DQQ3T5F");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test098");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        double double8 = timeAndRandom0.priceWithHappyHour((double) 100.0f);
        double double10 = timeAndRandom0.priceWithHappyHour((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = timeAndRandom0.priceWithHappyHour((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test099");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        double double7 = timeAndRandom0.priceWithHappyHour((double) (byte) 0);
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path10 = timeAndRandom0.appendToDailyReport("9TFK9MFE");
        java.lang.String str11 = timeAndRandom0.generateCouponCode();
        int int12 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str13 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "65) test099(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XTDM73JG" + "'", str2, "XTDM73JG");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(path10);
// flaky "20) test099(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "S6Z8KBCE" + "'", str11, "S6Z8KBCE");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
// flaky "2) test099(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MCMRFWX3" + "'", str13, "MCMRFWX3");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test100");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean5 = timeAndRandom0.isHappyHour();
        boolean boolean6 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "66) test100(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9VT9X9T9" + "'", str3, "9VT9X9T9");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test101");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.lang.Class<?> wildcardClass8 = timeAndRandom0.getClass();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test102");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        double double7 = timeAndRandom0.priceWithHappyHour((double) (byte) 0);
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        boolean boolean10 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "67) test102(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U6PX292F" + "'", str2, "U6PX292F");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "21) test102(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UXHSJD2V" + "'", str8, "UXHSJD2V");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test103");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        boolean boolean5 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
// flaky "68) test103(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PH4X8SAJ" + "'", str4, "PH4X8SAJ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test104");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        int int7 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("9G8J75WH");
        boolean boolean10 = timeAndRandom0.isHappyHour();
        boolean boolean11 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path13 = timeAndRandom0.appendToDailyReport("TRZTLH98");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(path13);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test105");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("LGLBTAWP");
        double double11 = timeAndRandom0.priceWithHappyHour((double) 100.0f);
        java.nio.file.Path path13 = timeAndRandom0.appendToDailyReport("LW5J5BRV");
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(path13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test106");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        java.nio.file.Path path6 = timeAndRandom0.appendToDailyReport("2KQYY27C");
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
// flaky "69) test106(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "BJBZWLMJ" + "'", str7, "BJBZWLMJ");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test107");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("EGU9EUDX");
        boolean boolean8 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "70) test107(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N9SEXN7A" + "'", str2, "N9SEXN7A");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test108");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        double double4 = timeAndRandom0.priceWithHappyHour((double) 10);
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        java.lang.Class<?> wildcardClass7 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "71) test108(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "VGPHLHZZ" + "'", str2, "VGPHLHZZ");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
// flaky "22) test108(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "QRRFNB8M" + "'", str6, "QRRFNB8M");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test109");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("EGU9EUDX");
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("5SPJJVWW");
        java.lang.Class<?> wildcardClass10 = path9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "72) test109(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PSUG2MP3" + "'", str2, "PSUG2MP3");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test110");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        boolean boolean3 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test111");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.lang.Class<?> wildcardClass6 = path5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "73) test111(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7L6LSYHJ" + "'", str2, "7L6LSYHJ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test112");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        double double9 = timeAndRandom0.priceWithHappyHour(19.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "74) test112(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9ZZW5DFY" + "'", str2, "9ZZW5DFY");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
// flaky "23) test112(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PJTRY26W" + "'", str7, "PJTRY26W");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 19.0d + "'", double9 == 19.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test113");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("YUBN7DER");
        int int9 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean10 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky "75) test113(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SCAYUZ74" + "'", str6, "SCAYUZ74");
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test114");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        double double8 = timeAndRandom0.priceWithHappyHour(35.0d);
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
// flaky "76) test114(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "6HQRKCWJ" + "'", str6, "6HQRKCWJ");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test115");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        double double6 = timeAndRandom0.priceWithHappyHour((double) 100);
        boolean boolean7 = timeAndRandom0.isHappyHour();
        double double9 = timeAndRandom0.priceWithHappyHour((double) (byte) 10);
        int int10 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "77) test115(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52Y4B88U" + "'", str2, "52Y4B88U");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "24) test115(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KLK6BH4P" + "'", str4, "KLK6BH4P");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test116");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        double double7 = timeAndRandom0.priceWithHappyHour((double) (byte) 0);
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("W3BDYHXP");
        java.lang.String str10 = timeAndRandom0.generateCouponCode();
        boolean boolean11 = timeAndRandom0.isHappyHour();
        boolean boolean12 = timeAndRandom0.isHappyHour();
        java.lang.Class<?> wildcardClass13 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "78) test116(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LSPTUG5G" + "'", str2, "LSPTUG5G");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(path9);
// flaky "25) test116(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZV545NES" + "'", str10, "ZV545NES");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test117");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        double double10 = timeAndRandom0.priceWithHappyHour((double) '4');
        java.nio.file.Path path12 = timeAndRandom0.appendToDailyReport("DJ9UWN9Q");
        java.lang.Class<?> wildcardClass13 = path12.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "79) test117(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DAA4VTBW" + "'", str2, "DAA4VTBW");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "26) test117(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CXMZYTVM" + "'", str8, "CXMZYTVM");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(path12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test118");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("NPQNJHP3");
        double double7 = timeAndRandom0.priceWithHappyHour((double) (byte) 100);
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test119");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        int int9 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "80) test119(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UF3Z9QXL" + "'", str2, "UF3Z9QXL");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "27) test119(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FEDVNDEM" + "'", str8, "FEDVNDEM");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test120");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        double double6 = timeAndRandom0.priceWithHappyHour((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "81) test120(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FF4GLVJ7" + "'", str2, "FF4GLVJ7");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test121");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        double double7 = timeAndRandom0.priceWithHappyHour((double) (byte) 0);
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = timeAndRandom0.priceWithHappyHour((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "82) test121(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TASQBGGK" + "'", str2, "TASQBGGK");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test122");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        double double7 = timeAndRandom0.priceWithHappyHour((double) (byte) 0);
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        int int10 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "83) test122(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "D29Q5FBF" + "'", str2, "D29Q5FBF");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test123");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        double double9 = timeAndRandom0.priceWithHappyHour(52.0d);
        java.lang.Class<?> wildcardClass10 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "84) test123(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H54PPXTM" + "'", str2, "H54PPXTM");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
// flaky "28) test123(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "WNZM56HJ" + "'", str7, "WNZM56HJ");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test124");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (short) 0);
        boolean boolean8 = timeAndRandom0.isHappyHour();
        double double10 = timeAndRandom0.priceWithHappyHour((double) '4');
        boolean boolean11 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test125");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("BWY8H4T5");
        boolean boolean9 = timeAndRandom0.isHappyHour();
        int int10 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test126");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (short) 0);
        double double9 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("PPK52R4L");
        boolean boolean12 = timeAndRandom0.isHappyHour();
        java.lang.Class<?> wildcardClass13 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(path11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test127");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        double double5 = timeAndRandom0.priceWithHappyHour((double) (byte) 10);
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("W9F6AJFJ");
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.Class<?> wildcardClass9 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "85) test127(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GE4FH82J" + "'", str2, "GE4FH82J");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test128");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("EGU9EUDX");
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "86) test128(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9HGQYL6Y" + "'", str2, "9HGQYL6Y");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test129");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.lang.Class<?> wildcardClass8 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "87) test129(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8NGQXBZ5" + "'", str2, "8NGQXBZ5");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test130");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (short) 0);
        double double9 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("PPK52R4L");
        java.lang.Class<?> wildcardClass12 = path11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(path11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test131");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        java.nio.file.Path path6 = timeAndRandom0.appendToDailyReport("W5RFV3BY");
        double double8 = timeAndRandom0.priceWithHappyHour(97.0d);
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test132");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("9TFK9MFE");
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "88) test132(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EYSP4PVX" + "'", str2, "EYSP4PVX");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
// flaky "29) test132(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4KNS6X2L" + "'", str6, "4KNS6X2L");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test133");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("NDK2ZJ9M");
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test134");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        double double6 = timeAndRandom0.priceWithHappyHour((double) 100);
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("UJNSLKR3");
        java.lang.String str9 = timeAndRandom0.generateCouponCode();
        java.lang.String str10 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "89) test134(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4WBMMX62" + "'", str2, "4WBMMX62");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "30) test134(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "67BQEN2V" + "'", str4, "67BQEN2V");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(path8);
// flaky "3) test134(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "T7MKG2P9" + "'", str9, "T7MKG2P9");
// flaky "1) test134(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "KG2SUBY4" + "'", str10, "KG2SUBY4");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test135");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("YG3VU6AK");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky "90) test135(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VP68U2XX" + "'", str6, "VP68U2XX");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(path11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test136");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("EGU9EUDX");
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("5SPJJVWW");
        int int10 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "91) test136(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NGRKXEBQ" + "'", str2, "NGRKXEBQ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test137");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = timeAndRandom0.priceWithHappyHour((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "92) test137(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NA69CGAA" + "'", str2, "NA69CGAA");
// flaky "31) test137(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZALCHA95" + "'", str3, "ZALCHA95");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test138");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path10 = timeAndRandom0.appendToDailyReport("57E7HYHE");
        java.lang.Class<?> wildcardClass11 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "93) test138(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NZRF9RVW" + "'", str2, "NZRF9RVW");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "32) test138(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H95PP3VA" + "'", str8, "H95PP3VA");
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test139");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        double double6 = timeAndRandom0.priceWithHappyHour((double) 100);
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("UJNSLKR3");
        java.lang.String str9 = timeAndRandom0.generateCouponCode();
        int int10 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "94) test139(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CBU5QZ2T" + "'", str2, "CBU5QZ2T");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "33) test139(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3EQ94U93" + "'", str4, "3EQ94U93");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(path8);
// flaky "4) test139(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ZPRMQMJS" + "'", str9, "ZPRMQMJS");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test140");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        double double9 = timeAndRandom0.priceWithHappyHour(52.0d);
        double double11 = timeAndRandom0.priceWithHappyHour((double) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "95) test140(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EP7WVHJY" + "'", str2, "EP7WVHJY");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
// flaky "34) test140(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "V3VZPEBX" + "'", str7, "V3VZPEBX");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test141");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("NPQNJHP3");
        double double7 = timeAndRandom0.priceWithHappyHour((double) (byte) 100);
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.Class<?> wildcardClass9 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test142");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (short) 0);
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("6FJLDRH9");
        double double11 = timeAndRandom0.priceWithHappyHour((double) 100.0f);
        java.nio.file.Path path13 = timeAndRandom0.appendToDailyReport("EGU9EUDX");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(path13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test143");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        boolean boolean5 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test144");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        boolean boolean6 = timeAndRandom0.isHappyHour();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("ALH582J9");
        java.lang.String str10 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "96) test144(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RQ5X3D7X" + "'", str7, "RQ5X3D7X");
        org.junit.Assert.assertNotNull(path9);
// flaky "35) test144(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "C5NCNNKM" + "'", str10, "C5NCNNKM");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test145");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("ALH582J9");
        java.lang.Class<?> wildcardClass10 = timeAndRandom0.getClass();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test146");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        int int7 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("9G8J75WH");
        double double11 = timeAndRandom0.priceWithHappyHour((double) (byte) 1);
        java.lang.String str12 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
// flaky "97) test146(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JDK32C7G" + "'", str12, "JDK32C7G");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test147");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        double double5 = timeAndRandom0.priceWithHappyHour((double) 19);
        boolean boolean6 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "98) test147(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5PYURFX2" + "'", str3, "5PYURFX2");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 19.0d + "'", double5 == 19.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test148");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        int int7 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("9G8J75WH");
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("N6BZ4GNK");
        int int12 = timeAndRandom0.daysUntilEndOfMonth();
        double double14 = timeAndRandom0.priceWithHappyHour((double) 100L);
        int int15 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertNotNull(path11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test149");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("");
        boolean boolean8 = timeAndRandom0.isHappyHour();
        int int9 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "99) test149(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3ZRH9T3C" + "'", str2, "3ZRH9T3C");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test150");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        double double8 = timeAndRandom0.priceWithHappyHour((double) 100.0f);
        double double10 = timeAndRandom0.priceWithHappyHour((double) 0);
        int int11 = timeAndRandom0.daysUntilEndOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = timeAndRandom0.priceWithHappyHour((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test151");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (short) 0);
        boolean boolean8 = timeAndRandom0.isHappyHour();
        double double10 = timeAndRandom0.priceWithHappyHour((double) (byte) 1);
        java.lang.String str11 = timeAndRandom0.generateCouponCode();
        double double13 = timeAndRandom0.priceWithHappyHour((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
// flaky "100) test151(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UBJWU9CP" + "'", str11, "UBJWU9CP");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test152");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str5 = timeAndRandom0.generateCouponCode();
        boolean boolean6 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "101) test152(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Q9R5UDKT" + "'", str2, "Q9R5UDKT");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
// flaky "36) test152(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RNPY8HPX" + "'", str5, "RNPY8HPX");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test153");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("ALH582J9");
        double double11 = timeAndRandom0.priceWithHappyHour((double) (short) 10);
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test154");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        boolean boolean6 = timeAndRandom0.isHappyHour();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        boolean boolean8 = timeAndRandom0.isHappyHour();
        java.lang.String str9 = timeAndRandom0.generateCouponCode();
        java.lang.String str10 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "102) test154(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MUQ5MN9J" + "'", str7, "MUQ5MN9J");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "37) test154(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SGSS2RKD" + "'", str9, "SGSS2RKD");
// flaky "5) test154(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UJ3Z9MFD" + "'", str10, "UJ3Z9MFD");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test155");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        java.nio.file.Path path6 = timeAndRandom0.appendToDailyReport("W5RFV3BY");
        java.lang.Class<?> wildcardClass7 = timeAndRandom0.getClass();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test156");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        double double10 = timeAndRandom0.priceWithHappyHour((double) (byte) 100);
        boolean boolean11 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "103) test156(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "VB4HJLFW" + "'", str2, "VB4HJLFW");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test157");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("LKH6LNGQ");
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        java.lang.Class<?> wildcardClass9 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "104) test157(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XZSFMVPG" + "'", str2, "XZSFMVPG");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
// flaky "38) test157(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ER8CTN6M" + "'", str8, "ER8CTN6M");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test158");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("NPQNJHP3");
        double double7 = timeAndRandom0.priceWithHappyHour((double) (byte) 100);
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        double double10 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
// flaky "105) test158(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "B5EJDYNR" + "'", str8, "B5EJDYNR");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test159");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        java.nio.file.Path path6 = timeAndRandom0.appendToDailyReport("");
        int int7 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean8 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test160");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("ALH582J9");
        java.lang.String str10 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path12 = timeAndRandom0.appendToDailyReport("");
        java.lang.String str13 = timeAndRandom0.generateCouponCode();
        boolean boolean14 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path16 = timeAndRandom0.appendToDailyReport("8WWJG4JU");
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(path9);
// flaky "106) test160(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VX9CCDZF" + "'", str10, "VX9CCDZF");
        org.junit.Assert.assertNotNull(path12);
// flaky "39) test160(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JTZ2E9J3" + "'", str13, "JTZ2E9J3");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(path16);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test161");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        double double6 = timeAndRandom0.priceWithHappyHour((double) 100);
        boolean boolean7 = timeAndRandom0.isHappyHour();
        boolean boolean8 = timeAndRandom0.isHappyHour();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = timeAndRandom0.priceWithHappyHour((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "107) test161(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "94FF8Z4S" + "'", str2, "94FF8Z4S");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "40) test161(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2DTXCV4P" + "'", str4, "2DTXCV4P");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test162");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (short) 0);
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("6FJLDRH9");
        double double11 = timeAndRandom0.priceWithHappyHour((double) 100L);
        int int12 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test163");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour(1.0d);
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test164");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        java.lang.String str5 = timeAndRandom0.generateCouponCode();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "108) test164(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9VCZQ39Z" + "'", str2, "9VCZQ39Z");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
// flaky "41) test164(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "X4MEXW7C" + "'", str4, "X4MEXW7C");
// flaky "6) test164(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LEVYARRK" + "'", str5, "LEVYARRK");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test165");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("");
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "109) test165(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "98GK559K" + "'", str2, "98GK559K");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test166");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test167");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        boolean boolean6 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "110) test167(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DHUF2DKM" + "'", str2, "DHUF2DKM");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test168");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (short) 0);
        boolean boolean8 = timeAndRandom0.isHappyHour();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test169");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("DYZ4GANX");
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.Class<?> wildcardClass9 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "111) test169(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KBCV66SG" + "'", str2, "KBCV66SG");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test170");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        double double5 = timeAndRandom0.priceWithHappyHour((double) ' ');
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        int int7 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.Class<?> wildcardClass8 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "112) test170(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AHFVB5Q9" + "'", str3, "AHFVB5Q9");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test171");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        double double5 = timeAndRandom0.priceWithHappyHour((double) ' ');
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "113) test171(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5WLLGRK2" + "'", str3, "5WLLGRK2");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test172");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        double double9 = timeAndRandom0.priceWithHappyHour(19.0d);
        int int10 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean11 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 19.0d + "'", double9 == 19.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test173");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        boolean boolean4 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test174");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean5 = timeAndRandom0.isHappyHour();
        java.lang.Class<?> wildcardClass6 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "114) test174(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "G3VEKLTP" + "'", str3, "G3VEKLTP");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test175");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        boolean boolean6 = timeAndRandom0.isHappyHour();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("V2L2BWPV");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "115) test175(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RXVUP7DG" + "'", str7, "RXVUP7DG");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(path11);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test176");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WM7PDVP7");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("ALH582J9");
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("LCTJYJPZ");
        java.lang.Class<?> wildcardClass10 = path9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test177");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("QCWJ4VLU");
        java.lang.Class<?> wildcardClass8 = path7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "116) test177(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5QMUKFUR" + "'", str2, "5QMUKFUR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "42) test177(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CRUR9N2G" + "'", str4, "CRUR9N2G");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test178");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("SK8S366L");
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("3X9DF5S7");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertNotNull(path9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test179");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        java.lang.String str5 = timeAndRandom0.generateCouponCode();
        boolean boolean6 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "117) test179(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EXM4G3NF" + "'", str2, "EXM4G3NF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "43) test179(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4YDLY8FC" + "'", str4, "4YDLY8FC");
// flaky "7) test179(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8GMJ2X5Z" + "'", str5, "8GMJ2X5Z");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test180");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("KAZDPHJR");
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("FF4GLVJ7");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "118) test180(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S7ZAZNYH" + "'", str2, "S7ZAZNYH");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertNotNull(path11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test181");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        int int1 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean2 = timeAndRandom0.isHappyHour();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("4KK9MCHY");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(path5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test182");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        double double9 = timeAndRandom0.priceWithHappyHour(52.0d);
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("LW657HYV");
        java.nio.file.Path path13 = timeAndRandom0.appendToDailyReport("98GK559K");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "119) test182(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKH8X389" + "'", str2, "AKH8X389");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
// flaky "44) test182(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "X5KHXK4J" + "'", str7, "X5KHXK4J");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(path11);
        org.junit.Assert.assertNotNull(path13);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test183");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        double double5 = timeAndRandom0.priceWithHappyHour((double) (byte) 10);
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        int int7 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "120) test183(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SP27AXXA" + "'", str2, "SP27AXXA");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
// flaky "45) test183(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5WHWRUSZ" + "'", str8, "5WHWRUSZ");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test184");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (short) 0);
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "121) test184(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "WXHPB6NW" + "'", str8, "WXHPB6NW");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test185");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        int int7 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("9G8J75WH");
        boolean boolean10 = timeAndRandom0.isHappyHour();
        boolean boolean11 = timeAndRandom0.isHappyHour();
        java.lang.String str12 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "122) test185(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LSUYC2CC" + "'", str12, "LSUYC2CC");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test186");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        double double5 = timeAndRandom0.priceWithHappyHour((double) ' ');
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = timeAndRandom0.priceWithHappyHour((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "123) test186(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TKNY23WN" + "'", str3, "TKNY23WN");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
// flaky "46) test186(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2FAZ86UC" + "'", str6, "2FAZ86UC");
// flaky "8) test186(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2ZDZS9JH" + "'", str7, "2ZDZS9JH");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test187");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        double double6 = timeAndRandom0.priceWithHappyHour((double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "124) test187(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "REE3YY6V" + "'", str3, "REE3YY6V");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test188");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (short) 0);
        boolean boolean8 = timeAndRandom0.isHappyHour();
        double double10 = timeAndRandom0.priceWithHappyHour((double) (byte) 1);
        java.lang.String str11 = timeAndRandom0.generateCouponCode();
        boolean boolean12 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
// flaky "125) test188(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "WGLE5JYF" + "'", str11, "WGLE5JYF");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test189");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("DYZ4GANX");
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str9 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("ZPRMQMJS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "126) test189(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U3FDZSVP" + "'", str2, "U3FDZSVP");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
// flaky "47) test189(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TQJQN7L5" + "'", str9, "TQJQN7L5");
        org.junit.Assert.assertNotNull(path11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test190");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str5 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("E9BR2HD2");
        java.lang.Class<?> wildcardClass8 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
// flaky "127) test190(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "XRXJNB4Q" + "'", str5, "XRXJNB4Q");
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test191");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        double double8 = timeAndRandom0.priceWithHappyHour((double) 100.0f);
        double double10 = timeAndRandom0.priceWithHappyHour((double) 0);
        double double12 = timeAndRandom0.priceWithHappyHour(0.0d);
        int int13 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test192");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (short) 0);
        double double9 = timeAndRandom0.priceWithHappyHour((double) 'a');
        double double11 = timeAndRandom0.priceWithHappyHour((double) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test193");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("5MPQYSW3");
        boolean boolean8 = timeAndRandom0.isHappyHour();
        int int9 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "128) test193(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AZQ7FUGR" + "'", str2, "AZQ7FUGR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "48) test193(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "VKY6SNPJ" + "'", str4, "VKY6SNPJ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test194");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        double double8 = timeAndRandom0.priceWithHappyHour((double) 100.0f);
        double double10 = timeAndRandom0.priceWithHappyHour((double) 100.0f);
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test195");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        double double6 = timeAndRandom0.priceWithHappyHour((double) 100);
        double double8 = timeAndRandom0.priceWithHappyHour((double) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "129) test195(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LGBMDL6Y" + "'", str2, "LGBMDL6Y");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "49) test195(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5XF7R7FW" + "'", str4, "5XF7R7FW");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test196");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WM7PDVP7");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("ALH582J9");
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path10 = timeAndRandom0.appendToDailyReport("USGXQ25V");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
// flaky "130) test196(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ZAQ2Q8HW" + "'", str8, "ZAQ2Q8HW");
        org.junit.Assert.assertNotNull(path10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test197");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        double double9 = timeAndRandom0.priceWithHappyHour(52.0d);
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("69QB937M");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "131) test197(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2Z7Q2UZT" + "'", str2, "2Z7Q2UZT");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
// flaky "50) test197(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EFU3B2CG" + "'", str7, "EFU3B2CG");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(path11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test198");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        java.lang.String str5 = timeAndRandom0.generateCouponCode();
        double double7 = timeAndRandom0.priceWithHappyHour(0.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "132) test198(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "992T5ENR" + "'", str2, "992T5ENR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "51) test198(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "VWQLY2RF" + "'", str4, "VWQLY2RF");
// flaky "9) test198(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LQ4GJKWJ" + "'", str5, "LQ4GJKWJ");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test199");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        double double5 = timeAndRandom0.priceWithHappyHour((double) ' ');
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        double double8 = timeAndRandom0.priceWithHappyHour(10.0d);
        int int9 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean10 = timeAndRandom0.isHappyHour();
        boolean boolean11 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "133) test199(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "B266R8YX" + "'", str3, "B266R8YX");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test200");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        boolean boolean3 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test201");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        int int1 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean2 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("8JQEYAZY");
        boolean boolean5 = timeAndRandom0.isHappyHour();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = timeAndRandom0.priceWithHappyHour((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: price must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test202");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        double double10 = timeAndRandom0.priceWithHappyHour((double) '4');
        java.nio.file.Path path12 = timeAndRandom0.appendToDailyReport("DJ9UWN9Q");
        java.lang.Class<?> wildcardClass13 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "134) test202(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3SFG7H7W" + "'", str2, "3SFG7H7W");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "52) test202(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "B2GPPM2F" + "'", str8, "B2GPPM2F");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(path12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test203");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour(1.0d);
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("");
        double double6 = timeAndRandom0.priceWithHappyHour((double) (byte) 1);
        boolean boolean7 = timeAndRandom0.isHappyHour();
        double double9 = timeAndRandom0.priceWithHappyHour((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test204");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "135) test204(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2XUCWFYN" + "'", str3, "2XUCWFYN");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test205");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        double double6 = timeAndRandom0.priceWithHappyHour((double) 100);
        double double8 = timeAndRandom0.priceWithHappyHour((double) 'a');
        boolean boolean9 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "136) test205(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3WX9K3BM" + "'", str2, "3WX9K3BM");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "53) test205(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HTEALUCH" + "'", str4, "HTEALUCH");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test206");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        double double4 = timeAndRandom0.priceWithHappyHour((double) 10);
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        double double8 = timeAndRandom0.priceWithHappyHour(1.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "137) test206(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8KF7DTDQ" + "'", str2, "8KF7DTDQ");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
// flaky "54) test206(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5R6NG95U" + "'", str6, "5R6NG95U");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test207");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean5 = timeAndRandom0.isHappyHour();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "138) test207(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NBGK2X5S" + "'", str3, "NBGK2X5S");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test208");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        double double7 = timeAndRandom0.priceWithHappyHour((double) (byte) 10);
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test209");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WM7PDVP7");
        boolean boolean6 = timeAndRandom0.isHappyHour();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        boolean boolean8 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test210");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str5 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "139) test210(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRNMHSK2" + "'", str2, "TRNMHSK2");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
// flaky "55) test210(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Q6CYDE8T" + "'", str5, "Q6CYDE8T");
        org.junit.Assert.assertNotNull(path7);
// flaky "10) test210(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "YWXCNUBF" + "'", str8, "YWXCNUBF");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test211");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        double double9 = timeAndRandom0.priceWithHappyHour(52.0d);
        int int10 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "140) test211(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BAL9Y2EA" + "'", str2, "BAL9Y2EA");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
// flaky "56) test211(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PHZH4RWB" + "'", str7, "PHZH4RWB");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test212");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        int int7 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("9G8J75WH");
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("N6BZ4GNK");
        int int12 = timeAndRandom0.daysUntilEndOfMonth();
        int int13 = timeAndRandom0.daysUntilEndOfMonth();
        int int14 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertNotNull(path11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test213");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WM7PDVP7");
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNotNull(path5);
// flaky "141) test213(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2L8WZ8NW" + "'", str6, "2L8WZ8NW");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test214");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        boolean boolean6 = timeAndRandom0.isHappyHour();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        boolean boolean8 = timeAndRandom0.isHappyHour();
        java.lang.Class<?> wildcardClass9 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "142) test214(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "YANXCWVK" + "'", str7, "YANXCWVK");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test215");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("YUBN7DER");
        int int9 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.Class<?> wildcardClass10 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky "143) test215(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TGFFBST5" + "'", str6, "TGFFBST5");
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test216");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        double double7 = timeAndRandom0.priceWithHappyHour((double) (byte) 0);
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        double double11 = timeAndRandom0.priceWithHappyHour(32.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "144) test216(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KKYFK4CR" + "'", str2, "KKYFK4CR");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "57) test216(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Y4Q5TAL2" + "'", str8, "Y4Q5TAL2");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test217");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        double double7 = timeAndRandom0.priceWithHappyHour((double) 10);
        boolean boolean8 = timeAndRandom0.isHappyHour();
        java.lang.Class<?> wildcardClass9 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "145) test217(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4BQZQSCL" + "'", str2, "4BQZQSCL");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test218");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        boolean boolean4 = timeAndRandom0.isHappyHour();
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "146) test218(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H3MGN968" + "'", str3, "H3MGN968");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test219");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        double double10 = timeAndRandom0.priceWithHappyHour((double) (byte) 100);
        int int11 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "147) test219(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LVCXZ4HN" + "'", str2, "LVCXZ4HN");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test220");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        double double5 = timeAndRandom0.priceWithHappyHour((double) ' ');
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        double double8 = timeAndRandom0.priceWithHappyHour(10.0d);
        int int9 = timeAndRandom0.daysUntilEndOfMonth();
        int int10 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "148) test220(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7U9YUDU3" + "'", str3, "7U9YUDU3");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test221");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        double double6 = timeAndRandom0.priceWithHappyHour((double) 100);
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        java.lang.String str9 = timeAndRandom0.generateCouponCode();
        int int10 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "149) test221(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "R3TQNBDX" + "'", str2, "R3TQNBDX");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "58) test221(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RZ9QSXNC" + "'", str4, "RZ9QSXNC");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "11) test221(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "QS3DZSGE" + "'", str8, "QS3DZSGE");
// flaky "2) test221(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KNPZA2MV" + "'", str9, "KNPZA2MV");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test222");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        boolean boolean6 = timeAndRandom0.isHappyHour();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        boolean boolean10 = timeAndRandom0.isHappyHour();
        double double12 = timeAndRandom0.priceWithHappyHour(35.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "150) test222(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4UGT7KJN" + "'", str7, "4UGT7KJN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test223");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        boolean boolean6 = timeAndRandom0.isHappyHour();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        boolean boolean10 = timeAndRandom0.isHappyHour();
        boolean boolean11 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "151) test223(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AQYY2VQ2" + "'", str7, "AQYY2VQ2");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test224");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        java.lang.String str5 = timeAndRandom0.generateCouponCode();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "152) test224(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TJKUWCX9" + "'", str2, "TJKUWCX9");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "59) test224(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "S642K2US" + "'", str4, "S642K2US");
// flaky "12) test224(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "NHMV9AM2" + "'", str5, "NHMV9AM2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test225");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky "153) test225(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AZXS9PH9" + "'", str6, "AZXS9PH9");
// flaky "60) test225(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LF5WGGWN" + "'", str7, "LF5WGGWN");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test226");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("FTV54MRW");
        int int10 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky "154) test226(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SBWEU4GP" + "'", str6, "SBWEU4GP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test227");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.Class<?> wildcardClass5 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test228");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("LW5J5BRV");
        java.lang.Class<?> wildcardClass8 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "155) test228(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "33GU6PGN" + "'", str2, "33GU6PGN");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test229");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("VX9CCDZF");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky "156) test229(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35DT4WUW" + "'", str6, "35DT4WUW");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(path11);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test230");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("YUBN7DER");
        java.lang.Class<?> wildcardClass9 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky "157) test230(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UHU5A2EZ" + "'", str6, "UHU5A2EZ");
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test231");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        double double7 = timeAndRandom0.priceWithHappyHour((double) '#');
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str9 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "158) test231(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MB7AFC4N" + "'", str2, "MB7AFC4N");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
// flaky "61) test231(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "G9ES8GJZ" + "'", str9, "G9ES8GJZ");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test232");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        double double7 = timeAndRandom0.priceWithHappyHour((double) 1.0f);
        boolean boolean8 = timeAndRandom0.isHappyHour();
        double double10 = timeAndRandom0.priceWithHappyHour((double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "159) test232(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "YSW2YUSG" + "'", str2, "YSW2YUSG");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "62) test232(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "XBEYBFEV" + "'", str4, "XBEYBFEV");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test233");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        int int4 = timeAndRandom0.daysUntilEndOfMonth();
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        int int7 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("DSRWEEVK");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "160) test233(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8FVY5F9W" + "'", str2, "8FVY5F9W");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
// flaky "63) test233(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "8NTWDTZT" + "'", str8, "8NTWDTZT");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(path11);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test234");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        double double5 = timeAndRandom0.priceWithHappyHour(52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test235");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        double double7 = timeAndRandom0.priceWithHappyHour((double) (byte) 0);
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        java.lang.String str10 = timeAndRandom0.generateCouponCode();
        boolean boolean11 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path13 = timeAndRandom0.appendToDailyReport("LEXWTS29");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "161) test235(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6Y69MT95" + "'", str2, "6Y69MT95");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "64) test235(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "B2WGZT88" + "'", str8, "B2WGZT88");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "13) test235(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9NDS87S5" + "'", str10, "9NDS87S5");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(path13);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test236");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        double double5 = timeAndRandom0.priceWithHappyHour((double) ' ');
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        double double8 = timeAndRandom0.priceWithHappyHour(10.0d);
        int int9 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("L9YQ6Z4C");
        double double13 = timeAndRandom0.priceWithHappyHour((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "162) test236(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CV5UMZ4M" + "'", str3, "CV5UMZ4M");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
        org.junit.Assert.assertNotNull(path11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test237");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        boolean boolean6 = timeAndRandom0.isHappyHour();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test238");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path10 = timeAndRandom0.appendToDailyReport("57E7HYHE");
        java.nio.file.Path path12 = timeAndRandom0.appendToDailyReport("Y92YPW43");
        int int13 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str14 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "163) test238(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AXAG55DT" + "'", str2, "AXAG55DT");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "65) test238(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FLMJBYUE" + "'", str8, "FLMJBYUE");
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(path12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
// flaky "14) test238(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "XQRBUF4B" + "'", str14, "XQRBUF4B");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test239");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        java.lang.String str9 = timeAndRandom0.generateCouponCode();
        boolean boolean10 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "164) test239(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "YBFG8KA9" + "'", str8, "YBFG8KA9");
// flaky "66) test239(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "URZKLKK8" + "'", str9, "URZKLKK8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test240");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("YUBN7DER");
        java.lang.String str9 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky "165) test240(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SHDU5SAC" + "'", str6, "SHDU5SAC");
        org.junit.Assert.assertNotNull(path8);
// flaky "67) test240(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "G4Y62JDU" + "'", str9, "G4Y62JDU");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test241");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        double double7 = timeAndRandom0.priceWithHappyHour((double) (byte) 0);
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        int int10 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "166) test241(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "QTPZ6T3A" + "'", str2, "QTPZ6T3A");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "68) test241(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "J2M6RVBS" + "'", str8, "J2M6RVBS");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test242");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        double double5 = timeAndRandom0.priceWithHappyHour((double) ' ');
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        java.lang.String str7 = timeAndRandom0.generateCouponCode();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        java.lang.String str9 = timeAndRandom0.generateCouponCode();
        java.lang.String str10 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "167) test242(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BDL3HXR7" + "'", str3, "BDL3HXR7");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
// flaky "69) test242(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ZBHN7X26" + "'", str6, "ZBHN7X26");
// flaky "15) test242(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3MCQYBUW" + "'", str7, "3MCQYBUW");
// flaky "3) test242(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "NAP5SMF5" + "'", str8, "NAP5SMF5");
// flaky "1) test242(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P32V3SYQ" + "'", str9, "P32V3SYQ");
// flaky "1) test242(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "J8ZPFQJC" + "'", str10, "J8ZPFQJC");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test243");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        java.nio.file.Path path6 = timeAndRandom0.appendToDailyReport("2KQYY27C");
        boolean boolean7 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test244");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WM7PDVP7");
        boolean boolean6 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("hi!");
        java.lang.Class<?> wildcardClass9 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test245");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour(1.0d);
        double double4 = timeAndRandom0.priceWithHappyHour((double) 'a');
        double double6 = timeAndRandom0.priceWithHappyHour(10.0d);
        boolean boolean7 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test246");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test247");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        int int1 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean2 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("8JQEYAZY");
        double double6 = timeAndRandom0.priceWithHappyHour((double) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test248");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        int int7 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean8 = timeAndRandom0.isHappyHour();
        int int9 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path11 = timeAndRandom0.appendToDailyReport("4MRHM3SL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
        org.junit.Assert.assertNotNull(path11);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test249");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        double double7 = timeAndRandom0.priceWithHappyHour((double) (byte) 0);
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("W3BDYHXP");
        java.lang.String str10 = timeAndRandom0.generateCouponCode();
        boolean boolean11 = timeAndRandom0.isHappyHour();
        int int12 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "168) test249(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HEXDF54R" + "'", str2, "HEXDF54R");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(path9);
// flaky "70) test249(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8WSY8V8G" + "'", str10, "8WSY8V8G");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test250");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WRM9TM7U");
        double double7 = timeAndRandom0.priceWithHappyHour((double) (byte) 0);
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path10 = timeAndRandom0.appendToDailyReport("9TFK9MFE");
        java.lang.String str11 = timeAndRandom0.generateCouponCode();
        int int12 = timeAndRandom0.daysUntilEndOfMonth();
        double double14 = timeAndRandom0.priceWithHappyHour((double) ' ');
        java.lang.String str15 = timeAndRandom0.generateCouponCode();
        java.lang.Class<?> wildcardClass16 = timeAndRandom0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "169) test250(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4FNTCQKS" + "'", str2, "4FNTCQKS");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(path10);
// flaky "71) test250(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53MZVGBF" + "'", str11, "53MZVGBF");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
// flaky "16) test250(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6RTK8ET5" + "'", str15, "6RTK8ET5");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test251");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("LQVN39B8");
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(path7);
// flaky "170) test251(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ETKDNQTF" + "'", str8, "ETKDNQTF");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test252");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        double double6 = timeAndRandom0.priceWithHappyHour((double) 100);
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("RGGYKCSU");
        double double10 = timeAndRandom0.priceWithHappyHour((double) (short) 10);
        java.lang.String str11 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "171) test252(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "T6CAFLN9" + "'", str2, "T6CAFLN9");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "72) test252(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2DKZUYCJ" + "'", str4, "2DKZUYCJ");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
// flaky "17) test252(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "F6LBFHQS" + "'", str11, "F6LBFHQS");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test253");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("SK8S366L");
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test254");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("hi!");
        double double5 = timeAndRandom0.priceWithHappyHour((double) (short) 100);
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("LQVN39B8");
        java.lang.Class<?> wildcardClass8 = path7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test255");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("");
        java.nio.file.Path path7 = timeAndRandom0.appendToDailyReport("DYZ4GANX");
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        int int9 = timeAndRandom0.daysUntilEndOfMonth();
        int int10 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean11 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "172) test255(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MU59BX4E" + "'", str2, "MU59BX4E");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test256");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        java.nio.file.Path path2 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        java.nio.file.Path path4 = timeAndRandom0.appendToDailyReport("2UP23743");
        int int5 = timeAndRandom0.daysUntilEndOfMonth();
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path9 = timeAndRandom0.appendToDailyReport("ALH582J9");
        java.lang.String str10 = timeAndRandom0.generateCouponCode();
        double double12 = timeAndRandom0.priceWithHappyHour((double) 19);
        org.junit.Assert.assertNotNull(path2);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(path9);
// flaky "173) test256(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GZ9FRMTS" + "'", str10, "GZ9FRMTS");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 19.0d + "'", double12 == 19.0d);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test257");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        double double6 = timeAndRandom0.priceWithHappyHour((double) 100);
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        boolean boolean9 = timeAndRandom0.isHappyHour();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "174) test257(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GCB396X3" + "'", str2, "GCB396X3");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "73) test257(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LBFX3UQ8" + "'", str4, "LBFX3UQ8");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "18) test257(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2LRV6N3W" + "'", str8, "2LRV6N3W");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test258");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        double double2 = timeAndRandom0.priceWithHappyHour((double) 'a');
        java.lang.String str3 = timeAndRandom0.generateCouponCode();
        double double5 = timeAndRandom0.priceWithHappyHour((double) ' ');
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        int int7 = timeAndRandom0.daysUntilEndOfMonth();
        int int8 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
// flaky "175) test258(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ST3829S7" + "'", str3, "ST3829S7");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test259");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("WM7PDVP7");
        boolean boolean6 = timeAndRandom0.isHappyHour();
        int int7 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test260");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        double double6 = timeAndRandom0.priceWithHappyHour((double) 100);
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("UJNSLKR3");
        int int9 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "176) test260(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "X9JEK9ZS" + "'", str2, "X9JEK9ZS");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "74) test260(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JFSQZ5TX" + "'", str4, "JFSQZ5TX");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test261");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path10 = timeAndRandom0.appendToDailyReport("57E7HYHE");
        java.nio.file.Path path12 = timeAndRandom0.appendToDailyReport("Y92YPW43");
        java.nio.file.Path path14 = timeAndRandom0.appendToDailyReport("YATM7E6Q");
        java.lang.String str15 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "177) test261(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L93CMLNL" + "'", str2, "L93CMLNL");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "75) test261(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "B8U9M4SV" + "'", str8, "B8U9M4SV");
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(path12);
        org.junit.Assert.assertNotNull(path14);
// flaky "19) test261(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2WQLYHDE" + "'", str15, "2WQLYHDE");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test262");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.nio.file.Path path3 = timeAndRandom0.appendToDailyReport("9Q6FWFMP");
        double double5 = timeAndRandom0.priceWithHappyHour(10.0d);
        java.lang.String str6 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("YUBN7DER");
        int int9 = timeAndRandom0.daysUntilEndOfMonth();
        int int10 = timeAndRandom0.daysUntilEndOfMonth();
        java.lang.String str11 = timeAndRandom0.generateCouponCode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky "178) test262(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LKSB7GNZ" + "'", str6, "LKSB7GNZ");
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
// flaky "76) test262(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PUDD7SWE" + "'", str11, "PUDD7SWE");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test263");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        int int3 = timeAndRandom0.daysUntilEndOfMonth();
        java.nio.file.Path path5 = timeAndRandom0.appendToDailyReport("42A9PZ4Q");
        int int6 = timeAndRandom0.daysUntilEndOfMonth();
        boolean boolean7 = timeAndRandom0.isHappyHour();
        java.lang.String str8 = timeAndRandom0.generateCouponCode();
        java.nio.file.Path path10 = timeAndRandom0.appendToDailyReport("57E7HYHE");
        java.nio.file.Path path12 = timeAndRandom0.appendToDailyReport("Y92YPW43");
        java.lang.String str13 = timeAndRandom0.generateCouponCode();
        int int14 = timeAndRandom0.daysUntilEndOfMonth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "179) test263(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "QAKJD4CX" + "'", str2, "QAKJD4CX");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "77) test263(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3B4T2YDZ" + "'", str8, "3B4T2YDZ");
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(path12);
// flaky "20) test263(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FZR6QJEM" + "'", str13, "FZR6QJEM");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimeAndRandomRandoopTest0.test264");
        benchmark.TimeAndRandom timeAndRandom0 = new benchmark.TimeAndRandom();
        boolean boolean1 = timeAndRandom0.isHappyHour();
        java.lang.String str2 = timeAndRandom0.generateCouponCode();
        boolean boolean3 = timeAndRandom0.isHappyHour();
        java.lang.String str4 = timeAndRandom0.generateCouponCode();
        double double6 = timeAndRandom0.priceWithHappyHour((double) 100);
        java.nio.file.Path path8 = timeAndRandom0.appendToDailyReport("H95PP3VA");
        java.lang.Class<?> wildcardClass9 = path8.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "180) test264(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HNQ3LRTK" + "'", str2, "HNQ3LRTK");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "78) test264(benchmark.TimeAndRandomRandoopTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4C9P3FWV" + "'", str4, "4C9P3FWV");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}
