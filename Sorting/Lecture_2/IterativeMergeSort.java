import java.util.*;

public class IterativeMergeSort {
    public static void sort(int[] a) {
        int n = a.length;
        int[] tmp = new int[n];
        for (int size = 1; size < n; size <<= 1) {
            for (int left = 0; left < n - size; left += size << 1) {
                int mid = left + size - 1;
                int right = Math.min(left + (size << 1) - 1, n - 1);
                merge(a, tmp, left, mid, right);
            }
        }
    }

    private static void merge(int[] a, int[] tmp, int l, int m, int r) {
        int i = l, j = m + 1, k = l;
        while (i <= m && j <= r) tmp[k++] = (a[i] <= a[j]) ? a[i++] : a[j++];
        while (i <= m) tmp[k++] = a[i++];
        while (j <= r) tmp[k++] = a[j++];
        for (int t = l; t <= r; t++) a[t] = tmp[t];
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
