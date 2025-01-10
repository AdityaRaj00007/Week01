import java.util.Scanner;

class TravelComputation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = input.nextLine();

        System.out.println("Enter the starting city (fromCity) ");
        String fromCity = input.nextLine();

        System.out.println("Enter the via city (viaCity) ");
        String viaCity = input.nextLine();

        System.out.println("Enter the destination city (toCity) ");
        String toCity = input.nextLine();

        System.out.println("Enter the distance from " + fromCity + " to " + viaCity + " in miles ");
        double distanceFromToVia = input.nextDouble();

        System.out.println("Enter the time taken to travel from " + fromCity + " to " + viaCity + " in minutes ");
        int timeFromToVia = input.nextInt();

        System.out.println("Enter the distance from " + viaCity + " to " + toCity + " in miles ");
        double distanceViaToFinalCity = input.nextDouble();

        System.out.println("Enter the time taken to travel from " + viaCity + " to " + toCity + " in minutes ");
        int timeViaToFinalCity = input.nextInt();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

       System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
						 
       input.close();
    }
}
