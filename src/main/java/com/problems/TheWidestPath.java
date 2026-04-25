package com.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TheWidestPath {

    public static int solution(int[] X, int[] Y) {
        List<Integer> sortedX = Arrays.stream(X)
                .distinct()
                .sorted()
                .boxed()
                .collect(Collectors.toList());
        int max = 0;
        for (int i = 1; i < sortedX.size(); i++) {
            max = Math.max(max, sortedX.get(i) - sortedX.get(i - 1));
        }
        return max;
    }
}
