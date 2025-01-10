import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year ");
        int year = input.nextInt();

        // Part 1 - Multiple if-else statements
        if (year < 1582) {
            System.out.println("The year " + year + " is not a valid year in the Gregorian calendar ");
        } else {
            if (year % 400 == 0) {
                System.out.println("The year " + year + " is a Leap Year ");
            } else if (year % 100 == 0) {
                System.out.println("The year " + year + " is not a Leap Year ");
            } else if (year % 4 == 0) {
                System.out.println("The year " + year + " is a Leap Year ");
            } else {
                System.out.println("The year " + year + " is not a Leap Year ");
            }
        }

        // Part 2 - Single if statement with logical conditions
        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("The year " + year + " is a Leap Year ");
        } else if (year >= 1582) {
            System.out.println("The year " + year + " is not a Leap Year ");
        }

        input.close();
    }
}
