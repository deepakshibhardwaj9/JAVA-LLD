package org.example.Registry;

public class SStStudents extends Student
{
    int credits;
    SStStudents(String name, String batchName, int rollnumber, double psp, int credits)
    {
        super(name,batchName,rollnumber,psp);
        this.credits = credits;
    }
    SStStudents(SStStudents sStStudents)
    {
        super(sStStudents);
        this.credits = sStStudents.credits;
    }

    @Override
    public SStStudents clone()
    {
        return new SStStudents(this);
    }


}
