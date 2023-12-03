package com.company;

import java.util.*;

public class _03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfInputs =  Integer.parseInt(sc.nextLine());

        //{plant} -> {rarity, rating}
        LinkedHashMap<String, List<Double>> plants = new LinkedHashMap<>();

        for (int i = 0; i < numberOfInputs; i++) {
            String[] tokens = sc.nextLine().split("<->");
            String plant = tokens[0];
            double rarity = Double.parseDouble(tokens[1]);

            if (!plants.containsKey(plant)) {
                plants.put(plant, Arrays.asList(0.0, 0.0));
            }
            plants.put(plant,Arrays.asList(plants.get(plant).get(0) + rarity, 0.0));
        }


        while (true) {
            String[] command = sc.nextLine().split(":");

            if (command[0].equals("Exhibition")) {
                break;
            }

            String action = command[0];
            String plant = command[1].split(" - ")[0];

            if (action.equals("Rate")) {
                Double rating = Double.parseDouble(command[1].split(" - ")[1]);
                plants.put(plant,Arrays.asList(plants.get(plant).get(0), plants.get(plant).get(1) + rating));
            } else if (action.equals("Update")) {
                Double newRarity = Double.parseDouble(command[1].split(" - ")[1]);
                plants.put(plant,Arrays.asList(newRarity, plants.get(plant).get(1)));
            } else if (action.equals("Reset")) {
                plants.put(plant,Arrays.asList(plants.get(plant).get(0), 0.0));
            }
        }

        System.out.println();
    }
}
