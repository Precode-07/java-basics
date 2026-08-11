package tools;
class Calc {
    public int add(int a, int b) {
        return a + b;
    }
}
class AdvCalc extends Calc { 
    public int sub(int a, int b) {
        return a - b;
    }
}

// Inheritance in java is fundamental OOP concept that allow one class(subclass/derived/child) to aquire 
// the properties and behaviours of another class(super/base/parent)
public class Inherit {
    public static void main(String[] args) {
        AdvCalc c = new AdvCalc(); 

        int a = 5, b = 3;
        System.out.println(c.add(a, b)); 
        System.out.println(c.sub(a, b)); 
    }
}
