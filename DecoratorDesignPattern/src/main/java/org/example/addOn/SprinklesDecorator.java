package org.example.addOn;

import org.example.iceCream;

public class SprinklesDecorator extends scoopDecorator
{
    iceCream iceCream;
    public SprinklesDecorator(iceCream cream)
    {
        super();
        this.iceCream = cream;
    }

    @Override
    public void description()
    {
        iceCream.description();
        System.out.println("Sprinkles");
    }

    @Override
    public int cost()
    {
        int c= iceCream.cost()+17;
        return c;
    }
}
