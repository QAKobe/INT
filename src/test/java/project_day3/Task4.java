package project_day3;

import com.google.gson.annotations.Since;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        // Ask the user to enter three strings
        System.out.println("Please enter three strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        // Check if the length is the same and all strings contain "java"
        boolean isLengthSame = str1.length() == str2.length() && str2.length() == str3.length();
        boolean containJava = str1.contains("java") && str2.contains("java") && str3.contains("java");


        System.out.println(isLengthSame);
        System.out.println(containJava);
    }
}


