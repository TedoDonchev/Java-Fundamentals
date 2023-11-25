package com.company;

import java.util.Scanner;

public class _02_CharacterMultiplier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        String str1 = input[0];
        String str2 = input[1];

        int sum = multiplyAsciiCommon(str1, str2);

        System.out.println(sum);

    }

    public static int multiplyAsciiCommon(String str1, String str2) {

        int sum = 0;
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {

            sum +=  (int) str1.charAt(i) * (int) str2.charAt(i);

        }

        if (str1.length() > str2.length()) {
            sum += multiplyAsciiRest(str1, Math.min(str1.length(), str2.length()));
        } else if (str1.length() < str2.length()) {
            sum += multiplyAsciiRest(str2, Math.min(str1.length(), str2.length()));
        }

        return sum;
    }

    public static int multiplyAsciiRest(String str, int startIndex) {

        int sum = 0;
        for (int i = startIndex; i < str.length(); i++) {
            sum += (int) str.charAt(i);
        }

        return sum;
    }

}
