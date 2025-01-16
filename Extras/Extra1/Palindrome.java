import java.util.Scanner;

class Palindrome {
    // Method to check if the given string is a palindrome
    public static boolean isPalindrome(String one) {
        int start = 0; // Start index of the string
        int end = one.length() - 1; // End index of the string

        // Loop to compare characters from both ends of the string
        while (start < end) {
            // If characters at start and end are not the same, it's not a palindrome
            if (one.charAt(start) != one.charAt(end)) {
                return false;
            }
            start++; // Move start index forward
            end--; // Move end index backward
        }

        // If all characters matched, it's a palindrome
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String ");
        String one = input.next();
        System.out.println("This String is Palindrome: " + isPalindrome(one));
        input.close();
    }
}
