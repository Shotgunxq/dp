package benchmark.modern;

/**
 * B09 - Modern Java language features (Java 21: records, sealed types, pattern matching
 * for switch, record patterns).
 *
 * <p>This class lives in its own module compiled with --release 21, because it cannot be
 * compiled for Java 8/11/17. It shows which tools can work with newer bytecode at all
 * (EvoSuite, Kex and UnitTestBot cannot; Randoop on JDK 21+ should).
 */
public final class ModernJavaFeatures {

    public sealed interface Shape permits Circle, Rectangle, Triangle {
    }

    public record Circle(double radius) implements Shape {
        public Circle {
            if (radius <= 0) {
                throw new IllegalArgumentException("radius must be positive");
            }
        }
    }

    public record Rectangle(double width, double height) implements Shape {
        public Rectangle {
            if (width <= 0 || height <= 0) {
                throw new IllegalArgumentException("sides must be positive");
            }
        }
    }

    public record Triangle(double a, double b, double c) implements Shape {
        public Triangle {
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalArgumentException("sides must be positive");
            }
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalArgumentException("triangle inequality violated");
            }
        }
    }

    public double area(Shape shape) {
        return switch (shape) {
            case Circle c -> Math.PI * c.radius() * c.radius();
            case Rectangle r -> r.width() * r.height();
            case Triangle t -> {
                double s = (t.a() + t.b() + t.c()) / 2;
                yield Math.sqrt(s * (s - t.a()) * (s - t.b()) * (s - t.c()));
            }
        };
    }

    public String classify(Object value) {
        return switch (value) {
            case null -> "null";
            case Circle(double r) when r > 10 -> "large circle";
            case Circle c -> "circle";
            case Rectangle(double w, double h) when w == h -> "square";
            case Rectangle r -> "rectangle";
            case Triangle t -> "triangle";
            case Integer i when i < 0 -> "negative int";
            case Integer i -> "int";
            case String s when s.isBlank() -> "blank string";
            case String s -> "string of length " + s.length();
            default -> "unknown";
        };
    }
}
