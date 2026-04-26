package com.problems;

public class CreatePalindrome {
    public static String solution(String S) {
        String[] chars = S.split("");
        int left = 0;
        int right = S.length() - 1;

        while (left <= right) {
            String currLeft = chars[left];
            String currRight = chars[right];

            if (currLeft.equals(currRight)) {
                if (currLeft.equals("?")) {
                    chars[left] = "a";
                    chars[right] = "a";
                }
            } else {
                if (currLeft.equals("?")) {
                    chars[left] = currRight;
                } else if (currRight.equals("?")) {
                    chars[right] = currLeft;
                } else {
                    return "NO";
                }
            }
            left++;
            right--;
        }
        return String.join("", chars);
    }
}
