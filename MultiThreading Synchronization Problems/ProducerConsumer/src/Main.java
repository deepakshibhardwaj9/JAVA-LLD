//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        /* PRODUCER_CONSUMER PROBLEM
        *  In this problem statement, we need to control the producer and consumer.
        *  Producer can only produce products when store is empty, store has space.
        *  Consumer can only consume the product when store has products inside it.
        * */
        /* HOW TO SOLVE?
        *  So Producer is a task, similarly consumer is also a task.
        *  We will store products in a Data Structure from where we can easily fetch the items i.e. Arrays.
        *  Our task is to make the system in such a way that only one person can fetch the items from store and only one producer can add items in a store at a given point of time.
        *  So the system can take only one Thread.
        *
        * */

        /* STEP 1: Create producer and consumer classes.
        *  STEP 2: Add/remove items in list.
        *  STEP 3: Create threads and add/remove items.
        *
        *
        * */
        Queue<Object> q = new LinkedList(); // shirt store.

        // multiple tasks for producer...
        Producer p1 = new Producer(q, 6, "p1");
        Producer p2 = new Producer(q, 6, "p2");
        Producer p3 = new Producer(q, 6, "p3");

        // multiple tasks for consumer...
        Consumer c1 = new Consumer(q, 6, "c1");
        Consumer c2 = new Consumer(q, 6, "c2");
        Consumer c3 = new Consumer(q, 6, "c3");
        Consumer c4 = new Consumer(q, 6, "c4");
        Consumer c5 = new Consumer(q, 6, "c5");
        Consumer c6 = new Consumer(q, 6, "c6");

        //these are producers-thread that are adding items
        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();

        //these are consumers-thread that remove items
        Thread ct1 = new Thread(c1);
        ct1.start();
        Thread ct2 = new Thread(c2);
        ct2.start();
        Thread ct3 = new Thread(c3);
        ct3.start();
        Thread ct4 = new Thread(c4);
        ct4.start();
        Thread ct5 = new Thread(c5);
        ct5.start();
        Thread ct6 = new Thread(c6);
        ct6.start();


        // PROBLEM HERE IS THREADS DON'T WAIT FOR EACH_OTHER TO EXECUTE
        // Threads are executing but synchronized block won't enter other threads to enter while one is executing
        // If we want threads to wait than we should use lock-object to use block(),wait(),etc. methods.
    }
}