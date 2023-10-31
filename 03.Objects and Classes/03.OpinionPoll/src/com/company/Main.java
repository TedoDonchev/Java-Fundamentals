package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(sc.nextLine());


        List<Person> people = new ArrayList<Person>();

        for (int i = 0; i < numberOfInputs; i++) {
            String[] tokens = sc.nextLine().split(" ");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person pers = new Person(name, age);
            people.add(pers);
        }

        for (Person person : people) {
            if (person.getAge() > 30) {
                System.out.printf("%s - %d%n", person.getName(), person.getAge());
            }
        }

    }
}
