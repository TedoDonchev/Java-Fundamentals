package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_DestinationMapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("([\\/=])(?<location>[A-Z][A-Za-z]{2,})\\1");

        List<String> locations = new ArrayList<>();

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            locations.add(matcher.group("location"));
        }

        System.out.print("Destinations: ");
        if (locations.size() > 0) {
            System.out.print(String.join(", ", locations));

        }

        System.out.printf("%nTravel Points: ");

        int sum = locations.stream().mapToInt(x -> x.length()).sum();
        System.out.print(sum);



    }
}
