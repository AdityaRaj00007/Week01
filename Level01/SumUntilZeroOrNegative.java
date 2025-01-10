import java.util.Scanner;

class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double number;

        System.out.println("Enter numbers to add to the total. Enter 0 or a negative number to stop ");

        while (true) {
            number = input.nextDouble();
            
            if (number <= 0) {
                break;
            }

            total += number;
        }

        System.out.println("The total sum is " + total);

        input.close();
    }
}
