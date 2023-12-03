package com.company;

import java.util.Scanner;

public class _01_WorldTour {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    StringBuilder cities = new StringBuilder();

        String input = sc.nextLine();

        cities.append(input);


        while (true) {
            String command = sc.nextLine();

            if (command.equals("Travel")) {
                break;
            }

            String[] tokens = command.split(":");

            String action = tokens[0];

            if (action.equals("Add Stop")) {
                int index = Integer.parseInt(tokens[1]);
                String city = tokens[2];
                insertString(cities, city, index);
            } else if (action.equals("Remove Stop")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);
                removeIndex(cities, startIndex, endIndex);
            } else if (action.equals("Switch")) {
                String oldStr = tokens[1];
                String newStr = tokens[2];
                removeStr(cities, oldStr, newStr);

            }

            System.out.println(cities);

        }


        System.out.print("Ready for world tour! Planned stops: ");
        System.out.println(cities);

    }

    private static void removeStr(StringBuilder cities, String oldStr, String newStr) {
        if (cities.indexOf(oldStr) != -1) {
            String temp = cities.toString();
            cities.setLength(0);
            cities.append(temp.replaceAll(oldStr, newStr));

        }
    }

    private static void removeIndex(StringBuilder cities, int startIndex, int endIndex) {
        if (startIndex < cities.length() && endIndex < cities.length()) {
            cities.delete(startIndex, endIndex + 1);
        }

    }

    private static void insertString(StringBuilder cities, String city, int index) {
        if (index < cities.length()) {
            cities.insert(index, city);
        }

    }
}
