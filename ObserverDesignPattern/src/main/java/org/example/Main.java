package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        iphoneSCreen iphoneSCreen = new iphoneSCreen();
        macScreen macScreen = new macScreen();
        List<Observer> observerList = new ArrayList<>();
        observerList.add(iphoneSCreen);
        observerList.add(macScreen);

        appleWeatherService appleWeatherService = new appleWeatherService(observerList,34);
        appleWeatherService.checkTemp(6);
        iphoneSCreen iphoneSCreen1 = new iphoneSCreen();
        observerList.add(iphoneSCreen1);
        appleWeatherService.checkTemp(-1);



    }
}