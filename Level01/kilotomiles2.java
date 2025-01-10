import java.util.*;
public class kilotomiles2
{
  public static void main(String args [])
  {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter distance in km ");
     double km = input.nextDouble();
	 double kmTomiles = km * 0.621371;
	 System.out.println("The total miles is " + kmTomiles + " mile for given " + km);
  }
}