package com.problems;

public class FormatArray {
    private static void printBorder(int cols, int width) {
        for (int i = 0; i < cols; i++) {
            System.out.print("+");
            for (int j = 0; j < width; j++) {
                System.out.print("-");
            }
        }
        System.out.println("+");
    }

    public static void solution(int[] A, int K) {
        int length = A.length;

        // Find max width
        int maxLen = 0;
        for (int num : A) {
            maxLen = Math.max(maxLen, String.valueOf(num).length());
        }

        int lastCols = 0;

        int i = 0;
        while (i < length) {
            lastCols = 0;
            int rowLength = Math.min(i + K, length);
            int cols = Math.min(K, rowLength - i);

            // Print top border
            printBorder(cols, maxLen);

            // Print numbers row
            for (int j = i; j < rowLength; j++) {
                System.out.print("|");
                String numStr = String.valueOf(A[j]);
                int padding = maxLen - numStr.length();
                for (int p = 0; p < padding; p++) {
                    System.out.print(" ");
                }
                System.out.print(numStr);
                lastCols++;
            }
            System.out.println("|");

            i = rowLength;
        }
        // Print bottom border of last row
        printBorder(lastCols, maxLen);
    }
}
