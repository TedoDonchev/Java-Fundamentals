package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_SoftUniBarIncome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("(%)(?<customer>[A-Z][a-z]+)\\1([^\\|\\$\\%\\.]*)(<)(?<product>[A-Z][a-z]+)(>)([^\\|\\$\\%\\.]*)(\\|)(?<count>[0-9]+)\\8([^\\|\\$\\%\\.]*)(?<price>\\d+.?\\d+)\\$");

        double sum = 0;

        while (true) {
            String input = sc.nextLine();

            if (input.equals("end of shift")) {
                break;
            }

            Matcher matcher = pattern.matcher(input);

            if (!matcher.find()) {
                continue;
            }


            String customer =  matcher.group("customer");
            String product = matcher.group("product");
            int count = Integer.parseInt(matcher.group("count"));
            double price = Double.parseDouble(matcher.group("price"));

            System.out.printf("%s: %s - %.2f%n", customer, product, count*price);
            sum+= count*price;
        }

        System.out.printf("Total income: %.2f%n", sum);
    }
}
