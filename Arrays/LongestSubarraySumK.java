import java.util.*;

public class LongestSubarraySumK {
    // Works for positives/negatives/zeros using prefix sum first occurrence
    public static int longestSubarray(int[] a, int k) {
        Map<Integer, Integer> first = new HashMap<>(); // prefix -> first index
        int pref = 0, best = 0;
        first.put(0, -1);
        for (int i = 0; i < a.length; i++) {
            pref += a[i];
            if (!first.containsKey(pref)) first.put(pref, i);
            Integer j = first.get(pref - k);
            if (j != null) best = Math.max(best, i - j);
        }
        return best;
    }
    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{1,2,3,1,1,1,1}, 3)); // 2 (1,2)
        System.out.println(longestSubarray(new int[]{-1,1,1,-1,1}, 1)); // 3
    }
}
