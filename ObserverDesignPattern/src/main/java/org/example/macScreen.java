package org.example;

public class macScreen implements Observer
{
    public void displayTempOnMAC(int temp)
    {
        System.out.println("Temperature on mac Screen is : " +temp);
    }

    @Override
    public void notify(int temperature)
    {
        displayTempOnMAC(temperature);
    }
}
