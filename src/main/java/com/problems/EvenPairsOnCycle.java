package com.problems;

public class EvenPairsOnCycle {
    private static int findPair(int[] A, int start, int end) {
        int count = 0;
        while (start < end) {
            if (A[start] % 2 == A[(start + 1)] % 2) {
                count++;
                start += 2;
            } else {
                start++;
            }
        }
        return count;
    }

    public static int solution(int[] A) {
        int length = A.length;
        // If sum of first and last is even, find pairs for remaining elements
        // and add 1
        if (A[0] % 2 == A[length - 1] % 2) {
            return findPair(A, 1, length - 2) + 1;
        }
        return findPair(A, 0, length - 1);
    }
}
