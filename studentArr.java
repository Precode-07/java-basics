class Students{
    // Created a class in which attributes are rollno, Name and Marks.
    int rollno ;
    String Name;
    double Marks;

}

public class studentArr{
    public static void main(String[] args) {
        // Created three objects using class Students.
        Students S1 = new Students();
        Students S2 = new Students();
        Students S3 = new Students();
        
        // Assign value to each variable.
        S1.rollno = 21;
        S1.Name = "Prem";
        S1.Marks = 76.2;

        S2.rollno = 22;
        S2.Name = "Ayush";
        S2.Marks = 54.6;

        S3.rollno = 23;
        S3.Name = "Karan";
        S3.Marks = 92.4;

        // storing objects in the array.
        Students[] student = new Students[3];
        student[0] = S1;
        student[1] = S2;
        student[2] = S3;

        // use enhanced for loop for each value to print.
        for (Students s : student) {
            System.out.println(s.rollno + " " + s.Name + " : " + s.Marks);
        }
        System.out.println( );
    }
}