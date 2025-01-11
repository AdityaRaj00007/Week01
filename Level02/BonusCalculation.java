import java.util.Scanner;

class BonusCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        int EMPLOYEE_COUNT = 10;
        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + " ");
            double salary = input.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + " ");
            double years = input.nextDouble();

           
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter again ");
                i--; 
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double bonusPercentage = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nEmployee-wise details ");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
             System.out.println("Employee " + (i + 1) + ": Old Salary = " + salaries[i] 
                               + ", Bonus = " + bonuses[i] 
                               + ", New Salary = " + newSalaries[i]);

        System.out.println("\nTotal Bonus Payout " + totalBonus);
        System.out.println("Total Old Salary " + totalOldSalary);
        System.out.println("Total New Salary " + totalNewSalary);

        input.close();
    }
}
}