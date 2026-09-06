/* Threads :
In Java, a thread is the smallest unit of execution that allows multiple tasks to run 
concurrently within the same program, enabling multitasking and efficient use of CPU resources. */
class Greet extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 100; i++) 
            {
                System.out.println("Hii");
            }
    }
}

class Greet1 extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 100; i++) 
            {
                System.out.println("Hello");
            }
    }
}

public class Threads 
{
    public static void main(String[] args) 
    {
        Greet obj1 = new Greet();
        Greet1 obj2 = new Greet1();
        
        obj1.start();
        obj2.start();
    }
}
