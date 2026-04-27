package com.problems;

public class SameDigitMerge {

    private static int getFirstDigit(int number) {
        while (number >= 10) {
            number /= 10;
        }
        return number;
    }

    public static int solution(int[] numbers) {
        int[] firstDigitCount = new int[10];
        int[] lastDigitCount = new int[10];

        for (int number : numbers) {
            int lastDigit = number % 10;
            int firstDigit = getFirstDigit(number);

            firstDigitCount[firstDigit]++;
            lastDigitCount[lastDigit]++;
        }
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += firstDigitCount[i] * lastDigitCount[i];
        }
        return result;
    }
}
