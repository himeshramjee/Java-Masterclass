package com.chaiwala.udemy;

public class DaysInMonth {

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if (LeapYear.isLeapYear(year)){
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 30;
        }
    }
}
