//Write a Java Program for Creating a random string of a specified length using user defined
//function generateRandomString()
package String3;

import java.util.Random;

public class RandomStringGenerator {

    // User-defined function to generate random string
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length()); // get random index
            sb.append(characters.charAt(index));             // append character
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int length = 10; // desired length of random string
        String randomStr = generateRandomString(length);

        System.out.println("Random String of length " + length + ": " + randomStr);
    }
}
