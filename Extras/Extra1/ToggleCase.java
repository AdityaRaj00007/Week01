import java.util.Scanner;

public class ToggleCase {
    // Method to toggle the case of each character in the string
    public static String toggleCase(String one) {
        String result = ""; 
        
        // Loop through each character in the input string
        for (int i = 0; i < one.length(); i++) {
            char ch = one.charAt(i); // Get the current character
            
            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                // Convert to lowercase and append to the result
                result += Character.toLowerCase(ch);
            } 
            // Check if the character is lowercase
            else if (Character.isLowerCase(ch)) {
                // Convert to uppercase and append to the result
                result += Character.toUpperCase(ch);
            } 
            // If it's neither, just append the character as it is (like numbers, symbols)
            else {
                result += ch;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to toggle case:");
        String one = input.nextLine();
    
        System.out.println("Toggled Case String: " + toggleCase(one));
        input.close();
    }
}
