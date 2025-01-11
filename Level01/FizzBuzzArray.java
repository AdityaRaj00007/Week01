import java.util.Scanner;

class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a positive integer ");
        int number = input.nextInt();

        // Check if input is a positive integer
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer ");
            return;
        }

        // Creating a String array to store the results
        String[] results = new String[number + 1];

        // FizzBuzz logic and storing results in the array
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Printing the array with position and value
        for (int i = 0; i <= number; i++) {
            System.out.println(i + " = " + results[i]);
        }

        input.close();
    }
}
