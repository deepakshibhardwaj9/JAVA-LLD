package org.example.Prototype;

public class Thor extends Avengers
{
    String hammer;

    public Thor(int power, String planet, String teamName, String hammer, String hammer1) {
        super(power, planet, teamName, hammer);
        this.hammer = hammer1;
    }

    public Thor()
    {}

    public Thor(Thor thor)
    {
        this.hammer = thor.hammer;
        this.planet = thor.planet;
        this.power = thor.power;
        this.teamName = thor.teamName;
    }
    @Override
    public Thor clone() {
        return new Thor(this);
    }
}
