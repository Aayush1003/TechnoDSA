import java.util.*;

public class ReverseWords {
    public static String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(parts));
        return String.join(" ", parts);
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("  the sky  is blue ")); // blue is sky the
    }
}
