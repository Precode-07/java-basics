class Student1 {
    String name;
    int id;

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student1 s = (Student1) obj;
        return this.id == s.id && this.name.equals(s.name);
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Prem";
        s1.id = 101;

        System.out.println(s1.toString()); // Student{name='Prem', id=101}
    }
}
