package com.company;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _01_Train {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();

        int capacity = Integer.parseInt(scanner.nextLine());

        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")) {

            if (input[0].equals("Add")) {
                wagons.add(Integer.parseInt(input[1]));
            } else {
                int passengers = Integer.parseInt(input[1];

            }


            input = scanner.nextLine().split(" ");
        }


        System.out.println(wagons);

    }
}
