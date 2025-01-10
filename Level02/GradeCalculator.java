import java.util.Scanner;
class GradeCalculator {
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter marks for Physics: ");
        int physicsMarks = input.nextInt();
        
        System.out.print("Enter marks for Chemistry: ");
        int chemistryMarks = input.nextInt();
        
        System.out.print("Enter marks for Maths: ");
        int mathsMarks = input.nextInt();

        int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / 3.0);

       
        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "Excellent";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Average";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Satisfactory";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Needs Improvement";
        } else {
            grade = "R";
            remarks = "Failed";
        }

        
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

         input.close();
    }
}