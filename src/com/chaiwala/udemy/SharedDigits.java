package com.chaiwala.udemy;

public class SharedDigits {
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99) {
            return false;
        }

        if (num2 < 10 || num2 > 99) {
            return false;
        }

        char[] num1Chars = (String.valueOf(num1)).toCharArray();
        char[] num2Chars = (String.valueOf(num2)).toCharArray();

        for (char c1 : num1Chars) {
            for (char c2: num2Chars) {
                if (c1 == c2) {
                    return true;
                }
            }
        }

        return false;
    }
}
