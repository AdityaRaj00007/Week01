import java.util.Scanner;

class LargestNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int number1 = input.nextInt();

        System.out.println("Enter the second number ");
        int number2 = input.nextInt();

        System.out.println("Enter the third number ");
        int number3 = input.nextInt();

        boolean isFirstLargest = number1 > number2 && number1 > number3;
        boolean isSecondLargest = number2 > number1 && number2 > number3;
        boolean isThirdLargest = number3 > number1 && number3 > number2;

        System.out.println("Is the first number the largest ");
        System.out.println(isFirstLargest);

        System.out.println("Is the second number the largest ");
        System.out.println(isSecondLargest);

        System.out.println("Is the third number the largest ");
        System.out.println(isThirdLargest);

        input.close();
    }
}
