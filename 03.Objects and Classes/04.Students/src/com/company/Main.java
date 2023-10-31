package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(sc.nextLine());

        List<Student> students = new ArrayList<Student>();

        for (int i = 0; i < numberOfInputs; i++) {

            String[] tokens = sc.nextLine().split(" ");

            String firstName = tokens[0];
            String lastName = tokens[1];
            double grade = Double.parseDouble(tokens[2]);

            Student stud = new Student(firstName, lastName, grade);

            students.add(stud);

        }

        Collections.sort(students, Comparator.comparingDouble(Student::getGrade)
            .reversed());

        for (Student student : students) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
