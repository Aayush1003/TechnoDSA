import java.util.*;

public class FirstLastOccurrence {
    public static int first(int[] a, int target) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] >= target) { if (a[m] == target) ans = m; r = m - 1; }
            else l = m + 1;
        }
        return ans;
    }
    public static int last(int[] a, int target) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] <= target) { if (a[m] == target) ans = m; l = m + 1; }
            else r = m - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,2,3,4};
        System.out.println(first(a,2) + "," + last(a,2)); // 1,3
    }
}
