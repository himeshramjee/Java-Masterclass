package com.chaiwala.udemy;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        if (number < 10){
            if (number % 2 == 0) {
                return number;
            } else {
                return 0;
            }
        }

        int eventDigitSum = 0;
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            if (remainder % 2 == 0) {
                eventDigitSum += remainder;
            }
            number = number / 10;
        }

        return eventDigitSum;
    }
}
