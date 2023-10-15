package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualSums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        boolean equalSums = false;

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                //sum numbers on left
                leftSum += numbers[j];
            }

            for (int k = i+1; k < numbers.length; k++) {
                //sum numbers on right
                rightSum += numbers[k];
            }


            if (leftSum == rightSum) {
                System.out.println(i);
                equalSums = true;
                break;
            }
        }

        if (!equalSums) {
            System.out.println("no");
        }

    }
}
