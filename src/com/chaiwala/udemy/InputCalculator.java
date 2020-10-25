package com.chaiwala.udemy;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long average = 0;

        Scanner scanner = new Scanner(System.in);
        int currentInt = 0;
        int numberCount = 0;
        try {
            while (true) {
                if (scanner.hasNextInt()) {
                    numberCount++;
                    sum += scanner.nextInt();
                } else {
                    // System.out.println("\tIgnoring input. You entered " + scanner.next()  + " and that is not a valid number.");
                    break;
                }
            }

            if (numberCount > 0) {
                average = sum / numberCount;
                average = Math.round((double) (sum / numberCount));
                average = Math.round((double) sum / numberCount); // This is the correct solution
            }
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
