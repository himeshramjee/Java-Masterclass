package com.chaiwala.udemy;

public class DigitsSum {
    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        char[] chrNumbers = String.valueOf(number).toCharArray();

        for (int i = 0; i < chrNumbers.length; i++) {
            System.out.println("\t adding " + chrNumbers[i]);
            sum += Character.getNumericValue(chrNumbers[i]);
        }
        
        return sum;
    }
}
