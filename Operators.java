public class Operators {
    public static void main(String args[]){
        //Arithmetic Operators
        int a = 11;
        int b = 5;
        int p;

        System.out.println("Addition :"+(a+b));
        System.out.println("Subtraction :"+(a-b));
        System.out.println("Multiplication :"+(a*b));
        System.out.println("Divsion :"+(a/b));
        System.out.println("Modulus :"+(a%b));

        System.out.println("-------------------------------------------------------");


        // Relational Operator [Returns True or False]
        System.out.println("== :"+(a==b));
        System.out.println("!= :"+(a!=b));
        System.out.println("> :"+(a>b));
        System.out.println("< :"+(a<b));
        System.out.println(">= :"+(a>=b));
        System.out.println("<= :"+(a<=b));

        System.out.println("-------------------------------------------------------");

        //Logical Operators
        System.out.println("&& :"+(true && false));
        System.out.println("||:"+(true||false));
        System.out.println("! :"+(!true));

        System.out.println("-------------------------------------------------------");

        //Bitwise Operator [Works at Binary Level]
        System.out.println("AND :"+(a&b));
        System.out.println("OR :"+(a|b));
        System.out.println("XOR :"+(a^b));
        System.out.println("NOT :"+(~a));
        System.out.println("Leftshift :"+(a << 1));
        System.out.println("Rightshift :"+(a >> 1));

        System.out.println("-------------------------------------------------------");

        //Unary Operator
        System.out.println("+ :"+(+a));
        System.out.println("- :"+(-a));
        System.out.println("++ :"+(++a)); // Pre Increment : increments first, then uses the value.
        System.out.println("++ :"+(a++)); // Post Increment : uses the value first, then increments.
        System.out.println("-- :"+(--a)); // Pre Decrement : decrements first, then uses the value.
        System.out.println("++ :"+(a--)); // Post Decrement : uses the value first, then decrements.

        System.out.println("-------------------------------------------------------");
        
        //Assignment Operator[Works on single Operand]
        System.out.println("= :"+(p = 10));
        System.out.println("+= :"+(p += 5));
        System.out.println("-= :"+(p-=2));
        System.out.println("*= :"+(p*=10));
        System.out.println("/= :"+(p/=2));
        System.out.println("%= :"+(p%=5));

        System.out.println("-------------------------------------------------------");

        //Ternary Operator [Shortcut if-else]
        String result = (a >= 5) ? "Greater" : "Smaller";
        System.out.println(result); 

        System.out.println("-------------------------------------------------------");

        //InstanceOf Operator [object belongs to a particular class]
        String str = "Hello";
        System.out.println(str instanceof String);
    }
}
