package com.company;

import java.util.Scanner;

public class _04_CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int ascii = (int) input.charAt(i);
            ascii += 3;
            String newSymbol = Character.toString((char) ascii);
            strBuilder.append(newSymbol);
        }

        System.out.println(strBuilder);
    }
}
