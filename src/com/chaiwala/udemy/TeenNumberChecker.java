package com.chaiwala.udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeenNumberChecker {

    public static boolean hasTeen (int x, int y, int z) {
        // return method1(x, y, z);
        return method2(x, y, z);
    }

    private static boolean method1(int x, int y, int z) {
        List<Integer> ageList = new ArrayList<>(Arrays.asList(x, y, z));
        List<Boolean> teenList = new ArrayList<>(3);

        ageList.forEach(age -> {
            if (age >= 13 && age <= 19) {
                teenList.add(true);
            } else {
                teenList.add(false);
            }
        });

        return teenList.contains(true);
    }

    private static boolean method2(int x, int y, int z) {
        if (x >= 13 && x <= 19) {
            return true;
        }

        if (y >= 13 && y <= 19) {
            return true;
        }

        if (z >= 13 && z <= 19) {
            return true;
        }

        return false;
    }
}
