import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to get the number of days in a month
    public static int getNumberOfDaysInMonth(int month, int year) {
        // Array containing the number of days for each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check for leap year and adjust February
        if (month == 2 && isLeapYear(year)) {
            return 29; // Leap year adjustment
        }
        
        return daysInMonth[month - 1];
    }

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        // A leap year is divisible by 4, but not by 100 unless also divisible by 400
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Method to get the first day of the month (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        
        return d0;
    }

    // Method to display the calendar for the given month and year
    public static void displayCalendar(int month, int year) {
        // Get the first day of the month and the number of days in the month
        int firstDay = getFirstDayOfMonth(month, year);
        int numberOfDays = getNumberOfDaysInMonth(month, year);
        
        // Display the calendar title
        System.out.println("Calendar for " + getMonthName(month) + " " + year);
        
        // Display the days of the week
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Display leading spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Display the days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);

            // If it's Saturday, move to the next line
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        // Print the final newline if the last day isn't Saturday
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();
        displayCalendar(month, year);

        input.close();
    }
}
