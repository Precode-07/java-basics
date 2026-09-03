abstract class Car   /* Abstract Class :
Declared with abstract class.
Cannot be instantiated directly (you can’t create objects of it).
Can contain abstract methods (without implementation) and concrete methods (with implementation).
Serves as a blueprint for subclasses. */
{
    /*The abstract keyword in Java is used to define abstraction, one of the four pillars of OOP.
     It can be applied to classes and methods, but it has different meanings in each case. */
    public abstract void drive(); // abstract method
    public abstract void fly();
    public void playMusic() // concrete method
    {
        System.out.println("Plying Music...");
    }
}
abstract class WagonR extends Car // Abstarct Class
{
    @Override
    public void drive(){
        System.out.println("Driving....");
    }
}
class UpdatedWagonR extends WagonR   // Concrete Class
{
    @Override
    public void fly()
    {
        System.out.println("Flying....");
    }
}
public class AbstractKeyword
{
    public static void main(String[] args) 
    {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.fly();
        obj.playMusic();
    }
}