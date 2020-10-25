package com.chaiwala.udemy;

public class FlourPacker {
    public static boolean canPack(int bigBagCount, int smallBagCount, int goalKilos) {
        if (bigBagCount < 0) {
            return false;
        }

        if (smallBagCount < 0) {
            return false;
        }

        if (goalKilos < 0) {
            return false;
        }

        // Make constants
        final int bigBagSize = 5;
        final int smallBagSize = 1;

        int totalBigBagKilos = bigBagCount * bigBagSize;
        int totalSmallBagKilos = smallBagCount * smallBagSize;
        int totalKilos = totalBigBagKilos + totalSmallBagKilos;

        if (totalKilos < goalKilos) {
            // we can't meet the goalKilos
            return false;
        } else if (totalKilos == goalKilos) {
            // we've met the goalKilos (regardless of what the split between big and small is)
            return true;
        }
        // we're over the goalKilos so now we should check that we've used full bags only

        if (totalBigBagKilos < goalKilos) {
            // we can use all big bags
            int kilosUnderGoal = goalKilos - totalBigBagKilos;

            if (kilosUnderGoal % smallBagSize == 0) {
                // we could fill with whole small bags
                // FIXME: Possibly wrong assumption in line 39 even though all tests pass.
                System.out.println("\tFIXME: Possibly wrong assumption in line 39 even though all tests pass.");
                return true;
            } else {
                // we can't fill with whole small bags
                return false;
            }
        } else {
            // we have too many big bags
            int bigBagsNeeded = goalKilos / bigBagSize;
            if ( bigBagsNeeded <= 0) {
                return false;
            }
            int kilosToFillWithSmalls = goalKilos - (bigBagsNeeded * bigBagSize);

            if (kilosToFillWithSmalls % smallBagSize >= 0 ) {
                // we could fill remainder with whole small bags so check if we have enough small bags
                int smallBagsNeeded = kilosToFillWithSmalls / smallBagSize;
                if (smallBagCount >= smallBagsNeeded) {
                    return true;
                } else {
                    return false;
                }
            } else {
                // we can't fill with whole small bags
                return false;
            }
        }
    }
}
