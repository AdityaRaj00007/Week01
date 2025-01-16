import java.util.Scanner;

public class CompareStrings {

    // Method to compare two strings lexicographically
    public static void compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);
        
        // Compare character by character
        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            
            // If characters are different, compare their ASCII values
            if (ch1 != ch2) {
                if (ch1 < ch2) {
                    System.out.println('"' + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
                } else {
                    System.out.println('"' + str2 + "\" comes before \"" + str1 + "\" in lexicographical order.");
                }
                return;
            }
        }

        // If all characters are the same, compare the lengths
        if (length1 == length2) {
            System.out.println('"' + str1 + "\" is equal to \"" + str2 + "\".");
        } else if (length1 < length2) {
            System.out.println('"' + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } else {
            System.out.println('"' + str2 + "\" comes before \"" + str1 + "\" in lexicographical order.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = input.nextLine();
        compareStrings(str1, str2);

        input.close();
    }
}
