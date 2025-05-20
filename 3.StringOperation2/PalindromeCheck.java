//Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
//and punctuation) using user defined function isPalindrome()
package String2;

public class PalindromeCheck {

    // User-defined function to check for palindrome
    public static boolean isPalindrome(String input) {
        // Remove all non-letter characters and convert to lowercase
        String cleaned = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Compare original and reversed
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "Hello World";

        System.out.println("\"" + test1 + "\" is palindrome? " + isPalindrome(test1));
        System.out.println("\"" + test2 + "\" is palindrome? " + isPalindrome(test2));
    }
}
