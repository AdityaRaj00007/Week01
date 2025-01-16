import java.util.Scanner;

public class LongestWordSentence {

    // Method to find the longest word in a given sentence
    public static String longestWord(String one) {
        String longestWord = ""; // To store the longest word
        String currentWord = ""; // To build the current word as we traverse the sentence

        for (int i = 0; i < one.length(); i++) {
            char ch = one.charAt(i); 

            // If the character is not a space, add it to the current word
            if (ch != ' ') {
                currentWord += ch;
            } else {
                // If we encounter a space, check if the current word is longer than the longest word
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = ""; // Reset the current word
            }
        }

        // Final check for the last word in the sentence
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }

        return longestWord;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String:");
        String one = input.nextLine();
        System.out.println("Longest word is: " + longestWord(one));
        input.close();
    }
}
