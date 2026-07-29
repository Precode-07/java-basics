

public class Loops {
    public static void main(String[] args) {
        // For Loop: Used when you know exactly how many times you want to repeat.
        for(int i = 1;i<=5;i++){
            System.out.println("Iteration: "+i);
        }
        System.out.println("------------------------------------------");
        // While Loop: Used when the number of iterations isn't fixed run as long as the condition is true.
        int j = 1;
        while(j<=10){
            System.out.println("Iteration :"+j);
            j++;
        }
        System.out.println("------------------------------------------");

        // do-while loop: Similar to while but executes once even if condition is not true.
        int k = 1;
        do { 
            System.out.println("Iteration: "+k);
            k++;
        } while (k<=15);

        System.out.println("------------------------------------------");

        // for-each loop : Used to iterate directly over arrays and collections.
        int[] numbers = {1,2,3,4,5,6};
        for(int num:numbers){
            System.out.println(num);
        }
        System.out.println("------------------------------------------");

        /* Loop Control Statements
        break -> Exits the iteration immediately.
        continue -> skip the current iteration and move to next.
        return -> Exits the entire method
        */ 
       for(int l = 1;l>=5;l++){
        if (l==3) continue;
        if(l==5) break;
        System.out.println(l);
       }
    }
}
