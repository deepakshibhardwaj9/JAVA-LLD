package org.example.Registry;

import org.example.Prototype.Prototype;

public class AcademyStudent extends Student
{
    int fees;
    public AcademyStudent(){}
    public AcademyStudent(String name, String batchName, int rollnumber, double psp, int fee)
    {
        super(name,batchName,rollnumber,psp);
        this.fees = fee;
    }

    public AcademyStudent(AcademyStudent a)
    {
        super(a);
        this.fees = a.fees;
    }

    @Override
    public AcademyStudent clone() {
        return new AcademyStudent(this);
    }
}
