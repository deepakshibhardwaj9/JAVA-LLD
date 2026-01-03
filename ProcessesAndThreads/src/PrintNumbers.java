public class PrintNumbers implements Runnable
{
    /*To create a THREAD, there are some steps
      1) Create a java class
      2) Implement Runnable/Callable Interface on that class.
      3) Override run()/call() method into class.
      4) Create a separate function for the task.
      5) Add the task/function into run() method.
      6) Go to Main class
    * */



//    THIS IS ONE WAY OF PRINTING NUMBERS FROM 1 TO 100 USING SINGLE THREAD
//
//    @Override
//    public void run()
//    {
//        print1To100();
//    }
//
//    public void print1To100()
//    {
//        for(int i=1;i<=100;i++)
//        {
//            System.out.println("Thread to print "+i +" is : " +Thread.currentThread().getName());
//        }
//    }



//     THIS IS ANOTHER WAY OF PRINTING NUMBERS FROM 1 TO 100 USING FIXED NUMBER OF THREADS i.e. 5 Threads
    int number;
    PrintNumbers(int number)
    {
        this.number = number;
    }

    @Override
    public void run()
    {
        System.out.println("Number is : " +number +" executed by this thread : " +Thread.currentThread().getName());
    }
}
