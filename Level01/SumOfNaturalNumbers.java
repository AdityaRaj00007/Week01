import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number ");
        } else {
            int sumUsingFormula = n * (n + 1) / 2;

            int sumUsingWhileLoop = 0;
            int i = 1;
            while (i <= n) {
                sumUsingWhileLoop += i;
                i++;
            }

            System.out.println("Sum using formula " + sumUsingFormula);
            System.out.println("Sum using while loop " + sumUsingWhileLoop);

            if (sumUsingFormula == sumUsingWhileLoop) {
                System.out.println("Both computations are correct ");
            } else {
                System.out.println("The computations do not match ");
            }
        }

        input.close();
    }
}
