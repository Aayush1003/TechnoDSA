import java.util.*;

public class AnagramCheck {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] f = new int[256];
        for (int i = 0; i < s.length(); i++) { f[s.charAt(i)]++; f[t.charAt(i)]--; }
        for (int x : f) if (x != 0) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car")); // false
    }
}
