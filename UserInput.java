import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException{
        System.out.print("Enter your number :");

        /*BufferedReader (java.io.BufferedReader) :
        A character-input stream that buffers characters for efficient reading.
        Improves performance when reading text, especially from large files or streams. */
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        /* Scanner : Scanner (java.util.Scanner)
        A utility class that parses primitive types and strings using regular expressions.
        Makes it easy to read input from various sources (keyboard, files, strings).
 */
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);

        System.out.print("Enter your first name :");

        String name = bf.readLine();
        System.out.println(name);

        System.out.print("Enter your second number :");
        int x = sc.nextInt();
        System.out.println(x);
        sc.nextLine();
        System.out.print("Enter your second name :");
        String name1 = sc.nextLine();
        System.out.println(name1);

        sc.close();
        bf.close();
    }
}
