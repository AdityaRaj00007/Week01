import java.util.Scanner;

public class MostFrequentCharacter {
    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String input) {
        int[] freq = new int[256];  // Array to store the frequency of each character (assuming ASCII characters)
        
        // Counting the frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;  // Increment the frequency of the character
        }

        // Finding the character with the highest frequency
        char mostFrequentChar = input.charAt(0);
        int maxFrequency = freq[mostFrequentChar];  // Start with the first character's frequency

        for (int i = 1; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (freq[ch] > maxFrequency) {
                mostFrequentChar = ch;
                maxFrequency = freq[ch];
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = input.nextLine();

        char mostFrequentChar = findMostFrequentCharacter(text);
        System.out.println("The most frequent character is: " + mostFrequentChar);

        input.close();
    }
}
