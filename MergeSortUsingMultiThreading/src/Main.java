import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(4,2,9,7,3,10,6);
        //FOR MULTITHREADING , STEP 1 : create executor service.
        //Here we need newCachedThreadPool because recursion is used to solve the merge sort and if create Fixed number of thread pool than once the thread is occupied it will not come out of that due to recursion and Until a thread is completed we cant reuse it. So because we cant reuse the threads in recursion until the task is completed so avoid using fixed number of thread pool.
        ExecutorService executorService = Executors.newFixedThreadPool(14);
        //STEP 2 : create and pass the task to executorServices
                // mergeSort mergeSorting = new mergeSort(list);
                // executorService.submit(mergeSorting);               //But still here everything is done using single thread of pool.

        //IF WE IMPLEMENT SIMPLE MERGE SORTING THAN IT IS DONE ON SINGLE main thread.
        //mergeSorting.call();
        //STEP 3 : We want that every call to left and right array is being done by new thread. So to do that we need to introduce ExecutorService in mergeSort Constructor.
        mergeSort mergeSorting = new mergeSort(list,executorService);

        //STEP 4 : Need list-of-futures to get the result.Because internal threads are still working.
        Future<List<Integer>> result = executorService.submit(mergeSorting);

        System.out.println("RESULT OF SORTED ARRAY: "  + result.get());
        executorService.shutdown();
    }
}