import java.util.Scanner;

class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year ");
        int year = input.nextInt();

        // Single if statement with logical operators
        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("The year " + year + " is a Leap Year ");
        } else if (year >= 1582) {
            System.out.println("The year " + year + " is not a Leap Year ");
        } else {
            System.out.println("The year " + year + " is not a valid year in the Gregorian calendar ");
        }

        input.close();
    }
}
