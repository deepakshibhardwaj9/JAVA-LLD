//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Student s2 = new Student();
        System.out.println(s2);
        s2.rollNumber=1002;
        s2.age=14;
        s2.name="Zoya";
        System.out.println("S2 Roll Number : "+s2.rollNumber);
        System.out.println("S2 Name : "+s2.name);
        System.out.println("S2 Age : "+s2.age);
        Student s3 = new Student(s2);
        //Because we are using copy constructor here, so,
        // I) new object s3 is created.
        //II) s3 will take the address of s2 and pass it as a value to copy the values of s2 variables in s3.
        //II) once the values of s2 gets copied to s3, then s3 will become a single independent entity.
        System.out.println(s3);
        //What if we assign values to s3, after using copy constructor???
        //So, yes we can assign different values to s3 after creating s3 with copy constructor.But once the values of s2 will be assigned to s3,after that values of s3 gets changed to new values.
        System.out.println("S3 Roll Number : "+s3.rollNumber);
        System.out.println("S3 Name : "+s3.name);
        System.out.println("S3 Age : "+s3.age);
        
    }
}