import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Remove spaces and convert to lowercase
        String cleaned = original.replaceAll("[\\W_]+", "").toLowerCase();

        StringBuilder reversed = new StringBuilder(cleaned);
        reversed.reverse();

        if (cleaned.equals(reversed.toString())) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        sc.close();
    }
}
