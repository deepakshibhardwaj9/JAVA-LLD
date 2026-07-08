package org.example;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Student s = Student.getBuilder().setAge(11).build();
        Student s2 = Student.getBuilder().setAge(42).build();
        s.getAge();
        s2.getAge();
    }
}