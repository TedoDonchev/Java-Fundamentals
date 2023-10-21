package com.company;

import javax.sound.midi.MidiFileFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_ChangeList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String[] command = sc.nextLine().split(" ");

        while (!command[0].equals("end")) {

            if (command[0].equals("Delete")) {
                removeNumberFromList(numbers, Integer.parseInt(command[1]));

            } else if (command[0].equals("Insert")) {
                numbers.add(Integer.parseInt(command[2]),Integer.parseInt(command[1]));
            }

            command = sc.nextLine().split(" ");
        }

        printList(numbers);

    }

    public static void removeNumberFromList(List<Integer> numbers, int elementToRemove) {

        for (int i = 0; i < numbers.size(); i++) {
            if (elementToRemove == numbers.get(i)) {
                numbers.remove(i);
                i -= 1;
            }

        }
    }

    public static void printList(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.printf("%d ", number);
        }
    }

}
