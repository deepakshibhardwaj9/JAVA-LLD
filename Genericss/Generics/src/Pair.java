public class Pair<T,V>
{
    //To support this class with Generics, give angle brackets and then add a datatype with which you want to support this class.
    //If we give <T> that means Class is now of Generic class.
    //<T> is now the datatype here
    //We can create class which can support multiple datatypes

    public T first;
    public V second;

    public T getFirst()
    {
        return first;
    }

    public V getSecond()
    {
        return second;
    }
}
