import java.util.*;

public class MajorityElement {
    // Boyer-Moore Voting Algorithm; assumes a majority element exists (> n/2). If not sure, verify count.
    public static int majorityElement(int[] nums) {
        int cand = 0, cnt = 0;
        for (int x : nums) {
            if (cnt == 0) { cand = x; cnt = 1; }
            else if (x == cand) cnt++;
            else cnt--;
        }
        // Optional verification step:
        int occ = 0; for (int x : nums) if (x == cand) occ++;
        return occ > nums.length / 2 ? cand : Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2})); // 2
        System.out.println(majorityElement(new int[]{1,2,3})); // Integer.MIN_VALUE (no majority)
    }
}
