import java.util.Scanner;

class BMI2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of persons ");
        int numPersons = input.nextInt();

        double[][] personData = new double[numPersons][3]; 
        String[] weightStatus = new String[numPersons]; 

        // Input for weight and height, and calculate BMI
        for (int i = 0; i < numPersons; i++) {
            // Take input for weight, ensuring it's a positive value
            double weight = -1;
            while (weight <= 0) {
                System.out.println("Enter weight (kg) for person " + (i + 1) + " ");
                weight = input.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive value for weight ");
                }
            }
            personData[i][0] = weight; // Store weight in the first column

            // Take input for height, ensuring it's a positive value
            double height = -1;
            while (height <= 0) {
                System.out.println("Enter height (cm) for person " + (i + 1) + " ");
                height = input.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value for height ");
                }
            }
            personData[i][1] = height / 100; // Convert height to meters and store it in the second column

            // Calculate BMI and store it in the third column
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + " ");
            System.out.println("Weight(kg) " + personData[i][0]);
            System.out.println("Height(m) " + personData[i][1]);
            System.out.println("BMI " + personData[i][2]);
            System.out.println("Status " + weightStatus[i]);
            System.out.println();
        }
    }
}
