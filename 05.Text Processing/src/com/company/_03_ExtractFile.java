package com.company;

import java.util.Scanner;

public class _03_ExtractFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\\\");


        String[] tokens = input[input.length - 1].split("\\.");
        String file = tokens[0];
        String extension = tokens[1];

        System.out.printf("File name: %s%n",file);
        System.out.printf("File extension: %s%n",extension);

    }
}
