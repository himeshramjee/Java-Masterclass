package com.chaiwala.udemy;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        x = x * 1000;
        y = y * 1000;

        Double xd = x;
        Double yd = y;

        return xd.intValue() == yd.intValue();
    }

    public static boolean isEqualByThreeDecimalPlaces(double x, double y) {
        x = x * 1000;
        y = y * 1000;

        return (int) x == (int) y;
    }
}
