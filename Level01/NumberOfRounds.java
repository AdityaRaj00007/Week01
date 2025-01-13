import java.util.Scanner;

public class NumberOfRounds {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the first side of the triangular park (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of the second side of the triangular park (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of the third side of the triangular park (in meters): ");
        double side3 = input.nextDouble();

        double totalDistance = 5.0;

        // number of rounds
        int numberOfRounds = calculateRounds(side1, side2, side3, totalDistance);

        System.out.println("The athlete needs to complete " + numberOfRounds + " rounds to cover 5 kilometers.");

        input.close();
    }
        // Method to calculate the number of rounds needed to complete to 5Km
        public static int calculateRounds(double side1, double side2, double side3, double totalDistance) {
        // Calculate perimeter
        double perimeter = side1 + side2 + side3;
        double distanceInMeters = totalDistance * 1000;

        // Calculate the number of rounds (round up to the nearest whole number)
        return (int) Math.ceil(distanceInMeters / perimeter); 
    }
}
