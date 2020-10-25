package com.chaiwala.udemy;

public class LastDigitCheck {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1)) {
            return false;
        }

        if (!isValid(num2)) {
            return false;
        }

        if (!isValid(num3)) {
            return false;
        }

        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num3LastDigit = num3 % 10;

        if (num1LastDigit == num2LastDigit) {
            return true;
        }

        if (num1LastDigit == num3LastDigit) {
            return true;
        }

        if (num2LastDigit == num3LastDigit) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }

        return true;
    }
}
