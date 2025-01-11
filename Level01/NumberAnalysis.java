import java.util.Scanner;

class NumberAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking input for 5 numbers
        System.out.println("Enter 5 numbers ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Analyzing each number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println("The number " + numbers[i] + " is positive and even");
                } else {
                    System.out.println("The number " + numbers[i] + " is positive and odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println("The number " + numbers[i] + " is negative");
            } else {
                System.out.println("The number " + numbers[i] + " is zero");
            }
        }

        // Comparing the first and last elements
        if (numbers[0] == numbers[4]) {
            System.out.println("The first and last numbers are equal");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("The first number is greater than the last number");
        } else {
            System.out.println("The first number is less than the last number");
        }

        input.close();
    }
}
