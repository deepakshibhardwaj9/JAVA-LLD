import java.util.concurrent.locks.Lock;

//this class is used to decrement the numbers
public class Subtractor implements Runnable
{
    Count count;
    Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        synchronized (count) {
            for (int i = 0; i <= 100000; i++) {
                this.count.incrementCount(-i);
                //To check how they access value
                System.out.println("Thread name : " + Thread.currentThread().getName() + " Value in subtractor :" + i);
            }
        }
    }
}
