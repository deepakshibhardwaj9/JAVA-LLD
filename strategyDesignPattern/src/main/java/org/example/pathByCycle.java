package org.example;

public class pathByCycle implements pathCalculator
{
    String source;
    String destination;
    public pathByCycle(String source,
                       String destination)
    {
        this.source=source;
        this.destination=destination;
    }

    @Override
    public int findPath() {
        return 45;
    }
}
