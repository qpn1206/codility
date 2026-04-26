package com.problems;

import java.util.HashMap;
import java.util.Map;

public class CountBananas {
    public static int solution(String S) {

        Map<String, Integer> counts = new HashMap<>();
        counts.put("B", 0);
        counts.put("A", 0);
        counts.put("N", 0);

        for (String word : S.split("")) {
            counts.computeIfPresent(word, (key, val) -> val + 1);
        }
        return Math.min(counts.get("B"),
                Math.min((int) Math.floor(counts.get("A") / 3),
                        (int) Math.floor(counts.get("N") / 2)));
    }
}
