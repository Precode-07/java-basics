/* Class : It is a blueprint or template that defines:
-> Fields(variables) : attribute of the Object.
-> Methods(Functions): behaviour of the Object. */

class Car{
    String brand;
    int speed;
    float capacity;
    String engine;

    void drive(){
        System.out.println(brand + "==> " + "Speed: " + speed + ", Capacity: " + capacity + "L, Engine Type: " + engine );
    }

}

/* Objects: An object is an instance of Class.
- Created using the new keyword.
- Each objects has its own copy of fields but shares method defined in the class. */
public class Classes {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "BMW";
        car1.speed = 240;
        car1.capacity = 17.5f;
        car1.engine = "V8";

        car1.drive();
    }
}
