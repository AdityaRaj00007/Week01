import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of persons ");
        int numPersons = input.nextInt();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + " ");
            weights[i] = input.nextDouble();

            System.out.println("Enter height (cm) for person " + (i + 1) + " ");
            heights[i] = input.nextDouble();

            heights[i] = heights[i] / 100; // Convert height to meters
            bmis[i] = weights[i] / (heights[i] * heights[i]); // Calculate BMI

            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] < 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight(kg): " + weights[i]);
            System.out.println("Height(m): " + heights[i]);
            System.out.println("BMI: " + bmis[i]);
            System.out.println("Status: " + statuses[i]);
            System.out.println();
        }
    }
}
