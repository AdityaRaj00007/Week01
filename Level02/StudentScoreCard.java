import java.util.Random;

public class StudentScoreCard {

    // Method to generate random scores for PCM
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // Columns for Physics, Chemistry, and Math
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(50) + 50; // Physics score (50-99)
            scores[i][1] = random.nextInt(50) + 50; // Chemistry score (50-99)
            scores[i][2] = random.nextInt(50) + 50; // Math score (50-99)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateTotalsAndPercentages(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // Columns for total, average, and percentage
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Rounded to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounded to 2 decimal places
        }
        return results;
    }

    // Method to calculate grades based on percentage
    public static String[] calculateGrades(double[][] percentages) {
        String[] grades = new String[percentages.length];
        for (int i = 0; i < percentages.length; i++) {
            double percentage = percentages[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("S.No  Physics  Chemistry  Maths  Total  Average  Percentage  Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-5d %-8d %-10d %-6d %-6.0f %-8.2f %-11.2f %-5s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 10;
        int[][] scores = generateRandomScores(numStudents);
        double[][] results = calculateTotalsAndPercentages(scores);
        String[] grades = calculateGrades(results);
        displayScorecard(scores, results, grades);
    }
}
