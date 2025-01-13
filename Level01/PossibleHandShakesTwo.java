import java.util.Scanner;

public class PossibleHandShakesTwo {
      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        if (numberOfStudents < 2) {
            System.out.println("There must be at least 2 students for handshakes.");
        } else {
            
            int possibleHandshakes = calculateHandshakes(numberOfStudents);

            System.out.println("The maximum number of handshakes is: " + possibleHandshakes);
        }

        input.close();
    }
       // Method to calculate the maximum number of Possible handshakes
       public static int calculateHandshakes(int n) {

        // Using combination formula
        return (n * (n - 1)) / 2;

    }
}
