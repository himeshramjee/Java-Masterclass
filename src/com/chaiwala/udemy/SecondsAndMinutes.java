package com.chaiwala.udemy;

import java.time.LocalDateTime;

public class SecondsAndMinutes {

    private static String OUTPUT_MSG = "%sh %sm %ss";

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0){
            return "Invalid minutes: " + minutes;
        }

        if (seconds < 0 || seconds > 59){
            return "Invalid seconds: " + seconds;
        }

        int hours = minutes / 60;
        int minutesRemaining = minutes % 60;

        if (hours > 24) {
            return "Invalid hours: " + hours;
        }

        LocalDateTime notNow = LocalDateTime.of(0, 1, 1, hours, minutesRemaining, seconds);
        return String.format("%tHh %tMm %tSs", notNow, notNow, notNow);
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0){
            return "Invalid seconds: " + seconds;
        }

        int minutes = seconds / 60;
        int secondsRemaining = seconds % 60;

        return getDurationString(minutes, secondsRemaining);
    }
}
