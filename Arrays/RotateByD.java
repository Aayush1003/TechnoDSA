import java.util.*;

public class RotateByD {
    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        if (n == 0) return;
        d %= n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    private static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int t = a[l]; a[l] = a[r]; a[r] = t;
            l++; r--;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        rotateLeft(a, 2);
        System.out.println(Arrays.toString(a)); // [3, 4, 5, 6, 7, 1, 2]
    }
}
