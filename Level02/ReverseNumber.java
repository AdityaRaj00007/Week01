import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
        int number = input.nextInt();

        // Find the count of digits
        int temp = number;
        int digitCount = 0;
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        // Store digits in an array
        int[] digits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Display the array in reverse order
        System.out.println("Reversed number ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}
