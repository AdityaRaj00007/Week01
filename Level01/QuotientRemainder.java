import java.util.Scanner;

class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for two numbers
        System.out.println("Enter the dividend ");
        int number = input.nextInt();

        System.out.println("Enter the divisor ");
        int divisor = input.nextInt();

        // Validate divisor to avoid division by zero
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero ");
            return;
        }

        // Find the quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the results
        System.out.println("Quotient: " + result[1]);
        System.out.println("Remainder: " + result[0]);
    }

    // Method to find the remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;  // Calculate remainder
        int quotient = number / divisor;  // Calculate quotient
        return new int[]{remainder, quotient}; // Return both in an array
    }
}
