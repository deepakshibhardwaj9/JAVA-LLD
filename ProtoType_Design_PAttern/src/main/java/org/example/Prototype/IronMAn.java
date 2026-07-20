package org.example.Prototype;

public class IronMAn extends Avengers implements Prototype
{
    String jarvis;
    public IronMAn()
    {}

    public IronMAn( int power, String  planet, String teamName, String hammer, String getJarvis)
    {
        super(power,planet,teamName,hammer);
        this.jarvis = getJarvis;
    }

    //copy constructor
    public IronMAn(IronMAn ironMAn)
    {
        this.jarvis = ironMAn.jarvis;
        this.hammer = ironMAn.hammer;
        this.planet = ironMAn.planet;
        this.power = ironMAn.power;
        this.teamName = ironMAn.teamName;
    }

    @Override
    public IronMAn clone() {
        return new IronMAn(this);
    }
}

