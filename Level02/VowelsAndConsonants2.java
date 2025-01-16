import java.util.Scanner;

public class VowelsAndConsonants2 {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to classify each character in the string
    public static String[][] classifyCharacters(String one) {
        int length = one.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = one.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayTable(String[][] data) {
        System.out.println("Character   Type");
        for (String[] row : data) {
            System.out.println(row[0] + "            " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String one = input.nextLine();
        String[][] result = classifyCharacters(one);
        displayTable(result);

        input.close();
    }
}
