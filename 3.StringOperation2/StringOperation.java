//Develop a java program for performing various string operations with different string
//handling functions directed as follows:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
//String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
//startsWith() and endsWith()
package String;

import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. String Creation and Basic Operations
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);

        // 2. Length and Character Access
        System.out.println("Length of String 1: " + s1.length());
        System.out.println("Character at index 1 in String 1: " + s1.charAt(1));

        // 3. String Comparison
        System.out.println("Is String 1 equal to String 2? " + s1.equals(s2));
        System.out.println("CompareTo result: " + s1.compareTo(s2));

        // 4. String Searching
        String sentence = "Java is a popular programming language.";
        System.out.println("Does the sentence contain 'popular'? " + sentence.contains("popular"));
        System.out.println("Index of 'programming': " + sentence.indexOf("programming"));

        // 5. Substring Operations
        String sub = sentence.substring(8, 15); 
        System.out.println("Substring from index 8 to 15: " + sub);

        // 6. String Modification
        String replaced = sentence.replace("Java", "Python");
        System.out.println("After replace: " + replaced);

        // 7. Whitespace Handling
        String withSpaces = "   Hello Java   ";
        System.out.println("Original: '" + withSpaces + "'");
        System.out.println("After trim(): '" + withSpaces.trim() + "'");

        // 8. String Concatenation
        String full = s1.concat(" ").concat(s2);
        System.out.println("Concatenated String: " + full);

        // 9. String Splitting
        String csv = "apple,banana,grape,orange";
        String[] fruits = csv.split(",");
        System.out.println("Fruits from CSV:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to Java");
        sb.insert(0, "Hello! ");
        sb.replace(0, 6, "Hi!");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 25;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email using contains(), startsWith(), endsWith()
        System.out.print("Enter your email address: ");
        String email = sc.nextLine();

        boolean isValid = email.contains("@") &&
                          email.contains(".") &&
                          email.startsWith("user") &&
                          email.endsWith(".com");

        if (isValid) {
            System.out.println("Valid email format.");
        } else {
            System.out.println("Invalid email format.");
        }

      
    }
}

