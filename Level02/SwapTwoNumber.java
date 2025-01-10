import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Number1 ");
		int number1 = input.nextInt();
		
		System.out.println("Enter Number2 ");
		int number2 = input.nextInt();
		
		number1 = number1 ^ number2;
		number2 = number1 ^ number2;
		number1 = number1 ^ number2;
		
		System.out.println("The swapped numbers are " + number1 + "  and " + number2);
        input.close();
    }
}
