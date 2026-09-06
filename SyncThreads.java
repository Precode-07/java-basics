class Counter
{
    int count;
    // Synchronized : prevents race conditions
    public synchronized void increment()
    {
        count ++;
    }
}

public class SyncThreads 
{
    public static void main(String[] args) 
    {
        Counter c = new Counter();
        //Runnable is a functional interface, we can use lambda expressions
        Runnable obj1 = () ->
        {
        for (int i = 1; i <= 1000; i++) 
            {
                c.increment();
            }
    };

        Runnable obj2 = () ->
        {
        for (int i = 1; i <= 1000; i++) 
            {
                c.increment();
            }
    };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();

    try {
        //Thread.join() → ensures deterministic output.
            t1.join();  // wait for t1 to finish
            t2.join();  // wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    System.out.println(c.count);
        
        
    }
}

