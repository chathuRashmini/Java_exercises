//Write a Java program to convert a decimal number to binary number

package com.company;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, d;
        int[] sum = new int[20];

        System.out.println("Enter decimal number: ");
        d = in.nextInt();

        while (d != 0) {
            sum[i++] = d%2;
            d = d/2;
        }
        --i;

        System.out.print("Equivalent binary number is: ");

        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }
}
