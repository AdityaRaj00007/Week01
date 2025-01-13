import java.util.Scanner;

public class NumberCheckerFive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = input.nextInt();

        // Calling different methods and displaying the results
        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest factor of " + number + ": " + greatestFactor(factors));
        System.out.println("Sum of factors of " + number + ": " + sumOfFactors(factors));
        System.out.println("Product of factors of " + number + ": " + productOfFactors(factors));
        System.out.println("Product of cubes of factors of " + number + ": " + productOfCubesOfFactors(factors));
        System.out.println(number + " is a perfect number: " + isPerfectNumber(factors, number));
        System.out.println(number + " is an abundant number: " + isAbundantNumber(factors, number));
        System.out.println(number + " is a deficient number: " + isDeficientNumber(factors, number));
        System.out.println(number + " is a strong number: " + isStrongNumber(number));

        input.close();
    }

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        int greatest = 0;
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cubes of the factors using Math.pow()
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int[] factors, int number) {
        return sumOfFactors(factors) == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int[] factors, int number) {
        return sumOfFactors(factors) > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int[] factors, int number) {
        return sumOfFactors(factors) < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == originalNumber;
    }

    // Helper method to calculate the factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
