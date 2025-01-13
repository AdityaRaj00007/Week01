import java.util.Scanner;

public class FactorCalculator {

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array with the count of factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to calculate the sum of the factors
        public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of the factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate the sum of squares of the factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = findFactors(number);

        
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        
        int sum = sumOfFactors(factors);
        System.out.println("Sum of Factors: " + sum);

        
        long product = productOfFactors(factors);
        System.out.println("Product of Factors: " + product);

        
        int sumOfSquares = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of Squares of Factors: " + sumOfSquares);

        input.close();
    }
}
