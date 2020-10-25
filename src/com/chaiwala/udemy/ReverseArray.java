package com.chaiwala.udemy;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] arrInput) {
        System.out.println("arrInput: " + Arrays.toString(arrInput));

        System.out.println("\tReversing array...");
        int iTemp = 0;
        int i = 0, j = arrInput.length - 1;

        while (i <= j) {
            System.out.print("\tIndices: (" + i + ", " + j + ") - ");
            System.out.println("Values: (" + arrInput[i] + ", " + arrInput[j] + ")");
            iTemp = arrInput[i];
            arrInput[i] = arrInput[j];
            arrInput[j] = iTemp;
            i++;
            j--;
        }

        System.out.println("arrInput: " + Arrays.toString(arrInput));
    }
}