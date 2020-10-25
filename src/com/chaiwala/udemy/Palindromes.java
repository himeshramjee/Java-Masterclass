package com.chaiwala.udemy;

public class Palindromes {
    public static boolean isPalindrome(int number) {
        if (number == 0) {
            return true;
        }

        int normalNumber = Math.abs(number);
        String strReversedNumber = "";

        int remainder = normalNumber;
        while (remainder > 0) {
            strReversedNumber += remainder % 10;
            remainder = remainder / 10;
            // System.out.printf("\tRemainder is %s\n", remainder);
        }

        System.out.printf("Comparing %s and %s\n\t", normalNumber, strReversedNumber);
        if (normalNumber == Integer.valueOf(strReversedNumber).intValue()) {
            return true;
        }

        return false;
    }
}
