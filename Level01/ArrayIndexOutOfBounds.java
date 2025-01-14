import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    public static String generateArrayIndexOutOfBoundsException(String names[]) {
        return names[10000];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number of names : ");
        int numberOfNames = input.nextInt();

        String names[] = new String[numberOfNames];

        System.out.println("Enter the names  ");
        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("Enter the " + (i + 1) + "st name : ");
            names[i] = input.next();
        }

        try {
            generateArrayIndexOutOfBoundsException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + " \nUsing Try-Catch we have handled the ArrayIndexOutOfBoundsException");
        }
        input.close();
    }
}
