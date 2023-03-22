package project_day3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.println("Please enter a string value:");
        String inputString = sc.nextLine();

        // Ask the user to enter the starting number
        System.out.println("Please enter the starting number:");
        int startNum = sc.nextInt();

        // Ask the user to enter the ending number
        System.out.println("Please enter the ending number:");
        int endNum = sc.nextInt();

        // Get the substring between the given starting and ending numbers
        String result = inputString.substring(startNum - 1, endNum);

        // Print the result
        System.out.println("The output is:");
        System.out.println(result);

        sc.close();
    }
    }

