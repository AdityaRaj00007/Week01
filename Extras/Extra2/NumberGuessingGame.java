import java.util.Scanner;
public class NumberGuessingGame {
       public static int generateGuess(int low, int high) {
        return low + (int) (Math.random() * (high - low + 1));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int low = 1, high = 100;
        boolean correct = false;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        while (!correct) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            String feedback = input.nextLine().toLowerCase();

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number!");
                correct = true;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }

        input.close();
    }
}
