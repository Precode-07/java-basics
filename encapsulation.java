class Student {
    private String name;   // private field
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name 
    public void setName(String name) {
        // this keyword is reference value used to point towards the current object.
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
        }
    }

public class encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Prem");
        s.setAge(22);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
