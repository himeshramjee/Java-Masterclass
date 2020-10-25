package com.chaiwala.udemy;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void readNumbers(int maxNumbersToRead) {
        if (maxNumbersToRead < 1) {
            System.out.println("Invalid numbers count value.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        int sumNumbers = 0;
        int currentNumber = 0;
        try {
            System.out.println("Reading " + maxNumbersToRead + " numbers.");
            for (int i = 1; i <= maxNumbersToRead; i++) {
                System.out.print("Enter number #" + i + ": ");
                if (scanner.hasNextInt()){
                    sumNumbers += scanner.nextInt();
                } else {
                    System.out.println("\tIgnoring input. You entered " + scanner.next()  + " and that is not a valid number.");
                }
            }
        } catch(Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
           scanner.close();
        }

        System.out.println("The total sum is: " + sumNumbers);
    }
}
