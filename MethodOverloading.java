class Calculator{
    /* Method Overloading : It is a feature in Java that :
    - Allow a class to have multiple method with same name but having different parameter lists.
    - used to achieve compile-time polymorphism(also known as static polymorphism) */
    // Method 1. Original method with data types.
    int add(int a,int b){
        return a+b;
    }
    // Method 2. Overloaded by changing the number of parameters.
    int add(int a, int b, int c){
        return a+b+c;
    }
    // Method 3. Overloaded by changing data types of parameters.
    double add(double a,double b){
        return a+b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int result1 = obj.add(4,5);
        int result2 = obj.add(12, 13, 11);
        double result3 = obj.add(2.4, 3.4);

        System.out.println("Result 1:" + result1);
        System.out.println("Result 2:" + result2);
        System.out.println("Result 3:" + result3);

    }
    
}
