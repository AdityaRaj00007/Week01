import java.util.Scanner;

public class TemperatureConverter {
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose conversion: 1) Fahrenheit to Celsius  2) Celsius to Fahrenheit");
        int choice = input.nextInt();
        System.out.print("Enter temperature: ");
        double temp = input.nextDouble();

        if (choice == 1) {
            System.out.println("Converted Temperature: " + fahrenheitToCelsius(temp) + " °C");
        } else {
            System.out.println("Converted Temperature: " + celsiusToFahrenheit(temp) + " °F");
        }
    }
}
