package com.company;

import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        char sentence[] = in.nextLine().toCharArray();

        for (int i = sentence.length-1; i>=0; i--) {
            System.out.print(sentence[i]);
        }

        System.out.print("\n");
    }
}