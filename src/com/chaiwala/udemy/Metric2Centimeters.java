package com.chaiwala.udemy;

public class Metric2Centimeters {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet < 0) {
            System.out.println("Invalid feet value: " + feet);
            return -1;
        }

        if (inches < 0 || inches > 12) {
            System.out.println("Invalid inches value: " + inches);
            return -1;
        }

        double feetInCm = feet * 30.48;
        double inchesInCm = inches * 2.54;
        double totalCm = feetInCm + inchesInCm;

        System.out.printf("%sft is equal to %scm\n", feet, feetInCm);
        System.out.printf("%sin is equal to %scm\n", inches, inchesInCm);
        System.out.printf("Total value is %scm\n", totalCm);

        return totalCm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0 || inches > 12) {
            System.out.println("Invalid inches value: " + inches);
            return -1;
        }

        double inchesInFeet = (int) inches / 12;
        double inchesRemaining = inches % 12;

        return calcFeetAndInchesToCentimeters(inchesInFeet, inchesRemaining);
    }
}
