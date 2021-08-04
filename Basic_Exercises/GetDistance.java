// Write a Java program to compute the distance between two points on the surface of earth.
// Distance between the two points [ (x1,y1) & (x2,y2)]
// d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
// Radius of the earth r = 6371.01 Kilometers

package com.company;

import java.util.Scanner;

public class GetDistance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double earthRadius = 6371.01;
        double distance;

        System.out.print("Input the latitude of coordinate 1: ");
        double latitude1 = in.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double longitude1 = in.nextDouble();

        System.out.print("Input the latitude of coordinate 2: ");
        double latitude2 = in.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double longitude2 = in.nextDouble();

        latitude1 = Math.toRadians(latitude1);
        latitude2 = Math.toRadians(latitude2);
        longitude1 = Math.toRadians(longitude1);
        longitude2 = Math.toRadians(longitude2);

        distance = earthRadius * Math.acos( (Math.sin(latitude1) * Math.sin(latitude2)) + (Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2)) );

        System.out.println("Distance: " + distance + "km" );
    }
}