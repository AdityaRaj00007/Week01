import java.util.Scanner;

public class SumOfNaturalNumbers {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int result = sum(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        }

        input.close();
    }
        // Method to calculate the sum of n natural numbers
         public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
