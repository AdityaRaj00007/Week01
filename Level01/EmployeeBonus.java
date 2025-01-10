import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the salary ");
        double salary = input.nextDouble();
        
        System.out.println("Enter the years of service ");
        int yearsOfService = input.nextInt();

        double bonus = 0;

        if (yearsOfService > 5) {
            bonus = salary * 0.05; 
        }

        System.out.println("The bonus amount is " + bonus);

        input.close();
    }
}
