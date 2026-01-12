import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable
{
    Queue<String> queue;
    int maxSize;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    Producer(Queue<String> queue,int maxSize, Semaphore producerSemaphore, Semaphore consumerSemaphore)
    {
        this.queue =queue;
        this.maxSize=maxSize;
        this.producerSemaphore=producerSemaphore;
        this.consumerSemaphore=consumerSemaphore;
    }
    @Override
    public void run()
    {
        while(true)
        {
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(queue.size()<maxSize)
            {
                queue.add("Shirt");
                System.out.println("PRODUCER THREAD : " +Thread.currentThread().getName() +" Size Of queue is : " +queue.size());
            }
            consumerSemaphore.release();
        }
    }
}