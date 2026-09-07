import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        /* HashMap :
            Part of the Collections Framework (java.util).
            Stores data in key-value pairs.
            Allows one null key and multiple null values.
            Not synchronized → faster, but not thread-safe.*/
        Map<String,Integer> students = new HashMap<>();
        students.put("Prem", 86);
        students.put("Rahul", 76);
        students.put("Aditya", 92);
        students.put("Raj", 89);
        students.put("Rahul", 82);

        System.out.println(students.keySet());

        for(String key : students.keySet()){
            System.out.println(key + ":" + students.get(key));
        }

        System.out.println("------------------------------");

        /*Hashtable :
          Part of legacy classes (java.util).
          Also stores data in key-value pairs.
          Does not allow null key or null values.
          Synchronized → thread-safe, but slower. */
        Map<String,Integer> student1 = new Hashtable<>();
        student1.put("Prem", 86);
        student1.put("Rahul", 76);
        student1.put("Aditya", 92);
        student1.put("Raj", 89);
        student1.put("Rahul", 82);

        System.out.println(student1.keySet());

        for(String key : student1.keySet()){
            System.out.println(key + ":" + student1.get(key));
        }

    }
}
