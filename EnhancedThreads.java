public class EnhancedThreads 
{
    public static void main(String[] args) 
    {
        Runnable obj1 = () ->
        {
        for (int i = 0; i <= 5; i++) 
            {
                System.out.println("Hii");
                try 
                {  /* Thread.sleep() is a static method that pauses the currently 
                    executing thread for a specified amount of time (in milliseconds). */
                    Thread.sleep(500);} catch (InterruptedException e) {}
                }
    };

        Runnable obj2 = () ->
        {
        for (int i = 0; i <= 5; i++) 
            {
                System.out.println("Hello");
                try {Thread.sleep(500);} catch (InterruptedException e) {}
            }
    };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();
        
        
    }
}
