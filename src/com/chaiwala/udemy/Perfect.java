package com.chaiwala.udemy;

public class Perfect {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sumFactors = 0;

        for (int f = 1; f < number; f++) {
            if (number % f == 0) {
                sumFactors+=f;
            }
        }

        return sumFactors == number;
    }
}
