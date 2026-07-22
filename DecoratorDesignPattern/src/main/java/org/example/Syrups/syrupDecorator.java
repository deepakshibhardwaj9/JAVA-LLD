package org.example.Syrups;

import org.example.iceCream;

public abstract class syrupDecorator implements iceCream
{
    iceCream iceCream;
    public syrupDecorator(iceCream cream)
    {
        this.iceCream = cream;
    }
    public abstract int cost();
    public abstract void description();
}
