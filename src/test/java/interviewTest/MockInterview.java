package interviewTest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MockInterview {
    public static void main(String[] args) {

        int [] array = {2,1,5,3};
        for (int i = 0; i < array.length; i++) {

            int temp = 0;
            for (int j = i+1; j < array.length; j++) {

                if (array[i] < array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[j] = temp;
                }

            }

        }

        System.out.println(Arrays.toString(array));

        String str2 = "codefish";

        for (int i = 0; i < str2.length(); i++) {
            int temp = 0;

            if (str2.charAt(i) == 'A' && str2.charAt(i) == 'Z'){
                temp+=str2.charAt(i);
            } else if (str2.charAt(i) == 'a' && str2.charAt(i) == 'z') {

                temp+=str2.charAt(i)+1;

            }
            System.out.println(temp);
        }

        // Natallia

        int[] arr = {-1,3,5,-600,1,20,3,19,500};

        for (int i = 0; i < arr.length; i++) {

            for (int k = 0; k < i; k++) {
                if (arr[i] > arr[k] ){
                    arr[k] = arr[i];
                }
            }
        }
    }
}
