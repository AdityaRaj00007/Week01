import java.util.Scanner;

class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int number1 = input.nextInt();

        System.out.println("Enter the second number ");
        int number2 = input.nextInt();

        System.out.println("Enter the third number ");
        int number3 = input.nextInt();

        
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the results
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }

    
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1; // Assume the first number is smallest
        int largest = number1; // Assume the first number is largest

        // Compare to find the smallest
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        // Compare to find the largest
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Return the smallest and largest numbers in an array
        return new int[]{smallest, largest};
    }
}
