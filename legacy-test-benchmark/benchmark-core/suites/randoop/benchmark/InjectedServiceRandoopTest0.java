package benchmark;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InjectedServiceRandoopTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "InjectedServiceRandoopTest0.test1");
        double double0 = benchmark.InjectedService.VAT_RATE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.2d + "'", double0 == 0.2d);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "InjectedServiceRandoopTest0.test2");
        benchmark.support.PriceRepository priceRepository0 = null;
        benchmark.support.AuditSink auditSink1 = null;
        // The following exception was thrown during execution in test generation
        try {
            benchmark.InjectedService injectedService2 = new benchmark.InjectedService(priceRepository0, auditSink1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dependencies must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "InjectedServiceRandoopTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

