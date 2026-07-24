package org.example;

public class pathByBus implements pathCalculator
{
    String source;
    String destination;
    public pathByBus(String source,
    String destination)
    {
        this.destination = destination;
        this.source = source;
    }

    @Override
    public int findPath() {
        return 60;
    }
}
