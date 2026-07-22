package org.example.Cones;

import org.example.iceCream;

public class chocolateCone implements iceCream
{
    @Override
    public void description() {
        System.out.println( "Chocolate cone");
    }

    @Override
    public int cost() {
        return 35;
    }
}
