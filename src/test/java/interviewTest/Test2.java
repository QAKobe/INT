package interviewTest;

import java.util.*;

public class Test2 {

    public static void main(String[] args) {

        String [] str = {"a", "b", "c"};
        String [] str2 = {"b", "a", "c"};
        int len1 = str.length;
        int len2 = str2.length;
        Arrays.sort(str);
        Arrays.sort(str2);

        for (int i = 0; i < len1; i++) {

            if (str[i] != str2[i]){
                System.out.println("not anagram");
                break;
            }else {
                System.out.println("anagram");
                break;
            }

        }

        int x = 10;
        int y =  5;

        x = x + y;// 15
        y = x - y;//10
        x = x - y;

        System.out.println(x +"this was 10");
        System.out.println(y +"this was 5");

        int numbers = 1233;
        int reversed = 0;
        int remainder = 0;

        while (numbers!= 0){

            remainder = numbers % 10;
            reversed = reversed * 10 + remainder;
            numbers = numbers/10;


        }
        System.out.println(reversed);














    }





}
