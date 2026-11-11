package benchmark;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExceptionHeavyRandoopTest0 {

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
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test001");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test002");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = exceptionHeavy0.getFlag(strMap1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test003");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.String str3 = configException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str3, "benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test004");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = exceptionHeavy0.getInt(strMap1, "hi!", (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test005");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = configException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test006");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = exceptionHeavy0.getInt(strMap3, "hi!", (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test007");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        java.lang.Class<?> wildcardClass4 = throwableArray3.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test008");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.String str10 = configException7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str10, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test009");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = exceptionHeavy0.getInt(strMap5, "benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test010");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        int int3 = configException2.getPosition();
        java.lang.String str4 = configException2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str4, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test011");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = exceptionHeavy0.getInt(strMap6, "benchmark.ExceptionHeavy$ConfigException: hi!", 100, 10);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test012");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = exceptionHeavy0.getInt(strMap7, "benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test013");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        java.lang.String str4 = configException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str4, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test014");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        java.lang.Class<?> wildcardClass7 = strMap3.getClass();
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test015");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap4 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test016");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = exceptionHeavy0.getInt(strMap3, "benchmark.ExceptionHeavy$ConfigException: hi!", 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test017");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap8 = exceptionHeavy0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test018");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = configException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test019");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.String str3 = configException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str3, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test020");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = exceptionHeavy0.getInt(strMap3, "hi!", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test021");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test022");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        java.lang.Class<?> wildcardClass4 = configException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test023");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        java.lang.Class<?> wildcardClass11 = throwableArray10.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test024");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.String str10 = configException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str10, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test025");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = exceptionHeavy0.getInt(strMap6, "hi!", 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test026");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        configException2.addSuppressed((java.lang.Throwable) configException10);
        java.lang.String str14 = configException2.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str14, "benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test027");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap14 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: ");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException:");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test028");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 100);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test029");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy1.getFlag(strMap6, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy1.getFlag(strMap12, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = exceptionHeavy0.getInt(strMap12, "", (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test030");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        int int15 = configException13.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException18 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray19 = configException18.getSuppressed();
        int int20 = configException18.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException23 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray24 = configException23.getSuppressed();
        configException18.addSuppressed((java.lang.Throwable) configException23);
        java.lang.Throwable[] throwableArray26 = configException18.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException29 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException18.addSuppressed((java.lang.Throwable) configException29);
        int int31 = configException29.getPosition();
        configException13.addSuppressed((java.lang.Throwable) configException29);
        java.lang.Class<?> wildcardClass33 = configException13.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertArrayEquals(throwableArray19, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertArrayEquals(throwableArray24, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test031");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) '#');
        int int3 = configException2.getPosition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test032");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap16 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: ");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException:");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test033");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Class<?> wildcardClass10 = configException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test034");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) 1);
        java.lang.String str3 = configException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str3, "benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test035");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        boolean boolean22 = exceptionHeavy16.getFlag(strMap19, "hi!", true);
        boolean boolean25 = exceptionHeavy9.getFlag(strMap19, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = exceptionHeavy0.getInt(strMap19, "hi!", (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test036");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        java.lang.String str3 = configException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str3, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test037");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        configException2.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException16 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray20 = configException19.getSuppressed();
        int int21 = configException19.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException24 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray25 = configException24.getSuppressed();
        configException19.addSuppressed((java.lang.Throwable) configException24);
        configException16.addSuppressed((java.lang.Throwable) configException24);
        benchmark.ExceptionHeavy.ConfigException configException30 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray31 = configException30.getSuppressed();
        int int32 = configException30.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException35 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray36 = configException35.getSuppressed();
        configException30.addSuppressed((java.lang.Throwable) configException35);
        java.lang.Throwable[] throwableArray38 = configException30.getSuppressed();
        configException24.addSuppressed((java.lang.Throwable) configException30);
        configException2.addSuppressed((java.lang.Throwable) configException24);
        java.lang.String str41 = configException24.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertArrayEquals(throwableArray25, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertArrayEquals(throwableArray36, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str41, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test038");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy3.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean18 = exceptionHeavy0.getFlag(strMap12, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap20 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test039");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = exceptionHeavy0.getInt(strMap12, "", (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test040");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test041");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        configException2.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException16 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        configException10.addSuppressed((java.lang.Throwable) configException16);
        java.lang.Class<?> wildcardClass18 = configException10.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test042");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        java.lang.String str3 = configException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: " + "'", str3, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test043");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy2 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = exceptionHeavy2.parse("");
        boolean boolean7 = exceptionHeavy1.getFlag(strMap4, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy8.getFlag(strMap11, "hi!", true);
        boolean boolean17 = exceptionHeavy1.getFlag(strMap11, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean20 = exceptionHeavy0.getFlag(strMap11, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy21 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = exceptionHeavy21.parse("");
        benchmark.ExceptionHeavy exceptionHeavy24 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = exceptionHeavy24.parse("");
        boolean boolean29 = exceptionHeavy21.getFlag(strMap26, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy30 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy30.parse("");
        boolean boolean35 = exceptionHeavy21.getFlag(strMap32, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = exceptionHeavy0.getInt(strMap32, "", (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test044");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        java.lang.Class<?> wildcardClass25 = strMap18.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test045");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 10);
        int int3 = configException2.getPosition();
        java.lang.String str4 = configException2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: " + "'", str4, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test046");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy3.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        benchmark.ExceptionHeavy exceptionHeavy19 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = exceptionHeavy19.parse("");
        boolean boolean24 = exceptionHeavy16.getFlag(strMap21, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        boolean boolean30 = exceptionHeavy16.getFlag(strMap27, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy31 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy32 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = exceptionHeavy32.parse("");
        boolean boolean37 = exceptionHeavy31.getFlag(strMap34, "hi!", true);
        boolean boolean40 = exceptionHeavy16.getFlag(strMap34, "", false);
        boolean boolean43 = exceptionHeavy3.getFlag(strMap34, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = exceptionHeavy0.getInt(strMap34, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test047");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy2 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = exceptionHeavy2.parse("");
        boolean boolean7 = exceptionHeavy1.getFlag(strMap4, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy8.getFlag(strMap11, "hi!", true);
        boolean boolean17 = exceptionHeavy1.getFlag(strMap11, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean20 = exceptionHeavy0.getFlag(strMap11, "benchmark.ExceptionHeavy$ConfigException: ", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap22 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: ");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException:");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test048");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        int int11 = configException2.getPosition();
        java.lang.Class<?> wildcardClass12 = configException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test049");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        configException2.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException16 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        configException10.addSuppressed((java.lang.Throwable) configException16);
        java.lang.String str18 = configException16.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str18, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test050");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        benchmark.ExceptionHeavy exceptionHeavy19 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = exceptionHeavy19.parse("");
        boolean boolean24 = exceptionHeavy16.getFlag(strMap21, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        boolean boolean30 = exceptionHeavy16.getFlag(strMap27, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy16.parse("");
        boolean boolean35 = exceptionHeavy9.getFlag(strMap32, "", false);
        boolean boolean38 = exceptionHeavy0.getFlag(strMap32, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap40 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException:");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test051");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = exceptionHeavy0.parse("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: ");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException:");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test052");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy3.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        benchmark.ExceptionHeavy exceptionHeavy19 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = exceptionHeavy19.parse("");
        boolean boolean24 = exceptionHeavy16.getFlag(strMap21, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean27 = exceptionHeavy3.getFlag(strMap21, "", false);
        boolean boolean30 = exceptionHeavy0.getFlag(strMap21, "", true);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy33 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = exceptionHeavy33.parse("");
        benchmark.ExceptionHeavy exceptionHeavy36 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = exceptionHeavy36.parse("");
        boolean boolean41 = exceptionHeavy33.getFlag(strMap38, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        boolean boolean47 = exceptionHeavy33.getFlag(strMap44, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy48 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy49 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap51 = exceptionHeavy49.parse("");
        boolean boolean54 = exceptionHeavy48.getFlag(strMap51, "hi!", true);
        boolean boolean57 = exceptionHeavy33.getFlag(strMap51, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int61 = exceptionHeavy0.getInt(strMap51, "benchmark.ExceptionHeavy$ConfigException: ", (int) '4', 35);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test053");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        java.lang.Class<?> wildcardClass15 = configException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test054");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        int int15 = configException13.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException18 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray19 = configException18.getSuppressed();
        int int20 = configException18.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException23 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray24 = configException23.getSuppressed();
        configException18.addSuppressed((java.lang.Throwable) configException23);
        java.lang.Throwable[] throwableArray26 = configException18.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException29 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException18.addSuppressed((java.lang.Throwable) configException29);
        int int31 = configException29.getPosition();
        configException13.addSuppressed((java.lang.Throwable) configException29);
        java.lang.String str33 = configException13.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertArrayEquals(throwableArray19, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertArrayEquals(throwableArray24, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: " + "'", str33, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test055");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = exceptionHeavy8.parse("");
        boolean boolean13 = exceptionHeavy7.getFlag(strMap10, "hi!", true);
        boolean boolean16 = exceptionHeavy0.getFlag(strMap10, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = exceptionHeavy0.getInt(strMap17, "", (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test056");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException5.addSuppressed((java.lang.Throwable) configException10);
        java.lang.String str12 = configException10.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str12, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test057");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy13 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = exceptionHeavy13.parse("");
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy13.getFlag(strMap18, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy22 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = exceptionHeavy22.parse("");
        boolean boolean27 = exceptionHeavy13.getFlag(strMap24, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy29 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = exceptionHeavy29.parse("");
        boolean boolean34 = exceptionHeavy28.getFlag(strMap31, "hi!", true);
        boolean boolean37 = exceptionHeavy13.getFlag(strMap31, "", false);
        boolean boolean40 = exceptionHeavy0.getFlag(strMap31, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap42 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test058");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        int int15 = configException2.getPosition();
        java.lang.Class<?> wildcardClass16 = configException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test059");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = exceptionHeavy0.getInt(strMap12, "benchmark.ExceptionHeavy$ConfigException: hi!", (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test060");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        int int15 = configException13.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException18 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray19 = configException18.getSuppressed();
        int int20 = configException18.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException23 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray24 = configException23.getSuppressed();
        configException18.addSuppressed((java.lang.Throwable) configException23);
        java.lang.Throwable[] throwableArray26 = configException18.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException29 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException18.addSuppressed((java.lang.Throwable) configException29);
        int int31 = configException29.getPosition();
        configException13.addSuppressed((java.lang.Throwable) configException29);
        java.lang.Throwable[] throwableArray33 = configException29.getSuppressed();
        java.lang.String str34 = configException29.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertArrayEquals(throwableArray19, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertArrayEquals(throwableArray24, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertArrayEquals(throwableArray33, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: " + "'", str34, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test061");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 10);
        java.lang.String str3 = configException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: " + "'", str3, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test062");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = exceptionHeavy0.parse("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap16 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test063");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy13 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = exceptionHeavy13.parse("");
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy13.getFlag(strMap18, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        java.util.Map<java.lang.String, java.lang.String> strMap25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = exceptionHeavy0.getFlag(strMap25, "benchmark.ExceptionHeavy$ConfigException: hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test064");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = exceptionHeavy8.parse("");
        boolean boolean13 = exceptionHeavy7.getFlag(strMap10, "hi!", true);
        boolean boolean16 = exceptionHeavy0.getFlag(strMap10, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test065");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy2 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = exceptionHeavy2.parse("");
        boolean boolean7 = exceptionHeavy1.getFlag(strMap4, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy8.getFlag(strMap11, "hi!", true);
        boolean boolean17 = exceptionHeavy1.getFlag(strMap11, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean20 = exceptionHeavy0.getFlag(strMap11, "benchmark.ExceptionHeavy$ConfigException: ", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap22 = exceptionHeavy0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test066");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = exceptionHeavy15.parse("");
        benchmark.ExceptionHeavy exceptionHeavy18 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = exceptionHeavy18.parse("");
        boolean boolean23 = exceptionHeavy15.getFlag(strMap20, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy24 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        boolean boolean30 = exceptionHeavy24.getFlag(strMap27, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy31 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = exceptionHeavy31.parse("");
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy31.getFlag(strMap36, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = exceptionHeavy40.parse("");
        boolean boolean45 = exceptionHeavy31.getFlag(strMap42, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = exceptionHeavy31.parse("");
        boolean boolean50 = exceptionHeavy24.getFlag(strMap47, "", false);
        boolean boolean53 = exceptionHeavy15.getFlag(strMap47, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = exceptionHeavy0.getInt(strMap47, "benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test067");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (byte) 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test068");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy25.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy25.getFlag(strMap36, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = exceptionHeavy25.parse("");
        boolean boolean44 = exceptionHeavy0.getFlag(strMap41, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        java.lang.Class<?> wildcardClass45 = exceptionHeavy0.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test069");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = exceptionHeavy15.parse("");
        benchmark.ExceptionHeavy exceptionHeavy18 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = exceptionHeavy18.parse("");
        boolean boolean23 = exceptionHeavy15.getFlag(strMap20, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy24 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        boolean boolean30 = exceptionHeavy24.getFlag(strMap27, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy31 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy32 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = exceptionHeavy32.parse("");
        boolean boolean37 = exceptionHeavy31.getFlag(strMap34, "hi!", true);
        boolean boolean40 = exceptionHeavy24.getFlag(strMap34, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean43 = exceptionHeavy15.getFlag(strMap34, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap45 = exceptionHeavy15.parse("");
        // The following exception was thrown during execution in test generation
        try {
            int int49 = exceptionHeavy0.getInt(strMap45, "", (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strMap45);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test070");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException7.getSuppressed();
        int int11 = configException7.getPosition();
        java.lang.String str12 = configException7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str12, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test071");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        int int15 = configException13.getPosition();
        java.lang.Throwable[] throwableArray16 = configException13.getSuppressed();
        java.lang.String str17 = configException13.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: " + "'", str17, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test072");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        java.lang.Throwable[] throwableArray15 = configException2.getSuppressed();
        java.lang.String str16 = configException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str16, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test073");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", 10);
        java.lang.String str3 = configException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str3, "benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test074");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = exceptionHeavy0.parse("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test075");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy2 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = exceptionHeavy2.parse("");
        boolean boolean7 = exceptionHeavy1.getFlag(strMap4, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy8.getFlag(strMap11, "hi!", true);
        boolean boolean17 = exceptionHeavy1.getFlag(strMap11, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean20 = exceptionHeavy0.getFlag(strMap11, "benchmark.ExceptionHeavy$ConfigException: ", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap22 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test076");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy3.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        benchmark.ExceptionHeavy exceptionHeavy19 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = exceptionHeavy19.parse("");
        boolean boolean24 = exceptionHeavy16.getFlag(strMap21, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean27 = exceptionHeavy3.getFlag(strMap21, "", false);
        boolean boolean30 = exceptionHeavy0.getFlag(strMap21, "", true);
        benchmark.ExceptionHeavy exceptionHeavy31 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = exceptionHeavy31.parse("");
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy31.getFlag(strMap36, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = exceptionHeavy40.parse("");
        boolean boolean45 = exceptionHeavy31.getFlag(strMap42, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = exceptionHeavy0.getInt(strMap42, "", 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test077");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        configException2.addSuppressed((java.lang.Throwable) configException10);
        java.lang.String str14 = configException10.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str14, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test078");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        int int11 = configException2.getPosition();
        int int12 = configException2.getPosition();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test079");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy25.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy35 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = exceptionHeavy35.parse("");
        boolean boolean40 = exceptionHeavy34.getFlag(strMap37, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy41 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        boolean boolean47 = exceptionHeavy41.getFlag(strMap44, "hi!", true);
        boolean boolean50 = exceptionHeavy34.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean53 = exceptionHeavy25.getFlag(strMap44, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = exceptionHeavy25.parse("");
        boolean boolean58 = exceptionHeavy0.getFlag(strMap55, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy59 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap61 = exceptionHeavy59.parse("");
        benchmark.ExceptionHeavy exceptionHeavy62 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap64 = exceptionHeavy62.parse("");
        boolean boolean67 = exceptionHeavy59.getFlag(strMap64, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy68 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap70 = exceptionHeavy68.parse("");
        boolean boolean73 = exceptionHeavy59.getFlag(strMap70, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy74 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy75 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap77 = exceptionHeavy75.parse("");
        boolean boolean80 = exceptionHeavy74.getFlag(strMap77, "hi!", true);
        boolean boolean83 = exceptionHeavy59.getFlag(strMap77, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int87 = exceptionHeavy0.getInt(strMap77, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test080");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        int int15 = configException13.getPosition();
        java.lang.Throwable[] throwableArray16 = configException13.getSuppressed();
        int int17 = configException13.getPosition();
        java.lang.String str18 = configException13.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: " + "'", str18, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test081");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = exceptionHeavy0.parse("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test082");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) '#');
        java.lang.Class<?> wildcardClass3 = configException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test083");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy13 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = exceptionHeavy13.parse("");
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy13.getFlag(strMap18, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy25.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", false);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = exceptionHeavy0.getInt(strMap30, "", (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test084");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) 100);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test085");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        boolean boolean22 = exceptionHeavy16.getFlag(strMap19, "hi!", true);
        boolean boolean25 = exceptionHeavy9.getFlag(strMap19, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean28 = exceptionHeavy0.getFlag(strMap19, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy29 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy30 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy30.parse("");
        boolean boolean35 = exceptionHeavy29.getFlag(strMap32, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy36 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = exceptionHeavy36.parse("");
        benchmark.ExceptionHeavy exceptionHeavy39 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = exceptionHeavy39.parse("");
        boolean boolean44 = exceptionHeavy36.getFlag(strMap41, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy45 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap47 = exceptionHeavy45.parse("");
        boolean boolean50 = exceptionHeavy36.getFlag(strMap47, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap52 = exceptionHeavy36.parse("");
        boolean boolean55 = exceptionHeavy29.getFlag(strMap52, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = exceptionHeavy0.getInt(strMap52, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test086");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        configException2.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException16 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        configException10.addSuppressed((java.lang.Throwable) configException16);
        java.lang.Throwable[] throwableArray18 = configException10.getSuppressed();
        java.lang.String str19 = configException10.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str19, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test087");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) 'a');
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test088");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = exceptionHeavy15.parse("");
        benchmark.ExceptionHeavy exceptionHeavy18 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = exceptionHeavy18.parse("");
        boolean boolean23 = exceptionHeavy15.getFlag(strMap20, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy24 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        boolean boolean30 = exceptionHeavy24.getFlag(strMap27, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy31 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy32 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = exceptionHeavy32.parse("");
        boolean boolean37 = exceptionHeavy31.getFlag(strMap34, "hi!", true);
        boolean boolean40 = exceptionHeavy24.getFlag(strMap34, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean43 = exceptionHeavy15.getFlag(strMap34, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = exceptionHeavy0.getInt(strMap34, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test089");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException5.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray15 = configException14.getSuppressed();
        int int16 = configException14.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray20 = configException19.getSuppressed();
        configException14.addSuppressed((java.lang.Throwable) configException19);
        java.lang.Throwable[] throwableArray22 = configException14.getSuppressed();
        int int23 = configException14.getPosition();
        configException5.addSuppressed((java.lang.Throwable) configException14);
        int int25 = configException14.getPosition();
        java.lang.Class<?> wildcardClass26 = configException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test090");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = configException2.getSuppressed();
        int int5 = configException2.getPosition();
        java.lang.Class<?> wildcardClass6 = configException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test091");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (byte) 1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        configException2.addSuppressed((java.lang.Throwable) configException10);
        int int14 = configException10.getPosition();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test092");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = configException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test093");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = exceptionHeavy0.parse("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap10 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test094");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy22 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy23 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = exceptionHeavy23.parse("");
        boolean boolean28 = exceptionHeavy22.getFlag(strMap25, "hi!", true);
        boolean boolean31 = exceptionHeavy15.getFlag(strMap25, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean34 = exceptionHeavy0.getFlag(strMap25, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        java.lang.Class<?> wildcardClass35 = strMap25.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test095");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy2 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = exceptionHeavy2.parse("");
        boolean boolean7 = exceptionHeavy1.getFlag(strMap4, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy8.getFlag(strMap11, "hi!", true);
        boolean boolean17 = exceptionHeavy1.getFlag(strMap11, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean20 = exceptionHeavy0.getFlag(strMap11, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy21 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy22 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = exceptionHeavy22.parse("");
        boolean boolean27 = exceptionHeavy21.getFlag(strMap24, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy21.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", true);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = exceptionHeavy21.parse("");
        // The following exception was thrown during execution in test generation
        try {
            int int39 = exceptionHeavy0.getInt(strMap35, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strMap35);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test096");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy22 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy23 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = exceptionHeavy23.parse("");
        boolean boolean28 = exceptionHeavy22.getFlag(strMap25, "hi!", true);
        boolean boolean31 = exceptionHeavy15.getFlag(strMap25, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean34 = exceptionHeavy0.getFlag(strMap25, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test097");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap14 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test098");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = configException2.getSuppressed();
        java.lang.String str5 = configException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str5, "benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test099");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (byte) 1);
        java.lang.String str3 = configException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str3, "benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test100");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (byte) 10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test101");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy13 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = exceptionHeavy13.parse("");
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy13.getFlag(strMap18, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy26 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = exceptionHeavy26.parse("");
        boolean boolean31 = exceptionHeavy25.getFlag(strMap28, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy32 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = exceptionHeavy32.parse("");
        boolean boolean37 = exceptionHeavy25.getFlag(strMap34, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy38 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap40 = exceptionHeavy38.parse("");
        benchmark.ExceptionHeavy exceptionHeavy41 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = exceptionHeavy41.parse("");
        boolean boolean46 = exceptionHeavy38.getFlag(strMap43, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean49 = exceptionHeavy25.getFlag(strMap43, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = exceptionHeavy0.getInt(strMap43, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test102");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy25.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy35 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = exceptionHeavy35.parse("");
        boolean boolean40 = exceptionHeavy34.getFlag(strMap37, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy41 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        boolean boolean47 = exceptionHeavy41.getFlag(strMap44, "hi!", true);
        boolean boolean50 = exceptionHeavy34.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean53 = exceptionHeavy25.getFlag(strMap44, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = exceptionHeavy25.parse("");
        boolean boolean58 = exceptionHeavy0.getFlag(strMap55, "benchmark.ExceptionHeavy$ConfigException: ", true);
        java.lang.Class<?> wildcardClass59 = strMap55.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test103");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = exceptionHeavy8.parse("");
        boolean boolean13 = exceptionHeavy7.getFlag(strMap10, "hi!", true);
        boolean boolean16 = exceptionHeavy0.getFlag(strMap10, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        java.lang.Class<?> wildcardClass17 = exceptionHeavy0.getClass();
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test104");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy7.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy7.getFlag(strMap18, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = exceptionHeavy7.parse("");
        boolean boolean26 = exceptionHeavy0.getFlag(strMap23, "", false);
        benchmark.ExceptionHeavy exceptionHeavy27 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy27.getFlag(strMap30, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy27.getFlag(strMap36, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = exceptionHeavy40.parse("");
        benchmark.ExceptionHeavy exceptionHeavy43 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = exceptionHeavy43.parse("");
        boolean boolean48 = exceptionHeavy40.getFlag(strMap45, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean51 = exceptionHeavy27.getFlag(strMap45, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = exceptionHeavy0.getInt(strMap45, "", (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test105");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        int int11 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray18 = configException17.getSuppressed();
        configException14.addSuppressed((java.lang.Throwable) configException17);
        benchmark.ExceptionHeavy.ConfigException configException22 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException17.addSuppressed((java.lang.Throwable) configException22);
        configException2.addSuppressed((java.lang.Throwable) configException17);
        int int25 = configException2.getPosition();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test106");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy11 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = exceptionHeavy11.parse("");
        boolean boolean16 = exceptionHeavy10.getFlag(strMap13, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        boolean boolean22 = exceptionHeavy10.getFlag(strMap19, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy23 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = exceptionHeavy23.parse("");
        benchmark.ExceptionHeavy exceptionHeavy26 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = exceptionHeavy26.parse("");
        boolean boolean31 = exceptionHeavy23.getFlag(strMap28, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean34 = exceptionHeavy10.getFlag(strMap28, "", false);
        boolean boolean37 = exceptionHeavy7.getFlag(strMap28, "", true);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = exceptionHeavy7.parse("");
        // The following exception was thrown during execution in test generation
        try {
            int int43 = exceptionHeavy0.getInt(strMap39, "benchmark.ExceptionHeavy$ConfigException: hi!", 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strMap39);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test107");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        benchmark.ExceptionHeavy exceptionHeavy6 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = exceptionHeavy6.parse("");
        boolean boolean11 = exceptionHeavy3.getFlag(strMap8, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy12 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = exceptionHeavy12.parse("");
        boolean boolean17 = exceptionHeavy3.getFlag(strMap14, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy3.parse("");
        benchmark.ExceptionHeavy exceptionHeavy20 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = exceptionHeavy20.parse("");
        benchmark.ExceptionHeavy exceptionHeavy23 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy24 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = exceptionHeavy24.parse("");
        boolean boolean29 = exceptionHeavy23.getFlag(strMap26, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy30 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy30.parse("");
        boolean boolean35 = exceptionHeavy23.getFlag(strMap32, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean38 = exceptionHeavy20.getFlag(strMap32, "hi!", true);
        boolean boolean41 = exceptionHeavy3.getFlag(strMap32, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = exceptionHeavy0.getInt(strMap32, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test108");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        benchmark.ExceptionHeavy.ConfigException configException12 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) ' ');
        configException7.addSuppressed((java.lang.Throwable) configException12);
        java.lang.String str14 = configException12.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: " + "'", str14, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test109");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy25.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy25.getFlag(strMap36, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy41 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = exceptionHeavy41.parse("");
        boolean boolean46 = exceptionHeavy40.getFlag(strMap43, "hi!", true);
        boolean boolean49 = exceptionHeavy25.getFlag(strMap43, "", false);
        benchmark.ExceptionHeavy exceptionHeavy50 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap52 = exceptionHeavy50.parse("");
        benchmark.ExceptionHeavy exceptionHeavy53 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap55 = exceptionHeavy53.parse("");
        boolean boolean58 = exceptionHeavy50.getFlag(strMap55, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy59 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap61 = exceptionHeavy59.parse("");
        boolean boolean64 = exceptionHeavy50.getFlag(strMap61, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap66 = exceptionHeavy50.parse("");
        boolean boolean69 = exceptionHeavy25.getFlag(strMap66, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean72 = exceptionHeavy0.getFlag(strMap66, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap74 = exceptionHeavy0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test110");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy7.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy7.getFlag(strMap18, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = exceptionHeavy7.parse("");
        boolean boolean26 = exceptionHeavy0.getFlag(strMap23, "", false);
        java.lang.Class<?> wildcardClass27 = exceptionHeavy0.getClass();
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test111");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy25.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy25.getFlag(strMap36, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = exceptionHeavy25.parse("");
        boolean boolean44 = exceptionHeavy0.getFlag(strMap41, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap46 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: ");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException:");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test112");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy7.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy7.getFlag(strMap18, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy22 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy23 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = exceptionHeavy23.parse("");
        boolean boolean28 = exceptionHeavy22.getFlag(strMap25, "hi!", true);
        boolean boolean31 = exceptionHeavy7.getFlag(strMap25, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = exceptionHeavy0.getInt(strMap25, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test113");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap8 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: ");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException:");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test114");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy3.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        benchmark.ExceptionHeavy exceptionHeavy19 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = exceptionHeavy19.parse("");
        boolean boolean24 = exceptionHeavy16.getFlag(strMap21, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean27 = exceptionHeavy3.getFlag(strMap21, "", false);
        boolean boolean30 = exceptionHeavy0.getFlag(strMap21, "", true);
        benchmark.ExceptionHeavy exceptionHeavy31 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy32 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = exceptionHeavy32.parse("");
        boolean boolean37 = exceptionHeavy31.getFlag(strMap34, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy38 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy39 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = exceptionHeavy39.parse("");
        boolean boolean44 = exceptionHeavy38.getFlag(strMap41, "hi!", true);
        boolean boolean47 = exceptionHeavy31.getFlag(strMap41, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = exceptionHeavy0.getInt(strMap41, "benchmark.ExceptionHeavy$ConfigException: ", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test115");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        java.lang.String str3 = configException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str3, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test116");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (short) 10);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException2.addSuppressed((java.lang.Throwable) configException5);
        int int7 = configException5.getPosition();
        java.lang.Throwable[] throwableArray8 = configException5.getSuppressed();
        java.lang.Class<?> wildcardClass9 = throwableArray8.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test117");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = exceptionHeavy0.parse("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap10 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: ");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException:");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test118");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy13 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = exceptionHeavy13.parse("");
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy13.getFlag(strMap18, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy25.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy35 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = exceptionHeavy35.parse("");
        boolean boolean40 = exceptionHeavy34.getFlag(strMap37, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy41 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        boolean boolean47 = exceptionHeavy41.getFlag(strMap44, "hi!", true);
        boolean boolean50 = exceptionHeavy34.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean53 = exceptionHeavy25.getFlag(strMap44, "hi!", false);
        boolean boolean56 = exceptionHeavy0.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: ", false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap58 = exceptionHeavy0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test119");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap14 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test120");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy25.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy25.getFlag(strMap36, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy41 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = exceptionHeavy41.parse("");
        boolean boolean46 = exceptionHeavy40.getFlag(strMap43, "hi!", true);
        boolean boolean49 = exceptionHeavy25.getFlag(strMap43, "", false);
        benchmark.ExceptionHeavy exceptionHeavy50 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap52 = exceptionHeavy50.parse("");
        benchmark.ExceptionHeavy exceptionHeavy53 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap55 = exceptionHeavy53.parse("");
        boolean boolean58 = exceptionHeavy50.getFlag(strMap55, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy59 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap61 = exceptionHeavy59.parse("");
        boolean boolean64 = exceptionHeavy50.getFlag(strMap61, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap66 = exceptionHeavy50.parse("");
        boolean boolean69 = exceptionHeavy25.getFlag(strMap66, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        // The following exception was thrown during execution in test generation
        try {
            int int73 = exceptionHeavy0.getInt(strMap66, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test121");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        int int3 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException6 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray7 = configException6.getSuppressed();
        int int8 = configException6.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException11 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray12 = configException11.getSuppressed();
        configException6.addSuppressed((java.lang.Throwable) configException11);
        java.lang.Throwable[] throwableArray14 = configException6.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException6.addSuppressed((java.lang.Throwable) configException17);
        configException2.addSuppressed((java.lang.Throwable) configException6);
        benchmark.ExceptionHeavy.ConfigException configException22 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException25 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray26 = configException25.getSuppressed();
        int int27 = configException25.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException30 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray31 = configException30.getSuppressed();
        configException25.addSuppressed((java.lang.Throwable) configException30);
        configException22.addSuppressed((java.lang.Throwable) configException30);
        configException2.addSuppressed((java.lang.Throwable) configException30);
        java.lang.Class<?> wildcardClass35 = configException2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test122");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (short) 10);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException2.addSuppressed((java.lang.Throwable) configException5);
        int int7 = configException5.getPosition();
        java.lang.Throwable[] throwableArray8 = configException5.getSuppressed();
        java.lang.Throwable[] throwableArray9 = configException5.getSuppressed();
        java.lang.String str10 = configException5.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str10, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test123");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        int int15 = configException2.getPosition();
        java.lang.Throwable[] throwableArray16 = configException2.getSuppressed();
        java.lang.Class<?> wildcardClass17 = configException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test124");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy3.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        benchmark.ExceptionHeavy exceptionHeavy19 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = exceptionHeavy19.parse("");
        boolean boolean24 = exceptionHeavy16.getFlag(strMap21, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean27 = exceptionHeavy3.getFlag(strMap21, "", false);
        boolean boolean30 = exceptionHeavy0.getFlag(strMap21, "", true);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy33 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy33.getFlag(strMap36, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = exceptionHeavy40.parse("");
        boolean boolean45 = exceptionHeavy33.getFlag(strMap42, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy46 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap48 = exceptionHeavy46.parse("");
        benchmark.ExceptionHeavy exceptionHeavy49 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap51 = exceptionHeavy49.parse("");
        boolean boolean54 = exceptionHeavy46.getFlag(strMap51, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean57 = exceptionHeavy33.getFlag(strMap51, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int61 = exceptionHeavy0.getInt(strMap51, "benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test125");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        int int3 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException6 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray7 = configException6.getSuppressed();
        int int8 = configException6.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException11 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray12 = configException11.getSuppressed();
        configException6.addSuppressed((java.lang.Throwable) configException11);
        java.lang.Throwable[] throwableArray14 = configException6.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException6.addSuppressed((java.lang.Throwable) configException17);
        configException2.addSuppressed((java.lang.Throwable) configException6);
        java.lang.String str20 = configException6.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str20, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test126");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        boolean boolean22 = exceptionHeavy16.getFlag(strMap19, "hi!", true);
        boolean boolean25 = exceptionHeavy9.getFlag(strMap19, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean28 = exceptionHeavy0.getFlag(strMap19, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy31 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = exceptionHeavy31.parse("");
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy31.getFlag(strMap36, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = exceptionHeavy40.parse("");
        boolean boolean45 = exceptionHeavy31.getFlag(strMap42, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = exceptionHeavy31.parse("");
        benchmark.ExceptionHeavy exceptionHeavy48 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = exceptionHeavy48.parse("");
        benchmark.ExceptionHeavy exceptionHeavy51 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy52 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap54 = exceptionHeavy52.parse("");
        boolean boolean57 = exceptionHeavy51.getFlag(strMap54, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy58 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap60 = exceptionHeavy58.parse("");
        boolean boolean63 = exceptionHeavy51.getFlag(strMap60, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean66 = exceptionHeavy48.getFlag(strMap60, "hi!", true);
        boolean boolean69 = exceptionHeavy31.getFlag(strMap60, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int73 = exceptionHeavy0.getInt(strMap60, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test127");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException5.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray15 = configException14.getSuppressed();
        int int16 = configException14.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray20 = configException19.getSuppressed();
        configException14.addSuppressed((java.lang.Throwable) configException19);
        java.lang.Throwable[] throwableArray22 = configException14.getSuppressed();
        int int23 = configException14.getPosition();
        configException5.addSuppressed((java.lang.Throwable) configException14);
        java.lang.String str25 = configException5.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str25, "benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test128");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy22 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy23 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = exceptionHeavy23.parse("");
        boolean boolean28 = exceptionHeavy22.getFlag(strMap25, "hi!", true);
        boolean boolean31 = exceptionHeavy15.getFlag(strMap25, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean34 = exceptionHeavy0.getFlag(strMap25, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy35 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = exceptionHeavy35.parse("");
        benchmark.ExceptionHeavy exceptionHeavy38 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap40 = exceptionHeavy38.parse("");
        boolean boolean43 = exceptionHeavy35.getFlag(strMap40, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy44 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap46 = exceptionHeavy44.parse("");
        boolean boolean49 = exceptionHeavy35.getFlag(strMap46, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = exceptionHeavy0.getInt(strMap46, "benchmark.ExceptionHeavy$ConfigException: hi!", (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test129");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        benchmark.ExceptionHeavy exceptionHeavy19 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = exceptionHeavy19.parse("");
        boolean boolean24 = exceptionHeavy16.getFlag(strMap21, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        boolean boolean30 = exceptionHeavy16.getFlag(strMap27, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy16.parse("");
        boolean boolean35 = exceptionHeavy9.getFlag(strMap32, "", false);
        boolean boolean38 = exceptionHeavy0.getFlag(strMap32, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy39 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = exceptionHeavy39.parse("");
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy43 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = exceptionHeavy43.parse("");
        boolean boolean48 = exceptionHeavy42.getFlag(strMap45, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy49 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap51 = exceptionHeavy49.parse("");
        boolean boolean54 = exceptionHeavy42.getFlag(strMap51, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy55 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = exceptionHeavy55.parse("");
        benchmark.ExceptionHeavy exceptionHeavy58 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap60 = exceptionHeavy58.parse("");
        boolean boolean63 = exceptionHeavy55.getFlag(strMap60, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean66 = exceptionHeavy42.getFlag(strMap60, "", false);
        boolean boolean69 = exceptionHeavy39.getFlag(strMap60, "", true);
        java.util.Map<java.lang.String, java.lang.String> strMap71 = exceptionHeavy39.parse("");
        // The following exception was thrown during execution in test generation
        try {
            int int75 = exceptionHeavy0.getInt(strMap71, "benchmark.ExceptionHeavy$ConfigException: hi!", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strMap71);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test130");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (short) 10);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = configException5.getSuppressed();
        java.lang.Throwable[] throwableArray8 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        java.lang.Class<?> wildcardClass10 = configException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test131");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (short) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test132");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) '#');
        configException2.addSuppressed((java.lang.Throwable) configException13);
        java.lang.Class<?> wildcardClass15 = configException13.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test133");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy25.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy25.getFlag(strMap36, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = exceptionHeavy25.parse("");
        boolean boolean44 = exceptionHeavy0.getFlag(strMap41, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        java.util.Map<java.lang.String, java.lang.String> strMap45 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = exceptionHeavy0.getFlag(strMap45, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test134");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException5.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray15 = configException14.getSuppressed();
        int int16 = configException14.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray20 = configException19.getSuppressed();
        configException14.addSuppressed((java.lang.Throwable) configException19);
        java.lang.Throwable[] throwableArray22 = configException14.getSuppressed();
        int int23 = configException14.getPosition();
        configException5.addSuppressed((java.lang.Throwable) configException14);
        java.lang.String str25 = configException14.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str25, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test135");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy3.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        benchmark.ExceptionHeavy exceptionHeavy19 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = exceptionHeavy19.parse("");
        boolean boolean24 = exceptionHeavy16.getFlag(strMap21, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean27 = exceptionHeavy3.getFlag(strMap21, "", false);
        boolean boolean30 = exceptionHeavy0.getFlag(strMap21, "", true);
        java.lang.Class<?> wildcardClass31 = strMap21.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test136");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy25.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy25.getFlag(strMap36, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy41 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = exceptionHeavy41.parse("");
        boolean boolean46 = exceptionHeavy40.getFlag(strMap43, "hi!", true);
        boolean boolean49 = exceptionHeavy25.getFlag(strMap43, "", false);
        benchmark.ExceptionHeavy exceptionHeavy50 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap52 = exceptionHeavy50.parse("");
        benchmark.ExceptionHeavy exceptionHeavy53 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap55 = exceptionHeavy53.parse("");
        boolean boolean58 = exceptionHeavy50.getFlag(strMap55, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy59 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap61 = exceptionHeavy59.parse("");
        boolean boolean64 = exceptionHeavy50.getFlag(strMap61, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap66 = exceptionHeavy50.parse("");
        boolean boolean69 = exceptionHeavy25.getFlag(strMap66, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean72 = exceptionHeavy0.getFlag(strMap66, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy73 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy74 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap76 = exceptionHeavy74.parse("");
        boolean boolean79 = exceptionHeavy73.getFlag(strMap76, "hi!", true);
        boolean boolean82 = exceptionHeavy0.getFlag(strMap76, "hi!", false);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strMap76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test137");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) 'a');
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test138");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        benchmark.ExceptionHeavy exceptionHeavy20 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy21 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = exceptionHeavy21.parse("");
        boolean boolean26 = exceptionHeavy20.getFlag(strMap23, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy27 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = exceptionHeavy27.parse("");
        boolean boolean32 = exceptionHeavy20.getFlag(strMap29, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean35 = exceptionHeavy17.getFlag(strMap29, "hi!", true);
        boolean boolean38 = exceptionHeavy0.getFlag(strMap29, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap40 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test139");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.lang.Class<?> wildcardClass1 = exceptionHeavy0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test140");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy2 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = exceptionHeavy2.parse("");
        boolean boolean7 = exceptionHeavy1.getFlag(strMap4, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy8.getFlag(strMap11, "hi!", true);
        boolean boolean17 = exceptionHeavy1.getFlag(strMap11, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean20 = exceptionHeavy0.getFlag(strMap11, "benchmark.ExceptionHeavy$ConfigException: ", true);
        java.lang.Class<?> wildcardClass21 = exceptionHeavy0.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test141");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: ");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException:");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test142");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        int int3 = configException2.getPosition();
        java.lang.Throwable[] throwableArray4 = configException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = configException2.getSuppressed();
        int int6 = configException2.getPosition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test143");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) '#');
        configException2.addSuppressed((java.lang.Throwable) configException13);
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("", (int) (short) 10);
        benchmark.ExceptionHeavy.ConfigException configException20 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray21 = configException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = configException20.getSuppressed();
        java.lang.Throwable[] throwableArray23 = configException20.getSuppressed();
        configException17.addSuppressed((java.lang.Throwable) configException20);
        configException13.addSuppressed((java.lang.Throwable) configException17);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertArrayEquals(throwableArray21, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test144");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap4 = exceptionHeavy0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test145");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        java.lang.Class<?> wildcardClass13 = strMap9.getClass();
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test146");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException8 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray9 = configException8.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException8);
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException8.addSuppressed((java.lang.Throwable) configException13);
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray18 = configException17.getSuppressed();
        int int19 = configException17.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException22 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray23 = configException22.getSuppressed();
        configException17.addSuppressed((java.lang.Throwable) configException22);
        java.lang.Throwable[] throwableArray25 = configException17.getSuppressed();
        int int26 = configException17.getPosition();
        configException8.addSuppressed((java.lang.Throwable) configException17);
        int int28 = configException17.getPosition();
        configException2.addSuppressed((java.lang.Throwable) configException17);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test147");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        boolean boolean22 = exceptionHeavy16.getFlag(strMap19, "hi!", true);
        boolean boolean25 = exceptionHeavy9.getFlag(strMap19, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean28 = exceptionHeavy0.getFlag(strMap19, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy31 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy32 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = exceptionHeavy32.parse("");
        boolean boolean37 = exceptionHeavy31.getFlag(strMap34, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy38 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap40 = exceptionHeavy38.parse("");
        boolean boolean43 = exceptionHeavy31.getFlag(strMap40, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy44 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap46 = exceptionHeavy44.parse("");
        benchmark.ExceptionHeavy exceptionHeavy47 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap49 = exceptionHeavy47.parse("");
        boolean boolean52 = exceptionHeavy44.getFlag(strMap49, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean55 = exceptionHeavy31.getFlag(strMap49, "", false);
        benchmark.ExceptionHeavy exceptionHeavy56 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap58 = exceptionHeavy56.parse("");
        benchmark.ExceptionHeavy exceptionHeavy59 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap61 = exceptionHeavy59.parse("");
        boolean boolean64 = exceptionHeavy56.getFlag(strMap61, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy65 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy66 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap68 = exceptionHeavy66.parse("");
        boolean boolean71 = exceptionHeavy65.getFlag(strMap68, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy72 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy73 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap75 = exceptionHeavy73.parse("");
        boolean boolean78 = exceptionHeavy72.getFlag(strMap75, "hi!", true);
        boolean boolean81 = exceptionHeavy65.getFlag(strMap75, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean84 = exceptionHeavy56.getFlag(strMap75, "hi!", false);
        boolean boolean87 = exceptionHeavy31.getFlag(strMap75, "benchmark.ExceptionHeavy$ConfigException: ", false);
        // The following exception was thrown during execution in test generation
        try {
            int int91 = exceptionHeavy0.getInt(strMap75, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test148");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        configException2.addSuppressed((java.lang.Throwable) configException10);
        java.lang.Throwable[] throwableArray14 = configException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test149");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        int int3 = configException2.getPosition();
        int int4 = configException2.getPosition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test150");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test151");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy3.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        benchmark.ExceptionHeavy exceptionHeavy19 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = exceptionHeavy19.parse("");
        boolean boolean24 = exceptionHeavy16.getFlag(strMap21, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean27 = exceptionHeavy3.getFlag(strMap21, "", false);
        boolean boolean30 = exceptionHeavy0.getFlag(strMap21, "", true);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy0.parse("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap34 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strMap32);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test152");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (-1));
        java.lang.Class<?> wildcardClass3 = configException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test153");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = exceptionHeavy8.parse("");
        boolean boolean13 = exceptionHeavy7.getFlag(strMap10, "hi!", true);
        boolean boolean16 = exceptionHeavy0.getFlag(strMap10, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        benchmark.ExceptionHeavy exceptionHeavy20 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = exceptionHeavy20.parse("");
        boolean boolean25 = exceptionHeavy17.getFlag(strMap22, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy26 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = exceptionHeavy26.parse("");
        boolean boolean31 = exceptionHeavy17.getFlag(strMap28, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy32 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy33 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = exceptionHeavy33.parse("");
        boolean boolean38 = exceptionHeavy32.getFlag(strMap35, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy39 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = exceptionHeavy40.parse("");
        boolean boolean45 = exceptionHeavy39.getFlag(strMap42, "hi!", true);
        boolean boolean48 = exceptionHeavy32.getFlag(strMap42, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean51 = exceptionHeavy17.getFlag(strMap42, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean54 = exceptionHeavy0.getFlag(strMap42, "", false);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = exceptionHeavy0.getFlag(strMap55, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test154");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) '#');
        java.lang.String str3 = configException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: " + "'", str3, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test155");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        java.lang.Class<?> wildcardClass13 = exceptionHeavy0.getClass();
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test156");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        int int15 = configException2.getPosition();
        java.lang.Throwable[] throwableArray16 = configException2.getSuppressed();
        int int17 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException20 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException23 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray24 = configException23.getSuppressed();
        configException20.addSuppressed((java.lang.Throwable) configException23);
        benchmark.ExceptionHeavy.ConfigException configException28 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException23.addSuppressed((java.lang.Throwable) configException28);
        configException2.addSuppressed((java.lang.Throwable) configException28);
        java.lang.Class<?> wildcardClass31 = configException28.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertArrayEquals(throwableArray24, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test157");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) '#');
        configException2.addSuppressed((java.lang.Throwable) configException13);
        java.lang.Throwable[] throwableArray15 = configException2.getSuppressed();
        java.lang.Class<?> wildcardClass16 = throwableArray15.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test158");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException6 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException9 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray10 = configException9.getSuppressed();
        int int11 = configException9.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray15 = configException14.getSuppressed();
        configException9.addSuppressed((java.lang.Throwable) configException14);
        configException6.addSuppressed((java.lang.Throwable) configException14);
        benchmark.ExceptionHeavy.ConfigException configException20 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        configException14.addSuppressed((java.lang.Throwable) configException20);
        configException2.addSuppressed((java.lang.Throwable) configException20);
        int int23 = configException20.getPosition();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test159");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = exceptionHeavy15.parse("");
        benchmark.ExceptionHeavy exceptionHeavy18 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = exceptionHeavy18.parse("");
        boolean boolean23 = exceptionHeavy15.getFlag(strMap20, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy24 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = exceptionHeavy24.parse("");
        boolean boolean29 = exceptionHeavy15.getFlag(strMap26, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy30 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy31 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = exceptionHeavy31.parse("");
        boolean boolean36 = exceptionHeavy30.getFlag(strMap33, "hi!", true);
        boolean boolean39 = exceptionHeavy15.getFlag(strMap33, "", false);
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = exceptionHeavy40.parse("");
        benchmark.ExceptionHeavy exceptionHeavy43 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = exceptionHeavy43.parse("");
        boolean boolean48 = exceptionHeavy40.getFlag(strMap45, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy49 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy50 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap52 = exceptionHeavy50.parse("");
        boolean boolean55 = exceptionHeavy49.getFlag(strMap52, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy56 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy57 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap59 = exceptionHeavy57.parse("");
        boolean boolean62 = exceptionHeavy56.getFlag(strMap59, "hi!", true);
        boolean boolean65 = exceptionHeavy49.getFlag(strMap59, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean68 = exceptionHeavy40.getFlag(strMap59, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap70 = exceptionHeavy40.parse("");
        boolean boolean73 = exceptionHeavy15.getFlag(strMap70, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean76 = exceptionHeavy0.getFlag(strMap70, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        java.util.Map<java.lang.String, java.lang.String> strMap78 = exceptionHeavy0.parse("");
        java.util.Map<java.lang.String, java.lang.String> strMap79 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = exceptionHeavy0.getFlag(strMap79, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strMap78);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test160");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 100);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        configException2.addSuppressed((java.lang.Throwable) configException5);
        java.lang.String str7 = configException2.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str7, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test161");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        boolean boolean22 = exceptionHeavy16.getFlag(strMap19, "hi!", true);
        boolean boolean25 = exceptionHeavy9.getFlag(strMap19, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean28 = exceptionHeavy0.getFlag(strMap19, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy29 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy30 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy30.parse("");
        boolean boolean35 = exceptionHeavy29.getFlag(strMap32, "hi!", true);
        boolean boolean38 = exceptionHeavy0.getFlag(strMap32, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy39 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = exceptionHeavy39.parse("");
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        boolean boolean47 = exceptionHeavy39.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy48 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = exceptionHeavy48.parse("");
        boolean boolean53 = exceptionHeavy39.getFlag(strMap50, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy54 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy55 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = exceptionHeavy55.parse("");
        boolean boolean60 = exceptionHeavy54.getFlag(strMap57, "hi!", true);
        boolean boolean63 = exceptionHeavy39.getFlag(strMap57, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = exceptionHeavy0.getInt(strMap57, "benchmark.ExceptionHeavy$ConfigException: hi!", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test162");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy13 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = exceptionHeavy13.parse("");
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy13.getFlag(strMap18, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy25.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy35 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = exceptionHeavy35.parse("");
        boolean boolean40 = exceptionHeavy34.getFlag(strMap37, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy41 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        boolean boolean47 = exceptionHeavy41.getFlag(strMap44, "hi!", true);
        boolean boolean50 = exceptionHeavy34.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean53 = exceptionHeavy25.getFlag(strMap44, "hi!", false);
        boolean boolean56 = exceptionHeavy0.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy57 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap59 = exceptionHeavy57.parse("");
        benchmark.ExceptionHeavy exceptionHeavy60 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap62 = exceptionHeavy60.parse("");
        boolean boolean65 = exceptionHeavy57.getFlag(strMap62, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy66 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy67 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap69 = exceptionHeavy67.parse("");
        boolean boolean72 = exceptionHeavy66.getFlag(strMap69, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy73 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy74 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap76 = exceptionHeavy74.parse("");
        boolean boolean79 = exceptionHeavy73.getFlag(strMap76, "hi!", true);
        boolean boolean82 = exceptionHeavy66.getFlag(strMap76, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean85 = exceptionHeavy57.getFlag(strMap76, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy86 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy87 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap89 = exceptionHeavy87.parse("");
        boolean boolean92 = exceptionHeavy86.getFlag(strMap89, "hi!", true);
        boolean boolean95 = exceptionHeavy57.getFlag(strMap89, "hi!", true);
        boolean boolean98 = exceptionHeavy0.getFlag(strMap89, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strMap76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(strMap89);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test163");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException5.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray15 = configException14.getSuppressed();
        int int16 = configException14.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray20 = configException19.getSuppressed();
        configException14.addSuppressed((java.lang.Throwable) configException19);
        java.lang.Throwable[] throwableArray22 = configException14.getSuppressed();
        int int23 = configException14.getPosition();
        configException5.addSuppressed((java.lang.Throwable) configException14);
        int int25 = configException14.getPosition();
        java.lang.Throwable[] throwableArray26 = configException14.getSuppressed();
        int int27 = configException14.getPosition();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test164");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = exceptionHeavy0.parse("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy0.parse("");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test165");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", 10);
        java.lang.Class<?> wildcardClass3 = configException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test166");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        int int3 = configException2.getPosition();
        int int4 = configException2.getPosition();
        int int5 = configException2.getPosition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test167");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) '#');
        configException2.addSuppressed((java.lang.Throwable) configException13);
        java.lang.String str15 = configException13.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: " + "'", str15, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test168");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException5.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray15 = configException14.getSuppressed();
        int int16 = configException14.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray20 = configException19.getSuppressed();
        configException14.addSuppressed((java.lang.Throwable) configException19);
        java.lang.Throwable[] throwableArray22 = configException14.getSuppressed();
        int int23 = configException14.getPosition();
        configException5.addSuppressed((java.lang.Throwable) configException14);
        int int25 = configException14.getPosition();
        java.lang.Throwable[] throwableArray26 = configException14.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException29 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException32 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray33 = configException32.getSuppressed();
        configException29.addSuppressed((java.lang.Throwable) configException32);
        benchmark.ExceptionHeavy.ConfigException configException37 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException32.addSuppressed((java.lang.Throwable) configException37);
        int int39 = configException37.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException42 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray43 = configException42.getSuppressed();
        int int44 = configException42.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException47 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray48 = configException47.getSuppressed();
        configException42.addSuppressed((java.lang.Throwable) configException47);
        java.lang.Throwable[] throwableArray50 = configException42.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException53 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException42.addSuppressed((java.lang.Throwable) configException53);
        int int55 = configException53.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException58 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray59 = configException58.getSuppressed();
        int int60 = configException58.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException63 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray64 = configException63.getSuppressed();
        configException58.addSuppressed((java.lang.Throwable) configException63);
        java.lang.Throwable[] throwableArray66 = configException58.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException69 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException58.addSuppressed((java.lang.Throwable) configException69);
        int int71 = configException69.getPosition();
        configException53.addSuppressed((java.lang.Throwable) configException69);
        java.lang.Throwable[] throwableArray73 = configException53.getSuppressed();
        configException37.addSuppressed((java.lang.Throwable) configException53);
        configException14.addSuppressed((java.lang.Throwable) configException53);
        int int76 = configException53.getPosition();
        java.lang.Throwable[] throwableArray77 = configException53.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertArrayEquals(throwableArray33, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertArrayEquals(throwableArray43, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertArrayEquals(throwableArray48, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertArrayEquals(throwableArray59, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertArrayEquals(throwableArray64, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(throwableArray77);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test169");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", 0);
        int int3 = configException2.getPosition();
        java.lang.String str4 = configException2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str4, "benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test170");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap8 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException:");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test171");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = exceptionHeavy0.parse("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test172");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException5.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray15 = configException14.getSuppressed();
        int int16 = configException14.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray20 = configException19.getSuppressed();
        configException14.addSuppressed((java.lang.Throwable) configException19);
        java.lang.Throwable[] throwableArray22 = configException14.getSuppressed();
        int int23 = configException14.getPosition();
        configException5.addSuppressed((java.lang.Throwable) configException14);
        int int25 = configException14.getPosition();
        int int26 = configException14.getPosition();
        java.lang.Throwable[] throwableArray27 = configException14.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(throwableArray27);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test173");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy25.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy25.getFlag(strMap36, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = exceptionHeavy25.parse("");
        boolean boolean44 = exceptionHeavy0.getFlag(strMap41, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap46 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test174");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy22 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy23 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = exceptionHeavy23.parse("");
        boolean boolean28 = exceptionHeavy22.getFlag(strMap25, "hi!", true);
        boolean boolean31 = exceptionHeavy15.getFlag(strMap25, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean34 = exceptionHeavy0.getFlag(strMap25, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test175");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        benchmark.ExceptionHeavy exceptionHeavy6 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = exceptionHeavy6.parse("");
        boolean boolean11 = exceptionHeavy3.getFlag(strMap8, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy12 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = exceptionHeavy12.parse("");
        boolean boolean17 = exceptionHeavy3.getFlag(strMap14, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy18 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = exceptionHeavy18.parse("");
        benchmark.ExceptionHeavy exceptionHeavy21 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = exceptionHeavy21.parse("");
        boolean boolean26 = exceptionHeavy18.getFlag(strMap23, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy27 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = exceptionHeavy27.parse("");
        boolean boolean32 = exceptionHeavy18.getFlag(strMap29, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy33 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy33.getFlag(strMap36, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy41 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = exceptionHeavy41.parse("");
        boolean boolean46 = exceptionHeavy40.getFlag(strMap43, "hi!", true);
        boolean boolean49 = exceptionHeavy33.getFlag(strMap43, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean52 = exceptionHeavy18.getFlag(strMap43, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean55 = exceptionHeavy3.getFlag(strMap43, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean58 = exceptionHeavy0.getFlag(strMap43, "benchmark.ExceptionHeavy$ConfigException: ", false);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test176");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException5.addSuppressed((java.lang.Throwable) configException10);
        java.lang.Class<?> wildcardClass12 = configException5.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test177");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) 0);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        java.lang.Class<?> wildcardClass4 = configException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test178");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) '#');
        java.lang.Class<?> wildcardClass3 = configException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test179");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy13 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = exceptionHeavy13.parse("");
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy13.getFlag(strMap18, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy25.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy35 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = exceptionHeavy35.parse("");
        boolean boolean40 = exceptionHeavy34.getFlag(strMap37, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy41 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        boolean boolean47 = exceptionHeavy41.getFlag(strMap44, "hi!", true);
        boolean boolean50 = exceptionHeavy34.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean53 = exceptionHeavy25.getFlag(strMap44, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = exceptionHeavy0.getInt(strMap44, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test180");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy3.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        benchmark.ExceptionHeavy exceptionHeavy19 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = exceptionHeavy19.parse("");
        boolean boolean24 = exceptionHeavy16.getFlag(strMap21, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean27 = exceptionHeavy3.getFlag(strMap21, "", false);
        boolean boolean30 = exceptionHeavy0.getFlag(strMap21, "", true);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy33 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy35 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = exceptionHeavy35.parse("");
        boolean boolean40 = exceptionHeavy34.getFlag(strMap37, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy41 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        boolean boolean47 = exceptionHeavy41.getFlag(strMap44, "hi!", true);
        boolean boolean50 = exceptionHeavy34.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean53 = exceptionHeavy33.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean56 = exceptionHeavy0.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy57 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap59 = exceptionHeavy57.parse("");
        benchmark.ExceptionHeavy exceptionHeavy60 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap62 = exceptionHeavy60.parse("");
        boolean boolean65 = exceptionHeavy57.getFlag(strMap62, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy66 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap68 = exceptionHeavy66.parse("");
        boolean boolean71 = exceptionHeavy57.getFlag(strMap68, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy72 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy73 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap75 = exceptionHeavy73.parse("");
        boolean boolean78 = exceptionHeavy72.getFlag(strMap75, "hi!", true);
        boolean boolean81 = exceptionHeavy57.getFlag(strMap75, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int85 = exceptionHeavy0.getInt(strMap75, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) '#', 35);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test181");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            configException2.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test182");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy26 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = exceptionHeavy26.parse("");
        boolean boolean31 = exceptionHeavy25.getFlag(strMap28, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy32 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = exceptionHeavy32.parse("");
        boolean boolean37 = exceptionHeavy25.getFlag(strMap34, "benchmark.ExceptionHeavy$ConfigException: ", true);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = exceptionHeavy25.parse("");
        boolean boolean42 = exceptionHeavy0.getFlag(strMap39, "benchmark.ExceptionHeavy$ConfigException: hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy43 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = exceptionHeavy43.parse("");
        benchmark.ExceptionHeavy exceptionHeavy46 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap48 = exceptionHeavy46.parse("");
        boolean boolean51 = exceptionHeavy43.getFlag(strMap48, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy52 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy53 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap55 = exceptionHeavy53.parse("");
        boolean boolean58 = exceptionHeavy52.getFlag(strMap55, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy59 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy60 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap62 = exceptionHeavy60.parse("");
        boolean boolean65 = exceptionHeavy59.getFlag(strMap62, "hi!", true);
        boolean boolean68 = exceptionHeavy52.getFlag(strMap62, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean71 = exceptionHeavy43.getFlag(strMap62, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy72 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy73 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap75 = exceptionHeavy73.parse("");
        boolean boolean78 = exceptionHeavy72.getFlag(strMap75, "hi!", true);
        boolean boolean81 = exceptionHeavy43.getFlag(strMap75, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int85 = exceptionHeavy0.getInt(strMap75, "hi!", 0, 1);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test183");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) '#');
        configException2.addSuppressed((java.lang.Throwable) configException13);
        java.lang.Throwable[] throwableArray15 = configException2.getSuppressed();
        java.lang.Throwable[] throwableArray16 = configException2.getSuppressed();
        java.lang.Class<?> wildcardClass17 = configException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test184");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (-1));
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        java.lang.String str4 = configException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: " + "'", str4, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test185");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        int int11 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray18 = configException17.getSuppressed();
        configException14.addSuppressed((java.lang.Throwable) configException17);
        benchmark.ExceptionHeavy.ConfigException configException22 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException17.addSuppressed((java.lang.Throwable) configException22);
        configException2.addSuppressed((java.lang.Throwable) configException17);
        java.lang.Class<?> wildcardClass25 = configException17.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test186");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException5.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray15 = configException14.getSuppressed();
        int int16 = configException14.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray20 = configException19.getSuppressed();
        configException14.addSuppressed((java.lang.Throwable) configException19);
        java.lang.Throwable[] throwableArray22 = configException14.getSuppressed();
        int int23 = configException14.getPosition();
        configException5.addSuppressed((java.lang.Throwable) configException14);
        int int25 = configException14.getPosition();
        java.lang.Throwable[] throwableArray26 = configException14.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException29 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException32 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray33 = configException32.getSuppressed();
        configException29.addSuppressed((java.lang.Throwable) configException32);
        benchmark.ExceptionHeavy.ConfigException configException37 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException32.addSuppressed((java.lang.Throwable) configException37);
        int int39 = configException37.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException42 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray43 = configException42.getSuppressed();
        int int44 = configException42.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException47 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray48 = configException47.getSuppressed();
        configException42.addSuppressed((java.lang.Throwable) configException47);
        java.lang.Throwable[] throwableArray50 = configException42.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException53 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException42.addSuppressed((java.lang.Throwable) configException53);
        int int55 = configException53.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException58 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray59 = configException58.getSuppressed();
        int int60 = configException58.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException63 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray64 = configException63.getSuppressed();
        configException58.addSuppressed((java.lang.Throwable) configException63);
        java.lang.Throwable[] throwableArray66 = configException58.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException69 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException58.addSuppressed((java.lang.Throwable) configException69);
        int int71 = configException69.getPosition();
        configException53.addSuppressed((java.lang.Throwable) configException69);
        java.lang.Throwable[] throwableArray73 = configException53.getSuppressed();
        configException37.addSuppressed((java.lang.Throwable) configException53);
        configException14.addSuppressed((java.lang.Throwable) configException53);
        java.lang.Throwable[] throwableArray76 = configException53.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertArrayEquals(throwableArray33, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertArrayEquals(throwableArray43, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertArrayEquals(throwableArray48, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertArrayEquals(throwableArray59, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertArrayEquals(throwableArray64, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray76);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test187");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        configException2.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException16 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        configException10.addSuppressed((java.lang.Throwable) configException16);
        java.lang.Throwable[] throwableArray18 = configException10.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException21 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        int int22 = configException21.getPosition();
        java.lang.Throwable[] throwableArray23 = configException21.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException26 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray27 = configException26.getSuppressed();
        int int28 = configException26.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException31 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray32 = configException31.getSuppressed();
        configException26.addSuppressed((java.lang.Throwable) configException31);
        java.lang.Throwable[] throwableArray34 = configException26.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException37 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) '#');
        configException26.addSuppressed((java.lang.Throwable) configException37);
        java.lang.Throwable[] throwableArray39 = configException26.getSuppressed();
        configException21.addSuppressed((java.lang.Throwable) configException26);
        configException10.addSuppressed((java.lang.Throwable) configException26);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertArrayEquals(throwableArray32, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test188");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = exceptionHeavy8.parse("");
        boolean boolean13 = exceptionHeavy7.getFlag(strMap10, "hi!", true);
        boolean boolean16 = exceptionHeavy0.getFlag(strMap10, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test189");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        configException2.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException16 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        configException10.addSuppressed((java.lang.Throwable) configException16);
        java.lang.Throwable[] throwableArray18 = configException10.getSuppressed();
        int int19 = configException10.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException22 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray23 = configException22.getSuppressed();
        int int24 = configException22.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException27 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray28 = configException27.getSuppressed();
        configException22.addSuppressed((java.lang.Throwable) configException27);
        java.lang.Throwable[] throwableArray30 = configException22.getSuppressed();
        configException10.addSuppressed((java.lang.Throwable) configException22);
        java.lang.Throwable[] throwableArray32 = configException10.getSuppressed();
        int int33 = configException10.getPosition();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertArrayEquals(throwableArray28, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test190");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        boolean boolean22 = exceptionHeavy16.getFlag(strMap19, "hi!", true);
        boolean boolean25 = exceptionHeavy9.getFlag(strMap19, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean28 = exceptionHeavy0.getFlag(strMap19, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy29 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy30 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy30.parse("");
        boolean boolean35 = exceptionHeavy29.getFlag(strMap32, "hi!", true);
        boolean boolean38 = exceptionHeavy0.getFlag(strMap32, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy39 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = exceptionHeavy39.parse("");
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        boolean boolean47 = exceptionHeavy39.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy48 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = exceptionHeavy48.parse("");
        boolean boolean53 = exceptionHeavy39.getFlag(strMap50, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = exceptionHeavy39.parse("");
        benchmark.ExceptionHeavy exceptionHeavy56 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap58 = exceptionHeavy56.parse("");
        benchmark.ExceptionHeavy exceptionHeavy59 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy60 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap62 = exceptionHeavy60.parse("");
        boolean boolean65 = exceptionHeavy59.getFlag(strMap62, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy66 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap68 = exceptionHeavy66.parse("");
        boolean boolean71 = exceptionHeavy59.getFlag(strMap68, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean74 = exceptionHeavy56.getFlag(strMap68, "hi!", true);
        boolean boolean77 = exceptionHeavy39.getFlag(strMap68, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", false);
        // The following exception was thrown during execution in test generation
        try {
            int int81 = exceptionHeavy0.getInt(strMap68, "benchmark.ExceptionHeavy$ConfigException: hi!", (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test191");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", 1);
        java.lang.Class<?> wildcardClass3 = configException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test192");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        benchmark.ExceptionHeavy exceptionHeavy20 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = exceptionHeavy20.parse("");
        boolean boolean25 = exceptionHeavy17.getFlag(strMap22, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy26 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = exceptionHeavy26.parse("");
        boolean boolean31 = exceptionHeavy17.getFlag(strMap28, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy32 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy33 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = exceptionHeavy33.parse("");
        boolean boolean38 = exceptionHeavy32.getFlag(strMap35, "hi!", true);
        java.util.Map<java.lang.String, java.lang.String> strMap40 = exceptionHeavy32.parse("");
        boolean boolean43 = exceptionHeavy17.getFlag(strMap40, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = exceptionHeavy0.getInt(strMap40, "benchmark.ExceptionHeavy$ConfigException: hi!", (-1), 35);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test193");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray14 = configException13.getSuppressed();
        configException10.addSuppressed((java.lang.Throwable) configException13);
        benchmark.ExceptionHeavy.ConfigException configException18 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException13.addSuppressed((java.lang.Throwable) configException18);
        configException2.addSuppressed((java.lang.Throwable) configException18);
        java.lang.String str21 = configException2.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str21, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test194");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy7.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy7.getFlag(strMap18, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = exceptionHeavy7.parse("");
        boolean boolean26 = exceptionHeavy0.getFlag(strMap23, "", false);
        benchmark.ExceptionHeavy exceptionHeavy27 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy29 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = exceptionHeavy29.parse("");
        boolean boolean34 = exceptionHeavy28.getFlag(strMap31, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy35 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy36 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = exceptionHeavy36.parse("");
        boolean boolean41 = exceptionHeavy35.getFlag(strMap38, "hi!", true);
        boolean boolean44 = exceptionHeavy28.getFlag(strMap38, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean47 = exceptionHeavy27.getFlag(strMap38, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean50 = exceptionHeavy0.getFlag(strMap38, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy51 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap53 = exceptionHeavy51.parse("");
        benchmark.ExceptionHeavy exceptionHeavy54 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy55 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = exceptionHeavy55.parse("");
        boolean boolean60 = exceptionHeavy54.getFlag(strMap57, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy61 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap63 = exceptionHeavy61.parse("");
        boolean boolean66 = exceptionHeavy54.getFlag(strMap63, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean69 = exceptionHeavy51.getFlag(strMap63, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            int int73 = exceptionHeavy0.getInt(strMap63, "benchmark.ExceptionHeavy$ConfigException: hi!", 0, 1);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test195");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        int int3 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException6 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray7 = configException6.getSuppressed();
        int int8 = configException6.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException11 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray12 = configException11.getSuppressed();
        configException6.addSuppressed((java.lang.Throwable) configException11);
        java.lang.Throwable[] throwableArray14 = configException6.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException6.addSuppressed((java.lang.Throwable) configException17);
        configException2.addSuppressed((java.lang.Throwable) configException6);
        java.lang.Throwable[] throwableArray20 = configException2.getSuppressed();
        java.lang.String str21 = configException2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str21, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test196");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        int int3 = configException2.getPosition();
        java.lang.Throwable[] throwableArray4 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        int int9 = configException7.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException12 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray13 = configException12.getSuppressed();
        configException7.addSuppressed((java.lang.Throwable) configException12);
        java.lang.Throwable[] throwableArray15 = configException7.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException18 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) '#');
        configException7.addSuppressed((java.lang.Throwable) configException18);
        java.lang.Throwable[] throwableArray20 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        int int22 = configException7.getPosition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test197");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = exceptionHeavy15.parse("");
        benchmark.ExceptionHeavy exceptionHeavy18 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = exceptionHeavy18.parse("");
        boolean boolean23 = exceptionHeavy15.getFlag(strMap20, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy24 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = exceptionHeavy24.parse("");
        boolean boolean29 = exceptionHeavy15.getFlag(strMap26, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = exceptionHeavy15.parse("");
        boolean boolean34 = exceptionHeavy0.getFlag(strMap31, "", false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test198");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        int int3 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException6 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray7 = configException6.getSuppressed();
        int int8 = configException6.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException11 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray12 = configException11.getSuppressed();
        configException6.addSuppressed((java.lang.Throwable) configException11);
        java.lang.Throwable[] throwableArray14 = configException6.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException6.addSuppressed((java.lang.Throwable) configException17);
        configException2.addSuppressed((java.lang.Throwable) configException6);
        benchmark.ExceptionHeavy.ConfigException configException22 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException25 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray26 = configException25.getSuppressed();
        int int27 = configException25.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException30 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray31 = configException30.getSuppressed();
        configException25.addSuppressed((java.lang.Throwable) configException30);
        configException22.addSuppressed((java.lang.Throwable) configException30);
        configException2.addSuppressed((java.lang.Throwable) configException30);
        benchmark.ExceptionHeavy.ConfigException configException37 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException30.addSuppressed((java.lang.Throwable) configException37);
        int int39 = configException30.getPosition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test199");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (short) 10);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = configException5.getSuppressed();
        java.lang.Throwable[] throwableArray8 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException12 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (byte) 1);
        configException5.addSuppressed((java.lang.Throwable) configException12);
        java.lang.Class<?> wildcardClass14 = configException5.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test200");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (byte) 1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        configException2.addSuppressed((java.lang.Throwable) configException10);
        int int14 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray18 = configException17.getSuppressed();
        int int19 = configException17.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException22 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray23 = configException22.getSuppressed();
        configException17.addSuppressed((java.lang.Throwable) configException22);
        java.lang.Throwable[] throwableArray25 = configException17.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException28 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException17.addSuppressed((java.lang.Throwable) configException28);
        int int30 = configException28.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException33 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray34 = configException33.getSuppressed();
        int int35 = configException33.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException38 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray39 = configException38.getSuppressed();
        configException33.addSuppressed((java.lang.Throwable) configException38);
        java.lang.Throwable[] throwableArray41 = configException33.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException44 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException33.addSuppressed((java.lang.Throwable) configException44);
        int int46 = configException44.getPosition();
        configException28.addSuppressed((java.lang.Throwable) configException44);
        java.lang.Throwable[] throwableArray48 = configException28.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException28);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertArrayEquals(throwableArray34, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertArrayEquals(throwableArray39, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(throwableArray48);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test201");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy25.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy25.getFlag(strMap36, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = exceptionHeavy25.parse("");
        boolean boolean44 = exceptionHeavy0.getFlag(strMap41, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        java.util.Map<java.lang.String, java.lang.String> strMap45 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int49 = exceptionHeavy0.getInt(strMap45, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test202");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        benchmark.ExceptionHeavy exceptionHeavy20 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy21 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = exceptionHeavy21.parse("");
        boolean boolean26 = exceptionHeavy20.getFlag(strMap23, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy27 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = exceptionHeavy27.parse("");
        boolean boolean32 = exceptionHeavy20.getFlag(strMap29, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean35 = exceptionHeavy17.getFlag(strMap29, "hi!", true);
        boolean boolean38 = exceptionHeavy0.getFlag(strMap29, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy39 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = exceptionHeavy39.parse("");
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        boolean boolean47 = exceptionHeavy39.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy48 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = exceptionHeavy48.parse("");
        boolean boolean53 = exceptionHeavy39.getFlag(strMap50, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy54 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy55 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = exceptionHeavy55.parse("");
        boolean boolean60 = exceptionHeavy54.getFlag(strMap57, "hi!", true);
        boolean boolean63 = exceptionHeavy39.getFlag(strMap57, "", false);
        benchmark.ExceptionHeavy exceptionHeavy64 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap66 = exceptionHeavy64.parse("");
        benchmark.ExceptionHeavy exceptionHeavy67 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap69 = exceptionHeavy67.parse("");
        boolean boolean72 = exceptionHeavy64.getFlag(strMap69, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy73 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap75 = exceptionHeavy73.parse("");
        boolean boolean78 = exceptionHeavy64.getFlag(strMap75, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap80 = exceptionHeavy64.parse("");
        boolean boolean83 = exceptionHeavy39.getFlag(strMap80, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        java.util.Map<java.lang.String, java.lang.String> strMap85 = exceptionHeavy39.parse("");
        // The following exception was thrown during execution in test generation
        try {
            int int89 = exceptionHeavy0.getInt(strMap85, "", (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strMap80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(strMap85);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test203");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException7.getSuppressed();
        int int11 = configException7.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray15 = configException14.getSuppressed();
        int int16 = configException14.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray20 = configException19.getSuppressed();
        configException14.addSuppressed((java.lang.Throwable) configException19);
        java.lang.Throwable[] throwableArray22 = configException14.getSuppressed();
        int int23 = configException14.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException26 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException29 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray30 = configException29.getSuppressed();
        configException26.addSuppressed((java.lang.Throwable) configException29);
        benchmark.ExceptionHeavy.ConfigException configException34 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException29.addSuppressed((java.lang.Throwable) configException34);
        configException14.addSuppressed((java.lang.Throwable) configException29);
        configException7.addSuppressed((java.lang.Throwable) configException14);
        java.lang.Throwable[] throwableArray38 = configException14.getSuppressed();
        java.lang.Class<?> wildcardClass39 = throwableArray38.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test204");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        java.lang.Throwable[] throwableArray15 = configException2.getSuppressed();
        java.lang.Class<?> wildcardClass16 = throwableArray15.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test205");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        benchmark.ExceptionHeavy exceptionHeavy6 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = exceptionHeavy6.parse("");
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy6.getFlag(strMap11, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy22 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy23 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = exceptionHeavy23.parse("");
        boolean boolean28 = exceptionHeavy22.getFlag(strMap25, "hi!", true);
        boolean boolean31 = exceptionHeavy15.getFlag(strMap25, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean34 = exceptionHeavy6.getFlag(strMap25, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy35 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy36 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = exceptionHeavy36.parse("");
        boolean boolean41 = exceptionHeavy35.getFlag(strMap38, "hi!", true);
        boolean boolean44 = exceptionHeavy6.getFlag(strMap38, "hi!", true);
        boolean boolean47 = exceptionHeavy3.getFlag(strMap38, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = exceptionHeavy0.getInt(strMap38, "hi!", (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test206");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = exceptionHeavy8.parse("");
        boolean boolean13 = exceptionHeavy7.getFlag(strMap10, "hi!", true);
        boolean boolean16 = exceptionHeavy0.getFlag(strMap10, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        benchmark.ExceptionHeavy exceptionHeavy20 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = exceptionHeavy20.parse("");
        boolean boolean25 = exceptionHeavy17.getFlag(strMap22, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy26 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = exceptionHeavy26.parse("");
        boolean boolean31 = exceptionHeavy17.getFlag(strMap28, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy32 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy33 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = exceptionHeavy33.parse("");
        boolean boolean38 = exceptionHeavy32.getFlag(strMap35, "hi!", true);
        boolean boolean41 = exceptionHeavy17.getFlag(strMap35, "", false);
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        benchmark.ExceptionHeavy exceptionHeavy45 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap47 = exceptionHeavy45.parse("");
        boolean boolean50 = exceptionHeavy42.getFlag(strMap47, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy51 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap53 = exceptionHeavy51.parse("");
        boolean boolean56 = exceptionHeavy42.getFlag(strMap53, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap58 = exceptionHeavy42.parse("");
        boolean boolean61 = exceptionHeavy17.getFlag(strMap58, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean64 = exceptionHeavy0.getFlag(strMap58, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy65 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy66 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap68 = exceptionHeavy66.parse("");
        boolean boolean71 = exceptionHeavy65.getFlag(strMap68, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy72 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap74 = exceptionHeavy72.parse("");
        boolean boolean77 = exceptionHeavy65.getFlag(strMap74, "benchmark.ExceptionHeavy$ConfigException: ", true);
        java.util.Map<java.lang.String, java.lang.String> strMap79 = exceptionHeavy65.parse("");
        java.util.Map<java.lang.String, java.lang.String> strMap81 = exceptionHeavy65.parse("");
        // The following exception was thrown during execution in test generation
        try {
            int int85 = exceptionHeavy0.getInt(strMap81, "", 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(strMap79);
        org.junit.Assert.assertNotNull(strMap81);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test207");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) '#');
        configException2.addSuppressed((java.lang.Throwable) configException13);
        java.lang.Throwable[] throwableArray15 = configException13.getSuppressed();
        int int16 = configException13.getPosition();
        int int17 = configException13.getPosition();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test208");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (short) 100);
        int int3 = configException2.getPosition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test209");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", 52);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test210");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = exceptionHeavy15.parse("");
        benchmark.ExceptionHeavy exceptionHeavy18 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = exceptionHeavy18.parse("");
        boolean boolean23 = exceptionHeavy15.getFlag(strMap20, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy24 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = exceptionHeavy24.parse("");
        boolean boolean29 = exceptionHeavy15.getFlag(strMap26, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy30 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy31 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = exceptionHeavy31.parse("");
        boolean boolean36 = exceptionHeavy30.getFlag(strMap33, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy37 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy38 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap40 = exceptionHeavy38.parse("");
        boolean boolean43 = exceptionHeavy37.getFlag(strMap40, "hi!", true);
        boolean boolean46 = exceptionHeavy30.getFlag(strMap40, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean49 = exceptionHeavy15.getFlag(strMap40, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean52 = exceptionHeavy0.getFlag(strMap40, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        java.lang.Class<?> wildcardClass53 = strMap40.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test211");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (short) 10);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException2.addSuppressed((java.lang.Throwable) configException5);
        java.lang.Throwable[] throwableArray7 = configException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test212");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        int int15 = configException13.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException18 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray19 = configException18.getSuppressed();
        int int20 = configException18.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException23 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray24 = configException23.getSuppressed();
        configException18.addSuppressed((java.lang.Throwable) configException23);
        java.lang.Throwable[] throwableArray26 = configException18.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException29 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException18.addSuppressed((java.lang.Throwable) configException29);
        int int31 = configException29.getPosition();
        configException13.addSuppressed((java.lang.Throwable) configException29);
        int int33 = configException13.getPosition();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertArrayEquals(throwableArray19, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertArrayEquals(throwableArray24, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test213");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy26 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = exceptionHeavy26.parse("");
        boolean boolean31 = exceptionHeavy25.getFlag(strMap28, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy32 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = exceptionHeavy32.parse("");
        benchmark.ExceptionHeavy exceptionHeavy35 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = exceptionHeavy35.parse("");
        boolean boolean40 = exceptionHeavy32.getFlag(strMap37, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy41 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = exceptionHeavy41.parse("");
        boolean boolean46 = exceptionHeavy32.getFlag(strMap43, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = exceptionHeavy32.parse("");
        boolean boolean51 = exceptionHeavy25.getFlag(strMap48, "", false);
        benchmark.ExceptionHeavy exceptionHeavy52 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy53 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy54 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap56 = exceptionHeavy54.parse("");
        boolean boolean59 = exceptionHeavy53.getFlag(strMap56, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy60 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy61 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap63 = exceptionHeavy61.parse("");
        boolean boolean66 = exceptionHeavy60.getFlag(strMap63, "hi!", true);
        boolean boolean69 = exceptionHeavy53.getFlag(strMap63, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean72 = exceptionHeavy52.getFlag(strMap63, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean75 = exceptionHeavy25.getFlag(strMap63, "hi!", false);
        boolean boolean78 = exceptionHeavy0.getFlag(strMap63, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test214");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", 100);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test215");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        java.lang.Throwable[] throwableArray15 = configException13.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test216");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) ' ');
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException8 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray9 = configException8.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException8);
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException8.addSuppressed((java.lang.Throwable) configException13);
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray18 = configException17.getSuppressed();
        int int19 = configException17.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException22 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray23 = configException22.getSuppressed();
        configException17.addSuppressed((java.lang.Throwable) configException22);
        java.lang.Throwable[] throwableArray25 = configException17.getSuppressed();
        int int26 = configException17.getPosition();
        configException8.addSuppressed((java.lang.Throwable) configException17);
        int int28 = configException17.getPosition();
        configException2.addSuppressed((java.lang.Throwable) configException17);
        java.lang.Class<?> wildcardClass30 = configException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test217");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", (int) (short) -1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test218");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        int int3 = configException2.getPosition();
        java.lang.Throwable[] throwableArray4 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        int int9 = configException7.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException12 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray13 = configException12.getSuppressed();
        configException7.addSuppressed((java.lang.Throwable) configException12);
        java.lang.Throwable[] throwableArray15 = configException7.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException18 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) '#');
        configException7.addSuppressed((java.lang.Throwable) configException18);
        java.lang.Throwable[] throwableArray20 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        benchmark.ExceptionHeavy.ConfigException configException24 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        configException7.addSuppressed((java.lang.Throwable) configException24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test219");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        configException2.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException16 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) 0);
        configException10.addSuppressed((java.lang.Throwable) configException16);
        benchmark.ExceptionHeavy.ConfigException configException20 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 10);
        configException16.addSuppressed((java.lang.Throwable) configException20);
        benchmark.ExceptionHeavy.ConfigException configException24 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", 1);
        configException16.addSuppressed((java.lang.Throwable) configException24);
        int int26 = configException16.getPosition();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test220");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", 10);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (short) 10);
        benchmark.ExceptionHeavy.ConfigException configException8 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException5.addSuppressed((java.lang.Throwable) configException8);
        int int10 = configException8.getPosition();
        java.lang.Throwable[] throwableArray11 = configException8.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException8);
        int int13 = configException2.getPosition();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test221");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        int int12 = configException10.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException15 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray16 = configException15.getSuppressed();
        configException10.addSuppressed((java.lang.Throwable) configException15);
        java.lang.Throwable[] throwableArray18 = configException10.getSuppressed();
        int int19 = configException10.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException22 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException25 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray26 = configException25.getSuppressed();
        configException22.addSuppressed((java.lang.Throwable) configException25);
        benchmark.ExceptionHeavy.ConfigException configException30 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException25.addSuppressed((java.lang.Throwable) configException30);
        configException10.addSuppressed((java.lang.Throwable) configException25);
        configException5.addSuppressed((java.lang.Throwable) configException10);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test222");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy1.getFlag(strMap6, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy1.getFlag(strMap12, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        boolean boolean22 = exceptionHeavy16.getFlag(strMap19, "hi!", true);
        boolean boolean25 = exceptionHeavy1.getFlag(strMap19, "", false);
        benchmark.ExceptionHeavy exceptionHeavy26 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = exceptionHeavy26.parse("");
        benchmark.ExceptionHeavy exceptionHeavy29 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = exceptionHeavy29.parse("");
        boolean boolean34 = exceptionHeavy26.getFlag(strMap31, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy35 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy36 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = exceptionHeavy36.parse("");
        boolean boolean41 = exceptionHeavy35.getFlag(strMap38, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy43 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = exceptionHeavy43.parse("");
        boolean boolean48 = exceptionHeavy42.getFlag(strMap45, "hi!", true);
        boolean boolean51 = exceptionHeavy35.getFlag(strMap45, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean54 = exceptionHeavy26.getFlag(strMap45, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = exceptionHeavy26.parse("");
        boolean boolean59 = exceptionHeavy1.getFlag(strMap56, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy60 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap62 = exceptionHeavy60.parse("");
        benchmark.ExceptionHeavy exceptionHeavy63 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap65 = exceptionHeavy63.parse("");
        boolean boolean68 = exceptionHeavy60.getFlag(strMap65, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy69 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap71 = exceptionHeavy69.parse("");
        boolean boolean74 = exceptionHeavy60.getFlag(strMap71, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy75 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy76 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap78 = exceptionHeavy76.parse("");
        boolean boolean81 = exceptionHeavy75.getFlag(strMap78, "hi!", true);
        java.util.Map<java.lang.String, java.lang.String> strMap83 = exceptionHeavy75.parse("");
        boolean boolean86 = exceptionHeavy60.getFlag(strMap83, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean89 = exceptionHeavy1.getFlag(strMap83, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean92 = exceptionHeavy0.getFlag(strMap83, "", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap94 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strMap78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strMap83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test223");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", 35);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test224");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        int int3 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException6 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray7 = configException6.getSuppressed();
        int int8 = configException6.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException11 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray12 = configException11.getSuppressed();
        configException6.addSuppressed((java.lang.Throwable) configException11);
        java.lang.Throwable[] throwableArray14 = configException6.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException6.addSuppressed((java.lang.Throwable) configException17);
        configException2.addSuppressed((java.lang.Throwable) configException6);
        benchmark.ExceptionHeavy.ConfigException configException22 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException6.addSuppressed((java.lang.Throwable) configException22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test225");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy3.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        benchmark.ExceptionHeavy exceptionHeavy19 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = exceptionHeavy19.parse("");
        boolean boolean24 = exceptionHeavy16.getFlag(strMap21, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean27 = exceptionHeavy3.getFlag(strMap21, "", false);
        boolean boolean30 = exceptionHeavy0.getFlag(strMap21, "", true);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy33 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy35 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = exceptionHeavy35.parse("");
        boolean boolean40 = exceptionHeavy34.getFlag(strMap37, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy41 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        boolean boolean47 = exceptionHeavy41.getFlag(strMap44, "hi!", true);
        boolean boolean50 = exceptionHeavy34.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean53 = exceptionHeavy33.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean56 = exceptionHeavy0.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy57 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap59 = exceptionHeavy57.parse("");
        benchmark.ExceptionHeavy exceptionHeavy60 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap62 = exceptionHeavy60.parse("");
        boolean boolean65 = exceptionHeavy57.getFlag(strMap62, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy66 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap68 = exceptionHeavy66.parse("");
        boolean boolean71 = exceptionHeavy57.getFlag(strMap68, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap73 = exceptionHeavy57.parse("");
        benchmark.ExceptionHeavy exceptionHeavy74 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap76 = exceptionHeavy74.parse("");
        benchmark.ExceptionHeavy exceptionHeavy77 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy78 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap80 = exceptionHeavy78.parse("");
        boolean boolean83 = exceptionHeavy77.getFlag(strMap80, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy84 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap86 = exceptionHeavy84.parse("");
        boolean boolean89 = exceptionHeavy77.getFlag(strMap86, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean92 = exceptionHeavy74.getFlag(strMap86, "hi!", true);
        boolean boolean95 = exceptionHeavy57.getFlag(strMap86, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int99 = exceptionHeavy0.getInt(strMap86, "benchmark.ExceptionHeavy$ConfigException: ", (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNotNull(strMap76);
        org.junit.Assert.assertNotNull(strMap80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(strMap86);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test226");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test227");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test228");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        benchmark.ExceptionHeavy exceptionHeavy20 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy21 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = exceptionHeavy21.parse("");
        boolean boolean26 = exceptionHeavy20.getFlag(strMap23, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy27 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = exceptionHeavy27.parse("");
        boolean boolean32 = exceptionHeavy20.getFlag(strMap29, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean35 = exceptionHeavy17.getFlag(strMap29, "hi!", true);
        boolean boolean38 = exceptionHeavy0.getFlag(strMap29, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", false);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = exceptionHeavy0.getInt(strMap39, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test229");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", 35);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException15 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) ' ');
        configException10.addSuppressed((java.lang.Throwable) configException15);
        configException2.addSuppressed((java.lang.Throwable) configException15);
        benchmark.ExceptionHeavy.ConfigException configException20 = new benchmark.ExceptionHeavy.ConfigException("hi!", 10);
        benchmark.ExceptionHeavy.ConfigException configException23 = new benchmark.ExceptionHeavy.ConfigException("", (int) (short) 10);
        benchmark.ExceptionHeavy.ConfigException configException26 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException23.addSuppressed((java.lang.Throwable) configException26);
        int int28 = configException26.getPosition();
        java.lang.Throwable[] throwableArray29 = configException26.getSuppressed();
        configException20.addSuppressed((java.lang.Throwable) configException26);
        configException15.addSuppressed((java.lang.Throwable) configException26);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertArrayEquals(throwableArray29, new java.lang.Throwable[] {});
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test230");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        boolean boolean22 = exceptionHeavy16.getFlag(strMap19, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy23 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy24 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = exceptionHeavy24.parse("");
        boolean boolean29 = exceptionHeavy23.getFlag(strMap26, "hi!", true);
        boolean boolean32 = exceptionHeavy16.getFlag(strMap26, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean35 = exceptionHeavy15.getFlag(strMap26, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean38 = exceptionHeavy0.getFlag(strMap26, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test231");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = configException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException8 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray9 = configException8.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException8);
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (-1));
        java.lang.Throwable[] throwableArray14 = configException13.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        int int18 = configException17.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException21 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray22 = configException21.getSuppressed();
        int int23 = configException21.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException26 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray27 = configException26.getSuppressed();
        configException21.addSuppressed((java.lang.Throwable) configException26);
        java.lang.Throwable[] throwableArray29 = configException21.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException32 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException21.addSuppressed((java.lang.Throwable) configException32);
        configException17.addSuppressed((java.lang.Throwable) configException21);
        benchmark.ExceptionHeavy.ConfigException configException37 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException40 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray41 = configException40.getSuppressed();
        int int42 = configException40.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException45 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray46 = configException45.getSuppressed();
        configException40.addSuppressed((java.lang.Throwable) configException45);
        configException37.addSuppressed((java.lang.Throwable) configException45);
        configException17.addSuppressed((java.lang.Throwable) configException45);
        configException13.addSuppressed((java.lang.Throwable) configException17);
        configException8.addSuppressed((java.lang.Throwable) configException17);
        java.lang.Class<?> wildcardClass52 = configException17.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertArrayEquals(throwableArray41, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertArrayEquals(throwableArray46, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test232");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (byte) 1);
        int int3 = configException2.getPosition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test233");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        benchmark.ExceptionHeavy.ConfigException configException12 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) ' ');
        configException7.addSuppressed((java.lang.Throwable) configException12);
        java.lang.String str14 = configException7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str14, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test234");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy2 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = exceptionHeavy2.parse("");
        boolean boolean7 = exceptionHeavy1.getFlag(strMap4, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy8.getFlag(strMap11, "hi!", true);
        boolean boolean17 = exceptionHeavy1.getFlag(strMap11, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean20 = exceptionHeavy0.getFlag(strMap11, "benchmark.ExceptionHeavy$ConfigException: ", true);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy23 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy24 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = exceptionHeavy24.parse("");
        boolean boolean29 = exceptionHeavy23.getFlag(strMap26, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy30 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy31 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = exceptionHeavy31.parse("");
        boolean boolean36 = exceptionHeavy30.getFlag(strMap33, "hi!", true);
        boolean boolean39 = exceptionHeavy23.getFlag(strMap33, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = exceptionHeavy40.parse("");
        benchmark.ExceptionHeavy exceptionHeavy43 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = exceptionHeavy43.parse("");
        boolean boolean48 = exceptionHeavy40.getFlag(strMap45, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy49 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap51 = exceptionHeavy49.parse("");
        boolean boolean54 = exceptionHeavy40.getFlag(strMap51, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy55 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy56 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap58 = exceptionHeavy56.parse("");
        boolean boolean61 = exceptionHeavy55.getFlag(strMap58, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy62 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy63 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap65 = exceptionHeavy63.parse("");
        boolean boolean68 = exceptionHeavy62.getFlag(strMap65, "hi!", true);
        boolean boolean71 = exceptionHeavy55.getFlag(strMap65, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean74 = exceptionHeavy40.getFlag(strMap65, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean77 = exceptionHeavy23.getFlag(strMap65, "", false);
        boolean boolean80 = exceptionHeavy0.getFlag(strMap65, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test235");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 0);
        java.lang.String str3 = configException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str3, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test236");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        int int3 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException6 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray7 = configException6.getSuppressed();
        int int8 = configException6.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException11 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray12 = configException11.getSuppressed();
        configException6.addSuppressed((java.lang.Throwable) configException11);
        java.lang.Throwable[] throwableArray14 = configException6.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException6.addSuppressed((java.lang.Throwable) configException17);
        configException2.addSuppressed((java.lang.Throwable) configException6);
        java.lang.Throwable[] throwableArray20 = configException2.getSuppressed();
        java.lang.Throwable[] throwableArray21 = configException2.getSuppressed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test237");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 100);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test238");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        boolean boolean22 = exceptionHeavy16.getFlag(strMap19, "hi!", true);
        boolean boolean25 = exceptionHeavy9.getFlag(strMap19, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean28 = exceptionHeavy0.getFlag(strMap19, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy29 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy30 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy30.parse("");
        boolean boolean35 = exceptionHeavy29.getFlag(strMap32, "hi!", true);
        boolean boolean38 = exceptionHeavy0.getFlag(strMap32, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy39 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = exceptionHeavy40.parse("");
        boolean boolean45 = exceptionHeavy39.getFlag(strMap42, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy46 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy47 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap49 = exceptionHeavy47.parse("");
        boolean boolean52 = exceptionHeavy46.getFlag(strMap49, "hi!", true);
        boolean boolean55 = exceptionHeavy39.getFlag(strMap49, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = exceptionHeavy0.getInt(strMap49, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", 35, (-1));
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test239");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        benchmark.ExceptionHeavy.ConfigException configException12 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) ' ');
        configException7.addSuppressed((java.lang.Throwable) configException12);
        java.lang.Class<?> wildcardClass14 = configException7.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test240");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        int int15 = configException13.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException18 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray19 = configException18.getSuppressed();
        int int20 = configException18.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException23 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray24 = configException23.getSuppressed();
        configException18.addSuppressed((java.lang.Throwable) configException23);
        java.lang.Throwable[] throwableArray26 = configException18.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException29 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException18.addSuppressed((java.lang.Throwable) configException29);
        int int31 = configException29.getPosition();
        configException13.addSuppressed((java.lang.Throwable) configException29);
        java.lang.Throwable[] throwableArray33 = configException13.getSuppressed();
        java.lang.String str34 = configException13.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertArrayEquals(throwableArray19, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertArrayEquals(throwableArray24, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: " + "'", str34, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test241");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = exceptionHeavy8.parse("");
        boolean boolean13 = exceptionHeavy7.getFlag(strMap10, "hi!", true);
        boolean boolean16 = exceptionHeavy0.getFlag(strMap10, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        benchmark.ExceptionHeavy exceptionHeavy20 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = exceptionHeavy20.parse("");
        boolean boolean25 = exceptionHeavy17.getFlag(strMap22, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy26 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = exceptionHeavy26.parse("");
        boolean boolean31 = exceptionHeavy17.getFlag(strMap28, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy32 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy33 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = exceptionHeavy33.parse("");
        boolean boolean38 = exceptionHeavy32.getFlag(strMap35, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy39 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = exceptionHeavy40.parse("");
        boolean boolean45 = exceptionHeavy39.getFlag(strMap42, "hi!", true);
        boolean boolean48 = exceptionHeavy32.getFlag(strMap42, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean51 = exceptionHeavy17.getFlag(strMap42, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean54 = exceptionHeavy0.getFlag(strMap42, "", false);
        benchmark.ExceptionHeavy exceptionHeavy55 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = exceptionHeavy55.parse("");
        benchmark.ExceptionHeavy exceptionHeavy58 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap60 = exceptionHeavy58.parse("");
        boolean boolean63 = exceptionHeavy55.getFlag(strMap60, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy64 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap66 = exceptionHeavy64.parse("");
        boolean boolean69 = exceptionHeavy55.getFlag(strMap66, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy70 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap72 = exceptionHeavy70.parse("");
        benchmark.ExceptionHeavy exceptionHeavy73 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap75 = exceptionHeavy73.parse("");
        boolean boolean78 = exceptionHeavy70.getFlag(strMap75, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy79 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap81 = exceptionHeavy79.parse("");
        boolean boolean84 = exceptionHeavy70.getFlag(strMap81, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap86 = exceptionHeavy70.parse("");
        boolean boolean89 = exceptionHeavy55.getFlag(strMap86, "", false);
        // The following exception was thrown during execution in test generation
        try {
            int int93 = exceptionHeavy0.getInt(strMap86, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strMap86);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test242");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) '#');
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test243");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = exceptionHeavy8.parse("");
        boolean boolean13 = exceptionHeavy7.getFlag(strMap10, "hi!", true);
        boolean boolean16 = exceptionHeavy0.getFlag(strMap10, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        benchmark.ExceptionHeavy exceptionHeavy20 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = exceptionHeavy20.parse("");
        boolean boolean25 = exceptionHeavy17.getFlag(strMap22, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy26 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = exceptionHeavy26.parse("");
        boolean boolean31 = exceptionHeavy17.getFlag(strMap28, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy32 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy33 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = exceptionHeavy33.parse("");
        boolean boolean38 = exceptionHeavy32.getFlag(strMap35, "hi!", true);
        boolean boolean41 = exceptionHeavy17.getFlag(strMap35, "", false);
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        benchmark.ExceptionHeavy exceptionHeavy45 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap47 = exceptionHeavy45.parse("");
        boolean boolean50 = exceptionHeavy42.getFlag(strMap47, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy51 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap53 = exceptionHeavy51.parse("");
        boolean boolean56 = exceptionHeavy42.getFlag(strMap53, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap58 = exceptionHeavy42.parse("");
        boolean boolean61 = exceptionHeavy17.getFlag(strMap58, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean64 = exceptionHeavy0.getFlag(strMap58, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy65 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap67 = exceptionHeavy65.parse("");
        benchmark.ExceptionHeavy exceptionHeavy68 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy69 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap71 = exceptionHeavy69.parse("");
        boolean boolean74 = exceptionHeavy68.getFlag(strMap71, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy75 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap77 = exceptionHeavy75.parse("");
        boolean boolean80 = exceptionHeavy68.getFlag(strMap77, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy81 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap83 = exceptionHeavy81.parse("");
        benchmark.ExceptionHeavy exceptionHeavy84 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap86 = exceptionHeavy84.parse("");
        boolean boolean89 = exceptionHeavy81.getFlag(strMap86, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean92 = exceptionHeavy68.getFlag(strMap86, "", false);
        boolean boolean95 = exceptionHeavy65.getFlag(strMap86, "", true);
        boolean boolean98 = exceptionHeavy0.getFlag(strMap86, "", false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(strMap83);
        org.junit.Assert.assertNotNull(strMap86);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test244");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) '4');
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) 'a');
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException9 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        int int10 = configException9.getPosition();
        configException2.addSuppressed((java.lang.Throwable) configException9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test245");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy22 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy23 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = exceptionHeavy23.parse("");
        boolean boolean28 = exceptionHeavy22.getFlag(strMap25, "hi!", true);
        boolean boolean31 = exceptionHeavy15.getFlag(strMap25, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean34 = exceptionHeavy0.getFlag(strMap25, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = exceptionHeavy0.getFlag(strMap35, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test246");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 100);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException9 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException12 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray13 = configException12.getSuppressed();
        configException9.addSuppressed((java.lang.Throwable) configException12);
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException12.addSuppressed((java.lang.Throwable) configException17);
        benchmark.ExceptionHeavy.ConfigException configException21 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray22 = configException21.getSuppressed();
        int int23 = configException21.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException26 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray27 = configException26.getSuppressed();
        configException21.addSuppressed((java.lang.Throwable) configException26);
        java.lang.Throwable[] throwableArray29 = configException21.getSuppressed();
        int int30 = configException21.getPosition();
        configException12.addSuppressed((java.lang.Throwable) configException21);
        configException5.addSuppressed((java.lang.Throwable) configException21);
        java.lang.Throwable[] throwableArray33 = configException21.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test247");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = exceptionHeavy0.parse("");
        java.lang.Class<?> wildcardClass9 = exceptionHeavy0.getClass();
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test248");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException5.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray15 = configException14.getSuppressed();
        int int16 = configException14.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray20 = configException19.getSuppressed();
        configException14.addSuppressed((java.lang.Throwable) configException19);
        java.lang.Throwable[] throwableArray22 = configException14.getSuppressed();
        int int23 = configException14.getPosition();
        configException5.addSuppressed((java.lang.Throwable) configException14);
        int int25 = configException14.getPosition();
        int int26 = configException14.getPosition();
        int int27 = configException14.getPosition();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test249");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        int int11 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray15 = configException14.getSuppressed();
        int int16 = configException14.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray20 = configException19.getSuppressed();
        configException14.addSuppressed((java.lang.Throwable) configException19);
        java.lang.Throwable[] throwableArray22 = configException14.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException25 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException14.addSuppressed((java.lang.Throwable) configException25);
        int int27 = configException14.getPosition();
        java.lang.Throwable[] throwableArray28 = configException14.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException31 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        int int32 = configException31.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException35 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) 0);
        configException31.addSuppressed((java.lang.Throwable) configException35);
        configException14.addSuppressed((java.lang.Throwable) configException31);
        configException2.addSuppressed((java.lang.Throwable) configException31);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test250");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        int int3 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException6 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) 0);
        configException2.addSuppressed((java.lang.Throwable) configException6);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray14 = configException13.getSuppressed();
        configException10.addSuppressed((java.lang.Throwable) configException13);
        benchmark.ExceptionHeavy.ConfigException configException18 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException13.addSuppressed((java.lang.Throwable) configException18);
        benchmark.ExceptionHeavy.ConfigException configException22 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray23 = configException22.getSuppressed();
        int int24 = configException22.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException27 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray28 = configException27.getSuppressed();
        configException22.addSuppressed((java.lang.Throwable) configException27);
        java.lang.Throwable[] throwableArray30 = configException22.getSuppressed();
        int int31 = configException22.getPosition();
        configException13.addSuppressed((java.lang.Throwable) configException22);
        int int33 = configException22.getPosition();
        java.lang.Throwable[] throwableArray34 = configException22.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException37 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException40 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray41 = configException40.getSuppressed();
        configException37.addSuppressed((java.lang.Throwable) configException40);
        benchmark.ExceptionHeavy.ConfigException configException45 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException40.addSuppressed((java.lang.Throwable) configException45);
        int int47 = configException45.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException50 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray51 = configException50.getSuppressed();
        int int52 = configException50.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException55 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray56 = configException55.getSuppressed();
        configException50.addSuppressed((java.lang.Throwable) configException55);
        java.lang.Throwable[] throwableArray58 = configException50.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException61 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException50.addSuppressed((java.lang.Throwable) configException61);
        int int63 = configException61.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException66 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray67 = configException66.getSuppressed();
        int int68 = configException66.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException71 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray72 = configException71.getSuppressed();
        configException66.addSuppressed((java.lang.Throwable) configException71);
        java.lang.Throwable[] throwableArray74 = configException66.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException77 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException66.addSuppressed((java.lang.Throwable) configException77);
        int int79 = configException77.getPosition();
        configException61.addSuppressed((java.lang.Throwable) configException77);
        java.lang.Throwable[] throwableArray81 = configException61.getSuppressed();
        configException45.addSuppressed((java.lang.Throwable) configException61);
        configException22.addSuppressed((java.lang.Throwable) configException61);
        configException2.addSuppressed((java.lang.Throwable) configException61);
        java.lang.String str85 = configException2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertArrayEquals(throwableArray28, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertArrayEquals(throwableArray41, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertArrayEquals(throwableArray51, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertArrayEquals(throwableArray56, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertArrayEquals(throwableArray67, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertArrayEquals(throwableArray72, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str85, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test251");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        configException2.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException16 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray20 = configException19.getSuppressed();
        int int21 = configException19.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException24 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray25 = configException24.getSuppressed();
        configException19.addSuppressed((java.lang.Throwable) configException24);
        configException16.addSuppressed((java.lang.Throwable) configException24);
        benchmark.ExceptionHeavy.ConfigException configException30 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray31 = configException30.getSuppressed();
        int int32 = configException30.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException35 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray36 = configException35.getSuppressed();
        configException30.addSuppressed((java.lang.Throwable) configException35);
        java.lang.Throwable[] throwableArray38 = configException30.getSuppressed();
        configException24.addSuppressed((java.lang.Throwable) configException30);
        configException2.addSuppressed((java.lang.Throwable) configException24);
        java.lang.String str41 = configException2.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertArrayEquals(throwableArray25, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertArrayEquals(throwableArray36, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str41, "benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test252");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        boolean boolean22 = exceptionHeavy16.getFlag(strMap19, "hi!", true);
        boolean boolean25 = exceptionHeavy9.getFlag(strMap19, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean28 = exceptionHeavy0.getFlag(strMap19, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy29 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy30 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy30.parse("");
        boolean boolean35 = exceptionHeavy29.getFlag(strMap32, "hi!", true);
        boolean boolean38 = exceptionHeavy0.getFlag(strMap32, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy39 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy41 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = exceptionHeavy41.parse("");
        boolean boolean46 = exceptionHeavy40.getFlag(strMap43, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy47 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy48 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = exceptionHeavy48.parse("");
        boolean boolean53 = exceptionHeavy47.getFlag(strMap50, "hi!", true);
        boolean boolean56 = exceptionHeavy40.getFlag(strMap50, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean59 = exceptionHeavy39.getFlag(strMap50, "benchmark.ExceptionHeavy$ConfigException: ", true);
        // The following exception was thrown during execution in test generation
        try {
            int int63 = exceptionHeavy0.getInt(strMap50, "benchmark.ExceptionHeavy$ConfigException: ", (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: ");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test253");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (short) 10);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = configException5.getSuppressed();
        java.lang.Throwable[] throwableArray8 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException12 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (byte) 1);
        configException5.addSuppressed((java.lang.Throwable) configException12);
        benchmark.ExceptionHeavy.ConfigException configException16 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) '4');
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException22 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray23 = configException22.getSuppressed();
        int int24 = configException22.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException27 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray28 = configException27.getSuppressed();
        configException22.addSuppressed((java.lang.Throwable) configException27);
        configException19.addSuppressed((java.lang.Throwable) configException27);
        benchmark.ExceptionHeavy.ConfigException configException33 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        configException27.addSuppressed((java.lang.Throwable) configException33);
        java.lang.Throwable[] throwableArray35 = configException27.getSuppressed();
        configException16.addSuppressed((java.lang.Throwable) configException27);
        configException5.addSuppressed((java.lang.Throwable) configException27);
        benchmark.ExceptionHeavy.ConfigException configException40 = new benchmark.ExceptionHeavy.ConfigException("", (int) (short) 10);
        benchmark.ExceptionHeavy.ConfigException configException43 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray44 = configException43.getSuppressed();
        java.lang.Throwable[] throwableArray45 = configException43.getSuppressed();
        java.lang.Throwable[] throwableArray46 = configException43.getSuppressed();
        configException40.addSuppressed((java.lang.Throwable) configException43);
        benchmark.ExceptionHeavy.ConfigException configException50 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (byte) 1);
        configException43.addSuppressed((java.lang.Throwable) configException50);
        java.lang.Throwable[] throwableArray52 = configException43.getSuppressed();
        configException27.addSuppressed((java.lang.Throwable) configException43);
        java.lang.String str54 = configException27.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertArrayEquals(throwableArray28, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertArrayEquals(throwableArray44, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertArrayEquals(throwableArray45, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertArrayEquals(throwableArray46, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str54, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test254");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", (int) (short) 10);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException8 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray9 = configException8.getSuppressed();
        int int10 = configException8.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray14 = configException13.getSuppressed();
        configException8.addSuppressed((java.lang.Throwable) configException13);
        configException5.addSuppressed((java.lang.Throwable) configException13);
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        configException13.addSuppressed((java.lang.Throwable) configException19);
        int int21 = configException13.getPosition();
        configException2.addSuppressed((java.lang.Throwable) configException13);
        java.lang.Throwable[] throwableArray23 = configException13.getSuppressed();
        java.lang.Throwable[] throwableArray24 = configException13.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test255");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) '#');
        configException2.addSuppressed((java.lang.Throwable) configException13);
        java.lang.Throwable[] throwableArray15 = configException2.getSuppressed();
        java.lang.String str16 = configException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str16, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test256");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", 100);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test257");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test258");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        int int15 = configException13.getPosition();
        java.lang.Throwable[] throwableArray16 = configException13.getSuppressed();
        int int17 = configException13.getPosition();
        java.lang.Class<?> wildcardClass18 = configException13.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test259");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        configException2.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException16 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) 0);
        configException10.addSuppressed((java.lang.Throwable) configException16);
        java.lang.Class<?> wildcardClass18 = configException10.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test260");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        int int8 = configException5.getPosition();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test261");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", 35);
        int int3 = configException2.getPosition();
        java.lang.Throwable[] throwableArray4 = configException2.getSuppressed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test262");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        int int15 = configException13.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException18 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray19 = configException18.getSuppressed();
        int int20 = configException18.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException23 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray24 = configException23.getSuppressed();
        configException18.addSuppressed((java.lang.Throwable) configException23);
        java.lang.Throwable[] throwableArray26 = configException18.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException29 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException18.addSuppressed((java.lang.Throwable) configException29);
        int int31 = configException29.getPosition();
        configException13.addSuppressed((java.lang.Throwable) configException29);
        java.lang.Throwable[] throwableArray33 = configException29.getSuppressed();
        int int34 = configException29.getPosition();
        java.lang.Throwable[] throwableArray35 = configException29.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException38 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray39 = configException38.getSuppressed();
        int int40 = configException38.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException43 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray44 = configException43.getSuppressed();
        configException38.addSuppressed((java.lang.Throwable) configException43);
        java.lang.Throwable[] throwableArray46 = configException38.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException49 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) '#');
        configException38.addSuppressed((java.lang.Throwable) configException49);
        java.lang.Throwable[] throwableArray51 = configException38.getSuppressed();
        java.lang.Throwable[] throwableArray52 = configException38.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException55 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException58 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray59 = configException58.getSuppressed();
        int int60 = configException58.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException63 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray64 = configException63.getSuppressed();
        configException58.addSuppressed((java.lang.Throwable) configException63);
        configException55.addSuppressed((java.lang.Throwable) configException63);
        benchmark.ExceptionHeavy.ConfigException configException69 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray70 = configException69.getSuppressed();
        int int71 = configException69.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException74 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray75 = configException74.getSuppressed();
        configException69.addSuppressed((java.lang.Throwable) configException74);
        java.lang.Throwable[] throwableArray77 = configException69.getSuppressed();
        configException63.addSuppressed((java.lang.Throwable) configException69);
        configException38.addSuppressed((java.lang.Throwable) configException69);
        configException29.addSuppressed((java.lang.Throwable) configException38);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertArrayEquals(throwableArray19, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertArrayEquals(throwableArray24, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertArrayEquals(throwableArray33, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertArrayEquals(throwableArray35, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertArrayEquals(throwableArray39, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertArrayEquals(throwableArray44, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertArrayEquals(throwableArray59, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertArrayEquals(throwableArray64, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertArrayEquals(throwableArray70, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertArrayEquals(throwableArray75, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray77);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test263");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = exceptionHeavy0.parse("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap16 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: ");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException:");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test264");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        boolean boolean22 = exceptionHeavy16.getFlag(strMap19, "hi!", true);
        boolean boolean25 = exceptionHeavy9.getFlag(strMap19, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean28 = exceptionHeavy0.getFlag(strMap19, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy29 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy30 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy30.parse("");
        boolean boolean35 = exceptionHeavy29.getFlag(strMap32, "hi!", true);
        boolean boolean38 = exceptionHeavy0.getFlag(strMap32, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy39 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = exceptionHeavy39.parse("");
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        boolean boolean47 = exceptionHeavy39.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy48 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = exceptionHeavy48.parse("");
        boolean boolean53 = exceptionHeavy39.getFlag(strMap50, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy54 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy55 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = exceptionHeavy55.parse("");
        boolean boolean60 = exceptionHeavy54.getFlag(strMap57, "hi!", true);
        boolean boolean63 = exceptionHeavy39.getFlag(strMap57, "", false);
        benchmark.ExceptionHeavy exceptionHeavy64 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap66 = exceptionHeavy64.parse("");
        benchmark.ExceptionHeavy exceptionHeavy67 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap69 = exceptionHeavy67.parse("");
        boolean boolean72 = exceptionHeavy64.getFlag(strMap69, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy73 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap75 = exceptionHeavy73.parse("");
        boolean boolean78 = exceptionHeavy64.getFlag(strMap75, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap80 = exceptionHeavy64.parse("");
        boolean boolean83 = exceptionHeavy39.getFlag(strMap80, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        java.util.Map<java.lang.String, java.lang.String> strMap85 = exceptionHeavy39.parse("");
        // The following exception was thrown during execution in test generation
        try {
            int int89 = exceptionHeavy0.getInt(strMap85, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", 0, 100);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strMap80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(strMap85);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test265");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException2.addSuppressed((java.lang.Throwable) configException13);
        java.lang.Throwable[] throwableArray15 = configException2.getSuppressed();
        java.lang.Throwable[] throwableArray16 = configException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test266");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) '4');
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException8 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray9 = configException8.getSuppressed();
        int int10 = configException8.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray14 = configException13.getSuppressed();
        configException8.addSuppressed((java.lang.Throwable) configException13);
        configException5.addSuppressed((java.lang.Throwable) configException13);
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        configException13.addSuppressed((java.lang.Throwable) configException19);
        java.lang.Throwable[] throwableArray21 = configException13.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException13);
        java.lang.String str23 = configException2.toString();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str23, "benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test267");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (-1));
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        int int6 = configException5.getPosition();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test268");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (-1));
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        java.lang.Class<?> wildcardClass4 = configException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test269");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException5.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray15 = configException14.getSuppressed();
        int int16 = configException14.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray20 = configException19.getSuppressed();
        configException14.addSuppressed((java.lang.Throwable) configException19);
        java.lang.Throwable[] throwableArray22 = configException14.getSuppressed();
        int int23 = configException14.getPosition();
        configException5.addSuppressed((java.lang.Throwable) configException14);
        int int25 = configException14.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException28 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) 1);
        benchmark.ExceptionHeavy.ConfigException configException31 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException34 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray35 = configException34.getSuppressed();
        int int36 = configException34.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException39 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray40 = configException39.getSuppressed();
        configException34.addSuppressed((java.lang.Throwable) configException39);
        configException31.addSuppressed((java.lang.Throwable) configException39);
        benchmark.ExceptionHeavy.ConfigException configException45 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) 0);
        configException39.addSuppressed((java.lang.Throwable) configException45);
        configException28.addSuppressed((java.lang.Throwable) configException45);
        int int48 = configException45.getPosition();
        configException14.addSuppressed((java.lang.Throwable) configException45);
        java.lang.String str50 = configException45.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertArrayEquals(throwableArray35, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertArrayEquals(throwableArray40, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str50, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test270");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", 35);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test271");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) 100);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test272");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy13 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy14 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = exceptionHeavy14.parse("");
        boolean boolean19 = exceptionHeavy13.getFlag(strMap16, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy20 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = exceptionHeavy20.parse("");
        boolean boolean25 = exceptionHeavy13.getFlag(strMap22, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy26 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = exceptionHeavy26.parse("");
        benchmark.ExceptionHeavy exceptionHeavy29 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = exceptionHeavy29.parse("");
        boolean boolean34 = exceptionHeavy26.getFlag(strMap31, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy35 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = exceptionHeavy35.parse("");
        boolean boolean40 = exceptionHeavy26.getFlag(strMap37, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy41 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        boolean boolean47 = exceptionHeavy41.getFlag(strMap44, "hi!", true);
        boolean boolean50 = exceptionHeavy26.getFlag(strMap44, "", false);
        boolean boolean53 = exceptionHeavy13.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy54 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap56 = exceptionHeavy54.parse("");
        benchmark.ExceptionHeavy exceptionHeavy57 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap59 = exceptionHeavy57.parse("");
        boolean boolean62 = exceptionHeavy54.getFlag(strMap59, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy63 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy64 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap66 = exceptionHeavy64.parse("");
        boolean boolean69 = exceptionHeavy63.getFlag(strMap66, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy70 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy71 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap73 = exceptionHeavy71.parse("");
        boolean boolean76 = exceptionHeavy70.getFlag(strMap73, "hi!", true);
        boolean boolean79 = exceptionHeavy63.getFlag(strMap73, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean82 = exceptionHeavy54.getFlag(strMap73, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy83 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy84 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap86 = exceptionHeavy84.parse("");
        boolean boolean89 = exceptionHeavy83.getFlag(strMap86, "hi!", true);
        boolean boolean92 = exceptionHeavy54.getFlag(strMap86, "hi!", true);
        boolean boolean95 = exceptionHeavy13.getFlag(strMap86, "benchmark.ExceptionHeavy$ConfigException: ", true);
        // The following exception was thrown during execution in test generation
        try {
            int int99 = exceptionHeavy0.getInt(strMap86, "hi!", (int) (byte) 10, 35);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strMap86);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test273");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy3.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean18 = exceptionHeavy0.getFlag(strMap12, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap20 = exceptionHeavy0.parse("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException:");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test274");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException6 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException9 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray10 = configException9.getSuppressed();
        int int11 = configException9.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray15 = configException14.getSuppressed();
        configException9.addSuppressed((java.lang.Throwable) configException14);
        configException6.addSuppressed((java.lang.Throwable) configException14);
        benchmark.ExceptionHeavy.ConfigException configException20 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        configException14.addSuppressed((java.lang.Throwable) configException20);
        configException2.addSuppressed((java.lang.Throwable) configException20);
        java.lang.String str23 = configException20.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str23, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test275");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", 10);
        java.lang.Class<?> wildcardClass3 = configException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test276");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = configException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException8 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray9 = configException8.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException8);
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            configException8.addSuppressed(throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test277");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (byte) 10);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (byte) 1);
        benchmark.ExceptionHeavy.ConfigException configException8 = new benchmark.ExceptionHeavy.ConfigException("", (int) (short) 10);
        int int9 = configException8.getPosition();
        configException5.addSuppressed((java.lang.Throwable) configException8);
        configException2.addSuppressed((java.lang.Throwable) configException5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test278");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy3.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        benchmark.ExceptionHeavy exceptionHeavy19 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = exceptionHeavy19.parse("");
        boolean boolean24 = exceptionHeavy16.getFlag(strMap21, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean27 = exceptionHeavy3.getFlag(strMap21, "", false);
        boolean boolean30 = exceptionHeavy0.getFlag(strMap21, "", true);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy33 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy33.getFlag(strMap36, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = exceptionHeavy40.parse("");
        boolean boolean45 = exceptionHeavy33.getFlag(strMap42, "benchmark.ExceptionHeavy$ConfigException: ", true);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = exceptionHeavy0.getInt(strMap42, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", 52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test279");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException5.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray15 = configException14.getSuppressed();
        int int16 = configException14.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException19 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray20 = configException19.getSuppressed();
        configException14.addSuppressed((java.lang.Throwable) configException19);
        java.lang.Throwable[] throwableArray22 = configException14.getSuppressed();
        int int23 = configException14.getPosition();
        configException5.addSuppressed((java.lang.Throwable) configException14);
        int int25 = configException14.getPosition();
        java.lang.Throwable[] throwableArray26 = configException14.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException29 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException32 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray33 = configException32.getSuppressed();
        configException29.addSuppressed((java.lang.Throwable) configException32);
        benchmark.ExceptionHeavy.ConfigException configException37 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException32.addSuppressed((java.lang.Throwable) configException37);
        int int39 = configException37.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException42 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray43 = configException42.getSuppressed();
        int int44 = configException42.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException47 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray48 = configException47.getSuppressed();
        configException42.addSuppressed((java.lang.Throwable) configException47);
        java.lang.Throwable[] throwableArray50 = configException42.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException53 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException42.addSuppressed((java.lang.Throwable) configException53);
        int int55 = configException53.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException58 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray59 = configException58.getSuppressed();
        int int60 = configException58.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException63 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray64 = configException63.getSuppressed();
        configException58.addSuppressed((java.lang.Throwable) configException63);
        java.lang.Throwable[] throwableArray66 = configException58.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException69 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException58.addSuppressed((java.lang.Throwable) configException69);
        int int71 = configException69.getPosition();
        configException53.addSuppressed((java.lang.Throwable) configException69);
        java.lang.Throwable[] throwableArray73 = configException53.getSuppressed();
        configException37.addSuppressed((java.lang.Throwable) configException53);
        configException14.addSuppressed((java.lang.Throwable) configException53);
        java.lang.String str76 = configException14.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertArrayEquals(throwableArray33, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertArrayEquals(throwableArray43, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertArrayEquals(throwableArray48, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertArrayEquals(throwableArray59, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertArrayEquals(throwableArray64, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str76, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test280");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        int int4 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray10 = configException2.getSuppressed();
        int int11 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException14 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray18 = configException17.getSuppressed();
        configException14.addSuppressed((java.lang.Throwable) configException17);
        benchmark.ExceptionHeavy.ConfigException configException22 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException17.addSuppressed((java.lang.Throwable) configException22);
        configException2.addSuppressed((java.lang.Throwable) configException17);
        java.lang.Throwable[] throwableArray25 = configException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test281");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException5);
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException5.addSuppressed((java.lang.Throwable) configException10);
        java.lang.Throwable[] throwableArray12 = configException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test282");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        int int3 = configException2.getPosition();
        java.lang.Throwable[] throwableArray4 = configException2.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException7 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray8 = configException7.getSuppressed();
        int int9 = configException7.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException12 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray13 = configException12.getSuppressed();
        configException7.addSuppressed((java.lang.Throwable) configException12);
        java.lang.Throwable[] throwableArray15 = configException7.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException18 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) '#');
        configException7.addSuppressed((java.lang.Throwable) configException18);
        java.lang.Throwable[] throwableArray20 = configException7.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException7);
        java.lang.Throwable[] throwableArray22 = configException2.getSuppressed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test283");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", 35);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException15 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) ' ');
        configException10.addSuppressed((java.lang.Throwable) configException15);
        configException2.addSuppressed((java.lang.Throwable) configException15);
        java.lang.Throwable[] throwableArray18 = configException15.getSuppressed();
        java.lang.Class<?> wildcardClass19 = configException15.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test284");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        boolean boolean24 = exceptionHeavy0.getFlag(strMap18, "", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = exceptionHeavy28.parse("");
        boolean boolean33 = exceptionHeavy25.getFlag(strMap30, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy25.getFlag(strMap36, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = exceptionHeavy25.parse("");
        boolean boolean44 = exceptionHeavy0.getFlag(strMap41, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        java.util.Map<java.lang.String, java.lang.String> strMap46 = exceptionHeavy0.parse("");
        java.lang.Class<?> wildcardClass47 = strMap46.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test285");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", 0);
        java.lang.String str3 = configException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str3, "benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test286");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy0.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy13 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = exceptionHeavy13.parse("");
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy13.getFlag(strMap18, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy22 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = exceptionHeavy22.parse("");
        boolean boolean27 = exceptionHeavy13.getFlag(strMap24, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy28 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy29 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = exceptionHeavy29.parse("");
        boolean boolean34 = exceptionHeavy28.getFlag(strMap31, "hi!", true);
        boolean boolean37 = exceptionHeavy13.getFlag(strMap31, "", false);
        boolean boolean40 = exceptionHeavy0.getFlag(strMap31, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap42 = exceptionHeavy0.parse("");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strMap42);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test287");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        configException2.addSuppressed((java.lang.Throwable) configException10);
        benchmark.ExceptionHeavy.ConfigException configException16 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) 0);
        configException10.addSuppressed((java.lang.Throwable) configException16);
        int int18 = configException16.getPosition();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test288");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy3.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        benchmark.ExceptionHeavy exceptionHeavy19 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = exceptionHeavy19.parse("");
        boolean boolean24 = exceptionHeavy16.getFlag(strMap21, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean27 = exceptionHeavy3.getFlag(strMap21, "", false);
        boolean boolean30 = exceptionHeavy0.getFlag(strMap21, "", true);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy33 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = exceptionHeavy33.parse("");
        benchmark.ExceptionHeavy exceptionHeavy36 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = exceptionHeavy36.parse("");
        boolean boolean41 = exceptionHeavy33.getFlag(strMap38, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy43 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = exceptionHeavy43.parse("");
        boolean boolean48 = exceptionHeavy42.getFlag(strMap45, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy49 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy50 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap52 = exceptionHeavy50.parse("");
        boolean boolean55 = exceptionHeavy49.getFlag(strMap52, "hi!", true);
        boolean boolean58 = exceptionHeavy42.getFlag(strMap52, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean61 = exceptionHeavy33.getFlag(strMap52, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy62 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy63 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap65 = exceptionHeavy63.parse("");
        boolean boolean68 = exceptionHeavy62.getFlag(strMap65, "hi!", true);
        boolean boolean71 = exceptionHeavy33.getFlag(strMap65, "hi!", true);
        boolean boolean74 = exceptionHeavy0.getFlag(strMap65, "", false);
        java.util.Map<java.lang.String, java.lang.String> strMap75 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int79 = exceptionHeavy0.getInt(strMap75, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test289");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (short) 10);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException2.addSuppressed((java.lang.Throwable) configException5);
        int int7 = configException5.getPosition();
        java.lang.Throwable[] throwableArray8 = configException5.getSuppressed();
        java.lang.String str9 = configException5.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!" + "'", str9, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test290");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        boolean boolean6 = exceptionHeavy0.getFlag(strMap3, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy8 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = exceptionHeavy8.parse("");
        boolean boolean13 = exceptionHeavy7.getFlag(strMap10, "hi!", true);
        boolean boolean16 = exceptionHeavy0.getFlag(strMap10, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy18 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = exceptionHeavy18.parse("");
        boolean boolean23 = exceptionHeavy17.getFlag(strMap20, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy24 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        boolean boolean30 = exceptionHeavy24.getFlag(strMap27, "hi!", true);
        boolean boolean33 = exceptionHeavy17.getFlag(strMap27, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        benchmark.ExceptionHeavy exceptionHeavy37 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = exceptionHeavy37.parse("");
        boolean boolean42 = exceptionHeavy34.getFlag(strMap39, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy43 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = exceptionHeavy43.parse("");
        boolean boolean48 = exceptionHeavy34.getFlag(strMap45, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy49 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy50 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap52 = exceptionHeavy50.parse("");
        boolean boolean55 = exceptionHeavy49.getFlag(strMap52, "hi!", true);
        boolean boolean58 = exceptionHeavy34.getFlag(strMap52, "", false);
        benchmark.ExceptionHeavy exceptionHeavy59 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap61 = exceptionHeavy59.parse("");
        benchmark.ExceptionHeavy exceptionHeavy62 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap64 = exceptionHeavy62.parse("");
        boolean boolean67 = exceptionHeavy59.getFlag(strMap64, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy68 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap70 = exceptionHeavy68.parse("");
        boolean boolean73 = exceptionHeavy59.getFlag(strMap70, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap75 = exceptionHeavy59.parse("");
        boolean boolean78 = exceptionHeavy34.getFlag(strMap75, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", true);
        boolean boolean81 = exceptionHeavy17.getFlag(strMap75, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean84 = exceptionHeavy0.getFlag(strMap75, "hi!", true);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test291");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", 100);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test292");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ", (int) 'a');
        java.lang.String str3 = configException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: " + "'", str3, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test293");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        boolean boolean22 = exceptionHeavy16.getFlag(strMap19, "hi!", true);
        boolean boolean25 = exceptionHeavy9.getFlag(strMap19, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean28 = exceptionHeavy0.getFlag(strMap19, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy29 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy30 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy30.parse("");
        boolean boolean35 = exceptionHeavy29.getFlag(strMap32, "hi!", true);
        boolean boolean38 = exceptionHeavy0.getFlag(strMap32, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy39 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = exceptionHeavy39.parse("");
        benchmark.ExceptionHeavy exceptionHeavy42 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = exceptionHeavy42.parse("");
        boolean boolean47 = exceptionHeavy39.getFlag(strMap44, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy48 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy49 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap51 = exceptionHeavy49.parse("");
        boolean boolean54 = exceptionHeavy48.getFlag(strMap51, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy55 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy56 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap58 = exceptionHeavy56.parse("");
        boolean boolean61 = exceptionHeavy55.getFlag(strMap58, "hi!", true);
        boolean boolean64 = exceptionHeavy48.getFlag(strMap58, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean67 = exceptionHeavy39.getFlag(strMap58, "hi!", false);
        boolean boolean70 = exceptionHeavy0.getFlag(strMap58, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test294");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        benchmark.ExceptionHeavy.ConfigException configException5 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray6 = configException5.getSuppressed();
        int int7 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException10 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray11 = configException10.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException10);
        java.lang.Throwable[] throwableArray13 = configException5.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException16 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException5.addSuppressed((java.lang.Throwable) configException16);
        int int18 = configException5.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException21 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray22 = configException21.getSuppressed();
        int int23 = configException21.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException26 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray27 = configException26.getSuppressed();
        configException21.addSuppressed((java.lang.Throwable) configException26);
        java.lang.Throwable[] throwableArray29 = configException21.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException32 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException21.addSuppressed((java.lang.Throwable) configException32);
        int int34 = configException32.getPosition();
        java.lang.Throwable[] throwableArray35 = configException32.getSuppressed();
        configException5.addSuppressed((java.lang.Throwable) configException32);
        configException2.addSuppressed((java.lang.Throwable) configException5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertArrayEquals(throwableArray35, new java.lang.Throwable[] {});
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test295");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 0);
        int int3 = configException2.getPosition();
        int int4 = configException2.getPosition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test296");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = exceptionHeavy9.parse("");
        boolean boolean14 = exceptionHeavy0.getFlag(strMap11, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy15 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        boolean boolean21 = exceptionHeavy15.getFlag(strMap18, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy22 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy23 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = exceptionHeavy23.parse("");
        boolean boolean28 = exceptionHeavy22.getFlag(strMap25, "hi!", true);
        boolean boolean31 = exceptionHeavy15.getFlag(strMap25, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean34 = exceptionHeavy0.getFlag(strMap25, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy35 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = exceptionHeavy35.parse("");
        benchmark.ExceptionHeavy exceptionHeavy38 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap40 = exceptionHeavy38.parse("");
        boolean boolean43 = exceptionHeavy35.getFlag(strMap40, "benchmark.ExceptionHeavy$ConfigException: ", false);
        java.util.Map<java.lang.String, java.lang.String> strMap45 = exceptionHeavy35.parse("");
        boolean boolean48 = exceptionHeavy0.getFlag(strMap45, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test297");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy1 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = exceptionHeavy1.parse("");
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        benchmark.ExceptionHeavy exceptionHeavy7 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = exceptionHeavy7.parse("");
        boolean boolean12 = exceptionHeavy4.getFlag(strMap9, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy13 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy14 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = exceptionHeavy14.parse("");
        boolean boolean19 = exceptionHeavy13.getFlag(strMap16, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy20 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy21 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = exceptionHeavy21.parse("");
        boolean boolean26 = exceptionHeavy20.getFlag(strMap23, "hi!", true);
        boolean boolean29 = exceptionHeavy13.getFlag(strMap23, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean32 = exceptionHeavy4.getFlag(strMap23, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy33 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy33.getFlag(strMap36, "hi!", true);
        boolean boolean42 = exceptionHeavy4.getFlag(strMap36, "hi!", true);
        boolean boolean45 = exceptionHeavy1.getFlag(strMap36, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean48 = exceptionHeavy0.getFlag(strMap36, "", true);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test298");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", 1);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test299");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        benchmark.ExceptionHeavy exceptionHeavy19 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = exceptionHeavy19.parse("");
        boolean boolean24 = exceptionHeavy16.getFlag(strMap21, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy25 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = exceptionHeavy25.parse("");
        boolean boolean30 = exceptionHeavy16.getFlag(strMap27, "hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy16.parse("");
        boolean boolean35 = exceptionHeavy9.getFlag(strMap32, "", false);
        boolean boolean38 = exceptionHeavy0.getFlag(strMap32, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", true);
        java.util.Map<java.lang.String, java.lang.String> strMap40 = exceptionHeavy0.parse("");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strMap40);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test300");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) (byte) -1);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test301");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        int int3 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException6 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray7 = configException6.getSuppressed();
        int int8 = configException6.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException11 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray12 = configException11.getSuppressed();
        configException6.addSuppressed((java.lang.Throwable) configException11);
        java.lang.Throwable[] throwableArray14 = configException6.getSuppressed();
        benchmark.ExceptionHeavy.ConfigException configException17 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: ", (int) (byte) 0);
        configException6.addSuppressed((java.lang.Throwable) configException17);
        configException2.addSuppressed((java.lang.Throwable) configException6);
        benchmark.ExceptionHeavy.ConfigException configException22 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        benchmark.ExceptionHeavy.ConfigException configException25 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray26 = configException25.getSuppressed();
        int int27 = configException25.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException30 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray31 = configException30.getSuppressed();
        configException25.addSuppressed((java.lang.Throwable) configException30);
        configException22.addSuppressed((java.lang.Throwable) configException30);
        configException2.addSuppressed((java.lang.Throwable) configException30);
        benchmark.ExceptionHeavy.ConfigException configException37 = new benchmark.ExceptionHeavy.ConfigException("benchmark.ExceptionHeavy$ConfigException: hi!", (int) (short) -1);
        configException30.addSuppressed((java.lang.Throwable) configException37);
        java.lang.String str39 = configException30.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str39, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test302");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", (int) (short) -1);
        java.lang.Throwable[] throwableArray3 = configException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = configException2.getSuppressed();
        int int5 = configException2.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException8 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray9 = configException8.getSuppressed();
        int int10 = configException8.getPosition();
        benchmark.ExceptionHeavy.ConfigException configException13 = new benchmark.ExceptionHeavy.ConfigException("", (int) (byte) 10);
        java.lang.Throwable[] throwableArray14 = configException13.getSuppressed();
        configException8.addSuppressed((java.lang.Throwable) configException13);
        java.lang.Throwable[] throwableArray16 = configException8.getSuppressed();
        configException2.addSuppressed((java.lang.Throwable) configException8);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test303");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = exceptionHeavy3.parse("");
        boolean boolean8 = exceptionHeavy0.getFlag(strMap5, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy9 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy9.getFlag(strMap12, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy17 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = exceptionHeavy17.parse("");
        boolean boolean22 = exceptionHeavy16.getFlag(strMap19, "hi!", true);
        boolean boolean25 = exceptionHeavy9.getFlag(strMap19, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean28 = exceptionHeavy0.getFlag(strMap19, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy29 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy30 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = exceptionHeavy30.parse("");
        boolean boolean35 = exceptionHeavy29.getFlag(strMap32, "hi!", true);
        boolean boolean38 = exceptionHeavy0.getFlag(strMap32, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap40 = exceptionHeavy0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing '=' in entry: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test304");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) (short) 1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test305");
        benchmark.ExceptionHeavy exceptionHeavy0 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = exceptionHeavy0.parse("");
        benchmark.ExceptionHeavy exceptionHeavy3 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy4 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = exceptionHeavy4.parse("");
        boolean boolean9 = exceptionHeavy3.getFlag(strMap6, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy10 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = exceptionHeavy10.parse("");
        boolean boolean15 = exceptionHeavy3.getFlag(strMap12, "benchmark.ExceptionHeavy$ConfigException: ", true);
        benchmark.ExceptionHeavy exceptionHeavy16 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = exceptionHeavy16.parse("");
        benchmark.ExceptionHeavy exceptionHeavy19 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = exceptionHeavy19.parse("");
        boolean boolean24 = exceptionHeavy16.getFlag(strMap21, "benchmark.ExceptionHeavy$ConfigException: ", false);
        boolean boolean27 = exceptionHeavy3.getFlag(strMap21, "", false);
        boolean boolean30 = exceptionHeavy0.getFlag(strMap21, "", true);
        benchmark.ExceptionHeavy exceptionHeavy31 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = exceptionHeavy31.parse("");
        benchmark.ExceptionHeavy exceptionHeavy34 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = exceptionHeavy34.parse("");
        boolean boolean39 = exceptionHeavy31.getFlag(strMap36, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy40 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = exceptionHeavy40.parse("");
        boolean boolean45 = exceptionHeavy31.getFlag(strMap42, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy46 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap48 = exceptionHeavy46.parse("");
        benchmark.ExceptionHeavy exceptionHeavy49 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap51 = exceptionHeavy49.parse("");
        boolean boolean54 = exceptionHeavy46.getFlag(strMap51, "benchmark.ExceptionHeavy$ConfigException: ", false);
        benchmark.ExceptionHeavy exceptionHeavy55 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = exceptionHeavy55.parse("");
        boolean boolean60 = exceptionHeavy46.getFlag(strMap57, "hi!", false);
        benchmark.ExceptionHeavy exceptionHeavy61 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy62 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap64 = exceptionHeavy62.parse("");
        boolean boolean67 = exceptionHeavy61.getFlag(strMap64, "hi!", true);
        benchmark.ExceptionHeavy exceptionHeavy68 = new benchmark.ExceptionHeavy();
        benchmark.ExceptionHeavy exceptionHeavy69 = new benchmark.ExceptionHeavy();
        java.util.Map<java.lang.String, java.lang.String> strMap71 = exceptionHeavy69.parse("");
        boolean boolean74 = exceptionHeavy68.getFlag(strMap71, "hi!", true);
        boolean boolean77 = exceptionHeavy61.getFlag(strMap71, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean80 = exceptionHeavy46.getFlag(strMap71, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", false);
        boolean boolean83 = exceptionHeavy31.getFlag(strMap71, "benchmark.ExceptionHeavy$ConfigException: hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap85 = exceptionHeavy31.parse("");
        // The following exception was thrown during execution in test generation
        try {
            int int89 = exceptionHeavy0.getInt(strMap85, "benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!", (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type benchmark.ExceptionHeavy.ConfigException; message: missing key: benchmark.ExceptionHeavy$ConfigException: benchmark.ExceptionHeavy$ConfigException: hi!");
        } catch (benchmark.ExceptionHeavy.ConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(strMap85);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test306");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("", (int) '4');
        int int3 = configException2.getPosition();
        java.lang.String str4 = configException2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "benchmark.ExceptionHeavy$ConfigException: " + "'", str4, "benchmark.ExceptionHeavy$ConfigException: ");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionHeavyRandoopTest0.test307");
        benchmark.ExceptionHeavy.ConfigException configException2 = new benchmark.ExceptionHeavy.ConfigException("hi!", 1);
    }
}

