package interview;

import java.util.Arrays;

public class BiggestNumberInArray {
    public static void main(String[] args) {

        // FINDING BIGGEST AND SMALLEST ELEMENT IN ARRAY
        int num[] = {-1, 3, 5, -600, 1, 20, 3, 19, 500};

        int biggest = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > biggest) {
                biggest = num[i];
            } else {
                continue;
            }
        }
        int smallest = biggest;
        for (int i = 0; i < num.length; i++) {

            if (num[i] < smallest){
                smallest = num[i];
            }else {
                continue;
            }

        }

        // SORTING ARRAY
//        for (int i = 0; i < num.length; i++) {
//            int temp = 0;
//            for (int j = i+1; j < num.length; j++) {
//                if (num[i] > num[j]){
//                    temp = num[i];
//                    num[i] = num[j];
//                    num[j] = temp;
//                }
//            }
//        }
        System.out.println(Arrays.toString(num));
        System.out.println(smallest);
        System.out.println(biggest);


    }
}
