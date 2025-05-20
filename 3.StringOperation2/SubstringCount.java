//Write a Java Program for Counting how many times a substring appears in a main string
//using user defined function countOccurrences()
package String2;

public class SubstringCount {

    // User-defined function to count substring occurrences
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        // Loop until all occurrences are found
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); 
        }

        return count;
    }

    public static void main(String[] args) {
        String mainString = "hello world, hello universe, hello everyone";
        String subString = "hello";

        int occurrences = countOccurrences(mainString, subString);

        System.out.println("The substring \"" + subString + "\" appears " + occurrences + " times in the main string.");
    }
}
