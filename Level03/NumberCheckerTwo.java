import java.util.Scanner;
public class NumberCheckerTwo {

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int number = input.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = digitArrays(number);
        System.out.println("Digits array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int sumOfDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);

        // Sum of squares of digits
        int sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check if Harshad Number
        boolean isHarshad = isHarshadNumber(number, sumOfDigits);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Frequency of each digit
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int[] pair : frequency) {
            System.out.println("Digit: " + pair[0] + ", Frequency: " + pair[1]);
        }
        input.close();
    }
    // count the digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] digitArrays(int number) {
        int num = number;
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // check if the number is a Harshad number
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }

    // frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }

        int count = 0;
        for (int f : freq) {
            if (f > 0) {
                count++;
            }
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }


}
