public class ShortestTallest {
        public static void main(String[] args) {
        int[] heights = new int[11];

        randomHeights(heights); // This will store random heights in the array

        System.out.println("Heights of players (in cms):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Calculate and display results
        int sum = findSum(heights);
        double mean = findMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\nResults:");
        System.out.println("Sum of heights: " + sum + " cms");
        System.out.println("Mean height: " + mean + " cms");
        System.out.println("Shortest height: " + shortest + " cms");
        System.out.println("Tallest height: " + tallest + " cms");
    }
     // Method to generate random heights between 150 and 250
         public static void randomHeights(int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) Math.floor(150 + Math.random() * 101);

        }
    }

    // Method to calculate the sum of all elements in the array
       public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

         // Method to calculate the mean height
        public static double findMean(int sum, int numberOfPlayers) {
        return (double) sum / numberOfPlayers;
    }

          // Method to find the shortest height
        public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

        // Method to find the tallest height
        public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

}
