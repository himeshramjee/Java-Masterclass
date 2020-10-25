package com.chaiwala.udemy;

public class Odd {
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }

        if (number % 2 != 0) {
            return true;
        }

        return false;
    }

    public static int sumOdd(int start, int end) {
        if (start <= 0 || end <= 0) {
            return -1;
        } else if (end < start) {
            return -1;
        }

        int totalSum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                totalSum += i;
            }
        }

        return totalSum;
    }
}
