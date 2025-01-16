import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionGenerator {
    public static char generateStringIndexOutOfBoundsException(String one) {
        return one.charAt(100);
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String ");
        String one = input.next();
        try {
            generateStringIndexOutOfBoundsException(one);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e + " \nUsing Try-Catch we have handled the StringIndexOutOfBoundsException");
        }
        input.close();
    }
}
