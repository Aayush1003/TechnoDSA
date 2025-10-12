import java.util.*;

public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) if (arr[j] < arr[minIdx]) minIdx = j;
            if (minIdx != i) {
                int t = arr[i]; arr[i] = arr[minIdx]; arr[minIdx] = t;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        sort(a);
        System.out.println(Arrays.toString(a)); // [11, 12, 22, 25, 64]
    }
}
