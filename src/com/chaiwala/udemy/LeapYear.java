package com.chaiwala.udemy;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 10000) {
            // System.out.println("Invalid Year");
            return false;
        }

        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400) == 0;
    }
}
