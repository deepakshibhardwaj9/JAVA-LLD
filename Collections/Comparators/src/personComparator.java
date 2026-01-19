import java.util.*;

public class personComparator implements Comparator<Person>
{

    @Override
    public int compare(Person p1, Person p2)
    {
        return p1.getAge()-p2.getAge();
    }

    //If we want to sort same class with more than one parameter than we need to create another-class which will implement.
    //
}
