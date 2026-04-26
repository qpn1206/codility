package com.problems;

public class DiversityString {

    public static String solution(int N) {
        // "letter occurs an equal number of times" so we find the maximum number of appearances for
        // each letter
        int distinctLetters = 1;
        if (N <= 26) {
            distinctLetters = N;
        } else {
            for (int k = 26; k >= 1; k--) {
                if (N % k == 0) {
                    distinctLetters = k;
                    break;
                }
            }
        }

        final int repeat = N / distinctLetters;
        String result = "";
        for (int i = 0; i < distinctLetters; i++) {
            result += String.valueOf((char) ('a' + i)).repeat(repeat);
        }
        return result;
    }
}
