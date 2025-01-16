import java.util.Scanner;

public class CountVowelsAndConsonant {
    // Method to check if a character is a vowel or consonant
    public static String isVowelOrConsonant(char ch) {
        // Convert character to lowercase
        ch = Character.toLowerCase(ch);
        
        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } 
        // Check if the character is a consonant
        else if ((ch >= 'a' && ch <= 'z')) {
            return "Consonant";
        } 
        // Return "Not a Letter" if the character is not a letter
        else {
            return "Not a Letter";
        }
    }

    // Method to find the number of vowels and consonants in a string
    public static int[] numberOfVowelsAndConsonant(String one) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < one.length(); i++) {
            char ch = one.charAt(i);

            // Call method to check whether the character is a vowel or consonant
            if (isVowelOrConsonant(ch).equals("Vowel")) {
                vowels++;
            } else if (isVowelOrConsonant(ch).equals("Consonant")) {
                consonants++;
            }
        }
        
        return new int[] {vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String one = input.nextLine();
        int[] result = numberOfVowelsAndConsonant(one);
        System.out.println("Number of Vowels are: " + result[0]);
        System.out.println("Number of Consonants are: " + result[1]);
        
        input.close();
    }
}
