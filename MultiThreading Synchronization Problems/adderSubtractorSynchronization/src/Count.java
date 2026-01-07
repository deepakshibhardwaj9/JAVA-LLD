//This is count class which will help us to increase/decrease the value.

public class Count
{
    int value=0;
    public int getValue()
    {
        return this.value;
    }

    //function will increment/decrement the value
    public void incrementCount(int integer)
    {
        this.value +=integer;
    }

    /* SYNCHRONIZED METHOD    *   means we make whole method as Synchronized method so that single thread can execute the method at a time.
    *  It will make whole block synchronized, so this takes a little more time to execute.
    *  Suppose we have 1000 threads, and one thread took 1sec to execute. Overall it would take 1000 seconds to execute. So making whole block as synchronized a time-taking in large operations.
    *  Instead of making all methods in child-class as synchronized, just make parent-method synchronized.
    *  public synchronized void incrementCount(int integer)
        {
            this.value +=integer;
        }
    */
}
