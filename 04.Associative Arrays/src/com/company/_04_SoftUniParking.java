package com.company;

import java.util.*;

public class _04_SoftUniParking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfCommands = Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, String> users = new LinkedHashMap<>();
        boolean userExists = false;

        for (int i = 0; i < numOfCommands; i++) {

            String[] input = sc.nextLine().split(" ");

            userExists = users.containsKey(input[1]);

            switch (input[0]){
                case "register":
                    if (userExists) {
                        System.out.printf("ERROR: already registered with plate number %s%n", users.get(input[1]));
                    } else {
                        users.put(input[1], input[2]);
                        System.out.printf("%s registered %s successfully%n", input[1], input[2]);
                    }
                    break;
                case "unregister":
                    if (userExists) {
                        users.remove(input[1]);
                        System.out.printf("%s unregistered successfully%n", input[1]);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", input[1]);
                    }
                    break;

            }

        }

        for (Map.Entry<String, String> kvp : users.entrySet()) {
            System.out.printf("%s => %s%n", kvp.getKey(), kvp.getValue());
        }
    }
}
