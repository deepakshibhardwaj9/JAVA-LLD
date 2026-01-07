import java.util.Locale;
import java.util.concurrent.locks.Lock;

//this class is used to decrement the numbers
public class Subtractor implements Runnable
{
    Count count;
    Lock lock;
    Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run()
    {
        for (int i=0;i<=100000;i++)
        {
            lock.lock();
            this.count.incrementCount(-i);
            //To check how they access value
            System.out.println("Thread name : " +Thread.currentThread().getName() +" Value in subtractor :"+i);
            lock.unlock();
        }
    }
}
