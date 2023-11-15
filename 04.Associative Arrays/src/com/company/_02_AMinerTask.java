package com.company;

import java.util.*;

public class _02_AMinerTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        List<String> inputList = new ArrayList<>();

        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            inputList.add(input);

            input = sc.nextLine();
        }

        for (int i = 0; i < inputList.size(); i+=2) {
            String resource = inputList.get(i);
            int amount = Integer.parseInt(inputList.get(i+1));

            if (!resources.containsKey(resource)) {
                resources.put(resource, 0);
            }

            resources.put(resource, resources.get(resource) + amount);
        }

        for (Map.Entry<String, Integer> kvp : resources.entrySet()) {
            System.out.printf("%s -> %d%n", kvp.getKey(), kvp.getValue());
        }

    }
}
