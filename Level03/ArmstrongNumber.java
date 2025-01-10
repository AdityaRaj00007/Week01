import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = input.nextInt();

        int sum = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, 3);
            originalNumber /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number ");
        } else {
            System.out.println(number + " is not an Armstrong number ");
        }
        input.close();
    }
}
