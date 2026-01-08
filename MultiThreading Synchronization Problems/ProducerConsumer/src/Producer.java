import java.util.*;

//Implement runnable because it is a task and
public class Producer implements Runnable
{
    //Items are stored in a objects of queue. Object class is parent-class for all Object-classes (String-classes, Collection-classes, Thread-classes,etc.) in JAVA.
    //They all inherit common methods as well.
    Queue<Object> queue;
    //size of queue
    int maxSize;
    //thread-name
    String name;

    //Producer is used to add items in list, til the queue is full
    Producer(Queue<Object> queue, int maxSize, String name)
    {
        this.queue=queue;
        this.maxSize=maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        // task of producer is to add items into queue
        // we use this condition while(true) when we know that anything is keep on running, as producer will produce items continously as long as queue is empty.
        /* while(true){} means thread is alive and consuming space all the time if it is idle as well.----> This is not good-practice.

        while (true)
        {
            if(queue.size()<maxSize)
            {
                System.out.println("Name of task : " +name + " adding  adding inside the queue, before size is "+ queue.size());
                queue.add(new Object());
            }
        }
         */

        //using synchronized, threads will execute continuously but will not consume CPU space when idle.
        synchronized (this.queue)
        {
            if(queue.size()<maxSize)
            {
                System.out.println("Name of task : " +name + " adding  adding inside the queue, before size is "+ queue.size());
                queue.add(new Object());
            }
        }
    }
}