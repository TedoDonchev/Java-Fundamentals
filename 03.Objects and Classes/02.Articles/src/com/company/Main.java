package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] initialInput = sc.nextLine().split(", ");

        String title = initialInput[0];
        String content = initialInput[1];
        String author = initialInput[2];

        Article article = new Article(title, content, author);

        int numberOfInputs = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numberOfInputs; i++) {

            String[] tokens = sc.nextLine().split(": ");

            String action = tokens[0];
            String newValue = tokens[1];

            if (action.equals("Edit")) {
                article.editContent(newValue);
            } else if (action.equals("ChangeAuthor")) {
                article.changeAuthor(newValue);
            } else if (action.equals("Rename")) {
                article.rename(newValue);
            }


        }

        String output = article.toString();
        System.out.println(output);
    }
}
