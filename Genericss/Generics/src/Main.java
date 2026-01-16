import java.util.List;

public class Main
{
    public static void main(String[] args)
    {

        //We can create objects with data-type of our choice.
        //This will give us code Reusability.

        //DOUBLE-PAIR OF INTEGER AND STRING
        Pair<Integer,String> pair1 = new Pair<>();
        pair1.first = 1001;
        pair1.second = "Yash";

        //DOUBLE-PAIR OF STRINGS
        Pair<String,String> pair2 = new Pair<>();
        pair2.first = "Hello";
        pair2.second = "World!!";

        //DOUBLE-PAIR OF INTEGER-DOUBLE
        Pair<Integer,Double> pair3 = new Pair<Integer, Double>();
        pair3.first=1031;
        pair3.second = 10342.422;

        //WE CAN CRATE GENERICS WITH INTERFACES ALSO, LIKE LINKED-LIST IS ALSO AN INTERFACE, SO WE CAN CREATE GENERICS WITH INTERFACES AS WELL.
        Pair<List<Integer>, List<String>> pair4 = new Pair<>();

        //STUDENT-PAIR CLASS
        studentPair<String,Integer> student1 = new studentPair<>();
        student1.studentName="Deepakshi";
        student1.studentAge=25;
        student1.getStudentAge();

        //call Generic static method with/without creating object of class.
        studentPair.setStudentLastNAme("Bhardwaj");
        System.out.println(studentPair.setStudentCourse("JAVA"));

    }
}