package org.example;

import org.example.Cones.OrangeCone;
import org.example.Cones.chocolateCone;
import org.example.Syrups.chocolateSyrup;
import org.example.addOn.SprinklesDecorator;
import org.example.Scoop.chocolateScoop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        iceCream iceCream = new chocolateCone();
        iceCream = new chocolateScoop(iceCream);
        iceCream = new SprinklesDecorator(iceCream);
        iceCream = new OrangeCone(iceCream);
        iceCream = new chocolateSyrup(iceCream);
        System.out.println("Icecream details: ");
        iceCream.description();
        System.out.println("Total cost is : " +iceCream.cost());

    }
}