import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = input.nextInt();
        
        boolean isPrime = true; 

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The number " + num + " is a Prime number ");
        } else {
            System.out.println("The number " + num + " is not a Prime number ");
        }

        input.close();
    }
}

