import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,1,2,6,9,5,7,8);

        /* Stream : A Stream is a sequence of elements from a source (like a List, Set, or array).
                    It supports functional-style operations to process data.
                    It does not store data; it just provides a pipeline for computation. */
        int result = nums.stream()
                         .filter(n -> n % 2 == 0)   // keep even numbers
                         .map(n -> n * 2)           // double them
                         .reduce(0, (c, e) -> c + e); // sum them up

        System.out.println("result: " + result); // result: 40
    }
}
