import java.util.Scanner;

public class WindChillTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double temperature = input.nextDouble();
        System.out.println("Enter wind speed in mph: ");
        double windSpeed = input.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill temperature is: " + windChill);
    }
        // Method to calculate Wind Chill Temperature
        public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
