package com.problems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CardPayments {
    static class MonthData {
        int count;
        int sum;

        MonthData() {
            this.count = 0;
            this.sum = 0;
        }
    }


    public static int solution(int[] transactions, String[] transactionDates) {
        int balance = 0;

        // Initialize 12 months
        MonthData[] months = new MonthData[12];
        for (int i = 0; i < 12; i++) {
            months[i] = new MonthData();
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (int i = 0; i < transactions.length; i++) {
            int amount = transactions[i];
            LocalDate date = LocalDate.parse(transactionDates[i], formatter);
            int month = date.getMonthValue() - 1;

            balance += amount;

            if (amount < 0) {
                months[month].count++;
                months[month].sum += Math.abs(amount);
            }
        }

        int fee = 0;

        for (int m = 0; m < 12; m++) {
            int count = months[m].count;
            int sum = months[m].sum;

            if (!(count >= 3 && sum >= 100)) {
                fee += 5;
            }
        }

        return balance - fee;
    }
}
