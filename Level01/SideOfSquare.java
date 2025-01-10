import java.util.Scanner;
public class SideOfSquare
{
  public static void main(String args [])
  {
     Scanner input  = new Scanner(System.in);
   System.out.println("Enter perimeter of Square ");
	 double perimeterOfSquare = input.nextDouble();
	 double sideOfSquare = perimeterOfSquare/4;
	 System.out.println("The length of the side is " + sideOfSquare + " whose perimeter is " + perimeterOfSquare);
	 input.close();
  }
}