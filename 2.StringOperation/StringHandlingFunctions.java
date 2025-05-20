//Develop a java program for performing various string operations with different string

//handling functions directed as follows
//String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String
//Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
//contains( ) and startsWith() and endsWith().
package two;

public class StringHandlingFunctions {
	public static void main(String[] args) {
		 String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        System.out.println("str1 equals str2: " + str1.equals(str2));
	        System.out.println("str1 equalsIgnoreCase 'HELLO': " + str1.equalsIgnoreCase("HELLO"));

	        // 4. String Searching
	        String sentence = "Java is powerful and versatile";
	        System.out.println("Contains 'power': " + sentence.contains("power"));
	        System.out.println("Index of 'versatile': " + sentence.indexOf("versatile"));

	        // 5. Substring Operations
	        String sub = sentence.substring(8, 16);
	        System.out.println("Substring (8-16): " + sub);

	        // 6. String Modification
	        String modified = sentence.replace("Java", "Python");
	        System.out.println("Modified sentence: " + modified);

	        // 7. Whitespace Handling
	        String whitespace = "   trim me   ";
	        System.out.println("Original with spaces: '" + whitespace + "'");
	        System.out.println("After trim(): '" + whitespace.trim() + "'");

	        // 8. String Concatenation
	        String combined = str1 + " " + str2;
	        System.out.println("Concatenated string: " + combined);

	        // 9. String Splitting
	        String data = "Apple,Banana,Orange";
	        String[] fruits = data.split(",");
	        System.out.println("Splitting 'Apple,Banana,Orange':");
	        for (String fruit : fruits) {
	            System.out.println("- " + fruit);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World!");
	        sb.insert(5, ",");
	        sb.replace(0, 5, "Hi");
	        sb.deleteCharAt(2);
	        System.out.println("StringBuilder result: " + sb.toString());

	        // 11. String Formatting
	        String name = "Alice";
	        int age = 22;
	        System.out.println(String.format("Name: %s, Age: %d", name, age));

	        // 12. Validate Email
	        String email = "example@mail.com";
	        System.out.println("Validating email: " + email);
	        if (email.contains("@") && email.endsWith(".com") && email.startsWith("example")) {
	            System.out.println("Email is valid based on simple checks.");
	        } else {
	            System.out.println("Email is invalid.");
	        }
	}
}
