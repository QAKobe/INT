package project_day;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {


        int number = 123456;
        int reversedNumber = 0;
        reversedNumber = reversedNumber + number % 10 * 100000;
        number /= 10;
        reversedNumber = reversedNumber + number % 10 * 10000;
        number /= 10;
        reversedNumber += number % 10 * 1000;
        number /= 10;
        reversedNumber += number % 10 * 100;
        number /= 10;
        reversedNumber += number % 10 * 10;
        number /= 10;
        reversedNumber += number % 10; // last one will be just
        System.out.println("The reversed number is " + reversedNumber);



        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n=scanner.nextInt();
        System.out.println(n+" * 1 = "+(n*1));
        System.out.println(n+" * 2 = "+(n*2));
        System.out.println(n+" * 3 = "+(n*3));
        System.out.println(n+" * 4 = "+(n*4));
        System.out.println(n+" * 5 = "+(n*5));
        System.out.println(n+" * 6 = "+(n*6));
        System.out.println(n+" * 7 = "+(n*7));
        System.out.println(n+" * 8 = "+(n*8));
        System.out.println(n+" * 9 = "+(n*9));
        System.out.println(n+" * 10 = "+(n*10));
    }


}
