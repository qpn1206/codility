package com.problems;

public class EraseOneLetter {

    public static String solution(String S) {
        for (int i = 0; i < S.length() - 1; i++) {
            // If next letter is smaller than current letter,
            // we can remove current letter to get a smaller string
            if (S.charAt(i) > S.charAt(i + 1)) {
                return S.substring(0, i) + S.substring(i + 1);
            }
        }
        return S.substring(0, S.length() - 1);
    }
}
