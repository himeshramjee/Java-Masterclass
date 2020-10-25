package com.chaiwala.udemy;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int divisorIndex = first > second ? second : first;

        for (int d = divisorIndex; d > 0; d--) {
            if ((first % d == 0) && (second % d == 0)) {
                return d;
            }
        }

        return -1;
    }
}
