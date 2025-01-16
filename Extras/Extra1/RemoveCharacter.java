import java.util.Scanner;

public class RemoveCharacter {
    // Method to remove all occurrences of a specific character from the string
    public static String removeCharacter(String one, char characterToRemove) {
        String result = ""; 
        
        // Loop through the string and build the new string without the specified character
        for (int i = 0; i < one.length(); i++) {
            char currentChar = one.charAt(i);  // Get the current character
            if (currentChar != characterToRemove) {
                result += currentChar;  // Add the character to the result if it's not the one to remove
            }
        }
        
        return result;  // Return the modified string
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        String one = input.nextLine();  
        
        System.out.println("Enter the character to remove: ");
        char charToRemove = input.next().charAt(0);  // Get the character to remove
        
        // Call the method to remove the specified character and print the result
        String modifiedString = removeCharacter(one, charToRemove);
        System.out.println("Modified String: " + modifiedString);
        
        input.close();
    }
}
