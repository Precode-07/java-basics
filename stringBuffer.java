public class stringBuffer {
    public static void main(String[] args) {
        // As Strings are immutable, alternatively we can use StringBuffer and StringBuilder.

        // StringBuffer is same as Strings but mutable and thread free.
        StringBuffer sb = new StringBuffer("Prem");
        sb.append("Chauhan");
        System.out.println(sb.capacity());

        // StringBuilder is same as strings but mutable means that once it is created can be modified.
        StringBuilder sb1 = new StringBuilder("Prem");
        sb1.append("Chauhan");
        System.out.println(sb1.capacity());
    }
}
