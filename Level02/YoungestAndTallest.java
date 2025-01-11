import java.util.Scanner;

class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + " ");
            ages[i] = input.nextInt();
            System.out.println("Enter height (in cm) of " + names[i] + " ");
            heights[i] = input.nextDouble();
        }

        
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + " years");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");

        input.close();
    }
}
