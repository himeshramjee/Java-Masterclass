package com.chaiwala.udemy;

public class MinutesTo {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int days = (int) minutes / (24 * 60);
        int years = days / 365;
        long remainingDays = days % 365;

        System.out.printf("%s min = %s y and %s d\n", minutes, years, remainingDays);
    }
}
