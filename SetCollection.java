import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(92);
        nums.add(21);
        nums.add(34);
        nums.add(73);

        for (int n : nums) {
            System.out.println(n);            
        }

        System.out.println("--------------------------------------------------------");

        Set<Integer> num1 = new TreeSet<>();
        num1.add(92);
        num1.add(21);
        num1.add(34);
        num1.add(73);

        Iterator<Integer> values = num1.iterator();

        while (values.hasNext()) {
            int n1 =  values.next();
            System.out.println(n1);
        }

        System.out.println("--------------------------------------------------------");
        for (int n : num1) {
            System.out.println(n);            
        }
    }
}
