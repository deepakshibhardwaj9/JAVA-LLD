public class Student
{
    int age;
    String name;
    int rollNumber;
    //DEFAULT CONSTRUCTOR
    Student()
    {
    }

    //COPY CONSTRUCTOR with Shallow Copy, this is used to copy the values of one object into another.
    Student(Student s)
    {;
        this.age = s.age;
        this.name = s.name;            // this will refer to same memory block until we change the name of student s3.
        this.rollNumber = s.rollNumber;
    }

    //DEEP COPY
    Student(String nameN)
    {
        // deep copy of 'name', so everytime new memory block is created for name.
        this.name = new String (nameN); // or this.name = new StringBuilder.append(s.name).build();
        //but making deep copies is not possible for all the cases, because there can be classes which has N-Level of nesting, so in these cases deep copies are not possible for all N levels.
        //In this class, we have only One Level Nesting of objects which is name, so name is the only object inside our class, therefore we can easily make deep copies here.
    }
}
