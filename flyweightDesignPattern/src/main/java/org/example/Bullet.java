package org.example;

public class Bullet
{

    double x;
    double y;
    BulletFlyweight bulletFlyweight;
    public Bullet(double x, double y, BulletFlyweight bulletFlyweight)
    {
        this.x = x;
        this.y = y;
        this.bulletFlyweight = bulletFlyweight;
    }

}
