package com.company;

import java.util.Scanner;

public class _06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] charArr = input.toCharArray();
        StringBuilder output = new StringBuilder();

        output.append(charArr[0]);
        for (int i = 1; i < charArr.length; i++) {

            if (charArr[i] != charArr[i-1]) {
                output.append(charArr[i]);
            }
        }

        System.out.println(output);

    }
}
