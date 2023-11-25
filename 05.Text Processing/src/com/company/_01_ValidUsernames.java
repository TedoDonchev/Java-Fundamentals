package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class _01_ValidUsernames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(", ");

        for (String username : input) {
            boolean isValid = isValidUsername(username);

            if (isValid) {
                System.out.println(username);
            }
        }


    }

    public static boolean isValidUsername(String username) {
        if (username.length() <= 3 || username.length() >= 16) {
            return false;
        }

        char[] allowedCharacters = new char[] {'-','_'};

        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }

        return true;
    }
}
