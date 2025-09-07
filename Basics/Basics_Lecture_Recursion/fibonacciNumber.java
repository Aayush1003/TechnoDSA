public class fibonacciNumber {
    public static void main(String[] args) {
        int n = 7; // Change this value to compute a different Fibonacci number
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: the 0th Fibonacci number is 0
        } else if (n == 1) {
            return 1; // Base case: the 1st Fibonacci number is 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
        }
    }
}