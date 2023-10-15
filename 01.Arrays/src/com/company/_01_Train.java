package com.company;

import java.util.Scanner;

public class _01_Train {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfInputs = Integer.parseInt(sc.nextLine());

        int[] arr = new int[numOfInputs];
        int sum = 0;

        for (int i = 0; i < numOfInputs; i++) {
            int input = Integer.parseInt(sc.nextLine());

            arr[i] = input;
            sum += input;
        }

        for (int num : arr) {
            System.out.printf("%d ", num);
        }

        System.out.println();
        System.out.println(sum);


    }
}
