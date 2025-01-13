import java.util.Scanner;

public class UnitConverter2 {

    // Length conversions
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    

    public static void main(String[] args) {
         Scanner input =  new Scanner(System.in);
        System.out.println("Enter the distance in Yards");
        int yards = input.nextInt();
        System.out.println("Enter the distance in Miles");
        int feet = input.nextInt();
        System.out.println("Enter the distance in Meters");
        int meters = input.nextInt();
        System.out.println("Enter the distance in Inches");
        int inches = input.nextInt();
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + convertInchesToCentimeters(inches) + " Centimeters");
        
    }
}
