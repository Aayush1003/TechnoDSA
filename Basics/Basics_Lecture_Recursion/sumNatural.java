public class sumNatural {
    public static void main(String[] args) {
        int n = 5;
        int result = sum(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + result);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1; // Base case: the sum of the first natural number is 1
        } else {
            return n + sum(n - 1); // Recursive case
        }
    }
}