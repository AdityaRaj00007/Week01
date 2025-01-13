import java.util.Scanner;

public class UnitConverter3 {

    
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the Temperature in Fahrenheit");
        int fahrenheit = input.nextInt();
        System.out.println("Enter the Temperature in Celsius");
        int celsius = input.nextInt();
        System.out.println("Enter the Weight in Pounds");
        int pounds = input.nextInt();
        System.out.println("Enter the Weight in Kilograms");
        int kilograms = input.nextInt();
        System.out.println("Enter the Volume in Gallons");
        int gallons = input.nextInt();
        System.out.println("Enter the Volume in Litres");
        int litres = input.nextInt();
        System.out.println(fahrenheit + " Fahrenheit = " + convertFahrenheitToCelsius(fahrenheit) + " Celsius");
        System.out.println(celsius + " Celsius = " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit");
        System.out.println(pounds + " pounds = " + convertPoundsToKilograms(pounds) + " kilograms");
        System.out.println(kilograms + " kilograms = " + convertKilogramsToPounds(kilograms) + " pounds");
        System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");
        System.out.println(litres + " liters = " + convertLitersToGallons(litres) + " gallons");
    }
}
