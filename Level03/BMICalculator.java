import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and Status
    public static String[][] calculateBMI(double[][] data) {
        String[][] results = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInMeters = heightInCm / 100.0; // Convert height to meters
            double bmi = weight / (heightInMeters * heightInMeters);

            // Determine BMI status
            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store values in the result array
            results[i][0] = String.valueOf(heightInCm);
            results[i][1] = String.valueOf(weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }

        return results;
    }

    // Method to display the results
    public static void displayResults(String[][] results) {
        System.out.println("Height (cm)  Weight (kg)  BMI           Status");
        for (int i = 0; i < 10; i++) {
            System.out.println(
                results[i][0] + "           " +
                results[i][1] + "          " +
                results[i][2] + "          " +
                results[i][3]
            );
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][2];
        System.out.println("Enter weight (in kg) and height (in cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Member " + (i + 1) + " - Weight (kg): ");
            data[i][0] = input.nextDouble();
            System.out.print("Member " + (i + 1) + " - Height (cm): ");
            data[i][1] = input.nextDouble();
        }
        String[][] results = calculateBMI(data);
        System.out.println("\nBMI Report:");
        displayResults(results);
        
        input.close();
    }
}
