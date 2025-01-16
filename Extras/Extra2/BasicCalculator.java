import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.println("Choose operation: +, -, *, /");
        char operation = input.next().charAt(0);
        double result = calculate(num1, num2, operation);
        System.out.println("Result: " + result);
    }

    // Method to perform the calculation based on the operation
    public static double calculate(double a, double b, char op) {
        // Use a switch statement to check the operation and perform the corresponding calculation
        switch (op) {
            case '+': // For addition
                return a + b;
            case '-': // For subtraction
                return a - b;
            case '*': // For multiplication
                return a * b;
            case '/': // For division
                // Check if b is not zero to avoid division by zero
                return b != 0 ? a / b : 0; // Return 0 if division by zero occurs
            default: // If the operation is invalid, return 0
                return 0;
        }
    }
}
