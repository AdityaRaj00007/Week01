import java.util.Scanner;

class CheckVotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];

        // Taking input for ages of 10 students
        System.out.println("Enter the ages of 10 students ");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
        }

        // Checking voting eligibility
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote ");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote ");
            }
        }
        input.close();
    }
}
