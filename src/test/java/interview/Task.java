package interview;

import javax.sound.midi.Track;

public class Task {

    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j >= 1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }






    }

}
