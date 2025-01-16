import java.util.Scanner;

public class PalindromeChecker {

    // Method to check if a text is a palindrome
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Loop to compare characters from start and end
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // If characters don't match, return false
            }
            start++;
            end--;
        }
        return true; // If loop completes, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text to check if it's a palindrome:");
        String text = input.nextLine();
        if (isPalindrome(text)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }

        input.close();
    }
}
