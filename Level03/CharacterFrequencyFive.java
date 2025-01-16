import java.util.Scanner;

public class CharacterFrequencyFive {

    // Method to find unique characters in the string
    public static char[] uniqueCharacters(String text) {
        int textLength = text.length();
        boolean[] seen = new boolean[256];  // To track characters we've already seen
        StringBuilder uniqueChars = new StringBuilder();
        
        for (int i = 0; i < textLength; i++) {
            char currentChar = text.charAt(i);
            if (!seen[currentChar]) {
                uniqueChars.append(currentChar);  // Add to the unique string
                seen[currentChar] = true;
            }
        }
        
        return uniqueChars.toString().toCharArray();
    }

    // Method to find the frequency of characters in the string
    public static String[][] findCharacterFrequency(String text) {
        int textLength = text.length();
        int[] frequency = new int[256];  // Array to store frequency of characters
        
        // Calculate frequency of each character
        for (int i = 0; i < textLength; i++) {
            frequency[text.charAt(i)]++;
        }
        
        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        
        // Store the unique characters and their frequencies in the result array
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }
        
        return result;
    }

    // Method to print the result in a readable format
    public static void printFrequency(String[][] result) {
        System.out.println("Character Frequency:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + ": " + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        String[][] characterFrequency = findCharacterFrequency(text);
        printFrequency(characterFrequency);
        
        input.close();
    }
}
