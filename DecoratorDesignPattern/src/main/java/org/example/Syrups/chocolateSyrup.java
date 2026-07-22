package org.example.Syrups;

import org.example.iceCream;

public class chocolateSyrup extends syrupDecorator
{
    iceCream iceCream;
    public chocolateSyrup(iceCream cream)
    {
        super(cream);
        this.iceCream = cream;
    }

    @Override
    public int cost() {
        return iceCream.cost() + 20;
    }

    @Override
    public void description()
    {
        iceCream.description();
        System.out.println("Chocolate Syrup");
    }
}
