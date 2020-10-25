package com.chaiwala.udemy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysChallenge {

    Integer[] iArr = new Integer[5];

    public ArraysChallenge() {
        Scanner scanner = new Scanner(System.in);

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number #" + i + ": ");
                if (scanner.hasNextInt()){
                    iArr[i] = Integer.valueOf(scanner.nextInt());
                } else {
                    System.out.println("\tIgnoring input. You entered " + scanner.next()  + " and that is not a valid number.");
                }
            }

        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public void printArray() {
        for (int i = 0; i < iArr.length; i++) {
            if (i == iArr.length - 1) {
                System.out.println(iArr[i]);
                break;
            }
            System.out.print(iArr[i] + ", ");
        }
    }

    public void sortArray() {
        Arrays.sort(iArr, Collections.reverseOrder());
        printArray();
    }

    public Integer[] getIntegers() {
        return iArr;
    }
}
