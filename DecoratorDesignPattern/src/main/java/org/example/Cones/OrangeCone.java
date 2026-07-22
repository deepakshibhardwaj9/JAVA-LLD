package org.example.Cones;

import org.example.iceCream;

public class OrangeCone implements iceCream
{
    iceCream iceCream;
    public  OrangeCone(iceCream cream)
    {
        this.iceCream = cream;
    }
    @Override
    public void description() {
        iceCream.description();
        System.out.println("Orange cone");
    }

    @Override
    public int cost() {

        return iceCream.cost()+ 30;
    }
}
