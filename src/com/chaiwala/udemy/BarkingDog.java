package com.chaiwala.udemy;

public class BarkingDog {

    public static boolean bark(boolean barking, int hourOfDay) {
        if (!isHourOfDayValid(hourOfDay)) {
            // System.out.println("Invalid Hour Of Day");
            return false;
        }

        return barking && isQuietTime(hourOfDay);
    }

    private static boolean isHourOfDayValid(int hourOfDay) {
        return (hourOfDay >= 0) && (hourOfDay <= 23) ? true : false;
    }

    private static boolean isQuietTime(int hourOfDay) {
        return (hourOfDay < 8) || (hourOfDay > 22) ? true : false;
    }
}
