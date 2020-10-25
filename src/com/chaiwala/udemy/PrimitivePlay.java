package com.chaiwala.udemy;

public class PrimitivePlay {

    // 64 bit
    private static long minLongValue = -9_223_372_036_854_775_808L;
    private static long maxLongValue = 9_223_372_036_854_775_807L;

    // 32 bit
    private static int minIntValue = -2_147_483_648;
    private static int maxIntValue = 2147483647;

    // 16 bit
    private static short minShortValue = -32768;
    private static short maxShortValue = 32767;

    // 8 bit
    private static byte minByteValue = -128;
    private static byte maxByteValue = 127;

    // 64 bit 16 precision
    private static double minDoubleValue = Double.MIN_VALUE;
    private static double maxDoubleValue = Double.MAX_VALUE;

    // 32 bit 7 precision
    private static float minFloatValue = Float.MIN_VALUE;
    private static float maxFloatValue = Float.MAX_VALUE;

    // 16 bit
    private static char charOne = '\u00A9';

    // 1 bit
    private static boolean boolOne = true;

    //
    private static String strOne = "one-string";

    public PrimitivePlay() {
        Long sumLongs = minLongValue + maxLongValue;
        printThis("longs", sumLongs.toString());

        Integer sumInts = minIntValue + maxIntValue;
        printThis("ints", sumInts.toString());

        Short sumShorts = minShortValue += maxShortValue; // implicit cast to byte with +=
        printThis("shorts", sumShorts.toString());

        Byte sumBytes = minByteValue += maxByteValue;
        printThis("bytes", sumBytes.toString());

        Float sumFloats = minFloatValue + maxFloatValue;
        printThis("floats", sumFloats.toString());

        Double sumDoubles = minDoubleValue + maxDoubleValue;
        printThis("doubles", sumDoubles.toString());

        printThis("char", String.valueOf(charOne));

        printThis("boolean", String.valueOf(boolOne));

        printThis("String", strOne);
    }

    private static void printThis(String type, String value){
        System.out.println(type + " : " + value);
    }
}
