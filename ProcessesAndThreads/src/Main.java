import java.util.concurrent.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        /*WHAT IS PROCESS?
          Process is program in execution.
          A process has a lot of metadata inside it, which is managed by Process Control Block(PCB).
         */
        /* WHAT IS THREAD?
         Thread is the smallest unit of processing that can be scheduled by Operating System.
         Basically threads are light weighted process which has less memory, and they execute a task.
         Task is a single-responsible code used to perform a particular task.
        * */

        /* HOW TO CALL A THREAD?
        * 1) Create an object of class where we implement Runnable/Callable Interface.
        * 2) Create object of Thread class and then pass the class-object inside Thread.
        * 3) There are more than ways in which we can create threads.
        * */

        System.out.println("Main Thread : " +Thread.currentThread().getName());

//  THIS IS INPUT FOR THE FUNCTION USING SINGLE-THREAD TO PRINT ALL NUMBERS.
        PrintNumbers add = new PrintNumbers(9);
        Thread t1 = new Thread(add);
        t1.start();
        System.out.println("Running Thread : " +Thread.currentThread().getName());

        // So both the lines at line no.22 and 27 will give output as "main", because "main-thread" is running and keep on executing, no matters what other threads are doing.
        // Other tasks are running there our threads, so if we want to know which thread is working on another tasks than we should check inside tasks.

        /* If we need to create 100 tasks and for 100 tasks than we need 100 threads, which we need to create manually, but this is not possible.
        *  So, to handle a huge number of threads, we have a thread-pool.
        *  To create a thread-pool, we need a inbuilt service i.e. ExecutorServices.
        *  Using ExecutorServices we can create two types of pool using inbuild functions :
        *       1) newFixedThreadPool(X) ---> using this we can create a fixed size thread-pool, with limited number of threads.
        *       2) newCachedThreadPool() ---> using this we can create a thread-pool in which initially a fixed-number of threads were created but if possible this function will reuse the thread also.
        */

// THIS IS ANOTHER WAY OF PRINTING NUMBERS FROM 1 TO 100 USING FIXED NUMBER OF THREADS.
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=1;i<=100;i++)
        {
            executorService.execute(new PrintNumbers(i));
        }

// THIS IS THIRD WAY OF PRINTING NUMBERS USING THREAD-POOL WITH CACHED THREADS
        ExecutorService execute = Executors.newCachedThreadPool();
        for (int i=1;i<=100;i++)
        {
            execute.submit(new PrintNumbers(i));
        }

//         used this shutdown() method to stop the executorService after performing its task. Else it will keep on working.
        execute.shutdown();
        System.out.println("Main Thread : " +Thread.currentThread().getName());
        // isTerminated() is used to ensure that all tasks are performed before we go to the next line of execution.
        execute.isTerminated();
        System.out.println("Main Thread : " +Thread.currentThread().getName());

//Every application has its own fixed number of threads associated with it.

        //CALLABLES : it will create threads,perform task and return a value.
        // Callables return result and throw checked exceptions.
    }
}