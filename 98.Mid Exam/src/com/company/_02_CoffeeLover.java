package com.company;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_CoffeeLover {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> coffeeList = Arrays.stream(sc.nextLine().split(" "))
                .collect(Collectors.toList());


        int numberOfCommands = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {

            String[] command = sc.nextLine().split(" ");

            switch (command[0]) {
                case "Include":
                    coffeeList.add(command[1]);
                    break;
                case "Remove":
                    if (command[1].equals("last")) {
                        removeLastElements(coffeeList, Integer.parseInt(command[2]));
                    } else {
                        removeFirstElements(coffeeList, Integer.parseInt(command[2]));
                    }
                    break;
                case "Prefer":
                    changePlaces(coffeeList, Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                case "Reverse":
                    Collections.reverse(coffeeList);
                    break;

            }
        }
        System.out.println("Coffees:");
        System.out.println(String.join(" ", coffeeList));
    }

    public static String removeLastElements(List<String> coffeeList, int removedElements) {
        if (coffeeList.size() < removedElements) {
            return "List is shorter than removed elements";
        }

        int listSize = coffeeList.size();
        for (int i = listSize - 1; i > listSize - 1 - removedElements; i--) {
            coffeeList.remove(i);
        }

        return "Ok";
    }


    public static String removeFirstElements(List<String> coffeeList, int removedElements) {
        if (coffeeList.size() < removedElements) {
            return "List is shorter than removed elements";
        }


        int k = 0;
        for (int i = 0; k < removedElements; i++) {
            coffeeList.remove(i);
            k += 1;
            i -= 1;
        }

        return "Ok";
    }

    public static void changePlaces(List<String> coffeeList, int firstIndex, int secondIndex) {
        if (coffeeList.size() >= Math.max(firstIndex, secondIndex)) {
            String firstCoffee = coffeeList.get(firstIndex);
            String secondCoffee = coffeeList.get(secondIndex);

            coffeeList.set(firstIndex, secondCoffee);
            coffeeList.set(secondIndex, firstCoffee);
        }
    }
}
