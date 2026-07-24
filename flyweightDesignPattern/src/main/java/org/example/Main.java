package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        BulletFlyweight gun1 = new BulletFlyweight(10,"red",31);
        BulletFlyweight gun2 = new BulletFlyweight(13,"Black",26);

        //create bulltes for these guns
        List<Bullet> gun1Bullet = new ArrayList<>();
        for(int i=0;i<100;i++)
        {
            gun1Bullet.add(new Bullet(Math.random(),Math.random(),gun1));
        }
        List<Bullet> gun2Bullets = new ArrayList<>();
        for (int i=0;i<100;i++)
        {
            gun2Bullets.add(new Bullet(Math.random(),Math.random(),gun2));
        }
    }
}