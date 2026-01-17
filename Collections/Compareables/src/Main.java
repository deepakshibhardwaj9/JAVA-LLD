import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {

        List<Person> listOFPErsons = new ArrayList<>(Arrays.asList(
        new Person("Sam", 26, 69.50),
        new Person("Jazz",50,75.45),
        new Person("Bob",40,79.87)
        ));
        System.out.println("List before Sorting : " +listOFPErsons);
        Collections.sort(listOFPErsons);
        System.out.println("List after Sorting : " +listOFPErsons);
    }
}