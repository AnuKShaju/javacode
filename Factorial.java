public class Factorial {
    public static void main(String[] args) {
        // Calculate and print the factorial of 6 using both methods
        System.out.println(getRecursiveFactorial(6)); // Output: 720
        System.out.println(getIterativeFactorial(6)); // Output: 720
    }
    
    /**
     * Calculates the factorial of a non-negative integer n recursively.
     * @param n the number to calculate the factorial of
     * @return the factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static int getRecursiveFactorial(int n) {
        // Check if the input is negative
        if (n < 0) throw new IllegalArgumentException("Input must be non-negative");
        // Base case: factorial of 0 and 1 is 1
        else if (n < 2) return 1;
        // Recursive case: n * factorial of (n - 1)
        else return n * getRecursiveFactorial(n - 1);		
    }
    
    /**
     * Calculates the factorial of a non-negative integer n iteratively.
     *
     * @param n the number to calculate the factorial of
     * @return the factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static int getIterativeFactorial(int n) {
        // Check if the input is negative
        if (n < 0) throw new IllegalArgumentException("Input must be non-negative");
        
        // Initialize factorial result to 1
        int fact = 1;
        // Loop from 1 to n, multiplying to get the factorial
        for (int i = 1; i <= n; i++)
            fact *= i; // Multiply current number to the factorial result
        
        // Return the final calculated factorial
        return fact;
    }
}
