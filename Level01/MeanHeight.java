import java.util.Scanner;
class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store heights of 11 players
        double[] heights = new double[11];
        double totalHeight = 0.0;

        // Input player heights
        System.out.println("Enter the heights of 11 players ");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height ");
            heights[i] = input.nextDouble();
            totalHeight += heights[i]; 
        }

        // Calculate and display the mean height
        double meanHeight = totalHeight / heights.length;
        System.out.println("Mean height of the team " + meanHeight);

        input.close(); 
    }
}
