import java.util.Scanner;

class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number ");
        } else {
            int sumUsingFormula = n * (n + 1) / 2;

            int sumUsingForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumUsingForLoop += i;
            }

            System.out.println("Sum using formula " + sumUsingFormula);
            System.out.println("Sum using for loop " + sumUsingForLoop);

            if (sumUsingFormula == sumUsingForLoop) {
                System.out.println("Both computations are correct ");
            } else {
                System.out.println("The computations do not match ");
            }
        }

        input.close();
    }
}
