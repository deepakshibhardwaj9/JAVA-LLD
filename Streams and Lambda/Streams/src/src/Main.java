import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        // Step 1 : List of students is craeated.
        List<Student> students = new ArrayList<>();
        students.add(new Student(28,"Anu"));
        students.add(new Student(29,"Deep"));
        students.add(new Student(40,"Chi"));
        students.add(new Student(50,"Lam"));;
        students.add(new Student(51,"Bob"));
        students.add(new Student(25,"Kim"));

        //Step 2 : make this list as stream-data whoes age is < 30 and store it in another list
        List<Student> listStudent = students.stream().filter((s -> s.age<30)).toList();

        //map() function to access the variables of Student List
        List<String> mapStudent = students.stream().map(s->s.name).toList();
        System.out.println("Name of Students : " +mapStudent);
        System.out.println("Students with age < 30 : " +listStudent);

        //findAny() function -> this function will return any object from the list randomly. It doesnot give any stable result.
        List<Student> randaomStudent= students.stream().findAny().stream().toList();
        System.out.println("This will give us random student from list : " +randaomStudent);

        //findFirst() -> It will always return first element from List
        List<Student> firstStudent =  students.stream().findFirst().stream().toList();
        System.out.println("First student in List : " +firstStudent);

        //anyMatch() -> This uses predicate, and it will return matching element if found in list.
        Boolean matchingNAme = students.stream().anyMatch(s->s.name.matches("Bob"));
        System.out.println("If there is any student exists with name Bob : " +matchingNAme);
    }
}