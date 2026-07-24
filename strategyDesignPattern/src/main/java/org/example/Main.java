package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String vehilve = sc.nextLine();
        String source = sc.nextLine();
        String destination = sc.nextLine();
        googleMaps maps = (googleMaps) googleMaps.calculatePath(vehicleEnum.valueOf(vehilve),source,destination);


    }
}