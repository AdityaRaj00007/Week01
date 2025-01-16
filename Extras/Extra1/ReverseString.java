import java.util.Scanner;

public class ReverseString {

    // Method to reverse a string
    public static String reverseString(String one) {
        String reversed = ""; // Initialize an empty string to store the reversed result
        
        // Loop through the input string from the last character to the first
        for (int i = one.length() - 1; i >= 0; i--) {
            reversed += one.charAt(i); // Append each character to the reversed string
        }
        
        return reversed; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String one = input.nextLine();
        System.out.println("Reversed String: " + reverseString(one));
        input.close();
    }
}
