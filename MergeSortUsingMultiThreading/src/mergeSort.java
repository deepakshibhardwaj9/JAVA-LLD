import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class mergeSort implements Callable <List<Integer>>
{
    /* In merge sort, divide and conquer technique is used, a given array is divided into two halves(left-half and right-half) until a single-element is left on both the sides.
    *  If we use Single-thread to do merge-sorting, then single thread is responsible for division and merging of array.
    *  If we use Multi-threads for merge-sorting, then main thread will create more threads for creating sub-arrays with each thread responsible for sorting segments of array.
    *  So here we need to use Callables because callables will return a value.
    * */

    List<Integer> arrayToSort;
    ExecutorService executorService ;       // we are not creating a executorService here because we are using executorService which we created in main-class. If we create another pool here it will create multiple threadPools.

    public mergeSort(List<Integer> list, ExecutorService exec)
    {
        this.arrayToSort = list;
        this.executorService = exec;
    }

    @Override
    public List<Integer> call() throws Exception
    {

        System.out.println("Array for sorting is : " +arrayToSort
                +" Thread is : " +Thread.currentThread().getName());
        // Step1 : if size of array is less than or equal to 1 that means single element in array.
        if(arrayToSort.size()<=1)
        {
            return arrayToSort;
        }

        //Step 2: if size of array is greater than 1, than find the mid-point
        int mid = arrayToSort.size()/2;

        //Step 3: divide the araay into two halves, left-side and right-side of array.
        List<Integer> leftArray = new ArrayList<>();
        // List<Integer> leftArray = arrayToSort.subList(0,mid);
        //List<Integer> rightArray = arrayToSort.subList(mid,array.size());
        for(int i=0;i<mid;i++)
        {
            leftArray.add(arrayToSort.get(i));
        }
        List<Integer> rightArray = new ArrayList<>();
        for(int i=mid;i<arrayToSort.size();i++)
        {
            rightArray.add(arrayToSort.get(i));
        }

        //Step 4: recursively call the function till the array breaks and become a single-element array.
        mergeSort rightSortArray = new mergeSort(rightArray,executorService);
        mergeSort leftSortArray = new mergeSort(leftArray,executorService);

        //STEP 7 : As we need to create new threads, so we need to use the capability of executorService inside also with each call for sub-array.
//         executorService.submit(leftSortArray);
//         executorService.submit(rightSortArray);

         //STEP 8 : Now i want this data to be returned from executorService's submit(). So to get the output from submit() we need FUTURES.
                    //But why FUTURES we need??
                    //Because as 3 threads will work ( first thread when mergeSort code is called, second at line 52, third at line 53) to get the data from threads we need Futures.
        Future<List<Integer>> leftSortedArrayFutures= executorService.submit(leftSortArray);
        Future<List<Integer>> rightSortedArrayFutures =executorService.submit(rightSortArray);


        //Step 5: When we create a multithreading, then it is responsibility of executor service to call a call() method and run it.
        //        But as of now we didn't create any call() method to call the arrays, so we need to  deliberately pass the call() method to arrayLists.
        //        So this call() method is call by EXECUTOR SERVICES.
//        List<Integer> leftSortedArray = leftSortArray.call();
//        List<Integer> rightSortedArray = rightSortArray.call();

        //STEP 9 : now because we are using multiple threading, so data is present in Future-datatype, so we need to fetch the data from Futres's datatype
        List<Integer> leftSortedArray = leftSortedArrayFutures.get();
        List<Integer> rightSortedArray = rightSortedArrayFutures.get();

        //Step 6 : Merging of two sorted arrays, simple merging
        int i=0,j=0;
        List<Integer> sortedArray = new ArrayList<>();
        while(i<leftSortedArray.size() && j<rightSortedArray.size())
        {
            if(leftSortedArray.get(i)<rightSortedArray.get(j))
            {
                sortedArray.add(leftSortedArray.get(i));
                ++i;
            }
            else
            {
                sortedArray.add(rightSortedArray.get(j));
                ++j;
            }
        }

        //it might be happen that some elements would left from arrays at end,so to sort them this is default sorting, for merging left and right arrays
        while(i<leftSortedArray.size())
        {
            sortedArray.add(leftSortedArray.get(i));
            ++i;
        }
        while (j<rightSortedArray.size())
        {
            sortedArray.add(rightSortedArray.get(j));
            ++j;
        }
        return sortedArray;
    }


}
