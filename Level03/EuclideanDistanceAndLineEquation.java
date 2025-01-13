import java.util.Scanner;

class EuclideanDistanceAndLineEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter coordinates for Point 1 (x1, y1):");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter coordinates for Point 2 (x2, y2):");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = findEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the two points: " + distance);

        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        if (lineEquation != null) {
            System.out.println("Equation of the line: y = " + lineEquation[0] + "*x + " + lineEquation[1]);
        } else {
            System.out.println("The two points are vertical, so the slope is undefined.");
        }
    }

    public static double findEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        if (x2 == x1) {
            // Slope is undefined for vertical lines
            return null;
        }
        double slope_m = (y2 - y1) / (x2 - x1); // Calculate slope
        double yIntercept = y1 - slope_m * x1;  // Calculate y-intercept
        return new double[]{slope_m, yIntercept};
    }
}
