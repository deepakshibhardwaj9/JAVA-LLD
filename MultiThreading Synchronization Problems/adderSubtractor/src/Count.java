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
}
