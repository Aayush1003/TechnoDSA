import java.util.*;

public class NextPermutation {
    public static void nextPermutation(int[] a) {
        int n = a.length;
        if (n <= 1) return;
        int i = n - 2;
        while (i >= 0 && a[i] >= a[i + 1]) i--;
        if (i >= 0) {
            int j = n - 1;
            while (a[j] <= a[i]) j--;
            int t = a[i]; a[i] = a[j]; a[j] = t;
        }
        reverse(a, i + 1, n - 1);
    }
    private static void reverse(int[] a, int l, int r) {
        while (l < r) { int t = a[l]; a[l] = a[r]; a[r] = t; l++; r--; }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3};
        nextPermutation(a);
        System.out.println(Arrays.toString(a)); // [1,3,2]
    }
}
