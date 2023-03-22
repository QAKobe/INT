package project_day3;

import java.util.Scanner;

public class Group4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("what's the weight for the shipment?");
        int weight = sc.nextInt();

        if (weight <= 5) {
            System.out.println("the shipping cost is $10.");
        } else if (weight >= 5 || weight <= 10) {
            System.out.println("the shipping cost is $20");

        } else if (weight > 10 || weight <= 20) {
            System.out.println("the shipping cost is $30");
        } else if (weight > 20) {
            System.out.println("the shipping cost is $40");
        } else {

            System.out.println(" if the shipping speed is overnight, the shipping cost is doubled");
        }
    }}
