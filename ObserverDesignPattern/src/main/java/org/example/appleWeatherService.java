package org.example;

import java.awt.desktop.ScreenSleepEvent;
import java.util.*;

public class appleWeatherService
{
    //List of Observers, to notify the observers
    private List<Observer> observersList;
    int temp;

    public appleWeatherService(List<Observer> observersList, int temp)
    {
        this.observersList = observersList;
        this.temp = temp;
    }

    //subscribe method
    public void subscribe(Observer observer)
    {
        this.observersList.add(observer);
    }

    //unsubscribe
    public void unsubscribe(Observer observer)
    {
        this.observersList.remove(observer);
    }

    //
    public void checkTemp(int change)
    {
        temp +=change;
        notifyAllObserver();
    }

    //Notify function, which will notify all subscribers when a change is made....

    private void notifyAllObserver()
    {
        for(Observer observer : observersList)
        {
            observer.notify(temp);
        }
    }
}
