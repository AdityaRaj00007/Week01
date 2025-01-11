import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number ");
        long number = input.nextLong();

        // For negative numbers
        number = Math.abs(number);

        int[] frequency = new int[10];

        while (number > 0) {
            int lastDigit = (int) (number % 10); 
            frequency[lastDigit]++;
            number /= 10;
        }

        System.out.println("Frequency of each digit ");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        input.close();
    }
}
