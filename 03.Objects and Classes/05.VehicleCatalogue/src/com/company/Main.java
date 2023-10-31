package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<Vehicle>();

        String[] tokens = sc.nextLine().split(" ");


        while (!tokens[0].equals("End")) {
            String type = convertToProperCase(tokens[0]);
            String model = tokens[1];
            String color = tokens[2];
            int horsepower = Integer.parseInt(tokens[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);

            vehicles.add(vehicle);

            tokens = sc.nextLine().split(" ");
        }


        tokens = sc.nextLine().split(" ");

        while(!tokens[0].equals("Close")) {
            String model = tokens[0];

            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(model)) {
                    System.out.println(vehicle.toString());
                }
            }


            tokens = sc.nextLine().split(" ");
        }

        int carHP = 0;
        int truckHP = 0;
        int numberOfCars = 0;
        int numberOfTrucks = 0;

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getType().equals("Car")) {
                carHP += vehicle.getHorsepower();
                numberOfCars += 1;
            } else if (vehicle.getType().equals("Truck")) {
                truckHP += vehicle.getHorsepower();
                numberOfTrucks += 1;
            }

        }

        double avgCar = (double) carHP / numberOfCars;
        double avgTruck = (double) truckHP / numberOfTrucks;

        avgCar = Double.valueOf(avgCar).isNaN() ? 0.00 : avgCar;
        avgTruck = Double.valueOf(avgTruck).isNaN() ? 0.00 : avgTruck;

        System.out.printf("Cars have average horsepower of: %.2f.%n",avgCar );
        System.out.printf("Trucks have average horsepower of: %.2f.%n",avgTruck );

    }

    public static String convertToProperCase(String str) {
        char firstLetter = str.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);

        String newStr = str.substring(1, str.length());
        newStr = firstLetter + newStr;

        return newStr;
    }
}
