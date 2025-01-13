import java.util.Scanner;

public class LeapYearCheck {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check and display result
        if (isLeapYear(year)) {
            System.out.println("The year " + year + " is a Leap Year.");
        } else {
            System.out.println("The year " + year + " is NOT a Leap Year.");
        }

        input.close();
    }
        // Method to check if a year is a leap year
        public static boolean isLeapYear(int year) {
        if (year >= 1582) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
        return false; // Only valid for years >= 1582
    }
}
