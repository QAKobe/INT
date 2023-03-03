package interview;

public class Fib {

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }


    public static void main(String[] args) {

        int num = factorial(8);
        System.out.println(num);

        Prime(5);

        fixString();


    }

    public static void Prime(int number){

        boolean isPrime = false;

        for (int i = 2; i <= number / 2; ++i) {

            if (number % i == 0) {
                isPrime = true;
                break;
            }
        }

        if (!isPrime) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is not a Prime number");
        }
    }

    public static void fixString(){



    }





}


