import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //STEP 1: CREATE LIST OF PERSONS
        List<Person> list= new ArrayList<>(
            Arrays.asList(
                    new Person("SAm", 32,70.31),
                    new Person("Jazz",49,78.00),
                    new Person("MAltie",32,90.00)
            )
    );
        System.out.println("List before Sorting : " +list);

        //// Because we can have multiple comparators so, it is a need to invoke the comparator explicity.
        Collections.sort(list, new personNameComparator());
        System.out.println("List after Sorting via NAme : " +list);


    }
}