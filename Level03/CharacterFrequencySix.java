import java.util.Scanner;

public class CharacterFrequencySix {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray(); // Convert string to character array
        int[] frequency = new int[chars.length]; // Array to store frequencies
        boolean[] isCounted = new boolean[chars.length]; // To track counted characters

        // Outer loop to iterate through each character
        for (int i = 0; i < chars.length; i++) {
            if (!isCounted[i]) { // Skip if already counted
                frequency[i] = 1; // Initialize frequency to 1

                // Inner loop to find duplicates
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        frequency[i]++;
                        isCounted[j] = true; // Mark duplicate as counted
                    }
                }
            }
        }

        // Count unique characters for result array size
        int uniqueCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (!isCounted[i]) {
                uniqueCount++;
            }
        }

        // Create result array to store characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (!isCounted[i]) {
                result[index] = "Character: " + chars[i] + ", Frequency: " + frequency[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = input.nextLine();
        String[] frequencies = findCharacterFrequency(text);
        System.out.println("Character Frequencies:");
        for (String row : frequencies) {
            System.out.println(row);
        }

        input.close();
    }
}
