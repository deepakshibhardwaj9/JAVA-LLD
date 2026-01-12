import java.util.concurrent.Semaphore;
import java.util.*;

public class Consumer implements Runnable
{
    int maxSize;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    Queue<String> store;
    Consumer(Queue<String> store,int maxSize, Semaphore producerSemaphore, Semaphore consumerSemaphore)
    {
        this.store =store;
        this.maxSize = maxSize;
        this.producerSemaphore=producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run()
    {
        while (true)
        {
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(store.size()>0)
            {
                store.remove();
                System.out.println("CONSUMER THREAD : " +Thread.currentThread().getName() +" Size of Queue : " +store.size());
            }
            producerSemaphore.release();
        }
    }
}
