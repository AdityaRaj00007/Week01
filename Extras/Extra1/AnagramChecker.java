import java.util.Scanner;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert both strings to lowercase
        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();

        // Check if the lengths are the same, if not, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Sort both strings and compare them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort the character arrays
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        // Compare the sorted arrays
        return java.util.Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = input.nextLine();
        if (areAnagrams(str1, str2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }

        input.close();
    }
}
