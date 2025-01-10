import java.util.Scanner;

class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers ");
        } else {
            int factorial = 1;
            int i = 1;

            while (i <= num) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + num + " is " + factorial);
        }

        input.close();
    }
}
