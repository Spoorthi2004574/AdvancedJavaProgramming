//Write a Java Program for Checking if a given string is null or contains only whitespace using user
//defined function isNullOrEmpty().
package String2;
import java.util.Scanner;

public class NullOrEmptyCheck{

    // User-defined function to check if a string is null or only whitespace
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        String str1 = " ";
        String str2 = "";
        String str3 = "Hello World";
        System.out.println("Does the string is null or empty:"+isNullOrEmpty(str1));  
        System.out.println("Does the string is null or empty:"+isNullOrEmpty(str2));  
        System.out.println("Does the string is null or empty:"+isNullOrEmpty(str3));  
 
    }
}
