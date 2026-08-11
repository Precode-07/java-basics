// AdvCalc is a class which I dervied in previous commit which was also inherit from another class Calc.

// This is Called Multilevel Inheritance.
// Multilevel inheritance in Java means that a class is derived from another class,
//  which itself is derived from yet another class — forming a chain of inheritance.

import tools.*;

class ModernCalc extends AdvCalc{
    public int mul(int a,int b){
        return a*b;
    }
}
class SciCalc extends ModernCalc{
    public double div(int a,int b){
        return (double)b/a;
    }
}
public class MultiInherit {
    public static void main(String[] args) {
        SciCalc obj = new SciCalc();

        int a = 7;
        int b = 24;
        // Calc class(add) => AdvCalc(sub) => ModernCalc(mul) => SciCalc(div) 
        System.out.println(obj.add(a, b));
        System.out.println(obj.sub(a, b));
        System.out.println(obj.mul(a, b));
        System.out.println(obj.div(a, b));

    }
}
