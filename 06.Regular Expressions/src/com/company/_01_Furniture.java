package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_Furniture {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^>>(?<furniture>[A-Za-z]+)<<(?<price>\\d+.?\\d+)!(?<quantity>\\d+)$");

        LinkedHashMap<String, Double> furnitures = new LinkedHashMap<String, Double>();

        while (true) {
            String input = sc.nextLine();

            if (input.equals("Purchase")) {
                break;
            }

            Matcher matcher = pattern.matcher(input);

            if (!matcher.find()) {
                continue;
            }

            String furniture = matcher.group("furniture");
            double price = Double.parseDouble(matcher.group("price"));
            int qty = Integer.parseInt(matcher.group("quantity"));

            if (!furnitures.containsKey(furniture)) {
                furnitures.put(furniture, 0.0);
            }

            furnitures.put(furniture, furnitures.get(furniture) + (price*qty));

        }

        double sum = 0.0;
        System.out.println("Bought furniture:");
        for (Map.Entry<String, Double> kvp : furnitures.entrySet()) {
            System.out.println(kvp.getKey());
            sum += kvp.getValue();
        }
        System.out.printf("Total money spend: %.2f%n", sum);
    }
}
