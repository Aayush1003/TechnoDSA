public class stringPaildrome {
    public static void main(String[] args) {
        String str = "racecar"; // Change this value to test different strings
        boolean result = isPalindrome(str);
        System.out.println("Is the string \"" + str + "\" a palindrome? " + result);
    }

    public static boolean isPalindrome(String str) {
        // Base case: if the string is empty or has one character, it's a palindrome
        if (str.length() <= 1) {
            return true;
        }
        // Check the first and last characters
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false; // Not a palindrome if they don't match
        }
        // Recursive case: check the substring without the first and last characters
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}