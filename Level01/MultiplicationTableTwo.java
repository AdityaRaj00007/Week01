import java.util.Scanner;

class MultiplicationTableTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to generate its multiplication table ");
        int number = input.nextInt();

        
        int[] multiplicationResult = new int[4];

       
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i-6] = number * i;
        }
        System.out.println("The multiplication table of " + number + " from 6 to 9 is ");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        input.close();
    }
}
