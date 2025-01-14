import java.util.Scanner;

public class Split {

    // Method to split the text into words using charAt() method
        public static String[] splitText(String text) {
        text = text.trim();
        String word = "";
        int count = 0;

        // Count the number of words to initialize the array
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' && text.charAt(i - 1) != ' ') {
                count++;
            }
        }
        count++; // For the last word

        String[] words = new String[count];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else if (text.charAt(i) == ' ' && text.charAt(i - 1) != ' ') {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word; // Add the last word
        return words;
    }

    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a sentence: ");
        String inputText = input.nextLine();

        // Process the input
        String[] words = splitText(inputText);
        String[][] wordLengths = wordsWithLengths(words);

        // Display the result in tabular format
        System.out.println("Word          Length");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "          " + Integer.parseInt(wordLength[1]));
        }

        input.close();
    }
}