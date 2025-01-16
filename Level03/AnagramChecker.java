import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths are the same
        if (text1.length() != text2.length()) {
            return false; // If lengths are not equal, they cannot be anagrams
        }

        // Convert both texts to lowercase to make the comparison case-insensitive
        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        // Create arrays to store the frequency of characters
        int[] frequency1 = new int[256]; // Array to store frequency of characters for text1
        int[] frequency2 = new int[256]; // Array to store frequency of characters for text2

        // Count the frequency of each character in both texts
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequencies of characters in both texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false; // If any character's frequency is different, texts are not anagrams
            }
        }

        return true; // If frequencies match, texts are anagrams
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first text:");
        String text1 = input.nextLine();
        System.out.println("Enter the second text:");
        String text2 = input.nextLine();
        if (areAnagrams(text1, text2)) {
            System.out.println(text1 + " and " + text2 + " are anagrams.");
        } else {
            System.out.println(text1 + " and " + text2 + " are not anagrams.");
        }

        input.close();
    }
}
