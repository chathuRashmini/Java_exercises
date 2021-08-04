// Write a Java program to compute the area of a hexagon. Go to the editor
// Area of a hexagon = (6 * s^2)/(4*tan(π/6))
// where s is the length of a side

package com.company;

import java.util.Scanner;

public class HexagonArea {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double area;

        System.out.print("Enter length of a side: ");
        double side = in.nextDouble();
        area = (6 * Math.pow(side, 2))/(4 * Math.tan(Math.PI/6));

        System.out.println("Area of the hexagon: " + area);
    }
}