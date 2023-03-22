package project_day3;

public class Task3 {

    public static void main(String[] args) {
        String snicker = " Snicker ";
        String result1 = snicker.trim().toUpperCase().substring(2, 5);
        char result2 = snicker.trim().toUpperCase().charAt(3);

        System.out.println(result1); // Output: NIC
        System.out.println(result2); // Output: C

        String cookie = "Cookie";
        String result3 = cookie.toLowerCase().replace('o', 'u').concat("s");
        boolean result4 = cookie.startsWith("C");

        System.out.println(result3); // Output: cookius
        System.out.println(result4); // Output: true
    }
}
