package com.chaiwala.udemy;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void getMinMax(int maxNumbersToRead) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);
        int currentInt = 0;
        try {
            for (int i = 1; i <= maxNumbersToRead; i++) {
                System.out.print("Enter number: ");
                if (scanner.hasNextInt()) {
                   currentInt = scanner.nextInt();

                   if (min > currentInt) {
                       min = currentInt;
                   }

                   if (max < currentInt) {
                       max = currentInt;
                   }
                } else {
                    System.out.println("\tIgnoring input. You entered " + scanner.next()  + " and that is not a valid number.");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
        System.out.println("Min value is " + min + " and Max value is " + max);
    }
}
