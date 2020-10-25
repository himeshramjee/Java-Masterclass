package com.chaiwala.udemy;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            System.out.println("Invalid input values");
            return -1;
        }

        double bucketsToBuy = 0;
        double wallArea = width * height;
        System.out.println("Wall area: " + wallArea);
        double areaCoveredByHomeBuckets = (areaPerBucket * extraBuckets);
        System.out.println("Home buckets area: " + areaCoveredByHomeBuckets);

        if (wallArea > areaCoveredByHomeBuckets){
            double wallAreaNotCoveredByHomeBuckets = wallArea - areaCoveredByHomeBuckets;
            System.out.println("Wall area to cover: " + wallAreaNotCoveredByHomeBuckets);
            bucketsToBuy = Math.ceil(wallAreaNotCoveredByHomeBuckets / areaPerBucket);
        }

        return (int) bucketsToBuy;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double bucketsToBuy = 0;

        bucketsToBuy = Math.ceil(area / areaPerBucket);

        return (int) bucketsToBuy;
    }
}
