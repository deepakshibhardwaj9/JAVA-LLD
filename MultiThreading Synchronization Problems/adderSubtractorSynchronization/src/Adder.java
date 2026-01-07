//Using this class we will increment the value.

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable
{
    Count count;
   public Adder(Count count)
    {
        this.count=count;
    }
    @Override
    public void run()
    {
        synchronized (count) {
            for (int i = 0; i <= 100000; i++) {
                this.count.incrementCount(i);
                //To check how they access value
                // System.out.println("Thread name : " +Thread.currentThread().getName() +" Value in adder :"+i);
            }
        }
    }
}
