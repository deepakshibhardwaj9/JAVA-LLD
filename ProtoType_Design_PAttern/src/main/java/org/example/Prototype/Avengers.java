package org.example.Prototype;

public class Avengers implements Prototype
{
    int power;
    String planet;
    String teamName;
    String hammer;

    public Avengers(){}

    //parameterized constructor
    public Avengers(int power, String planet, String teamName, String hammer)
    {
        this.power = power;
        this.planet = planet;
        this.teamName = teamName;
        this.hammer = hammer;
    }

    //copy constructor
    public Avengers(Avengers avengers)
    {
        this.teamName = avengers.teamName;
        this.planet = avengers.planet;
        this.power = avengers.power;
        this.hammer = avengers.hammer;
    }

    @Override
    public Avengers clone() {
        return new Avengers(this);
    }
}
