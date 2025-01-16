import java.util.Scanner;

public class Split2 {

    //Method to count length of String
    public static int findLength(String one) {
        int count = 0;
        try { 
            // Infinite Loop to count the length
            while (true) {
                one.charAt(count);
                count++; 
            }
        } catch (IndexOutOfBoundsException e) { // Handles runtime exception and return count
           
        }
        return count;
    }

    // Method to split text into words without using the built-in split() method
    public static String[] splitText(String text) {
        int textLength = findLength(text);

        // Step 1: Count the number of words
        int wordCount = 1; // Start with 1 as there will be at least one word
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store the indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int spaceIndex = 0;
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ' && spaceIndex < spaceIndexes.length) {
                spaceIndexes[spaceIndex++] = i;
            }
        }

        // Step 3: Extract words using space indexes
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            words[i] = text.substring(start, end);
            start = end + 1;
        }
        words[words.length - 1] = text.substring(start); // Last word

        return words;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] create2DArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Word
            wordLengthArray[i][1] = String.valueOf(findLength(words[i])); // Length as String
        }

        return wordLengthArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String one = input.nextLine();
        String[] words = splitText(one);
        String[][] wordLengthArray = create2DArray(words);

        System.out.println("Word            Length");
        
        for (String[] row : wordLengthArray) {
            String word = row[0];
            int length = Integer.parseInt(row[1]); // Convert String length back to Integer
            System.out.println(word + "            " + length);
        }

        input.close();
    }
}
