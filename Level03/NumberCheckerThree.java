import java.util.Scanner;

public class NumberCheckerThree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = input.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = digitArray(number);
        System.out.println("Digits array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int[] reversedDigits = reverseArray(digits);
        System.out.println("Reversed digits array: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        boolean isPalindrome = isPalindrome(digits);
        System.out.println("Is Palindrome: " + isPalindrome);

        boolean isDuckNumber = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuckNumber);

        System.out.println("Enter another number to compare:");
        int numberToCompare = input.nextInt();
        int[] digitsToCompare = digitArray(numberToCompare);
        boolean areArraysEqual = compareArrays(digits, digitsToCompare);
        System.out.println("Are arrays equal: " + areArraysEqual);

        input.close();
    }

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to create digits array
    public static int[] digitArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }
}
