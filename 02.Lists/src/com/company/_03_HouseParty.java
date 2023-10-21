package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_HouseParty {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(sc.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 0; i < numberOfCommands; i++) {

            List<String> input = Arrays.stream(sc.nextLine().split(" "))
                    .collect(Collectors.toList());

            String currentGuest = input.get(0);

            boolean isOnList = checkList(guests,currentGuest);

            if (input.contains("not")) {
                if (isOnList) {
                    guests.remove(currentGuest);
                } else {
                    System.out.printf("%s is not in the list! %n", currentGuest);
                }
            } else {
                if (isOnList) {
                    System.out.printf("%s is already in the list! %n", currentGuest);
                } else {
                    guests.add(currentGuest);
                }
            }

        }

        printList(guests);
    }

    public static boolean checkList(List<String> names, String name) {

        if (names.contains(name)) {
            return true;
        }
        return false;
    }

    public static void printList(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
