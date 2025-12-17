// This is Child class of User class and here we use 'extend' keyword to make User class as SuperClass.
public class Student extends User
{
    int age;
    String name;
    int rollNumber;
    String userName;
    String password;

    //NO ARRGUMENT CONSTRUCTOR
    Student()
    {
        System.out.println("Hello from STUDENT No arrgument constructor.");
    }

    //COPY CONSTRUCTOR
   Student(Student s)
    {
        System.out.println("Hello from STUDENT copy Constructor.");
        this.age = s.age;
        this.name = s.name;
        this.rollNumber = s.rollNumber;
    }

    //DEEP COPY
    Student(String nameN)
    {

        System.out.println("Hello from STUDENT Parameterized Constructor with single argument.");
        this.name = new String (nameN);
    }

    Student(String userName, String password, int rollNumber)
    {
        //Here we use 'super' keyword to call the parent class constructor from child class according to my requirement.
        //We can call any parent class constructor from child class constructor.
        //We can also skip to extensively call a parent class constructor, but than we require a No Argument constructor in parent class.
        //Main Requirement for 'super' keyword is, it should be the first line of code in constructor.
        //Child class can only call Parent Class Constructor using 'super' keyword.
        super(userName,password);
        System.out.println("Hello now 'super' keyword executed USER constructor of 2 arguments from a STUDENT constructor with 3 arguments.");
    }
    public  void studentLogin()
    {
        System.out.println("Hello i Logged In as a STUDENT!");
    }
}