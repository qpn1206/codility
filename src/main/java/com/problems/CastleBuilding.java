package com.problems;

public class CastleBuilding {

    public static int solution(int[] A) {
        int length = A.length;

        int result = 1;
        int i = 1;
        while (i < length && A[i] == A[i - 1]) {
            i++;
        }
        if (i == length) {
            return 1;
        }

        boolean isTaller = A[i] > A[i - 1];
        while (i < length) {
            if (A[i] == A[i - 1]) {
                i++;
                continue;
            }
            boolean isNextBlockTaller = A[i] > A[i - 1];

            if (isNextBlockTaller != isTaller) {
                result++;
                isTaller = isNextBlockTaller;
            }
            i++;
        }
        return result + 1;
    }
}
