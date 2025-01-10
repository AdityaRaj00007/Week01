import java.util.Scanner;
public class CmToFeet
{
  public static void main(String args [])
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Height in Cm:");
	  double heightInCm = input.nextDouble();
    double heightInInch = heightInCm/2.54;
    int heightInFeet = (int) (heightInInch / 12);
    int inch = (int)heightInInch % 12	;
	System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + inch);
	input.close();
  }
}