import java.util.Scanner;

public class Split{

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

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();
        String[] customSplitWords = splitText(input);
        String[] builtInSplitWords = input.split(" ");
        boolean areArraysEqual = compareArrays(customSplitWords, builtInSplitWords);

        System.out.println("Words using custom split method:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nAre the two arrays equal? " + areArraysEqual);

        scanner.close();
    }
}
