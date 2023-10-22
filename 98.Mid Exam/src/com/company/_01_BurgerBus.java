package com.company;

import java.util.Scanner;

public class _01_BurgerBus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfCities = Integer.parseInt(sc.nextLine());
        double totalProfit = 0;

        for (int i = 1; i <= numberOfCities; i++) {

            String cityName = sc.nextLine();
            double income = Double.parseDouble(sc.nextLine());
            double expenses = Double.parseDouble(sc.nextLine());

            double profit = 0;

            if (i % 3 == 0 && i % 5 != 0) {
                expenses = expenses * 1.5;
            }

            if (i % 5 == 0) {
                income = income * 0.9;
            }

            profit = income - expenses;
            totalProfit += profit;
            System.out.printf("In %s Burger Bus earned %.2f leva. %n", cityName, profit);


        }

        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
    }
}
