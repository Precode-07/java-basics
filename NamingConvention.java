// Classes and Interfaces - PascalCase
class Calculate {

    // Constants - UPPERCASE with underscores
    static final double PI = 3.14;

    // Methods - camelCase
    public int addition(int x, int y) {
        return x + y;
    }

    public double radius(int r) {
        return r * PI;
    }
}

/*
Naming Convention: are standardized rules that make code more readable, maintainable, and professional.  */

public class NamingConvention {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        // Variables - uses camelCase
        int a = 9;
        int b = 7;

        System.out.println(calc.addition(a, b)); // 16
        System.out.println(calc.radius(a));      // 28.26
    }
}
