package com.problems;

import java.util.HashMap;
import java.util.Map;

public class ShortestUniqueSubstring {
    public static int solution(String S) {
        int length = S.length();

        // Find the shortest unique substring start with
        // all substring with 2 length, then 3 length,...
        for (int subLength = 1; subLength <= length; subLength++) {
            Map<String, Integer> subStringCount = new HashMap<>();

            for (int i = 0; i <= length - subLength; i++) {
                String subString = S.substring(i, i + subLength);
                subStringCount.put(subString, subStringCount.getOrDefault(subString, 0) + 1);
            }

            for (int count : subStringCount.values()) {
                if (count == 1) {
                    return subLength;
                }
            }
        }
        return length;
    }
}
