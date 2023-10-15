package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class _03_ZigZagArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrayLength = Integer.parseInt(sc.nextLine());
        boolean isOddInput = true;

        int[] firstOutput = new int[arrayLength];
        int[] secondOutput = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int[] input = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();

            if (isOddInput) {
                firstOutput[i] = input[0];
                secondOutput[i] = input[1];
                isOddInput = false;
            } else {
                firstOutput[i] = input[1];
                secondOutput[i] = input[0];
                isOddInput = true;
            }

        }

        for (int num : firstOutput) {
            System.out.printf("%d ", num);
        }
        System.out.println();
        for (int num : secondOutput) {
            System.out.printf("%d ", num);
        }
    }
}
