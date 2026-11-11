package benchmark.modern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import benchmark.modern.ModernJavaFeatures.Circle;
import benchmark.modern.ModernJavaFeatures.Rectangle;
import benchmark.modern.ModernJavaFeatures.Triangle;
import org.junit.jupiter.api.Test;

/** Hand-written reference suite (human baseline) for {@link ModernJavaFeatures}. */
class ModernJavaFeaturesReferenceTest {

    private final ModernJavaFeatures subject = new ModernJavaFeatures();

    @Test
    void areas() {
        assertEquals(Math.PI, subject.area(new Circle(1)), 1e-9);
        assertEquals(6.0, subject.area(new Rectangle(2, 3)), 1e-9);
        assertEquals(6.0, subject.area(new Triangle(3, 4, 5)), 1e-9);
    }

    @Test
    void recordsValidateTheirComponents() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 1));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(1, -1));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 0, 1));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 1, 0));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 2, 3));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 3, 2));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, 1, 2));
    }

    @Test
    void recordsHaveValueSemantics() {
        assertEquals(new Circle(2), new Circle(2));
        assertEquals("Circle[radius=2.0]", new Circle(2).toString());
    }

    @Test
    void classifyShapes() {
        assertEquals("large circle", subject.classify(new Circle(11)));
        assertEquals("circle", subject.classify(new Circle(10)));
        assertEquals("square", subject.classify(new Rectangle(2, 2)));
        assertEquals("rectangle", subject.classify(new Rectangle(2, 3)));
        assertEquals("triangle", subject.classify(new Triangle(3, 4, 5)));
    }

    @Test
    void classifyOtherValues() {
        assertEquals("null", subject.classify(null));
        assertEquals("negative int", subject.classify(-1));
        assertEquals("int", subject.classify(0));
        assertEquals("blank string", subject.classify("  "));
        assertEquals("string of length 3", subject.classify("abc"));
        assertEquals("unknown", subject.classify(3.5));
    }
}
