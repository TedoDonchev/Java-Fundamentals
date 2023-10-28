package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] phrases = {
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        };

        String[] events = {
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };

        String[] names = {
                "Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"
        };

        String[] cities = {
                "Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"
        };


        Random rand = new Random();

        int phraseInx = rand.nextInt(phrases.length);
        int eventInx = rand.nextInt(events.length);
        int nameInx = rand.nextInt(names.length);
        int cityInx = rand.nextInt(cities.length);

        String phrase = phrases[phraseInx];
        String event = events[eventInx];
        String name = names[nameInx];
        String city = cities[cityInx];



        Message msg = new Message(phrase, event, name, city);

        msg.printMessage();

    }
}
