package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class _02_CommonElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] firstArr = sc.nextLine().split(" ");
        String[] secondArr = sc.nextLine().split(" ");

        for (int i = 0; i < secondArr.length; i++) {
            for (int j = 0; j < firstArr.length; j++) {

                if (firstArr[j].equals(secondArr[i])) {
                    System.out.printf("%s ", firstArr[j]);
                }

            }

        }
    }

}
