// Write a Java Program for Reversing the characters in a string using user defined function
//reverseString().
package String2;

public class ReverseStringExample {

    // User-defined function to reverse a string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = reverseString(original);

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
