 // Write a Java program that takes a number as input and 
 // prints its multiplication table upto 10

package com.company;

import java.util.Scanner;

public class Q_01 {

    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner in_num = new Scanner(System.in);
        int num = in_num.nextInt();

        for (int i=1; i<= num; i++) {
            System.out.println(i + " x " + num + " = " + i*num);
        }
    }
}
