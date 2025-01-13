import java.util.Scanner;

class Calendar {

    //method to get the name of the month
    public static String getMonthName(int month){
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1]; 
    }

    public static int getNumberOfDays(int month, int year){

        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    //method to check if a year is a leap year
    public static boolean isLeapYear(int year){
        //check for leap year
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        return isLeap;
    }

    //method to get the first day of the month
    public static int getFirstDayOfMonth(int month, int year){

        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;

        int day = (1 + x + (31 * m) / 12) % 7;

        return day;
    }

    //method to display the calendar
    public static void displayCalendar(int month, int year){
        System.out.println("\n    " + getMonthName(month) + " " + year+ "\n Sun Mon Tue Wed Thu Fri Sat");

        //get the first day of the month and the number of days
        int firstDay = getFirstDayOfMonth(month, year);
        int numberOfDays = getNumberOfDays(month, year);

        //leading spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        //print the days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%4d", day);
            if ((day + firstDay) % 7 == 0){ 
                //next line after saturday
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month - ");
        int month = input.nextInt();
        System.out.print("Enter year- ");
        int year = input.nextInt();

        displayCalendar(month, year);
     
        input.close();
    }
}
