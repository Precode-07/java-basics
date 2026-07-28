public class typePromotion {
    public static void main (String Args[]){
        /* Type Promotion :
        - When evaluating expression, Java automatically promotes smaller data types to
          larger data types to avoid precision and data lost.
        - It happens during Arithmetic Operations and while mixing different data types.
        */

        byte b = 10;
        short s = 30;
        char c = 'A';
        int I = (int)c;
        int result = b + s + c;
        System.out.println("Result : " + result);
        System.out.println("Char c : " + I);

    }
}
