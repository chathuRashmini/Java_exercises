//Write a Java program to compare two numbers

package com.company;

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " = " + num2);
        }
        else if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        }
        else {
            System.out.println(num1 + " < " + num2);
        }
    }
}