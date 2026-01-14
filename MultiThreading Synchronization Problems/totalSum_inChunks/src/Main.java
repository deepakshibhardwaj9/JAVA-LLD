import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.ExecutionException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int arraySize = 1000;
        int availableCores = Runtime.getRuntime().availableProcessors();
        System.out.println("Avaiable cores : "+availableCores);

        //STEP1: Create a List of integers with random numbers in it from 0 to 1000.
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<arraySize;i++)
        {
            numbers.add(random.nextInt(1000));
        }

        //STEP 2: NOw find the chunk-size,i.e. find the number of threads you want to create
        int chunkSize = arraySize/availableCores;

        //STEP 3: Create thread-pool equal to chunkSize
        ExecutorService executorService = Executors.newFixedThreadPool(availableCores);
        List<Future<Long>> overallSum = new ArrayList<>();       //to store sum of each individual sum of each chunk in a list

        //STEP4: Find the start and end index of chunks
        for(int i=0;i<availableCores;i++)
        {
            int start = i*chunkSize;
            int end=(i==availableCores-1)?arraySize:(i+1)*chunkSize;
//            if(i==availableCores-1)
//            {
//                end = arraySize;
//            }
//            else
//            {
//                end = (i+1)*chunkSize;
//            }

            //STEP 5: Call the callable to fetch the total-sum of each chunk
          Callable<Long> task = new totalSum(numbers,start,end);

            //STEP 6: Fetch the sum of each chunk and then store the total-sum of each chunk in a list
            Future<Long> chunkSum = executorService.submit(task);
            overallSum.add(chunkSum);

        }

        //STEP 7: Iterate over the futures and get the total-Sum of all chunks.
        long total =0;
        for (int i=0;i<overallSum.size();i++)
        {
            total=total+overallSum.get(i).get();
        }
        //STEP 8: Before printing the overall sum ,we need to shut-down our executorServices else it will run continously.
        executorService.shutdown();
        System.out.println("Sum is: " + total);
    }
}