package org.example.Registry;

import org.example.Prototype.Prototype;

public class Student implements Prototype<Student>
{
    private String name;
    private String batchName;
    private int rollNumber;
    private double psp;


    public Student(String name, String batchName, int rollNumber, double psp) {
        this.name = name;
        this.batchName = batchName;
        this.rollNumber = rollNumber;
        this.psp = psp;
    }

    public Student(Student student)
    {
        this.batchName = student.batchName;
        this.name = student.name;
        this.psp = student.psp;
        this.rollNumber = student.rollNumber;
    }

    public Student(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    @Override
    public Student clone()
    {
        return new Student(this);
    }
}
