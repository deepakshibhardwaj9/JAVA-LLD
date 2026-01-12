import java.util.*;
import java.util.concurrent.Semaphore;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
       /* We are going to solve Producer-Consumer Problem using Semaphore.
       *  Why do we need Semaphores?
       *  Because Semaphores allows multiple threads to enter the Critical-Section.
       *
       *
       *  */

        // STEP-1) Because we need to store items in store, so use Queue
        Queue<String> store = new LinkedList<>();

        // STEP-2) Create Producer-Consumer Classes
        // STEP-3) Implement semaphore on Critical-Section wisely
        // STEP-4) Create objects of Producer and Consumer
        Semaphore producerSemaphore = new Semaphore(3);         // Means initially there is no consumer because store is Empty, so we need all producers i.e. 3Producers.
        Semaphore consumerSemaphore = new Semaphore(0);         // We need no consumer initially so count of Consumers = 0

        Producer p1 = new Producer(store,3,producerSemaphore,consumerSemaphore);
        Producer p2 = new Producer(store,3,producerSemaphore,consumerSemaphore);
        Producer p3 = new Producer(store,3,producerSemaphore,consumerSemaphore);
        Consumer c2 = new Consumer(store,3,producerSemaphore,consumerSemaphore);
        Consumer c1 = new Consumer(store,3,producerSemaphore,consumerSemaphore);


        // STEP-5) Create multiple threads.
        Thread task1 = new Thread(p1);
        Thread task3 = new Thread(p2);
        Thread task4 = new Thread(p3);
        Thread task2 = new Thread(c1);
        Thread task5 = new Thread(c2);
        task1.start();
        task2.start();
        task3.start();
        task4.start();
        task5.start();

    }
}