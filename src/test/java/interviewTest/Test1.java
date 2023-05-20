package interviewTest;

import org.junit.Test;

public class Test1 {

    public static void main(String[] args) {


        //

        String str = "1232ksfdsf";

        String numbers = "";
        String letters = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){

                letters += str.charAt(i);

            }else {
                numbers += str.charAt(i);
            }

        }

        System.out.println(numbers);
        System.out.println(letters);





    }

    @Test
    public void apexTask(){

        String first = "cab";
        String second = "abc";
        char[] charactersOfFirst = first.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] charactersOfSecond = second.replaceAll("\\s", "").toLowerCase().toCharArray();

        if (charactersOfFirst.length != charactersOfSecond.length) {
            System.out.println("anagram");
        }

        else {
            System.out.println("not anagram");
        }

        int[] frequencies = new int[26];

        for (int i = 0; i < charactersOfFirst.length; i++) {
            frequencies[charactersOfFirst[i] - 'a']++;
            frequencies[charactersOfSecond[i] - 'a']--;
        }

        for (int frequency : frequencies) {
            if (frequency != 0) {
                System.out.println("not anagram");
                break;
            }else {
                System.out.println("anagram");
                break;
            }
        }


    }



    }



