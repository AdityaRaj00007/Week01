import java.util.Scanner;

public class StudentCanVote {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Student " + (i + 1) + " age: " + ages[i] + " - " +
                    (canStudentVote(ages[i]) ? "Can vote" : "Cannot vote"));
        }

        input.close();
    }
        // Method to check if a student can vote
        public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; 
        }
        return age >= 18;
    }
}
