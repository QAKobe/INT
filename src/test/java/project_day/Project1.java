package project_day;

public class Project1 {

    public static void main(String[] args) {

        int number = 578432;
        int multiplication = 1;
        int sum = 0;
        int digit = number % 10; //using modulus to get the last number
        multiplication *= digit; // multiplying our digit
        sum += digit; // updating our sum
        number /= 10; // updating our number, if we dont do it, it will remain as initial number
        digit = number % 10;
        multiplication *= digit;
        sum += digit;
        number /= 10;
        digit = number % 10;
        multiplication *= digit;
        sum += digit;
        number /= 10;
        digit = number % 10;
        multiplication *= digit;
        sum += digit;
        number /= 10;
        digit = number % 10;
        multiplication *= digit;
        sum += digit;
        number /= 10;
        digit = number % 10;
        multiplication *= digit;
        sum += digit;
        System.out.println("Multiplication of all digits is " + multiplication);
        System.out.println("The sum of all digits is " + sum);
    }

}
