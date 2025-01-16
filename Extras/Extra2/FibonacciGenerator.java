import java.util.Scanner;

public class FibonacciGenerator {
    // Method to Generate Fibonacci Series and print it
       public static int getInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextInt();
    }

    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int terms = getInput("Enter the number of terms: ");
        generateFibonacci(terms);
        
    }
}
