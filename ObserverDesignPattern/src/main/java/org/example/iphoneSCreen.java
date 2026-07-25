package org.example;

public class iphoneSCreen implements Observer
{
    public void displayTempOnIphone(int temp)
    {
        System.out.println("Temperature on iphone Screen is : " +temp);
    }

    @Override
    public void notify(int temperature)
    {
        displayTempOnIphone(temperature);
    }
}
