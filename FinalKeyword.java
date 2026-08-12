// Final used with class prohibit it from being extend(Inheritance).
final class Circumference {
    // Final used with method stop it from being override (Method Overriding)
    public final double cF(int r) {
        // Final used with variable makes it a constant that cant be changed.
        final double PI = 3.14;
        double circumference = 2 * PI * r;
        System.out.println("Circumference: " + circumference);
        return circumference;
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        Circumference c = new Circumference();
        c.cF(2); 
    }
}
