package com.company;

import java.util.*;

public class _03_Orders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        LinkedHashMap<String, List<Double>> products = new LinkedHashMap<>();

        while(!input[0].equals("buy")) {

            String productName = input[0];
            double price = Double.parseDouble(input[1]);
            double qty = Double.parseDouble(input[2]);


            if (!products.containsKey(productName)) {
                products.put(productName, Arrays.asList(0.0, 0.0));
            }



            List<Double> priceQty = products.get(productName);
            products.put(productName, Arrays.asList(price, priceQty.get(1)+qty));


            input = sc.nextLine().split(" ");
        }

        for (Map.Entry<String, List<Double>> kvp : products.entrySet()) {
            // Beer -> [2.20, 100]
            double totalPrice = kvp.getValue().get(0) * kvp.getValue().get(1);

            System.out.printf("%s -> %.2f%n", kvp.getKey(), totalPrice);
        }

    }
}
