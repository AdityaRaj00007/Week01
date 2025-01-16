import java.util.Scanner;

public class SubstringCounter {
    //Method to countOccurrences
    public static int countOccurrences(String str, String substr) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(substr, index)) != -1) { // Find the substring starting from the current index
            count++;
            index += substr.length(); // Move the index forward to avoid overlapping matches
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String str = input.nextLine();
        System.out.println("Enter the substring to search for:");
        String substr = input.nextLine();
        int occurrences = countOccurrences(str, substr);
        System.out.println("The substring \"" + substr + "\" occurs " + occurrences + " times in the string.");
        input.close();
    }
}
