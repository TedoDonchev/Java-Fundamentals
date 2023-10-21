package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class _08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int targetSum = Integer.parseInt(scanner.nextLine());

        boolean toBeSkipped = false;

        for (int i = 0; i < numbers.length; i++) {

            int residual = targetSum - numbers[i];

            for (int k = 0; k < i; k++) {
                if (numbers[k] == numbers[i] || numbers[k] == residual) {
                    toBeSkipped = true;
                    break;
                } else {
                    toBeSkipped = false;
                }
            }

            if (!toBeSkipped) {

                for (int j = i; j < numbers.length; j++) {

                    if (residual == numbers[j]) {
                        System.out.printf("%d %d %n", numbers[i], residual);
                        break;
                    }

                }

            }


        }
    }
}
