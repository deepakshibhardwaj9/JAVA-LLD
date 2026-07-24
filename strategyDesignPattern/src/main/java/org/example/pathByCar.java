package org.example;

public class pathByCar implements pathCalculator
{
    String source;
    String destination;
    public pathByCar(String source,
                     String destination)
    {
        this.destination=destination;
        this.source=source;
    }

    @Override
    public int findPath() {
        return 40;
    }
}
