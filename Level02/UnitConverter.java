
import java.util.Scanner;

public class UnitConverter {

    
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

   
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

   
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the distance in Kilometer");
        int km = input.nextInt();
        System.out.println("Enter the distance in Miles");
        int miles = input.nextInt();
        System.out.println("Enter the distance in Meter");
        int meter = input.nextInt();
        System.out.println("Enter the distance in Feet");
        int feet = input.nextInt();
        
        
        System.out.println(km + " kilometers = " + convertKmToMiles(km) + " miles");
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " kilometers");
        System.out.println(meter + " meters = " + convertMetersToFeet(meter) + " feet");
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
    }
}
