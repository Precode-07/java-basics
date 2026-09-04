/* Inner Class :
An inner class is a class declared within another class.
It helps logically group classes that are only used in one place.
It increases encapsulation and can access the members (including private ones) of the outer class. */

class Father
{
    public void show()
    {
        System.out.println("in Showing...");
    }

    class Son
    {
        public void config()
        {
            System.out.println("in inner class...");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Father obj = new Father();
        obj.show();

        Father.Son obj1 = obj.new Son();
        obj1.config();
    }
}
