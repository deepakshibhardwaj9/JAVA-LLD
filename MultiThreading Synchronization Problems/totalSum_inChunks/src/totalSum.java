import java.util.concurrent.Callable;
import java.util.*;

public class totalSum implements Callable<Long>
{
    List<Integer> arr;
    int start,end;

    totalSum(List<Integer> arr,int start,int end)
    {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception
    {
        long sum=0L;
        for (int i=start;i<end;i++)
        {
            sum += arr.get(i);
        }
        return sum;
    }
}
