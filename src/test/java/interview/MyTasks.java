package interview;

import java.util.HashMap;
import java.util.Map;

public class MyTasks {

    static int solution(int[] A) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int array[] = {-2, 2, 3, 5, 1, 6, -3};
        int newArray = MyTasks.solution(array);
        System.out.println(newArray);

        /*
        Find anagram
         */

        String str = "dcba";
        String sortEdString = "";
        for (char i = 'a'; i <= 'z' ; i++) {

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == i){
                    sortEdString += str.charAt(j);
                }

            }

        }
        System.out.println(sortEdString);

        /*
        Count the letters from array of strings and put them inside a Map
         */
        String []characters = {"wg", "aa", "b"};

        Map<Character, Integer> names = new HashMap<>();

        for (int i = 0; i < characters.length; i++) {

            for (int j = 0; j < characters[i].length(); j++) {

                if (!names.containsKey(characters[i].charAt(j))){
                    names.put(characters[i].charAt(j), 1);
                }else {
                    int value = names.get(characters[i].charAt(j));
                    names.put(characters[i].charAt(j), value+1);
                }
            }
        }
        System.out.println(names);


    }


}
