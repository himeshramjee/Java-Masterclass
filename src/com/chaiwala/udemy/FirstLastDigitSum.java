package com.chaiwala.udemy;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        if (number < 10){
            return number * 2;
        }

        int lastDigit = number % 10;

        while (number >= 10) {
            number = number / 10;
        }

        System.out.printf("Return sum of %s and %s\n\t", number, lastDigit);
        return number + lastDigit;
    }
}
