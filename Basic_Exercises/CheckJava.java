//Write a Java program to check whether Java is installed on your computer.

package com.company;

import java.util.Scanner;

public class CheckJava {

    public static void main(String[] args) {
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
    }
}