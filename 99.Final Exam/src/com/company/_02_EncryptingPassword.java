package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_EncryptingPassword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Pattern pattern = Pattern.compile("^(.+)>(?<first>[0-9]{3})\\|(?<second>[a-z]{3})\\|(?<third>[A-Z]{3})\\|(?<fourth>[^\\<\\>]{3})<\\1$");

        int numberOfInputs = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < numberOfInputs; i++) {
            String input = sc.nextLine();

            Matcher matcher = pattern.matcher(input);

            if (!matcher.find()) {
                System.out.println("Try another password!");
                continue;
            }
            sb.append(matcher.group("first"));
            sb.append(matcher.group("second"));
            sb.append(matcher.group("third"));
            sb.append(matcher.group("fourth"));
            System.out.printf("Password: %s%n", sb);
            sb.setLength(0);

        }
    }
}
