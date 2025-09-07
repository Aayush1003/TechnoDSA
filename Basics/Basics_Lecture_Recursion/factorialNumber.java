public class factorialNumber {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("The factorial of " + n + " is: " + result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: the factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }
}