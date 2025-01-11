import java.util.Scanner;

class ArraySumWithLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (maximum 10 values) Enter 0 or a negative number to stop ");

        // Infinite loop to take user input
        while (true) {
            double userInput = input.nextDouble();

            // Break if the user enters 0, a negative number, or if the array is full
            if (userInput <= 0 || index == 10) {
                break;
            }

            // Store the user input in the array and increment the index
            numbers[index] = userInput;
            index++;
        }

        // Calculate the sum of the elements in the array
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the entered numbers and their sum
        System.out.println("The entered numbers are:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("The total sum of the numbers is " + total);

        input.close();
    }
}
