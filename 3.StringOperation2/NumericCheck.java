//Write a Java Program for Verifying if a string contains only numeric characters using user defined
//function isNumeric()
package String3;

public class NumericCheck {

    // User-defined function to check if a string is numeric
    public static boolean isNumeric(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        return input.matches("\\d+"); // matches one or more digits
    }

    public static void main(String[] args) {
        String str1 = "123456";
        String str2 = "123a45";
        String str3 = "";

        System.out.println("\"" + str1 + "\" is numeric? " + isNumeric(str1)); // true
        System.out.println("\"" + str2 + "\" is numeric? " + isNumeric(str2)); // false
        System.out.println("\"" + str3 + "\" is numeric? " + isNumeric(str3)); // false
    }
}
