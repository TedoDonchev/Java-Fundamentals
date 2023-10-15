package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class _04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int numOfRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfRotations; i++) {

            int firstElement = numArr[0];

            for (int j = 0; j < numArr.length - 1; j++) {
                numArr[j] = numArr[j+1];

            }
            numArr[numArr.length-1] = firstElement;
        }

        for (int i : numArr) {
            System.out.printf("%d " , i);
        }

    }
}
