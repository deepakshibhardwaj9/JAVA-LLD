package org.example.Scoop;

import org.example.Cones.chocolateCone;
import org.example.iceCream;

public class chocolateScoop extends chocolateCone
{
    iceCream iceCream;
    public chocolateScoop(iceCream cream)
    {
        super();
        this.iceCream = cream;
    }

    @Override
    public int cost() {
        int cost = iceCream.cost()+23;
        return cost;
    }

    @Override
    public void description()
    {
        iceCream.description();
        System.out.println("Chocolate Scoop");
    }
}
