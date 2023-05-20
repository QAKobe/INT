package interview;

import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args) {


        int [] array = {0,1,2,3,4,5,6,7,8,9,10};

        int [] even = new int[array.length];
        int [] odd = new int[array.length];
        for (int i = 1; i < array.length; i++) {

            if (array[i] % 2 ==0){
                even[i] = array[i];
            }else {
               odd[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
    }
}
