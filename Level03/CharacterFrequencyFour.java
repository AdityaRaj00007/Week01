import java.util.Scanner;

public class CharacterFrequencyFour {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters (ASCII size)

        // Loop through the text to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Calculate the number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Store character
                result[index][1] = String.valueOf(frequency[i]); // Store frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = input.nextLine();
        String[][] frequencies = findCharacterFrequency(text);
        System.out.println("Character Frequencies:");
        for (String[] row : frequencies) {
            System.out.println("Character: " + row[0] + ", Frequency: " + row[1]);
        }

        input.close();
    }
}
