import java.util.Scanner;

public class RemoveDuplicates {
    
    // Method to remove duplicate characters from the input string
    public static String removeDuplicates(String one) {
        String result = ""; // String to store the result with duplicates removed
        
        // Loop through each character in the input string
        for (int i = 0; i < one.length(); i++) {
            char ch = one.charAt(i); 
            // Skip spaces (spaces are not considered in the result)
            if (ch == ' ') {
                result += ""; // This line does nothing since we are not adding anything for spaces
            } 
            // If the character is not already in the result string, add it
            else if (!result.contains(String.valueOf(ch))) {
                result += ch; // Append the character to the result string
            }
        }
        
      
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String one = input.nextLine();
        System.out.println(removeDuplicates(one));
        input.close();
    }
}
