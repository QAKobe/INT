package interviewTest;

import io.cucumber.java.hu.Ha;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Nail {

    public static void main(String[] args) {

        String str = "ccodefish";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            if (!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            }else {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }

        }

        System.out.println(map);

        int nums [] = {2,3,4,1,2};

        for (int i = 0; i < nums.length; i++) {

            int temp =0;

            for (int j = i+1; j < nums.length; j++) {

                if (nums[i] > nums[j]){

                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));


    }
}
