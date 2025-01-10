import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = (int)distanceInYards / 1760;
        int yardInMiles = (int)distanceInYards%1760;
        
        System.out.println("Distance of " + distanceInFeet + " feet in miles and yard is " + distanceInMiles + " miles and " + yardInMiles + " yard");
       
		input.close();
    }
}
