package com.chaiwala.udemy;

public class MegaBytesAndKiloBytes {

    private static String MSG_MB_KB = "%s KB = %s MB and %s KB";
    private static int ONE_MB_IN_KB = 1024;

    public MegaBytesAndKiloBytes() {
        System.out.println("MegaBytesAndKiloBytes: Explicit default Constructor invoked");
    }

    /**
     * Calculates and prints MegaByte or KiloByte value based on kB.
     * @param kB value to convert to Mega or Kilo Byte
     */
    public static void printMegaBytesAndKiloBytes(int kB) {

        if (kB < 0) {
            System.out.println("Invalid kB value (must be > 0)");
            return;
        }

        System.out.printf(MSG_MB_KB, Integer.toString(kB), Integer.toString(kB / ONE_MB_IN_KB), Integer.toString(kB % ONE_MB_IN_KB));
    }
}
