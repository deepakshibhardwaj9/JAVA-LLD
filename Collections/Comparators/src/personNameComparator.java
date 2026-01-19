// In this class we will use Name for Sorting
// Or use Simple sort method to sort the list via name

import java.util.Comparator;

public class personNameComparator implements Comparator<Person>
{
    @Override
    public int compare(Person p1, Person p2)
    {
        return p1.getName().compareTo(p2.getName());
    }
}
