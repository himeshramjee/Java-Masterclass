package com.chaiwala.udemy;

public class Factors {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for (int f = 1; f <= number; f++) {
            if (number % f == 0) {
                System.out.print(f);

                if (f != number) {
                    System.out.print(" ");
                }
            }
        }

        System.out.println();
    }
}