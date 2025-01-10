import java.util.Scanner;

class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for ages
        System.out.println("Enter the age of Amar ");
        int amarAge = input.nextInt();

        System.out.println("Enter the age of Akbar ");
        int akbarAge = input.nextInt();

        System.out.println("Enter the age of Anthony ");
        int anthonyAge = input.nextInt();

        // Take input for heights
        System.out.println("Enter the height of Amar in cm ");
        double amarHeight = input.nextDouble();

        System.out.println("Enter the height of Akbar in cm ");
        double akbarHeight = input.nextDouble();

        System.out.println("Enter the height of Anthony in cm ");
        double anthonyHeight = input.nextDouble();

        // Find the youngest friend (smallest age)
        int youngestAge = amarAge;
        String youngestFriend = "Amar";

        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }

        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        // Find the tallest friend (largest height)
        double tallestHeight = amarHeight;
        String tallestFriend = "Amar";

        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }

        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        // Display the results
        System.out.println("The youngest friend is  " + youngestFriend + " with age " + youngestAge + " years ");
        System.out.println("The tallest friend is  " + tallestFriend + " with height " + tallestHeight + " cm ");

        input.close();
    }
}
