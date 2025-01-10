import java.util.Scanner;
public class NumberOfHandshake
{
  public static void main(String args [])
  {
    Scanner input = new Scanner(System.in);
	System.out.println("Enter the Number of Student ");
	int numberOfStudents = input.nextInt();
	int totalNumOfHandshake = (numberOfStudents*(numberOfStudents - 1))/2;
	System.out.println("Number of possible handshakes " + totalNumOfHandshake);
	input.close();
  }
}