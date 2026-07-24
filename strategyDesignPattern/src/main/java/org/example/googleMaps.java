package org.example;

import static org.example.vehicleEnum.*;

public class googleMaps
{
    public static pathCalculator calculatePath(vehicleEnum vehicleEnum,String source, String destination)
    {
        return switch (vehicleEnum)
        {
            case car -> new pathByCar(source,destination);
            case bus -> new pathByBus(source,destination);
            case cycle -> new pathByCycle(source,destination);
            default -> throw new IllegalArgumentException("Invalid vehicle type");
        };
    }
}
