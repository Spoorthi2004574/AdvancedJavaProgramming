//Write a Java Program for Eliminating all whitespace characters from a string using user defined
//function removeWhitespace()
package String2;

public class RemoveWhitespace {

    // User-defined function to remove all whitespace
    public static String removeWhitespace(String input) {
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String original = "  Java   Programming   Language  ";
        String result = removeWhitespace(original);

        System.out.println("Original String: \"" + original + "\"");
        System.out.println("String without whitespace: \"" + result + "\"");
    }
}

