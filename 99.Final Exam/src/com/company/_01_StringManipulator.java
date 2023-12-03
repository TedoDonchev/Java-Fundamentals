package com.company;

import java.util.Scanner;

public class _01_StringManipulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        String input = sc.nextLine();

        sb.append(input);

        while(true) {
            String[] command = sc.nextLine().split(" ");

            if (command[0].equals("End")){
                break;
            }

            if (command[0].equals("Translate")) {
                replaceChar(sb, command[1], command[2]);
                System.out.println(sb);
            } else if (command[0].equals("Includes")) {
                String substr = command[1];

                if (sb.indexOf(substr) != -1 ) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }


            } else if (command[0].equals("Start")) {
                String substr = command[1];

                if (sb.indexOf(substr) == 0 ) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (command[0].equals("Lowercase")) {
                lowerCase(sb);
                System.out.println(sb);
            } else if (command[0].equals("FindIndex")) {
                String letter = command[1];
                System.out.println(sb.lastIndexOf(letter));
            } else if (command[0].equals("Remove")) {
                int start = Integer.parseInt(command[1]);
                int count = Integer.parseInt(command[2]);
                sb.delete(start, start+count);

                System.out.println(sb);
            }
        }
    }

    private static void lowerCase(StringBuilder sb) {
        String lowercase = sb.toString().toLowerCase();
        sb.setLength(0);
        sb.append(lowercase);
    }

    public static void replaceChar(StringBuilder sb, String oldChar, String newChar) {
        if (sb.indexOf(oldChar) != -1) {
            String temp = sb.toString();
            sb.setLength(0);
            sb.append(temp.replaceAll(oldChar, newChar));
        }



    }
}
