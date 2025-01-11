import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of students
        System.out.println("Enter the number of students ");
        int numberOfStudents = input.nextInt();

        double[] physicsMarks = new double[numberOfStudents]; // Array to store physics marks
        double[] chemistryMarks = new double[numberOfStudents]; // Array to store chemistry marks
        double[] mathsMarks = new double[numberOfStudents]; // Array to store maths marks
        double[] percentages = new double[numberOfStudents]; // Array to store percentages
        char[] grades = new char[numberOfStudents]; // Array to store grades

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            // Input physics marks
            System.out.print("Physics ");
            physicsMarks[i] = input.nextDouble();
            while (physicsMarks[i] < 0 || physicsMarks[i] > 100) {
                System.out.println("Invalid input. Please enter marks between 0 and 100.");
                System.out.print("Physics ");
                physicsMarks[i] = input.nextDouble();
            }

            // Input chemistry marks
            System.out.print("Chemistry ");
            chemistryMarks[i] = input.nextDouble();
            while (chemistryMarks[i] < 0 || chemistryMarks[i] > 100) {
                System.out.println("Invalid input. Please enter marks between 0 and 100 ");
                System.out.print("Chemistry ");
                chemistryMarks[i] = input.nextDouble();
            }

            // Input maths marks
            System.out.print("Maths ");
            mathsMarks[i] = input.nextDouble();
            while (mathsMarks[i] < 0 || mathsMarks[i] > 100) {
                System.out.println("Invalid input. Please enter marks between 0 and 100 ");
                System.out.print("Maths ");
                mathsMarks[i] = input.nextDouble();
            }

           
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3;

            
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display results
        System.out.println("\nStudent Marks, Percentage and Grade ");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + " - Physics " + physicsMarks[i] + ", Chemistry " + chemistryMarks[i] + ", Maths " + mathsMarks[i] + ", Percentage " + percentages[i] + "%, Grade " + grades[i]);
        }
    }
}
