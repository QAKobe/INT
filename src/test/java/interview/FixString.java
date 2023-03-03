package interview;

public class FixString {



        public static void main(String[] args) {
            String input = "a1b2c4l2";
            StringBuilder output = new StringBuilder();

            char prevChar = '\0';  // initialize to null character
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isLetter(c)) {
                    output.append(c);
                    prevChar = c;
                } else if (Character.isDigit(c)) {
                    int count = Character.getNumericValue(c);
                    for (int j = 0; j < count-1; j++) {
                        output.append(prevChar);
                    }
                }
            }

            System.out.println(output);
        }
    }


