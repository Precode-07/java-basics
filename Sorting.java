import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Worker
{
    int age;
    String name;

    public Worker(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Worker [age=" + age + ", name=" + name + "]";
    }
}
//Sorting is usually done with the Collections utility class or by implementing Comparable / Comparator.
public class Sorting {
    public static void main(String[] args) {

        // Comparator<Integer> comp = (Integer i, Integer j) -> {
        //     if(i%10 > j%10)
        //         return 1;
        //     else
        //         return -1;
        // };

        // List<Integer> nums = new ArrayList<>();
        // nums.add(41);
        // nums.add(26);
        // nums.add(52);
        // nums.add(97);
        // nums.add(78);

        // Collections.sort(nums, comp);

        // System.out.println(nums);


        Comparator<Worker> comp = (i,j) -> i.age > j.age ? 1 : -1;

        List<Worker> nums = new ArrayList<>();
        nums.add(new Worker(21,"Raj"));
        nums.add(new Worker(11,"Rahul"));
        nums.add(new Worker(32,"Karan"));
        nums.add(new Worker(18,"Rishab"));

        Collections.sort(nums, comp);

        for (Worker n : nums) {
            System.out.println(n);
        }
        
    }
}
