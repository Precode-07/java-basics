class typeCasting{
    public static void main(String args[]) {
        /* Widening(Automatic Conversion): 
        Happens when smaller data types are converted into a larger data type. 
        Safe conversion because no data lost.
        Performed automatically by the compiler.
         */

        byte b = 127;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("Byte : " + b);
        System.out.println("Short : " + s);
        System.out.println("Integer: "+i);
        System.out.println("Long : "+l);
        System.out.println("Float : "+f);
        System.out.println("Double :"+d);
        System.out.println("-------------------------------------");

        /* Narrowing(Explicit Conversion):
        -> Happens when larger data type is converted into a smaller data types.
        -> Not Safe because precision or data may lost.
        -> Require explicit cast operator.
        */

        double D = 123.456;
        float F = (float)D;
        long L = (long)F;
        int I = (int)L;
        short S = (short)I;
        byte B = (byte)S;
        char C = (char)B;

        System.out.println("Double :"+D);
        System.out.println("Float : "+F);
        System.out.println("Long : "+L);
        System.out.println("Integer: "+I);
        System.out.println("Short : " + S);
        System.out.println("Byte : " + B);
        System.out.println("Char :" + C);


    }
}