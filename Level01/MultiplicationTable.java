import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number from user
        System.out.println("Enter a number ");
        int number = input.nextInt();

        // Define an array to store multiplication results
        int[] table = new int[10];

        // Calculate and store results in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        input.close();
    }
}
