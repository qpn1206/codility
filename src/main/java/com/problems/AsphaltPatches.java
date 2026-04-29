package com.problems;

public class AsphaltPatches {
    public static int solution(String S) {
        int patches = 0;
        int i = 0;
        while (i < S.length()) {
            if (S.charAt(i) == 'x') {
                patches++;
                i += 3;
            } else {
                i++;
            }
        }
        return patches;
    }
}
