package com.chaiwala.udemy;

public class Sum3And5 {
    public static void sum35() {
        int totalSum = 0;
        int dividendCount = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                totalSum += i;
                dividendCount++;
                System.out.println("Found dividend: " + i);
            }

            if (dividendCount == 5) {
                break;
            }
        }

        System.out.println("Total sum is: " + totalSum);
    }
}
