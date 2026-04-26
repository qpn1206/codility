package com.problems;

public class ForbiddenTriosSwaps {
    public static int solution(String S) {
        int count = 0;
        for (int i = 0; i < S.length() - 2; i++) {
            if (S.charAt(i) == S.charAt(i + 1) && S.charAt(i) == S.charAt(i + 2)) {
                count++;
                i += 2;
            }
        }
        return count;
    }
}
