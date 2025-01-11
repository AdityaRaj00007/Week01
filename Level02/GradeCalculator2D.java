import java.util.Scanner;

public class GradeCalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students ");
        int numberOfStudents = input.nextInt();

        double[][] marks = new double[numberOfStudents][3]; // Marks for Physics, Chemistry, Maths
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Input marks in a 2D array
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                while (true) {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    System.out.print("Enter marks for " + subject + " of student " + (i + 1) + " ");
                    marks[i][j] = input.nextDouble();

                    if (marks[i][j] >= 0) {
                        break;
                    } else {
                        System.out.println("Marks should be positive. Please enter again ");
                    }
                }
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        
        System.out.println("\nStudent Marks, Percentage and Grade ");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + " - Physics " + marks[i][0] + ", Chemistry " + marks[i][1] + ", Maths " + marks[i][2] + ", Percentage " + percentages[i] + "%, Grade  " + grades[i]);
        }
    }
}
