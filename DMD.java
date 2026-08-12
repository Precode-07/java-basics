class X {
    // Base class method
    public void show() {
        System.out.println("in X show");
    }
}

class Y extends X {
    // Overriding show() from X
    public void show() {
        System.out.println("in Y show");
    }
}

class Z extends Y {
    // Overriding show() from Y
    public void show() {
        System.out.println("in Z show");
    }
}

/* Dynamic Method Dispatch:
   - Superclass reference can point to subclass objects.
   - The method executed depends on the actual object type at runtime.
*/
public class DMD {
    public static void main(String[] args) {
        
        X obj = new Y();   // Reference of X, object of Y
        obj.show();        // Calls Y's show()

        Y obj1 = new Z();  // Reference of Y, object of Z
        obj1.show();       // Calls Z's show()

        X obj2 = new Z();  // Reference of X, object of Z
        obj2.show();       // Calls Z's show()
    }
}
