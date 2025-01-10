import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double number;

        System.out.println("Enter numbers to add to the total. Enter 0 to stop ");
        do {
            number = input.nextDouble();
            if (number != 0) {
                total += number;
            }
        } while (number != 0);

        
        System.out.println("The total sum is " + total);

        input.close();
    }
}
