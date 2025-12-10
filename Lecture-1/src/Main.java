//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //Obejcts of student class with DEFAULT CONSTRUCTOR.
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("Address of Student s1 : " + s1);
        System.out.println("Address of Student s2 :" +s2);
        System.out.println("s1 name : " + s1.name+" s1 age : " + s1.age);
        //So as we can see s1 and s2 assigned a different memory blocks.
        s2=s1;
        System.out.println("Address of Student s2 after assiging s1 to s2 :" +s2);
        System.out.println("Address of Student s1 after assiging s1 to s2 :" +s1);
        System.out.println("s1 name : " + s1.name+" s1 age : " + s1.age);
        System.out.println("s2 name : " + s2.name+" s2 age : " + s2.age);

        //Now because we assign s1 to s2, so s2 also start pointing to s1 as well.
        System.out.println("CUSTOM OBJECTS:");
        //Objects with CUSTOM CONSTRUCTOR

        Student s3 = new Student(11,"jullie",
                1001);
        System.out.println("s3 name : "+s3.name+" , s3 age : "+s3.age); //we are not able to access roll Number because it is private attribute.
        Student s4 = new Student(15,"bob",102);
        System.out.println("s4 name : "+s4.name+",s4 age : "+s4.age);
        s4=s3;
        System.out.println("Object s4 after assigning s3 to s4. And we can see that values of s3 gets shifted to s4.");
        System.out.println("s4 name : "+s4.name+",s4 age : "+s4.age);
    }
}