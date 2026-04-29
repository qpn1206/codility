package com.example;

import java.util.Arrays;
import com.problems.AsphaltPatches;
import com.problems.CardPayments;
import com.problems.CastleBuilding;
import com.problems.CommonLetter;
import com.problems.CountBananas;
import com.problems.CreatePalindrome;
import com.problems.DiversityString;
import com.problems.EndsTheSame;
import com.problems.EraseOneLetter;
import com.problems.EvenPairsOnCycle;
import com.problems.ForbiddenTriosSwaps;
import com.problems.FormatArray;
import com.problems.SameDigitMerge;
import com.problems.ShortestUniqueSubstring;
import com.problems.SmallestDigitSum;
import com.problems.TheWidestPath;
import com.problems.ValueOccurrences;

public class Main {
    public static void main(String[] args) {
        int[] X = {1, 8, 7, 3, 4, 1, 8};
        int[] Y = {};
        System.out.println("The Widest Path: " + TheWidestPath.solution(X, Y));


        // int[] A = {100, 100, 100, -10};
        // String[] D = {"2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29"};;
        // int[] A = {180, -50, -25, -25};
        // String[] D = {"2020-01-01", "2020-01-01", "2020-01-01", "2020-01-31"};
        // int[] A = {1, -1, 0, -105, 1};
        // String[] D = {"2020-12-31", "2020-04-04", "2020-04-04", "2020-04-14", "2020-07-12"};
        // int[] A = {100, 100, -10, -20, -30};
        // String[] D = {"2020-01-01", "2020-02-01", "2020-02-11", "2020-02-05", "2020-02-08"};
        int[] A = {-60, 60, -40, -20};
        String[] D = {"2020-10-01", "2020-02-02", "2020-10-10", "2020-10-30"};
        System.out.println("Card payments: " + CardPayments.solution(A, D));


        int[] C = {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5};
        System.out.println("Castle building: " + CastleBuilding.solution(C));


        // String[] S = {"abc", "bca", "dbe"};
        // String[] S = {"zzzz", "ferz", "zdsr", "fgtd"};
        // String[] S = {"gr", "sd", "rg"};
        String[] S = {"bdafg", "ceagi"};
        System.out.println("Common letter: " + Arrays.toString(CommonLetter.solution(S)));

        // String bananas = "NAABXXAN";
        // String bananas = "NAANAAXNABABYNNBZ";
        String bananas = "QABAAAWOBL";
        System.out.println("Count Bananas: " + CountBananas.solution(bananas));

        // String palindrome = "?ab??a";
        // String palindrome = "bab??a";
        String palindrome = "?a?";
        System.out.println("Create Palindrome: " + CreatePalindrome.solution(palindrome));


        System.out.println("Diversity String: " + DiversityString.solution(3));
        System.out.println("Diversity String: " + DiversityString.solution(5));
        System.out.println("Diversity String: " + DiversityString.solution(30));

        // String eraseLetter = "acb";
        // String eraseLetter = "hot";
        String eraseLetter = "codility";
        // String eraseLetter = "aaaa";
        System.out.println("Erase One Letter: " + EraseOneLetter.solution(eraseLetter));


        // int[] circle = {4, 2, 5, 8, 7, 3, 7};
        // int[] circle = {14, 21, 16, 35, 22};
        int[] circle = {5, 5, 5, 5, 5, 5};
        System.out.println("Even Pairs on Cycle: " + EvenPairsOnCycle.solution(circle));

        // String forbiddenTrios = "baaaaa";
        // String forbiddenTrios = "baaabbaabbba";
        String forbiddenTrios = "baabab";
        System.out
                .println("Forbidden Trios Swaps: " + ForbiddenTriosSwaps.solution(forbiddenTrios));

        FormatArray.solution(new int[] {4, 35, 80, 123, 12345, 44, 8, 5, 24, 3}, 4);
        // FormatArray.solution(new int[] {4, 35, 80, 123, 12345, 44, 8, 5, 24, 3, 22, 35}, 4);
        // FormatArray.solution(new int[] {4, 35, 80, 123, 44, 8, 5}, 10);


        int[] numbers = {30, 12, 29, 91};
        // int[] numbers = {122, 21, 21, 23};
        System.out.println("The Same digit merge: " + SameDigitMerge.solution(numbers));


        // String uniqueSubstring = "abaaba";
        // String uniqueSubstring = "zyzyzyz";
        String uniqueSubstring = "aabbbabaaa";
        System.out.println("Shortest Unique Substring: "
                + ShortestUniqueSubstring.solution(uniqueSubstring));


        System.out.println("Smallest Digit Sum: " + SmallestDigitSum.solution(16));
        System.out.println("Smallest Digit Sum: " + SmallestDigitSum.solution(19));
        System.out.println("Smallest Digit Sum: " + SmallestDigitSum.solution(7));


        // int[] occurrences = {1, 1, 3, 4, 4, 4};
        // int[] occurrences = {1, 2, 2, 2, 5, 5, 5, 8};
        // int[] occurrences = {1, 1, 1, 1, 3, 3, 4, 4, 4, 4, 4};
        int[] occurrences = {10, 10, 10};
        System.out.println("Value Occurrences: " + ValueOccurrences.solution(occurrences));


        // String road = ".x..x";
        // String road = "x.xxxxx.x.";
        // String road = "xx.xxx..";
        String road = "xxxx";
        System.out.println("Asphalt Patches: " + AsphaltPatches.solution(road));


        // String endTheSame = "abbaa";
        // String endTheSame = "aaaa";
        String endTheSame = "abab";
        System.out.println("Ends the same: " + EndsTheSame.solution(endTheSame));
    }
}
