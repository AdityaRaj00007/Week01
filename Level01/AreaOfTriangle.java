import java.util.Scanner;
class AreaOfTriangle
{
  public static void main(String args [])
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the base of the triangle in inches ");
    double baseInches = input.nextDouble();

    System.out.println("Enter the height of the triangle in inches ");
    double heightInches = input.nextDouble();

    double areaInSquareInches = 0.5 * baseInches * heightInches;
    double areaInSquareCentimeters = areaInSquareInches * 6.4516;

    System.out.println("Area of Triangle is " + areaInSquareInches + " square inches" + " and " + areaInSquareCentimeters + " square centimeters");
    input.close();
  }
}