//Write a Java Program for Counting the number of words in a string using user defined function
//countWords()
package String3;

public class WordCounter {

    // User-defined function to count words
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        String[] words = input.trim().split("\\s+"); // split on one or more spaces
        return words.length;
    }

    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";
        
        int wordCount = countWords(sentence);

        System.out.println("Sentence: " + sentence);
        System.out.println("Number of words: " + wordCount);
    }
}
