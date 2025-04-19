public class Palindrome {
    public static void main(String[] args) {
        // Replace Scanner with hardcoded input for testing
        String original = "A man, a plan, a canal, Panama"; // Example input

        // Preprocess the string (remove non-alphanumeric characters and convert to lowercase)
        String cleaned = original.replaceAll("[\\W_]+", "").toLowerCase();

        StringBuilder reversed = new StringBuilder(cleaned);
        reversed.reverse();

        if (cleaned.equals(reversed.toString())) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
