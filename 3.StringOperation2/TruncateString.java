//Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
//defined function truncate()
package String3;

public class TruncateString {

    // User-defined function to truncate and add ellipsis
    public static String truncate(String input, int maxLength) {
        if (input == null || maxLength < 0) {
            return "";
        }

        if (input.length() <= maxLength) {
            return input;
        } else if (maxLength <= 3) {
            // If maxLength is too short, return dots only
            return "...".substring(0, maxLength);
        } else {
            return input.substring(0, maxLength - 3) + "...";
        }
    }

    public static void main(String[] args) {
        String original = "Java is a popular programming language.";
        int maxLength = 20;

        String shortened = truncate(original, maxLength);

        System.out.println("Original: " + original);
        System.out.println("Truncated: " + shortened);
    }
}
