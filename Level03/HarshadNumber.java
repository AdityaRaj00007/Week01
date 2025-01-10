import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = input.nextInt();

        int digitSum = 0;
        int originalNumber = num;

        while (originalNumber != 0) {
            int lastDigit = originalNumber % 10;
            digitSum += lastDigit;
            originalNumber /= 10;
        }

        if (num % digitSum == 0) {
            System.out.println(num + " is a Harshad Number ");
        } else {
            System.out.println(num + " is not a Harshad Number ");
        }
        input.close();
    }
}
