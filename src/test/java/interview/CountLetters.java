package interview;

import java.util.Map;
import java.util.TreeMap;

public class CountLetters {
    public static void main(String[] args) {

        //count letter
        String str = "Codefishss";
        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {


            if (map.containsKey(str.charAt(i))){

                int count = map.get(str.charAt(i));
                map.putIfAbsent(str.charAt(i), count+1);

            }else {
                map.put(str.charAt(i), 1);

            }


        }

        System.out.println(map);

        ExampleClass ex = new ExampleClass() {
        };





    }
}
