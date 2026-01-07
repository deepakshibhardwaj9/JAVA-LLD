import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        /*  PROBLEM STATEMENT:
         * We need to have two operations being done in parallel on a count variable.
         * Op-1 : Add values from 1-1000000
         * Op-2 : Sub valuesa from 1-1000000
         *
         * These should be done parallely and on the same count variable.
         * The initial value of count=0.
        Step1: Create a class count,adder,subtractor.
        * */
        /* Step2: Call adder function to add values
        * */

        Count count = new Count();
        Lock lock = new ReentrantLock();   //STEP 5: Created a lock. NOw inject locks in Adder and Subtractor class. Now inject locks in critical-section now.
        Adder add = new Adder(count,lock);
        Subtractor sub = new Subtractor(count, lock);

        /* Step3 : create threads of these class and run them parallely
         * */
        Thread task1 = new Thread(add);
        Thread task2 = new Thread(sub);
        task1.start();
        task2.start();
        /* Step4: Get the value after add and subtract
         *         We use join(), so that the thread which is using join(), will wait for another thread to wait until the execution of current thread is completed.
         *          So unless task1 thread is not complete that means until addition of numbers is not completed we forced task2 not to start the execution.*/
        task1.join();
        task2.join();
        System.out.println("RESULT WHILE USING SHARED VARIABLE 'count' :" +count.getValue());
        /*So as we can see that we got unexpected result each time random number is generated.
        * Because i =i+1 / i = i-1, is not a single step problem.
        * S1 = Read(i)
        * S2 = Add 1 to i
        * S3 = update the value of i
        * Now these 3 steps are working independently.
        * As adder and subtract are two operations, so they do there operations independently.
        * When both the threads are working independently than they both are sharing same memory individually as well.
        * Sharing same memory by two different threads lead to inconsistent data issues.
        * */

        /* HOW TO SOLVE RACE CONDITION?
           Introduced a Critical-Section. And allow only one thread can enter in critical-section,so that one thread will work at a time.
           So the solution is to use LOCKS/MUTEX.
           MUTEX is independent of language, it is a feature of Operating System not a particular language.
           MUTEX will lock
        Step4: Create locks in critical section. So critical-section here is the Count-class function.
         * */

    }
}