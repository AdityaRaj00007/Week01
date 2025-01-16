import java.util.Scanner;

public class WordReplacer {
    
    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Replace all occurrences of oldWord with newWord
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get input from user
        System.out.println("Enter the sentence: ");
        String sentence = input.nextLine();
        
        System.out.println("Enter the word to replace: ");
        String oldWord = input.nextLine();
        
        System.out.println("Enter the new word: ");
        String newWord = input.nextLine();
        
        // Call the replaceWord method and display the result
        String updatedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Updated sentence: " + updatedSentence);
        
        input.close();
    }
}
