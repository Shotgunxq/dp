package benchmark;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BranchyValidatorRandoopTest0 {

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
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test001");
        int int0 = benchmark.BranchyValidator.MAX_QUANTITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test002");
        double double0 = benchmark.BranchyValidator.SUSPICIOUS_PRICE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 10000.0d + "'", double0 == 10000.0d);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test003");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test004");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (short) -1, (double) (byte) 10, "", false);
        java.lang.Class<?> wildcardClass25 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test005");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 1, (double) 0L, "", false);
        java.lang.Class<?> wildcardClass25 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test006");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        java.lang.Class<?> wildcardClass25 = strList24.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test007");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) ' ', 10000.0d, "", true);
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test008");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        java.lang.Class<?> wildcardClass25 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test009");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 1, (double) '#', "", false);
        java.lang.Class<?> wildcardClass19 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test010");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.lang.Class<?> wildcardClass7 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test011");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 1, (double) '#', "", false);
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test012");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("hi!", (int) (short) 1, (double) '4', "hi!", false);
        java.lang.Class<?> wildcardClass19 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test013");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) 'a', (double) ' ', "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test014");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (byte) 10, (double) '#', "hi!", true);
        java.lang.Class<?> wildcardClass37 = strList36.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test015");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (short) 0, (double) 10, "hi!", false);
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test016");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test017");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.lang.Class<?> wildcardClass19 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test018");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.lang.Class<?> wildcardClass13 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test019");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        java.lang.Class<?> wildcardClass37 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test020");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) ' ', 10000.0d, "", true);
        java.lang.Class<?> wildcardClass13 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test021");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 10, (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (short) 1, (double) '4', "hi!", false);
        java.lang.Class<?> wildcardClass37 = strList36.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test022");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (byte) 10, (double) '#', "hi!", true);
        java.lang.Class<?> wildcardClass37 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test023");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) ' ', (double) (byte) 0, "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (short) 1, (double) 10, "hi!", false);
        java.lang.Class<?> wildcardClass37 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test024");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 10, (double) (-1), "", true);
        java.lang.Class<?> wildcardClass31 = strList30.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test025");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 10, (double) (-1), "", true);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test026");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) 'a', (double) 100.0f, "", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", 1, (double) 100L, "hi!", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("hi!", (int) (byte) 10, (double) 100.0f, "hi!", false);
        java.lang.Class<?> wildcardClass55 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test027");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) '#', "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (-1), (double) 0.0f, "hi!", true);
        java.lang.Class<?> wildcardClass43 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test028");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test029");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test030");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 0, (double) (short) 1, "hi!", false);
        java.lang.Class<?> wildcardClass25 = strList24.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test031");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) 'a', (double) 100.0f, "", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", 1, (double) 100L, "hi!", true);
        java.lang.Class<?> wildcardClass49 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test032");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) 'a', (double) (-1L), "", false);
        java.lang.Class<?> wildcardClass25 = strList24.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test033");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) '4', (double) (byte) 100, "hi!", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) '4', (double) 0.0f, "", false);
        java.lang.Class<?> wildcardClass37 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test034");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        boolean boolean12 = branchyValidator0.isValid("", (int) 'a', (double) (short) 0, "", false);
        java.lang.Class<?> wildcardClass13 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test035");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) ' ', 0.0d, "", false);
        java.lang.Class<?> wildcardClass37 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test036");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 0, (double) (byte) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", 0, (double) '4', "hi!", true);
        java.lang.Class<?> wildcardClass37 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test037");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 10, (double) (-1), "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", 10, (double) 1000, "hi!", true);
        java.lang.Class<?> wildcardClass37 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test038");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) 'a', (double) 100.0f, "", false);
        boolean boolean48 = branchyValidator0.isValid("", (int) (byte) 10, (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("hi!", 100, (double) 'a', "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strList54);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test039");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 100, (double) 1L, "", false);
        java.lang.Class<?> wildcardClass19 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test040");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) 'a', (double) 1L, "hi!", true);
        java.lang.Class<?> wildcardClass25 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test041");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) '#', "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (-1), (double) 0.0f, "hi!", true);
        boolean boolean48 = branchyValidator0.isValid("", 10, (double) 0.0f, "", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("hi!", (int) (byte) 0, (double) 0, "", true);
        java.util.List<java.lang.String> strList60 = branchyValidator0.validate("", 0, 0.0d, "", false);
        java.lang.Class<?> wildcardClass61 = strList60.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test042");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (short) 0, (double) 10, "hi!", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (-1), (double) (short) -1, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) '4', (double) 100, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test043");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test044");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", (int) (short) 0, (-1.0d), "", false);
        boolean boolean42 = branchyValidator0.isValid("hi!", (int) (byte) 0, (double) 1L, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test045");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        boolean boolean12 = branchyValidator0.isValid("", (int) 'a', (double) 10, "", true);
        boolean boolean18 = branchyValidator0.isValid("", (int) ' ', 10.0d, "", true);
        java.lang.Class<?> wildcardClass19 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test046");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 10, (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (short) 1, (double) '4', "hi!", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 1000, (double) 'a', "", false);
        java.lang.Class<?> wildcardClass43 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test047");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 0, (double) (short) 1, "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 0, (double) 100, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test048");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (short) -1, (double) (byte) 10, "", false);
        java.lang.Class<?> wildcardClass25 = strList24.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test049");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 10, (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", (int) (short) -1, (double) (byte) 0, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test050");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) '#', "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (-1), (double) 0.0f, "hi!", true);
        boolean boolean48 = branchyValidator0.isValid("", 10, (double) 0.0f, "", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("hi!", (int) (byte) 0, (double) 0, "", true);
        java.lang.Class<?> wildcardClass55 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test051");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("hi!", (int) (short) 1, (double) '4', "hi!", false);
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test052");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 1, (double) '#', "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (byte) 1, (double) (byte) -1, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) 1, (double) 10, "", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", (int) (short) 0, 0.0d, "", true);
        java.lang.Class<?> wildcardClass37 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test053");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 0, (double) 100.0f, "", false);
        java.lang.Class<?> wildcardClass31 = strList30.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test054");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) '#', "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (-1), (double) 0.0f, "hi!", true);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", 1000, 1.0d, "", true);
        java.lang.Class<?> wildcardClass49 = strList48.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test055");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("hi!", (int) (byte) 0, (double) (-1L), "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) 'a', (double) (short) -1, "", true);
        java.lang.Class<?> wildcardClass25 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test056");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", 100, 10000.0d, "", false);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) 'a', (double) 0.0f, "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (-1), (double) (short) 1, "", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (-1), "hi!", true);
        java.lang.Class<?> wildcardClass31 = strList30.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test057");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) 'a', (double) 100.0f, "", false);
        boolean boolean48 = branchyValidator0.isValid("", (int) (byte) 10, (double) 'a', "hi!", false);
        java.lang.Class<?> wildcardClass49 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test058");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) 'a', (double) 100.0f, "", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", 1, (double) 100L, "hi!", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("hi!", (int) (byte) 10, (double) 100.0f, "hi!", false);
        boolean boolean60 = branchyValidator0.isValid("hi!", (int) (byte) -1, (double) '#', "", true);
        java.util.List<java.lang.String> strList66 = branchyValidator0.validate("", 0, (double) ' ', "", true);
        java.lang.Class<?> wildcardClass67 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test059");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        java.lang.Class<?> wildcardClass13 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test060");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.lang.Class<?> wildcardClass19 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test061");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) '#', "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("hi!", (int) (short) 0, (double) 100L, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test062");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 0, (double) 100.0f, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (short) -1, (double) 'a', "hi!", false);
        java.lang.Class<?> wildcardClass25 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test063");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        boolean boolean24 = branchyValidator0.isValid("", 100, (double) 1, "hi!", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) 'a', (double) 100.0f, "", false);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test064");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 0, (double) 100.0f, "", false);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test065");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", (int) (short) 0, (-1.0d), "", false);
        java.lang.Class<?> wildcardClass37 = strList36.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test066");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 10, (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) '4', (double) 100.0f, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test067");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) 'a', (double) (-1L), "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (-1), (double) 1, "hi!", true);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test068");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) 0, (double) (byte) 100, "", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", (int) ' ', (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.lang.Class<?> wildcardClass43 = strList42.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test069");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 10, (double) (-1), "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (byte) 1, (double) (-1.0f), "", false);
        boolean boolean42 = branchyValidator0.isValid("", 1000, (double) 'a', "", false);
        boolean boolean48 = branchyValidator0.isValid("hi!", (int) ' ', 0.0d, "", false);
        java.lang.Class<?> wildcardClass49 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test070");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) 'a', (double) 100.0f, "", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", 1, (double) 100L, "hi!", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("hi!", (int) (byte) 1, (double) 10.0f, "", true);
        boolean boolean60 = branchyValidator0.isValid("hi!", (int) 'a', (double) (short) 100, "hi!", false);
        java.lang.Class<?> wildcardClass61 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test071");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (short) 0, (double) 10, "hi!", false);
        boolean boolean24 = branchyValidator0.isValid("hi!", (int) ' ', (double) 10, "hi!", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (byte) 100, (double) 100L, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test072");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (short) -1, (double) (byte) 10, "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (-1), (double) 0, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test073");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) 0, (double) (byte) 100, "", false);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test074");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 1, (double) 0L, "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", 1, 0.0d, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) '#', "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) '4', (double) 1.0f, "hi!", true);
        java.lang.Class<?> wildcardClass43 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test075");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 10, (double) (-1), "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (byte) 1, (double) (-1.0f), "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) '#', (double) 100.0f, "", true);
        java.lang.Class<?> wildcardClass43 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test076");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("hi!", (int) (byte) 0, (double) 100.0f, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) '#', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 1000, (double) (short) -1, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test077");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 1, (double) '#', "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (byte) 1, (double) (byte) -1, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) 1, (double) 10, "", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", (int) (short) 0, 0.0d, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", (int) (byte) 10, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", (int) (short) 0, 10.0d, "hi!", false);
        java.lang.Class<?> wildcardClass49 = strList48.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test078");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", 0, (double) (short) 100, "hi!", false);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test079");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 0, (double) (byte) 100, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "hi!", true);
        java.lang.Class<?> wildcardClass37 = strList36.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test080");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 0, (double) 1000, "", true);
        java.lang.Class<?> wildcardClass31 = strList30.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test081");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 1, (double) '#', "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (byte) 1, (double) (byte) -1, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) 1, (double) 10, "", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", (int) (short) 0, 0.0d, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", (int) (byte) 10, (double) 10.0f, "hi!", false);
        java.lang.Class<?> wildcardClass43 = strList42.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test082");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", 100, 10000.0d, "", false);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) 'a', (double) 0.0f, "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (-1), (double) (short) 1, "", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (-1), "hi!", true);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", 0, (double) (-1L), "hi!", true);
        java.lang.Class<?> wildcardClass37 = strList36.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test083");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) ' ', 0.0d, "", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", (int) (byte) 10, (double) (short) 100, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test084");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) ' ', 10000.0d, "", true);
        boolean boolean18 = branchyValidator0.isValid("", (int) (byte) 0, (double) (short) -1, "hi!", false);
        java.lang.Class<?> wildcardClass19 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test085");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("hi!", (int) (byte) 0, (double) 100.0f, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("hi!", 0, (-1.0d), "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test086");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        boolean boolean12 = branchyValidator0.isValid("", (int) 'a', (double) (short) 0, "", false);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("hi!", 0, (double) 10L, "hi!", false);
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test087");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 1, (double) 0L, "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", 1, 0.0d, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) '#', "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) '4', (double) 1.0f, "hi!", true);
        boolean boolean48 = branchyValidator0.isValid("", (int) 'a', (double) 1, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test088");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 0, (double) 100.0f, "", false);
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test089");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", 100, 10000.0d, "", false);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) 'a', (double) 0.0f, "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (byte) 1, (double) (short) 1, "", false);
        java.lang.Class<?> wildcardClass25 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test090");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 1, (double) 0L, "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", 1, 0.0d, "", true);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) '#', (double) 100.0f, "", false);
        java.lang.Class<?> wildcardClass37 = strList36.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test091");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", 0, (double) (short) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (int) '4', (double) 100, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 0, (double) (short) 100, "hi!", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", (-1), (double) 10L, "", false);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("", (int) (short) 100, (-1.0d), "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test092");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", 0, (double) (short) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", 100, (double) 0, "hi!", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) (byte) -1, (double) 1, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test093");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        boolean boolean12 = branchyValidator0.isValid("", (int) 'a', (double) 10, "", true);
        boolean boolean18 = branchyValidator0.isValid("", (int) ' ', 10.0d, "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (short) 1, (double) 10.0f, "", false);
        java.lang.Class<?> wildcardClass25 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test094");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("", (int) (byte) 0, (double) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", 100, (double) 100L, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test095");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", 10, (double) (byte) 0, "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("hi!", (int) 'a', (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", (int) '4', (double) 1, "", false);
        java.lang.Class<?> wildcardClass49 = strList48.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test096");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 1, (double) 0L, "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", 1, 0.0d, "", true);
        boolean boolean36 = branchyValidator0.isValid("", 0, (double) 10, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test097");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 10, (double) (-1), "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (byte) 1, (double) (-1.0f), "", false);
        boolean boolean42 = branchyValidator0.isValid("", 1000, (double) 'a', "", false);
        boolean boolean48 = branchyValidator0.isValid("", (int) (byte) -1, (double) 100, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test098");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) (byte) 10, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (-1), (double) (short) 0, "hi!", true);
        boolean boolean42 = branchyValidator0.isValid("", 100, (double) ' ', "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test099");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", 0, (double) (short) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (int) '4', (double) 100, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 0, (double) (short) 100, "hi!", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", 0, (double) (short) 0, "", false);
        boolean boolean54 = branchyValidator0.isValid("hi!", (int) (short) 100, (double) (byte) 10, "", false);
        java.lang.Class<?> wildcardClass55 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test100");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", 0, (double) (short) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", 100, (double) 0, "hi!", false);
        java.lang.Class<?> wildcardClass37 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test101");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) '#', (double) (byte) 100, "", true);
        boolean boolean48 = branchyValidator0.isValid("", (int) (byte) -1, (double) '#', "hi!", false);
        boolean boolean54 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) (byte) 1, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test102");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", 0, (double) (short) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (int) '4', (double) 100, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 0, (double) (short) 100, "hi!", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", 0, (double) (short) 0, "", false);
        java.lang.Class<?> wildcardClass49 = strList48.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test103");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) 'a', (double) 100.0f, "", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", 1, (double) 100L, "hi!", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("hi!", (int) (byte) 10, (double) 100.0f, "hi!", false);
        boolean boolean60 = branchyValidator0.isValid("hi!", (int) (byte) -1, (double) '#', "", true);
        boolean boolean66 = branchyValidator0.isValid("hi!", 0, (double) (-1), "hi!", true);
        boolean boolean72 = branchyValidator0.isValid("", 0, 0.0d, "hi!", false);
        boolean boolean78 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) (-1), "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test104");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) '4', (double) (byte) 100, "hi!", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) '4', (double) 0.0f, "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) (short) -1, (double) 10L, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test105");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", 100, 10000.0d, "", false);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) 'a', (double) 0.0f, "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (-1), (double) (short) 1, "", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (short) 0, (double) 100.0f, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test106");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 1, (double) 0L, "", false);
        boolean boolean30 = branchyValidator0.isValid("", 1, (double) 0.0f, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test107");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 1, (double) 0L, "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", 1, 0.0d, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) '#', "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) '4', (double) 1.0f, "hi!", true);
        boolean boolean48 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) (byte) -1, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test108");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test109");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 1, (double) 0L, "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", 1, 0.0d, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) '#', "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) (byte) 10, 1.0d, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test110");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) 'a', (double) 100.0f, "", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", 1, (double) 100L, "hi!", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("hi!", (int) (byte) 10, (double) 100.0f, "hi!", false);
        boolean boolean60 = branchyValidator0.isValid("hi!", (int) (byte) -1, (double) '#', "", true);
        boolean boolean66 = branchyValidator0.isValid("hi!", 0, (double) (-1), "hi!", true);
        boolean boolean72 = branchyValidator0.isValid("", 0, 0.0d, "hi!", false);
        boolean boolean78 = branchyValidator0.isValid("", 1, (double) (byte) -1, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test111");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) '#', (double) (byte) 100, "", true);
        boolean boolean48 = branchyValidator0.isValid("hi!", 1, (double) (-1.0f), "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test112");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 0, (double) (short) 1, "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) 1, (double) 1000, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", 0, (double) (-1L), "", false);
        java.lang.Class<?> wildcardClass37 = strList36.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test113");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) '#', "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (-1), (double) 0.0f, "hi!", true);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", 1000, 1.0d, "", true);
        java.lang.Class<?> wildcardClass49 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test114");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) '#', "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (-1), (double) 0.0f, "hi!", true);
        boolean boolean48 = branchyValidator0.isValid("hi!", (int) '4', (double) (short) 1, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test115");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) ' ', 10000.0d, "", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) '#', (double) (byte) 0, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test116");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 0, (double) (byte) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (-1), 100.0d, "hi!", true);
        boolean boolean42 = branchyValidator0.isValid("", (int) (byte) 100, (double) 0, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test117");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) (byte) -1, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (short) -1, (double) (short) -1, "", true);
        java.lang.Class<?> wildcardClass37 = strList36.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test118");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) '#', "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (-1), (double) 0.0f, "hi!", true);
        boolean boolean48 = branchyValidator0.isValid("", 10, (double) 0.0f, "", true);
        java.lang.Class<?> wildcardClass49 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test119");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 1L, "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) ' ', 0.0d, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test120");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) ' ', 10000.0d, "", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) (byte) 1, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test121");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) 'a', (double) 100.0f, "", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", 1, (double) 100L, "hi!", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("hi!", (int) (byte) 10, (double) 100.0f, "hi!", false);
        boolean boolean60 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) (short) -1, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test122");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) 'a', (double) 1L, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) 100, (double) ' ', "hi!", true);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test123");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", 100, 10000.0d, "", false);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) 'a', (double) 0.0f, "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (-1), (double) (short) 1, "", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 0, (double) (byte) 0, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test124");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) 'a', (double) 100.0f, "", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", 1, (double) 100L, "hi!", true);
        java.lang.Class<?> wildcardClass49 = strList48.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test125");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (short) -1, (double) (byte) 10, "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) '#', 1.0d, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test126");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 0, (double) (byte) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (-1), 100.0d, "hi!", true);
        boolean boolean42 = branchyValidator0.isValid("", 0, 100.0d, "hi!", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", 0, (double) 0, "hi!", true);
        java.lang.Class<?> wildcardClass49 = strList48.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test127");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 1, (double) 0L, "", false);
        java.lang.Class<?> wildcardClass25 = strList24.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test128");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.lang.Class<?> wildcardClass25 = strList24.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test129");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", 0, (double) (short) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (int) '4', (double) 100, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 0, (double) (short) 100, "hi!", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", (int) (byte) 0, 10000.0d, "", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("", 10, (double) '4', "", false);
        java.lang.Class<?> wildcardClass55 = strList54.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test130");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 0, (double) 10.0f, "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 1000, (double) 0, "", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (short) -1, (double) (byte) -1, "hi!", true);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test131");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 0, (double) (byte) 100, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "hi!", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) (short) 10, (double) 100.0f, "", true);
        boolean boolean48 = branchyValidator0.isValid("", 100, (double) 0.0f, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test132");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        boolean boolean12 = branchyValidator0.isValid("", (int) 'a', (double) 10, "", true);
        boolean boolean18 = branchyValidator0.isValid("", (int) ' ', 10.0d, "", true);
        boolean boolean24 = branchyValidator0.isValid("", 0, (double) (short) 1, "", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (short) 1, (double) (short) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (byte) 1, (double) (short) 0, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", (int) '4', (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", (int) ' ', (double) 100L, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test133");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 0, (double) 100.0f, "", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", (-1), (double) 10.0f, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test134");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("", (int) (byte) 0, (double) 10, "hi!", false);
        boolean boolean12 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 1.0f, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test135");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) 0, (double) (byte) 100, "", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", (int) ' ', (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", (-1), (double) (short) 100, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test136");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", 10, (double) (byte) 0, "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("hi!", (int) 'a', (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", (int) '4', (double) 1, "", false);
        boolean boolean54 = branchyValidator0.isValid("hi!", (int) (byte) 1, (double) 1000, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test137");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) ' ', 0.0d, "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) (byte) 100, (double) (short) 0, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test138");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (short) -1, (double) (byte) 10, "", false);
        boolean boolean30 = branchyValidator0.isValid("", (-1), (double) (short) 0, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test139");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) 'a', (double) 100.0f, "", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", 1, (double) 100L, "hi!", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("hi!", (int) (byte) 10, (double) 100.0f, "hi!", false);
        boolean boolean60 = branchyValidator0.isValid("hi!", (int) (byte) -1, (double) '#', "", true);
        java.util.List<java.lang.String> strList66 = branchyValidator0.validate("", 0, (double) ' ', "", true);
        java.util.List<java.lang.String> strList72 = branchyValidator0.validate("hi!", 100, (double) (byte) 0, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strList72);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test140");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 1, (double) '#', "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (byte) 1, (double) (byte) -1, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (short) -1, (double) (byte) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (int) (short) 0, (double) 0.0f, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test141");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 0, (double) 10.0f, "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (-1.0f), "hi!", false);
        java.lang.Class<?> wildcardClass25 = strList24.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test142");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) (byte) -1, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", 1000, (double) 'a', "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test143");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        boolean boolean24 = branchyValidator0.isValid("", 100, (double) 1, "hi!", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) 'a', (double) 100.0f, "", false);
        java.lang.Class<?> wildcardClass31 = strList30.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test144");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 10, (double) (-1), "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (byte) 1, (double) (-1.0f), "", false);
        boolean boolean42 = branchyValidator0.isValid("", 1000, (double) 'a', "", false);
        java.lang.Class<?> wildcardClass43 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test145");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (short) -1, (double) (byte) 10, "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (byte) 10, (double) 1000, "", true);
        java.lang.Class<?> wildcardClass31 = strList30.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test146");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (short) 0, (double) 10, "hi!", false);
        boolean boolean24 = branchyValidator0.isValid("", (int) (short) -1, (double) (short) 0, "", false);
        java.lang.Class<?> wildcardClass25 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test147");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (short) 0, (double) 10, "hi!", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (-1), (double) (short) -1, "hi!", true);
        java.lang.Class<?> wildcardClass25 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test148");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", 0, (double) (short) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (int) '4', (double) 100, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 0, (double) (short) 100, "hi!", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", 0, (double) (short) 0, "", false);
        boolean boolean54 = branchyValidator0.isValid("", 0, (double) (-1L), "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test149");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) '#', "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (-1), (double) 0.0f, "hi!", true);
        boolean boolean48 = branchyValidator0.isValid("", 10, (double) 0.0f, "", true);
        boolean boolean54 = branchyValidator0.isValid("hi!", (int) (short) 100, (double) (-1), "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test150");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 0, (double) (short) 1, "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) -1, 0.0d, "", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", 100, (double) (short) 10, "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) '#', (double) 100, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test151");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 1, (double) 0L, "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", 1, 0.0d, "", true);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) '#', (double) 100.0f, "", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", (-1), (double) (byte) 100, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test152");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (-1), (double) 100L, "", true);
        boolean boolean42 = branchyValidator0.isValid("", (int) '4', (double) (short) 10, "", true);
        boolean boolean48 = branchyValidator0.isValid("", (int) (short) 100, (double) '#', "hi!", false);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("", (-1), (double) '#', "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strList54);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test153");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", 10, (double) (byte) 0, "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) '#', (double) 1L, "hi!", true);
        boolean boolean48 = branchyValidator0.isValid("hi!", (int) (short) 1, 10000.0d, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test154");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 0, (double) (byte) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) '#', (double) 0L, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", (int) (byte) 1, 1.0d, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test155");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 1, (double) '#', "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (short) 100, (double) 1, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test156");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) '#', "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (-1), (double) 0.0f, "hi!", true);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", 1000, 1.0d, "", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("", (int) ' ', 0.0d, "hi!", false);
        boolean boolean60 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) ' ', "hi!", false);
        boolean boolean66 = branchyValidator0.isValid("", (int) (byte) 0, (double) (byte) 0, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test157");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", 0, (double) (short) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (int) '4', (double) 100, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 0, (double) (short) 100, "hi!", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", (int) (byte) 0, 10000.0d, "", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("", 10, (double) '4', "", false);
        java.util.List<java.lang.String> strList60 = branchyValidator0.validate("hi!", 1000, (double) (byte) 1, "", false);
        java.util.List<java.lang.String> strList66 = branchyValidator0.validate("hi!", (int) (byte) 0, (double) 100, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList66);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test158");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", 100, 10000.0d, "", false);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) 'a', (double) 0.0f, "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (-1), (double) (short) 1, "", true);
        boolean boolean30 = branchyValidator0.isValid("", 1, (double) (short) 10, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test159");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 10, (double) (-1), "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (byte) 1, (double) (-1.0f), "", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) '#', (double) 1L, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test160");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 1L, "", true);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", (int) 'a', (double) 100L, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", 0, (double) (short) 0, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test161");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (byte) 1, (double) (short) 100, "hi!", true);
        java.lang.Class<?> wildcardClass31 = strList30.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test162");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) (byte) 10, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (-1), (double) (short) 0, "hi!", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) '4', (double) 100.0f, "", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", (int) ' ', 0.0d, "", false);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("", 1000, (double) '#', "hi!", true);
        java.lang.Class<?> wildcardClass55 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test163");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 10, (double) (-1), "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (byte) 1, (double) (-1.0f), "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) '#', (double) 100.0f, "", true);
        boolean boolean48 = branchyValidator0.isValid("hi!", (int) '4', (double) 10, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test164");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        boolean boolean12 = branchyValidator0.isValid("", 0, (double) 10, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test165");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (byte) 10, (double) '#', "hi!", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", (int) 'a', (double) 'a', "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test166");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", 0, (double) (short) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", 100, (double) 0, "hi!", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) (short) -1, (double) 1, "", true);
        java.lang.Class<?> wildcardClass43 = strList42.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test167");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 0, (double) (byte) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) '#', (double) 0L, "", true);
        java.lang.Class<?> wildcardClass37 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test168");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (-1), (double) 100L, "", true);
        java.lang.Class<?> wildcardClass37 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test169");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) '#', "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (-1), (double) 0.0f, "hi!", true);
        boolean boolean48 = branchyValidator0.isValid("", 10, (double) 0.0f, "", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("hi!", (int) (byte) 0, (double) 0, "", true);
        java.util.List<java.lang.String> strList60 = branchyValidator0.validate("", 0, 0.0d, "", false);
        boolean boolean66 = branchyValidator0.isValid("hi!", (int) (byte) 0, (double) '4', "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test170");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 1, (double) '#', "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (byte) 1, (double) (byte) -1, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (short) -1, (double) (byte) 100, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (byte) 1, (double) 10.0f, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", 1000, (double) 10, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test171");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("hi!", (int) (byte) 0, (double) 100.0f, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) '#', "hi!", false);
        java.lang.Class<?> wildcardClass25 = strList24.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test172");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (short) -1, (double) (byte) 10, "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) '#', (double) (short) 0, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test173");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        boolean boolean12 = branchyValidator0.isValid("", (int) 'a', (double) 10, "", true);
        boolean boolean18 = branchyValidator0.isValid("", (int) ' ', 10.0d, "", true);
        boolean boolean24 = branchyValidator0.isValid("hi!", (int) ' ', 0.0d, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test174");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", 100, 10000.0d, "", false);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) 'a', (double) 0.0f, "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (byte) 1, (double) (short) 1, "", false);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 0, 1.0d, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test175");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) 'a', (double) (-1L), "", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 1.0f, "", false);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test176");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("hi!", (int) (short) 1, (double) '4', "hi!", false);
        boolean boolean24 = branchyValidator0.isValid("hi!", (int) '#', (double) 1.0f, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test177");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (-1), (double) 100L, "", true);
        boolean boolean42 = branchyValidator0.isValid("", (int) '4', (double) (short) 10, "", true);
        boolean boolean48 = branchyValidator0.isValid("hi!", 1, (double) 100L, "", false);
        boolean boolean54 = branchyValidator0.isValid("", (int) (short) 100, (double) (byte) 1, "hi!", true);
        boolean boolean60 = branchyValidator0.isValid("hi!", 0, 10000.0d, "hi!", false);
        boolean boolean66 = branchyValidator0.isValid("hi!", 0, 10000.0d, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test178");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 10, (double) (-1), "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (byte) 1, (double) (-1.0f), "", false);
        boolean boolean42 = branchyValidator0.isValid("", 1000, (double) 'a', "", false);
        boolean boolean48 = branchyValidator0.isValid("", (-1), 0.0d, "hi!", false);
        java.lang.Class<?> wildcardClass49 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test179");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 1, (double) 0L, "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", 1, 0.0d, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) '#', "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", (int) (byte) 0, (double) 100, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test180");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("", (int) (byte) 0, (double) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (-1), (double) (short) 100, "hi!", false);
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test181");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 0, (double) 10.0f, "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", 0, (double) 100L, "", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (byte) 0, (double) 100L, "hi!", false);
        java.lang.Class<?> wildcardClass31 = strList30.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test182");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) ' ', 0.0d, "", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) (byte) 10, (double) 100, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test183");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 10, (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (short) 1, (double) '4', "hi!", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 1000, (double) 'a', "", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", (int) (byte) 0, (double) (-1), "hi!", true);
        boolean boolean54 = branchyValidator0.isValid("hi!", (int) (byte) 10, 10.0d, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test184");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 0, (double) (byte) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (-1), 100.0d, "hi!", true);
        boolean boolean42 = branchyValidator0.isValid("hi!", (int) ' ', (double) '#', "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test185");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) '#', "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (-1), (double) 0.0f, "hi!", true);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", 1000, 1.0d, "", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("", (int) ' ', 0.0d, "hi!", false);
        java.util.List<java.lang.String> strList60 = branchyValidator0.validate("hi!", (int) (byte) 1, 0.0d, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList60);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test186");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 10, (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (short) 1, (double) '4', "hi!", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) (short) -1, (double) 10, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test187");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", 0, (double) (short) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (int) '4', (double) 100, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 0, (double) (short) 100, "hi!", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", 0, (double) (short) 0, "", false);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("", (int) (short) 0, 10000.0d, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test188");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 0, (double) (short) 1, "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) 1, (double) 1000, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (int) ' ', (double) (byte) 100, "hi!", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", (int) (short) -1, (double) 1L, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test189");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", 100, 10000.0d, "", false);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) 'a', (double) 0.0f, "", true);
        java.lang.Class<?> wildcardClass19 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test190");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", 0, (double) (short) 10, "", false);
        java.lang.Class<?> wildcardClass37 = strList36.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test191");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", 100, 10000.0d, "", false);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) 'a', (double) 0.0f, "", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", 0, (double) 0, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test192");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", 10, (double) (byte) 0, "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) '#', (double) '4', "", true);
        boolean boolean48 = branchyValidator0.isValid("", (int) (byte) 100, (double) 'a', "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test193");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        boolean boolean24 = branchyValidator0.isValid("", 100, (double) 1, "hi!", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) 'a', (double) 100.0f, "", false);
        boolean boolean36 = branchyValidator0.isValid("", (int) (short) 100, (double) (byte) 0, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test194");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 10, (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (short) 1, (double) '4', "hi!", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 100, 10.0d, "hi!", true);
        java.lang.Class<?> wildcardClass43 = strList42.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test195");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) ' ', (double) (byte) 0, "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) '4', (double) (short) 1, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", (int) (short) 1, (double) 100, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test196");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (byte) 1, (double) (short) 100, "hi!", true);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test197");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 0, (double) 1000, "", true);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test198");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", 0, (double) (short) 10, "", false);
        boolean boolean42 = branchyValidator0.isValid("", 10, (double) (byte) -1, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test199");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (short) -1, (double) (byte) 10, "", false);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 0, (double) 'a', "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test200");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) '4', (double) (byte) 100, "hi!", true);
        boolean boolean36 = branchyValidator0.isValid("", 0, (double) 1L, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test201");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", (int) '#', (double) 10.0f, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test202");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        boolean boolean12 = branchyValidator0.isValid("", (int) 'a', (double) 10, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) 'a', 0.0d, "hi!", false);
        java.lang.Class<?> wildcardClass19 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test203");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", 100, 10000.0d, "", false);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) 'a', (double) 0.0f, "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (-1), (double) (short) 1, "", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (-1), "hi!", true);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", (int) (short) 0, (double) (short) -1, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test204");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("hi!", (int) (byte) 0, (double) (-1L), "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (short) 10, 0.0d, "", false);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) -1, (double) 0L, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test205");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) '4', (double) (byte) 100, "hi!", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (byte) 0, (double) 1000, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test206");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) '#', "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (-1), (double) 0.0f, "hi!", true);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", 1000, 0.0d, "", false);
        java.lang.Class<?> wildcardClass49 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test207");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", 10, (double) (byte) 0, "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) '#', (double) '4', "", true);
        boolean boolean48 = branchyValidator0.isValid("hi!", (int) (byte) 0, (double) 0L, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test208");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (short) 0, (double) 10, "hi!", false);
        boolean boolean24 = branchyValidator0.isValid("hi!", (int) ' ', (double) 10, "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) 10, 0.0d, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test209");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 0, (double) 10.0f, "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", 0, (double) 100L, "", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (byte) 10, (double) 100, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test210");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 0, (double) 1000, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (byte) 0, (double) 'a', "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test211");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (short) 0, (double) 10, "hi!", false);
        boolean boolean24 = branchyValidator0.isValid("", (int) (short) -1, (double) (short) 0, "", false);
        boolean boolean30 = branchyValidator0.isValid("", (-1), (double) (short) 0, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", 0, 0.0d, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test212");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) ' ', (double) (byte) 0, "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) '4', (double) (short) 1, "", true);
        boolean boolean42 = branchyValidator0.isValid("hi!", (int) ' ', (double) 1.0f, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test213");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (byte) 1, (double) (short) 100, "hi!", true);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (byte) 1, (double) (-1.0f), "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test214");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 0, (double) 1000, "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (short) -1, (double) (-1.0f), "", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", 1000, (double) 100.0f, "hi!", false);
        java.lang.Class<?> wildcardClass43 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test215");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (-1), (double) 100L, "", true);
        boolean boolean42 = branchyValidator0.isValid("", (int) '4', (double) (short) 10, "", true);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", (int) 'a', (double) '4', "hi!", true);
        boolean boolean54 = branchyValidator0.isValid("hi!", (int) (byte) -1, (double) 1000, "hi!", false);
        boolean boolean60 = branchyValidator0.isValid("", (int) (short) 10, 0.0d, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test216");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 1, (double) 0L, "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", 1, 0.0d, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) '#', "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) '4', (double) 1.0f, "hi!", true);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", 1, (double) (short) 0, "", false);
        boolean boolean54 = branchyValidator0.isValid("hi!", 0, (double) 1000, "", false);
        java.util.List<java.lang.String> strList60 = branchyValidator0.validate("", 10, (double) '4', "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strList60);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test217");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", 0, (double) (short) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (int) '4', (double) 100, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 0, (double) (short) 100, "hi!", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", 0, (double) (short) 0, "", false);
        boolean boolean54 = branchyValidator0.isValid("hi!", (int) (short) 100, (double) (byte) 10, "", false);
        boolean boolean60 = branchyValidator0.isValid("", (int) (byte) -1, (double) 10.0f, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test218");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (byte) 10, (double) '#', "hi!", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", 100, (double) 100, "hi!", true);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", (int) ' ', (double) 0L, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test219");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", 100, 10000.0d, "", false);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) 'a', (double) 0.0f, "", true);
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test220");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("hi!", (int) ' ', (double) 0.0f, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test221");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        boolean boolean12 = branchyValidator0.isValid("", (int) 'a', (double) (short) 0, "", false);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) '#', 0.0d, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("hi!", 1, (double) (-1), "", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (byte) 100, (double) (byte) -1, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test222");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 0, (double) 100.0f, "", false);
        boolean boolean36 = branchyValidator0.isValid("", 1, (double) 'a', "", true);
        boolean boolean42 = branchyValidator0.isValid("hi!", 100, (double) '4', "hi!", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", (int) (byte) 0, 0.0d, "", true);
        java.lang.Class<?> wildcardClass49 = strList48.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test223");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 100, (double) 1L, "", false);
        boolean boolean24 = branchyValidator0.isValid("", (int) '#', (double) (byte) 1, "", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", 10, (double) 1000, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test224");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 0, (double) (byte) 100, "hi!", false);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test225");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 0, (double) 1000, "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (short) -1, (double) (-1.0f), "", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", 1, (double) (short) 0, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test226");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 0, (double) 1000, "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (short) -1, (double) (-1.0f), "", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", (int) ' ', (double) (byte) -1, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test227");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) 'a', (double) (-1L), "", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 1.0f, "", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", 100, (double) 0, "", true);
        java.lang.Class<?> wildcardClass37 = strList36.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test228");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("hi!", (int) (byte) 0, (double) (-1L), "", true);
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test229");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (byte) 1, (double) (short) 100, "hi!", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (short) -1, (double) (short) 1, "", true);
        boolean boolean42 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) 0, "", false);
        boolean boolean48 = branchyValidator0.isValid("", (int) ' ', (double) 'a', "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test230");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 10, (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (short) 1, (double) '4', "hi!", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 100, 10.0d, "hi!", true);
        boolean boolean48 = branchyValidator0.isValid("", (int) (byte) 10, (-1.0d), "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test231");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 1, (double) 0L, "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", 1, 0.0d, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) '#', "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) '4', (double) 1.0f, "hi!", true);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", 1, (double) (short) 0, "", false);
        boolean boolean54 = branchyValidator0.isValid("hi!", 0, (double) 1000, "", false);
        boolean boolean60 = branchyValidator0.isValid("", 0, (double) (byte) -1, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test232");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 0, (double) (byte) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (-1), 100.0d, "hi!", true);
        boolean boolean42 = branchyValidator0.isValid("", 0, 100.0d, "hi!", false);
        boolean boolean48 = branchyValidator0.isValid("", 1, (double) (byte) -1, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test233");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 10, (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (byte) 1, (double) 10.0f, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test234");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 0, (double) (byte) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (-1), 100.0d, "hi!", true);
        boolean boolean42 = branchyValidator0.isValid("", 0, 100.0d, "hi!", false);
        boolean boolean48 = branchyValidator0.isValid("", 0, (double) '#', "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test235");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", 10, (double) (byte) 0, "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) '#', (double) 1L, "hi!", true);
        java.lang.Class<?> wildcardClass43 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test236");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 100, (double) 1L, "", false);
        boolean boolean24 = branchyValidator0.isValid("", (int) '#', (double) (byte) 1, "", true);
        java.lang.Class<?> wildcardClass25 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test237");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 0, (double) 10.0f, "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (-1.0f), "hi!", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (-1), (double) 1000, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test238");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (short) 0, (double) 10, "hi!", false);
        boolean boolean24 = branchyValidator0.isValid("hi!", (int) ' ', (double) 10, "hi!", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", 1000, (double) 1, "", false);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test239");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        boolean boolean24 = branchyValidator0.isValid("", 100, (double) 1, "hi!", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) 'a', (double) 100.0f, "", false);
        boolean boolean36 = branchyValidator0.isValid("", (int) (short) 0, (double) (byte) -1, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test240");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (byte) 10, (double) '#', "hi!", true);
        boolean boolean42 = branchyValidator0.isValid("hi!", (int) (byte) -1, (double) ' ', "hi!", true);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", (int) 'a', (double) 1000, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test241");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (byte) 1, (double) (short) 100, "hi!", true);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (byte) 100, (double) '4', "", false);
        boolean boolean42 = branchyValidator0.isValid("hi!", 0, (double) 10, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test242");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("", (int) (byte) 0, (double) 10, "hi!", false);
        boolean boolean12 = branchyValidator0.isValid("", (int) (byte) 100, (double) (byte) 0, "hi!", false);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) '4', 0.0d, "hi!", false);
        boolean boolean24 = branchyValidator0.isValid("", (int) '#', (double) 'a', "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test243");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 10, (double) (-1), "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (byte) 1, (double) (-1.0f), "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) '#', (double) 100.0f, "", true);
        boolean boolean48 = branchyValidator0.isValid("", (int) '#', (double) 1L, "", false);
        boolean boolean54 = branchyValidator0.isValid("", (int) (byte) -1, (double) 0L, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test244");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (byte) 1, (double) (short) 100, "hi!", true);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (byte) 100, (double) '4', "", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", (int) (byte) -1, 0.0d, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test245");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) ' ', 0.0d, "", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", (-1), 0.0d, "hi!", true);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", 1, (double) (short) 100, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test246");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", 0, (double) (short) 10, "", false);
        java.lang.Class<?> wildcardClass37 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test247");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) '#', "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (-1), (double) 0.0f, "hi!", true);
        boolean boolean48 = branchyValidator0.isValid("", 10, (double) 0.0f, "", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("hi!", (int) (byte) 0, (double) 0, "", true);
        java.util.List<java.lang.String> strList60 = branchyValidator0.validate("", (int) (byte) 100, (double) 10, "", false);
        java.lang.Class<?> wildcardClass61 = strList60.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test248");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) '#', (double) (byte) 100, "", true);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", (int) (byte) 1, (double) 'a', "hi!", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("", 1000, (double) 10, "", true);
        boolean boolean60 = branchyValidator0.isValid("", 0, (double) (byte) 0, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test249");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", 100, 10000.0d, "", false);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) 'a', (double) 0.0f, "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (byte) 1, (double) (short) 1, "", false);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", 100, 100.0d, "hi!", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test250");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        boolean boolean12 = branchyValidator0.isValid("", (int) 'a', (double) 10, "", true);
        boolean boolean18 = branchyValidator0.isValid("", (int) ' ', 10.0d, "", true);
        boolean boolean24 = branchyValidator0.isValid("", 0, (double) (short) 1, "", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (short) 1, (double) (short) 10, "", true);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", (int) (short) 10, (double) (-1.0f), "hi!", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) 'a', 1.0d, "", true);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", (int) (short) 100, (double) 100L, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test251");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (byte) 1, (double) (short) 100, "hi!", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (short) -1, (double) (short) 1, "", true);
        boolean boolean42 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) 0, "", false);
        boolean boolean48 = branchyValidator0.isValid("hi!", (int) (short) -1, 10000.0d, "hi!", false);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("hi!", (int) '#', (double) '4', "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strList54);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test252");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) (byte) 10, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (-1), (double) (short) 0, "hi!", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) '4', (double) 100.0f, "", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("hi!", (int) ' ', 0.0d, "", false);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("", 1000, (double) '#', "hi!", true);
        java.lang.Class<?> wildcardClass55 = strList54.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test253");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 1, (double) '#', "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (byte) 1, (double) (byte) -1, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (short) -1, (double) (byte) 100, "hi!", false);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test254");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 10, (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (short) 1, (double) '4', "hi!", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 1000, (double) 'a', "", false);
        boolean boolean48 = branchyValidator0.isValid("hi!", (int) (short) 1, (double) (short) 10, "", true);
        java.lang.Class<?> wildcardClass49 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test255");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", 10, (double) (byte) 0, "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) '#', (double) '4', "", true);
        boolean boolean48 = branchyValidator0.isValid("", 100, (double) 10L, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test256");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 10, (double) (-1), "", true);
        boolean boolean36 = branchyValidator0.isValid("hi!", 10, (double) 1000, "hi!", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 1, (double) (short) 10, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test257");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        boolean boolean24 = branchyValidator0.isValid("", 100, (double) 1, "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 1, (double) 10L, "hi!", true);
        boolean boolean36 = branchyValidator0.isValid("", (-1), (double) (byte) 1, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test258");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 0, (double) 10.0f, "", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) (short) 10, (double) (short) 1, "", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", 1000, (double) 10, "hi!", true);
        java.lang.Class<?> wildcardClass31 = strList30.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test259");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("hi!", (int) (byte) 0, (double) 100.0f, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) (short) 100, (double) (byte) 1, "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("hi!", 1000, (double) '4', "", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (-1), (double) 100.0f, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test260");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (short) 0, (double) 100.0f, "", false);
        boolean boolean36 = branchyValidator0.isValid("", 1, (double) 'a', "", true);
        boolean boolean42 = branchyValidator0.isValid("", 10, 0.0d, "", true);
        java.lang.Class<?> wildcardClass43 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test261");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) 'a', (double) (-1L), "", false);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) -1, (double) (byte) -1, "hi!", true);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test262");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("hi!", (int) (byte) 0, (double) (-1L), "", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", 1, (double) (-1L), "", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (byte) 0, (double) (-1), "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test263");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (byte) 10, (double) '#', "hi!", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", 100, (double) 100, "hi!", true);
        boolean boolean48 = branchyValidator0.isValid("", (int) (short) 10, (-1.0d), "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test264");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) (byte) -1, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (short) -1, (double) (short) -1, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("", (int) (short) 100, 10.0d, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test265");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 10, (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (short) 1, (double) '4', "hi!", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 1000, (double) 'a', "", false);
        boolean boolean48 = branchyValidator0.isValid("hi!", (int) (short) 1, (double) (short) 10, "", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("", 100, (double) (byte) 0, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strList54);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test266");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 1, (double) '#', "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (byte) 1, (double) (byte) -1, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) 100, (double) ' ', "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test267");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 0, (double) (short) 1, "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) 1, (double) 1000, "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", 0, (double) (-1L), "", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 10, 10.0d, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test268");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 0, (double) (short) 1, "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) 1, (double) 1000, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (int) ' ', (double) (byte) 100, "hi!", true);
        boolean boolean42 = branchyValidator0.isValid("hi!", (int) (byte) -1, (double) ' ', "", true);
        boolean boolean48 = branchyValidator0.isValid("hi!", 10, (double) 0, "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test269");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) (byte) -1, (double) (short) 10, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 100, (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", 0, (double) (short) 1, "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) -1, 0.0d, "", false);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test270");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) (byte) 10, "hi!", false);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test271");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("hi!", (int) (short) 1, (double) '4', "hi!", false);
        boolean boolean24 = branchyValidator0.isValid("hi!", (int) (byte) 1, (double) 1.0f, "", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (-1), (double) 1L, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test272");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 100, (double) 10, "", true);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test273");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 10, (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (short) 1, (double) '4', "hi!", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 1000, (double) 'a', "", false);
        boolean boolean48 = branchyValidator0.isValid("hi!", (int) (short) 10, 0.0d, "hi!", true);
        boolean boolean54 = branchyValidator0.isValid("hi!", (int) (short) 0, (double) (-1.0f), "", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test274");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        boolean boolean12 = branchyValidator0.isValid("", (int) 'a', (double) (short) 0, "", false);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("hi!", 0, (double) 10L, "hi!", false);
        boolean boolean24 = branchyValidator0.isValid("", (int) (short) 1, (double) 1L, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test275");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        boolean boolean18 = branchyValidator0.isValid("hi!", (int) (byte) 0, (double) 10.0f, "", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) (short) 10, (double) (short) 1, "", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", 1000, (double) 10, "hi!", true);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("hi!", (int) (short) -1, 0.0d, "hi!", false);
        boolean boolean42 = branchyValidator0.isValid("hi!", (int) '#', (double) (byte) 100, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test276");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("hi!", (int) (byte) 1, (double) (short) 100, "hi!", true);
        boolean boolean36 = branchyValidator0.isValid("", (int) (short) -1, (double) (short) 1, "", true);
        boolean boolean42 = branchyValidator0.isValid("hi!", (int) (short) 10, (double) 0, "", false);
        java.lang.Class<?> wildcardClass43 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test277");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) '#', (double) ' ', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("", 100, (double) 10.0f, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (int) (short) -1, (double) ' ', "", false);
        boolean boolean42 = branchyValidator0.isValid("", (int) '#', (double) (byte) 100, "", true);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", (int) (byte) 1, (double) 'a', "hi!", true);
        java.util.List<java.lang.String> strList54 = branchyValidator0.validate("", 1000, (double) 10, "", true);
        java.lang.Class<?> wildcardClass55 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test278");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (byte) 10, (double) 'a', "hi!", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (int) (short) 1, (double) '4', "hi!", false);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 1000, (double) 'a', "", false);
        boolean boolean48 = branchyValidator0.isValid("hi!", (int) (short) 10, 0.0d, "hi!", true);
        boolean boolean54 = branchyValidator0.isValid("hi!", (-1), (double) 10.0f, "hi!", false);
        java.util.List<java.lang.String> strList60 = branchyValidator0.validate("", (-1), (double) 100.0f, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strList60);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test279");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        boolean boolean24 = branchyValidator0.isValid("", (int) 'a', 0.0d, "", true);
        boolean boolean30 = branchyValidator0.isValid("", (int) (short) 0, (double) (byte) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("hi!", (-1), 100.0d, "hi!", true);
        boolean boolean42 = branchyValidator0.isValid("hi!", 10, (double) (-1L), "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test280");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (short) -1, (double) (byte) 10, "", false);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) '4', (-1.0d), "", true);
        java.lang.Class<?> wildcardClass31 = branchyValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test281");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("hi!", (int) 'a', (double) 0L, "hi!", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", 0, (double) 100.0f, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("", (int) (short) -1, (double) 'a', "hi!", false);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) 1, (double) (short) 100, "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test282");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) 'a', (double) 1L, "hi!", true);
        java.util.List<java.lang.String> strList30 = branchyValidator0.validate("", (int) (byte) 100, (double) 100L, "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test283");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 100, 1.0d, "", false);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 100, (double) (byte) 10, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", 0, (double) (short) 100, "hi!", false);
        boolean boolean36 = branchyValidator0.isValid("", (int) '4', (double) 100, "", true);
        java.util.List<java.lang.String> strList42 = branchyValidator0.validate("hi!", 0, (double) (short) 100, "hi!", false);
        java.util.List<java.lang.String> strList48 = branchyValidator0.validate("", (-1), (double) 10L, "", false);
        java.lang.Class<?> wildcardClass49 = strList48.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BranchyValidatorRandoopTest0.test284");
        benchmark.BranchyValidator branchyValidator0 = new benchmark.BranchyValidator();
        boolean boolean6 = branchyValidator0.isValid("hi!", 1000, (double) (short) 10, "hi!", false);
        java.util.List<java.lang.String> strList12 = branchyValidator0.validate("", (int) (byte) 100, 0.0d, "", true);
        java.util.List<java.lang.String> strList18 = branchyValidator0.validate("", (int) (byte) 0, (double) (byte) 10, "hi!", true);
        java.util.List<java.lang.String> strList24 = branchyValidator0.validate("hi!", (int) (short) 1, 10000.0d, "hi!", true);
        boolean boolean30 = branchyValidator0.isValid("hi!", (int) (short) 0, (double) (byte) 100, "", false);
        java.util.List<java.lang.String> strList36 = branchyValidator0.validate("", (-1), (double) 100, "", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList36);
    }
}

