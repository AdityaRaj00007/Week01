import java.util.Scanner;

public class NumberFormat {
    public static int generateNumberFormatException(String one) {
        return Integer.parseInt(one);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String  ");
        String one = input.next();

        try {
            generateNumberFormatException(one);
        } catch (NumberFormatException e) {
            System.out.println(e + " \nUsing Try-Catch we have handled the NumberFormatException");
        }
        input.close();
       
    }
}
