import java.util.Scanner;

public class SimpleInterest {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter the Time in years: ");
        double time = input.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal
                + ", Rate of Interest " + rate + " and Time " + time);

        input.close();
    }
    // Method to calculate Simple Interest
     public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
