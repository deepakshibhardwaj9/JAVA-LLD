package org.example;
public class Student
{
    int age;
    Student(int age)
    {
        this.age = age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        System.out.println(age);
        return age;
    }
    public static StudentHelper getBuilder()
    {
        return new StudentHelper();
    }


    public static class StudentHelper
    {
        static int studentAge;
        private StudentHelper()
        {}
        public int getAge()
        {
            return studentAge;
        }
        public StudentHelper setAge(int age)
        {
            this.studentAge = age;
            return this;
        }
        public static Student build()
        {
            try
            {
                if (studentAge < 18)
                {
                   throw new IllegalArgumentException();
                }
            }

            catch (IllegalArgumentException e)
            {
                System.out.println("Age should be greater than 18.....");
            }
            return new Student(studentAge);
        }
    }
}