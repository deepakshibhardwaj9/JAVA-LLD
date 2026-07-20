package org.example;

import org.example.Prototype.Avengers;
import org.example.Prototype.Thor;
import org.example.Registry.AcademyStudent;
import org.example.Registry.RegistryClass;
import org.example.Registry.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static Avengers copy(Avengers a)
    {
        Avengers avengers = new Avengers();
        return avengers.clone();
    }
    public static void main(String[] args)
    {
        System.out.println("PROTOTYPE DESIGN PATTERN...................................................");
        Avengers avengers = new Thor(5,"Earth","acd","hammer23","frs3");
        Avengers a = avengers.clone();
        System.out.println("Copy of avengers.............."+a);
        Thor thor = new Thor();
        Thor t = thor.clone();
        System.out.println("Copy of Thor............"+t);
        //This is used so that, we just need to pass the object and automatically copy is created......
        System.out.println("CCopy USing a public-method..............."+copy(a));

        //
        //........REGISTRY
        //
        System.out.println("REGISTRY DESIGN PATTERN...................................................");

        System.out.println("New Students are created: ");
        Student septBatch = new Student("Anil","SeptBAtch_2026",1011,69.3);
        Student augBatch = new Student("Sam","AugBAtch_2026",1011,65.3);

        System.out.println("Student 1 : "+septBatch.getName() +"," +"Second student : "+augBatch.getName());
        System.out.println("Now add the students in Registry....");
        RegistryClass registryClass = new RegistryClass();
        registryClass.addEntry("Aug_Batch",augBatch);
        registryClass.addEntry("Sept_Batch",septBatch);

        //Cloned the objects of already added objects in Registry.....
        Student s2 = registryClass.getRegistry("Aug_Batch");
        s2.setName("People");
        s2.setRollNumber(8520);
        registryClass.addEntry("s2",s2);

        //
        AcademyStudent academyStudent = new AcademyStudent("sunil","Jan_2025",4257,90,4110);
        AcademyStudent s1 = (AcademyStudent) academyStudent.clone();
        s1.setName("Deep");
        s1.setRollNumber(52827);
        registryClass.addEntry("s1", s1);
        System.out.println( registryClass.registrySize() +" Size of Registry ");
    }
}