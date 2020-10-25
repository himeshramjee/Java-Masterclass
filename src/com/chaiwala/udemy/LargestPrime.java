package com.chaiwala.udemy;

public class LargestPrime {
    // I got knotted with a recursive solution and then found this
    // really simple non recursive solution in the Q&A.
    // https://www.udemy.com/course/java-the-complete-java-developer-course/learn/quiz/4448802#questions/8622344
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                System.out.println("\t (f) -> " + i);
                number /= i;
                i--;
            }
        }
        return number;
    }
}