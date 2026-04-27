package com.problems;

public class SmallestDigitSum {
    public static int solution(int N) {
        int numberOfNines = N / 9;
        int firstDigit = N % 9;

        String result = "";
        if (firstDigit > 0) {
            result += firstDigit;
        }

        for (int i = 0; i < numberOfNines; i++) {
            result += "9";
        }
        return Integer.parseInt(result);
    }
}
