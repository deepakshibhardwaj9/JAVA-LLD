import java.util.*;

//Implement runnable because it is a task and
public class Consumer implements Runnable
{
    //Items are stored in a objects of queue. Object class is parent-class for all Object-classes (String-classes, Collection-classes, Thread-classes,etc.) in JAVA.
    //They all inherit common methods as well.
    Queue<Object> queue;
    //size of queue
    int maxSize;
    //thread-name
    String name;

    //Producer is used to add items in list, til the queue is full
    Consumer(Queue<Object> queue, int maxSize, String name)
    {
        this.queue=queue;
        this.maxSize=maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        // task of consumer is to remove items into queue.
        // Consumer can remove items from queue when queue has items inside it.
        /* while(true){} means thread is alive and consuming space all the time if it is idle as well.----> This is not good-practice.

        while (true)
        {
            if(queue.size()>0)
            {
                System.out.println("Name of task : " +name + " Removing from queue, when size of queue is "+ queue.size());
                queue.remove();
            }
        }

         */

        //So if we use while() loop it will keep on executing and at same time more than one threads are executing leading to race-condition.
        // To handle the race-condition so that only one-thread of same-object can execute the task of consumer, we use synchronized block
        synchronized (this.queue)
        {
            if(queue.size()>0)
            {
                System.out.println("Name of task : " +name + " Removing from queue, when size of queue is "+ queue.size());
                queue.remove();
            }
        }
    }
}