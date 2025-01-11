import java.util.Scanner;
class OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a natural number ");
            return; // Exit for invalid input
        }

        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0;

        // Separate odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Display odd and even numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        input.close(); 
    }
}

