import java.util.Scanner;

class MultiDimensionalTo1dArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows ");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns ");
        int columns = input.nextInt();

        // Creating a 2D array
        int[][] matrix = new int[rows][columns];

        // Taking user input for the 2D array elements
        System.out.println("Enter the elements of the matrix ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element at position (" + i + "," + j + ") ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Creating a 1D array to copy elements from the 2D array
        int[] array = new int[rows * columns];
        int index = 0;

        // Copying elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        
        System.out.println("The original 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The 1D array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}
