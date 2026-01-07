//Using this class we will increment the value.

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable
{
    Count count;
    Lock lock;
    public Adder(Count count, Lock lock)
    {
        this.count=count;
        this.lock = lock;
    }
    @Override
    public void run()
    {
        for (int i=0;i<=100000;i++)
        {
            lock.lock();
            this.count.incrementCount(i);
            //To check how they access value
            // System.out.println("Thread name : " +Thread.currentThread().getName() +" Value in adder :"+i);
            lock.unlock();
        }
    }
}
