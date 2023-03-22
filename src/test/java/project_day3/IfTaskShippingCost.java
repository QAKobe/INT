package project_day3;

import java.util.Scanner;

public class IfTaskShippingCost {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of your order (in pounds): ");
        int weight = input.nextInt();
        System.out.print("Enter the shipping speed (standard/overnight): ");
        String speed = input.next();

        int cost;
        if (weight <= 5) {
            cost = 10;
        } else {
            if (weight <= 10) {
                cost = 20;
            } else {
                if (weight <= 20) {
                    cost = 30;
                } else {
                    cost = 40;
                }
            }
        }

        if (speed.equals("overnight")) {
            cost *= 2;
        }

        System.out.println("The shipping cost for your order is $" + cost + ".");
    }
}


