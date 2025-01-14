import java.util.Arrays;
import java.util.Scanner;

public class CharArrayConversion {

    public static char[] chartoCharArray(String one) {
        char charArray[] = new char[one.length()];
        for (int i = 0; i < one.length(); i++) {
            charArray[i] = one.charAt(i);
        }
        return charArray;
    }

    public static char[] usingCharArrayMethod(String one) {
        return one.toCharArray();
    }

    public static boolean compare(char[] one, char[] two) {
        return Arrays.equals(one, two); // Compare array contents
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String one = input.next();
        char charArray[] = chartoCharArray(one);
        char charArrayUsingMethod[] = usingCharArrayMethod(one);

        if (compare(charArray, charArrayUsingMethod)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }

        input.close(); 
    }
}
