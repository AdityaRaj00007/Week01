import java.util.Scanner;
public class IllegalArgumentExceptionGenerator {

    // Method to generate an IllegalArgumentException
    public static void generateIllegalArgumentException(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed: " + number);
        } else {
            System.out.println("The number is valid: " + number);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        try {
            generateIllegalArgumentException(number);
        } catch (IllegalArgumentException e) {
            System.out.println(e + " \nUsing Try-Catch we have handled the IllegalArgumentException.");
        }

        input.close();
        
    }
}
