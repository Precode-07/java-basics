class A {
    public A(){
        System.out.println("Default Constructor A");
    }

    public A(int n){
        System.out.println("Parameterized Constructor A");
    }
}

class B extends A {
    public B(){
        // Even though we don’t explicitly write super(),
        // Java automatically inserts super() here.
        // So first, the default constructor of class A is called.
        System.out.println("Default Constructor B");
    }

    public B(int n){
        // 'this()' calls the default constructor of class B.
        // That constructor in turn calls super() → Default Constructor A.
        this();
        System.out.println("Parameterized Constructor B");
    }
}

public class SuperThis {
    public static void main(String[] args) {
        B obj = new B(7); 
        System.out.println(obj);
    }
}
