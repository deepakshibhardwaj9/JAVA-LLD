//This is a Student Class containing attributes as age,name,rollNumber.
//
public class Student {
    public int age;
    public String name; // accessiable outside the class as well.
    private int rollNumber; // this attribute is encapsulated using private modifier.

    //default constructor
    Student()
    {
        this.age=10;
        this.name="unknown";
        this.rollNumber= 999;
    }

    //customer constructor
    Student(int age,String name,int rN)
    {
     this.age=age;
     this.name=name;
     this.rollNumber=rN;
    }
    //CLASS and OBJECTS
    //CONSTRTUCTORS:
        //1) Default Constructor
        //2) Custom/Parameterized Constructors
    //ENCAPSLATION :We can use concept encapsulation to hold the attributes and behavior together so that we can allow control over the attributes.
    //So we have three types of access modifires : public,private,default,protected.
}