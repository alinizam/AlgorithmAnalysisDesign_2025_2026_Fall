package temp;

public class t3Knapsack {


        // Recursive function to solve Knapsack
        public static int knapsack(int W, int[] weights, int[] values, int n) {
            // Base case: no items left or no capacity
            if (n == 0 || W == 0) {
                return 0;
            }

            // If weight of nth item is more than capacity, skip it
            if (weights[n - 1] > W) {
                System.out.println("Last W: "+W+" n: "+n);
                return knapsack(W, weights, values, n - 1);
            } else {
                // Case 1: Exclude the item

                int exclude = knapsack(W, weights, values, n - 1);
                System.out.println("Exclude W: "+W+" ne: "+n+" "+exclude);

                System.out.println("Include W: "+W+" n: "+n);
                // Case 2: Include the item

                int include = values[n - 1] + knapsack(W - weights[n - 1], weights, values, n - 1);
                System.out.println("Exclude W: "+W+" ni: "+n+" "+include);
                // Return the maximum of including or excluding
                return Math.max(include, exclude);
            }
        }

        public static void main(String[] args) {
            int[] values = {60, 100, 120};
            int[] weights = {10, 25, 42};
            int W = 50; // Knapsack capacity
            int n = values.length;

            int maxValue = knapsack(W, weights, values, n);
            System.out.println("Maximum value in Knapsack = " + maxValue);
        }

}
