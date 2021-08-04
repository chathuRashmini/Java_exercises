package com.company;

import java.util.Scanner;

public class BonaryToDecimal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, d;
        double[] sum = new double[20];
        double p = 0;

        System.out.println("Enter decimal number: ");
        d = in.nextInt();

        while (d != 0) {
            sum[i++] = (d%10) * Math.pow(2.0, p);
            p = p + 1.0;
            d = d/10;
        }
        --i;

        System.out.print("Equivalent binary number is: ");

        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }
}