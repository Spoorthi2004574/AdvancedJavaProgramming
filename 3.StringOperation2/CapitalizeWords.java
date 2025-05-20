//Write a Java Program for Capitalizing the first letter of each word. using user defined function
//capitalizeWords()
package String3;

public class CapitalizeWords {

    // User-defined function to capitalize each word
    public static String capitalizeWords(String input) {
        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize first letter, lowercase the rest
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String original = "java programming language";
        String capitalized = capitalizeWords(original);

        System.out.println("Original: " + original);
        System.out.println("Capitalized: " + capitalized);
    }
}
