package com.example;

import java.util.Arrays;
import com.problems.CardPayments;
import com.problems.CastleBuilding;
import com.problems.CommonLetter;
import com.problems.TheWidestPath;

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
    }
}
