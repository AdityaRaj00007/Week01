import java.util.Scanner;

public class SumOfnNaturalNUmber {

    // Recursive method to calculate the sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to calculate the sum using the formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Validate the input
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0). Exiting.");
            return;
        }

        // Calculate sums
        int sumRecursion = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);

        // Display results
        System.out.println("Sum using Recursion: " + sumRecursion);
        System.out.println("Sum using Formula: " + sumFormula);

        // Verify results
        if (sumRecursion == sumFormula) {
            System.out.println("Both computations are correct!");
        } else {
            System.out.println("There is a mismatch in the results.");
        }

        input.close();
    }
}
