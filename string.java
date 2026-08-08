public class string {
    public static void main(String[] args) {
        /* String :
        -In java String is an object that represents a sequence of Characters.
        -String are immutable means once created their value can't be changed.*/ 
        String name = " Prem ";
        System.out.println(name);

        // Commonly used methods for Strings:
        
        // 1. length() - returns the number of characters in string.
        System.out.println(name.length());

        // 2. charAt(int index) - return character a specific positions.
        System.out.println(name.charAt(2));

        // 3. substring(int start, int end) - extract the part of string.
        System.out.println(name.substring(1, 4));

        // 4. equals(Strings) - compare two strings and return true or false (Boolean Values).
        System.out.println(name.equals(" prem "));

        // 5. equalsIgnoreCase(Strings) : compare two string while case-insensitive.
        System.out.println(name.equalsIgnoreCase(" prem ")); 

        // 6. trim() - removes leading/trailing spaces.
        System.out.println(name.trim());

        // 7. split(String regex) - Splits string into array.
        System.out.println("p,r,e,m".split(","));

        // 8.replace(old char,new char) - replace charcters.
        System.out.println(name.replace('r','o'));

        // 9. toUpperCase() - used to change cases.
        System.out.println(name.toUpperCase());

        // 10. toLowerCase() - used to change cases.
        System.out.println(name.toLowerCase());

        // String Concatenation : Two ways to concatenate 

        String s = name + "Chauhan";
        System.out.println(s);

        String s1 = name.concat("sagar");
        System.out.println(s1);




    }
}
