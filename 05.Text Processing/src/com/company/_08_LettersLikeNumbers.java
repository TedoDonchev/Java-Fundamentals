package com.company;

import java.util.Scanner;

public class _08_LettersLikeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");

        StringBuilder str = new StringBuilder();
        double sum = 0;

        for (String sequence : input) {
            str.setLength(0);
            str.append(sequence);

            double temp = 0;

            char firstLetter = str.charAt(0);
            char secondLetter = str.charAt(str.length()-1);
            double number = Double.parseDouble(str.substring(1,str.length()-1));

            temp += checkFirstLetter(firstLetter, number);
            sum += checkSecondLetter(secondLetter, temp);

        }

        System.out.printf("%.2f", sum);
    }

    public static double checkFirstLetter(char letter, double num) {
        if (Character.isUpperCase(letter)) {
            num = num / ((int) letter - 64);
        } else {
            num = num * ((int) letter - 96);
        }

        return num;
    }

    public static double checkSecondLetter(char letter, double num) {
        if (Character.isUpperCase(letter)) {
            num = num - ((int) letter - 64);
        } else {
            num = num + ((int) letter - 96);
        }

        return num;
    }
}
