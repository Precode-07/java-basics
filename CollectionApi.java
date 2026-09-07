import java.util.ArrayList;
import java.util.List;
/* The Collection API is the entire framework in Java that provides architecture for storing and manipulating groups of objects.
Interfaces: Collection, List, Set, Queue, Map
Implementations: ArrayList, HashSet, LinkedList, HashMap, etc. */
public class CollectionApi {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        // nums.add(9);
        // nums.add(8);
        // nums.add(2);
        // nums.add(3);
        // nums.add(7);

        // // System.out.println(nums.size());

        // for (Object n : nums) {
        //     int num = (Integer)n;
        //     System.out.println(num * 2);

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(9);
        nums.add(8);
        nums.add(2);
        nums.add(3);
        nums.add(7);

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(3));
        System.out.println(nums.addAll(nums));
        System.out.println(nums.hashCode());
    }
}
