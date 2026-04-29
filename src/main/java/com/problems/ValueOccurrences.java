package com.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ValueOccurrences {
    public static int solution(int[] A) {
        Map<Integer, Integer> numberToAppearance = new HashMap<>();
        for (int number : A) {
            numberToAppearance.put(number, numberToAppearance.getOrDefault(number, 0) + 1);
        }

        int result = 0;
        for (Entry<Integer, Integer> entry : numberToAppearance.entrySet()) {
            int number = entry.getKey();
            int appearances = entry.getValue();
            int stepsToAdd = Math.abs(appearances - number);
            int stepsToRemove = appearances;
            result += Math.min(stepsToAdd, stepsToRemove);
        }
        return result;
    }
}
