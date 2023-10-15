package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class _05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isTopInteger = true;

        for (int i = 0; i < numbers.length; i++) {

            int element = numbers[i];
            isTopInteger = true;

            for (int j = i; j < numbers.length - 1; j++) {
                if (element > numbers[j + 1]) {
                    isTopInteger = true;
                } else {
                    isTopInteger = false;
                    break;
                }

            }

            if (isTopInteger) {
                System.out.printf("%d ", element);;
            }
        }
    }
}
