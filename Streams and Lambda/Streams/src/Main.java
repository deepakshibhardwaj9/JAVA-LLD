import java.util.*;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //SIMPLE LIST
        List<Integer> listt = Arrays.asList(1,2,3,4,5,6,7);

        // WAY 1: Create stream from list
        Stream<Integer> stream = listt.stream();

        //Now our list become Stream list.
        // Now it is enabled to do lambda operations on it.

        // WAY 2: Create stream using Stream.of()
        Stream<Character> stream1 = Stream.of('a','c','s','e','s','e','a','f','c','e','d');

        // Normal way: Print odd numbers
        for(Integer i : listt)
        {
            if (i % 2 != 0)
            {
                System.out.println("Number: " + i);
            }
        }

        // WORKING WITH STREAMS.........
        //Stream Way : Print all the odd numbers in Stream-list.
        
    }
}