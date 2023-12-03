package com.company;

import java.util.*;

public class _03_HeroRecruitment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, List<String>> heroes = new LinkedHashMap<>();

        while (true) {
            String[] command = sc.nextLine().split(" ");

            if (command[0].equals("End")) {
                break;
            }

            String hero = command[1];
            if (command[0].equals("Enroll")) {
                boolean check = enrollHero(heroes, hero);
                if (!check) {
                    System.out.printf("%s is already enrolled.%n", hero);
                }
            } else if (command[0].equals("Learn")) {
                String spellName = command[2];
                if (!heroes.containsKey(hero)) {
                    System.out.printf("%s doesn't exist.%n", hero);
                } else if (heroes.get(hero).contains(spellName)) {
                    System.out.printf("%s has already learnt %s%n", hero, spellName);
                } else {
                    List<String> spellList = heroes.get(hero);
                    spellList.add(spellName);
                }
            } else if (command[0].equals("Unlearn")) {
                String spellName = command[2];
                if (!heroes.containsKey(hero)) {
                    System.out.printf("%s doesn't exist.%n", hero);
                } else if (!heroes.get(hero).contains(spellName)) {
                    System.out.printf("%s doesn't know %s.%n", hero, spellName);
                } else {
                    heroes.get(hero).remove(spellName);
                }
            }
        }

        System.out.printf("Heroes:%n");
        for (Map.Entry<String, List<String>> kvp : heroes.entrySet()) {
            System.out.printf("== %s: %s%n", kvp.getKey(), String.join(", ", kvp.getValue()));
        }
    }

    private static boolean enrollHero(LinkedHashMap<String, List<String>> heroes, String hero) {
        if (heroes.containsKey(hero)) {
            return false;
        }

        List<String> spells = new ArrayList<>();
        heroes.put(hero, spells);
        return true;
    }


}
