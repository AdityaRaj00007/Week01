import java.util.Scanner;

public class UniqueCharacters {

    // Method to find unique characters in a string using charAt() and return them as a 1D array
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();  // Get the length of the string
        char[] uniqueChars = new char[length];  // Array to store unique characters
        int index = 0;  // Index to store unique characters
        
        // Outer loop iterates through each character in the text
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop checks if the character is unique by comparing it with previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, store it in the result array
            if (isUnique) {
                uniqueChars[index++] = currentChar;
            }
        }

        // Create a new array to store only the valid unique characters (no empty spaces)
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to print the unique characters
    public static void printUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        char[] uniqueChars = findUniqueCharacters(text);
        printUniqueCharacters(uniqueChars);
        input.close();
    }
}
