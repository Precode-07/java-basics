class M1 {
    public String n1(String a) {
        return a;
    }
}
/* Method Overriding : Method overriding in Java allows a subclass to redefine a method from its 
parent class with the same signature, enabling runtime polymorphism (dynamic method dispatch). */
class M2 extends M1 {
    public String n1(String a) {
        return "@" + a; // Overridden method adds '@' before the string
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        M2 obj = new M2();
        System.out.println(obj.n1("Prem")); 
    }
}
