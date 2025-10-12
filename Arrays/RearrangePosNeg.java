import java.util.*;

public class RearrangePosNeg {
    // Partition: move negatives to left, positives to right (order not preserved)
    public static void rearrange(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            if (arr[l] < 0) l++;
            else if (arr[r] >= 0) r--;
            else {
                int t = arr[l]; arr[l] = arr[r]; arr[r] = t;
                l++; r--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, -2, 3, -4, -1, 4};
        rearrange(a);
        System.out.println(Arrays.toString(a));
    }
}
