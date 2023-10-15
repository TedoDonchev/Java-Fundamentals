package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class _07_LongestSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int longestSequence = 0;
        int currentSequence = 1;
        int sequenceValue = 0;


        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == numbers[i-1]) {
                currentSequence += 1;
            } else {
                currentSequence = 1;
            }

            if (currentSequence > longestSequence) {
                sequenceValue = numbers[i];
                longestSequence = currentSequence;
            }

        }

        for (int i = 0; i < longestSequence; i++) {
            System.out.printf("%d ", sequenceValue);

        }
    }
}
