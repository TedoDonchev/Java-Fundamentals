package com.company;

import java.util.Scanner;

public class _07_StringExplosion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        StringBuilder initialString = new StringBuilder();
        initialString.append(input);

        //peter>2sis>1a>2akarate>4hexmaster
        //abv>1>1>2>2asdasd


        for (int i = 0; i < initialString.length(); i++) {

            if (initialString.charAt(i) == '>') {
                int power = Integer.parseInt(Character.toString(initialString.charAt(i+1)));

                for (int j = i+1; j <= i+power; j++) {

                    if (initialString.charAt(j) == '>') {
                        power += Integer.parseInt(Character.toString(initialString.charAt(j+1)));
                    }

                }

                initialString.delete(i+1,i+1+power);
            }

        }

//        int substrIndex = 0;
//        for (int i = 0; i < input.length(); i++) {
//
//            if (input.charAt(i) == '>') {
//                int power = Integer.parseInt(Character.toString(input.charAt(i+1)));
//
//                String substr = input.substring(substrIndex, i+1);
//                output.append(substr);
//                substrIndex = i+1 + power;
//                //i = substrIndex;
//            }
//
//
//        }

        System.out.println(initialString);
    }
}
