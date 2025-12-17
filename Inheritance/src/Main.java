//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        /*
        * Here we will HIERARCHY OF constructors CALLING.
        * As Constructors are always executed from PArent class to Child Class.
        *
        * */
        System.out.println("S2 OBJECT OF STUDENT CLASS IS CREATED WITH NO ARGUMENTS............");
        Student s2 = new Student();
        s2.rollNumber=1002;
        s2.age=14;
        s2.name="Zoya";
        System.out.println("S2 Roll Number : "+s2.rollNumber);
        System.out.println("S3 OF STUDENT CLASS IS CREATED TO COPY S2 TO S3..............");
        Student s3 = new Student(s2);
        System.out.println("USER1 is created using USER CLASS................");
        User user1 = new User(s2.name);
        user1.logIn();
        //In inheritance, Child Class can use arguments/behaviors of Parent Class but Parent Class cant use properties of Child Class.
        //As we can see that logIn and logOut methods are defined in Parent class But we are able to use them with Child Class objects.
        user1.logIn();
        s2.studentLogin();
        s2.logIn();
        s3.logOut();
        System.out.println("HOW 'super' KEYWORD IS WORKING WITH 3 ARGUMENTS...........");
        Student S4 = new Student("UserNAme","password",324);

    }
}