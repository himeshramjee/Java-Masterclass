package com.chaiwala.udemy;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        String[] numbersMap = new String[11];
        numbersMap[0] = "Zero";
        numbersMap[1] = "One";
        numbersMap[2] = "Two";
        numbersMap[3] = "Three";
        numbersMap[4] = "Four";
        numbersMap[5] = "Five";
        numbersMap[6] = "Six";
        numbersMap[7] = "Seven";
        numbersMap[8] = "Eight";
        numbersMap[9] = "Nine";
        numbersMap[10] = "Ten";

        // System.out.printf("%s has the following digits ", number);

        int digitCount = NumberToWords.getDigitCount(number);
        if (digitCount == 1) {
            System.out.println(numbersMap[number]);
            return;
        }

        int reversedNumber = NumberToWords.reverse(number);
        int currentDigit = 0;
        for (int i = 0; i < digitCount; i++) {
            currentDigit = reversedNumber % 10;
            reversedNumber = reversedNumber / 10;

            System.out.print(numbersMap[currentDigit]);
            if((i + 1) != digitCount) {
                System.out.print(' ');
            }
        }

        System.out.println();
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        int currentDigit = 0;
        boolean isNegative = number < 0 ? true : false;
        if (isNegative) {
            number = number * -1;
        }

        while (number > 0) {
            currentDigit = number % 10;
            number = number / 10;
            reversedNumber = (reversedNumber * 10) + currentDigit;
        }

        return isNegative ? reversedNumber * -1 : reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return -1;
        }

        if (number < 10) {
            return 1;
        }

        int digitCounter = 0;
        while (number > 0) {
            number = number / 10;
            digitCounter++;
        }

        return digitCounter;
    }
}
