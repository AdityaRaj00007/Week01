import java.util.Scanner;

public class TrimString {

    // Method to find the start and end index of the trimmed string
    public static int[] findTrimIndices(String one) {
        int start = 0;
        int end = one.length() - 1;

        // Trim leading spaces
        while (start < one.length() && one.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= 0 && one.charAt(end) == ' ') {
            end--;
        }

        // Return start and end indices
        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String one, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(one.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string with leading and trailing spaces:");
        String one = input.nextLine();
        int[] trimIndices = findTrimIndices(one);
        String trimmedString = createSubstring(one, trimIndices[0], trimIndices[1]);
        String builtInTrimmed = one.trim();
        boolean areEqual = compareStrings(trimmedString, builtInTrimmed);
        System.out.println("String after trimming (custom method): \"" + trimmedString + "\"");
        System.out.println("String after trimming (built-in method): \"" + builtInTrimmed + "\"");
        System.out.println("Are the two trimmed strings equal? " + areEqual);

        input.close();
    }
}
