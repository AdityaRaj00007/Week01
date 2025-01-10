import java.util.Scanner;
public class DiscountFeeUserInput
{
  public static void main(String args [])
  {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter fee ");
  double fee = input.nextDouble();
  System.out.println("Enter discount percentage ");
	double discountPercent = input.nextDouble();
	double discount = fee * discountPercent/100;
	double discountedfee = fee - discount;
	System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedfee);
  }
}