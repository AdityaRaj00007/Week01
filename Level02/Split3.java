import java.util.Scanner;

public class Split3 {

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

    // Method to find the shortest and longest strings in the 2D array
    public static String[] findShortestAndLongest(String[][] wordLengthArray) {
        String shortestWord = wordLengthArray[0][0];
        String longestWord = wordLengthArray[0][0];
        int shortestLength = Integer.parseInt(wordLengthArray[0][1]);
        int longestLength = Integer.parseInt(wordLengthArray[0][1]);

        for (String[] wordData : wordLengthArray) {
            int currentLength = Integer.parseInt(wordData[1]);
            if (currentLength < shortestLength) {
                shortestWord = wordData[0];
                shortestLength = currentLength;
            }
            if (currentLength > longestLength) {
                longestWord = wordData[0];
                longestLength = currentLength;
            }
        }

        return new String[]{shortestWord, longestWord};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String one = input.nextLine();
        String[] words = splitText(one);
        String[][] wordLengthArray = create2DArray(words);
        String[] result = findShortestAndLongest(wordLengthArray);
        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);

        input.close();
    }
}
