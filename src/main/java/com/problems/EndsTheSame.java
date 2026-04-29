package com.problems;

public class EndsTheSame {
    public static int solution(String S) {
        int result = 0;
        int length = S.length();
        for (int i = 0; i < length; i++) {
            // (i + 1 + length) % length is used to get the next index in a circular
            int nextIndex = (i + 1 + length) % length;
            if (S.charAt(i) == S.charAt(nextIndex)) {
                result++;
            }
        }
        return result;
    }
}
