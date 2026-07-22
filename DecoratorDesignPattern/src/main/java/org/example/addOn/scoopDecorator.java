package org.example.addOn;

import org.example.iceCream;

public abstract class scoopDecorator implements iceCream
{
    iceCream iceCream;
    public scoopDecorator()
    {
        this.iceCream = iceCream;
    }

    @Override
    public abstract void description();

    @Override
    public abstract int cost();

}
