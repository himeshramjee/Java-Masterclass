package com.chaiwala.udemy;

public class DayOfWeek {
    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Day is: Sunday");
                break;
            case 1:
                System.out.println("Day is: Monday");
                break;
            case 2:
                System.out.println("Day is: Tuesday");
                break;
            case 3:
                System.out.println("Day is: Wednesday");
                break;
            case 4:
                System.out.println("Day is: Thursday");
                break;
            case 5:
                System.out.println("Day is: Friday");
                break;
            case 6:
                System.out.println("Day is: Saturday");
                break;
            default:
                System.out.println("Invalid day of week value: " + day);
        }
    }
}
