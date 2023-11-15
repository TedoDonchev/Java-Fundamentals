package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _01_CountCharsInAString {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    String[] input = sc.nextLine().split(" ");
        String inputJoined = String.join("", input);
        char[] characterArr = inputJoined.toCharArray();

        LinkedHashMap<Character, Integer> numberOfOccurences = new LinkedHashMap<>();

        for (char letter : characterArr) {

            if (!numberOfOccurences.containsKey(letter)) {
                numberOfOccurences.put(letter, 0);
            }

            numberOfOccurences.put(letter, numberOfOccurences.get(letter) + 1);
        }

        for (Map.Entry<Character, Integer> kvp : numberOfOccurences.entrySet()) {

            System.out.printf("%s -> %d%n", kvp.getKey(), kvp.getValue());
        }

    }
}
