package project_day3;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a three-word sentence
        System.out.println("Please enter a sentence with three words:");
        String sentence = scanner.nextLine();

        // Find the index of the last character of the first word
        int lastCharIndex1 = sentence.indexOf(' ');

        // Find the index of the last character of the second word
        int lastCharIndex2 = sentence.lastIndexOf(' ');

        // Find the index of the last character of the third word
        int lastCharIndex3 = sentence.length() - 1;

        // Print the index of the last character of each word
        System.out.println((lastCharIndex1 - 1) + " --> index number of '" + sentence.charAt(lastCharIndex1 - 1) + "'");
        System.out.println((lastCharIndex2 - 1) + " --> index number of '" + sentence.charAt(lastCharIndex2 - 1) + "'");
        System.out.println(lastCharIndex3 + " --> index number of '" + sentence.charAt(lastCharIndex3) + "'");

        // Calculate the sum of the last character indices
        int sum = lastCharIndex1 + lastCharIndex2 + lastCharIndex3 - 2;
        System.out.println("The sum: " + sum);
    }
}
