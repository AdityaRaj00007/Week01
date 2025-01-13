import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and populate the 2D array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100; // Convert cm to meters
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters); // BMI formula
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i][2] <= 18.4) {
                status[i] = "Underweight";
            } else if (data[i][2] >= 18.5 && data[i][2] <= 24.9) {
                status[i] = "Normal";
            } else if (data[i][2] >= 25.0 && data[i][2] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // 10 rows, 3 columns

        // Input weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and determine status
        calculateBMI(data);
        String[] status = determineBMIStatus(data);

        // Display results
        System.out.println("\nPerson\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t" +
                               data[i][0] + "\t\t" +
                               data[i][1] + "\t\t" +
                               data[i][2] + "\t\t" +
                               status[i]);
        }

        scanner.close();
    }
}
