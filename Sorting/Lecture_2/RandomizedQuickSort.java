import java.util.*;

public class RandomizedQuickSort {
    private static final Random RNG = new Random();

    public static void quickSort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int p = randomizedPartition(a, lo, hi);
            quickSort(a, lo, p - 1);
            quickSort(a, p + 1, hi);
        }
    }

    private static int randomizedPartition(int[] a, int lo, int hi) {
        int pivotIdx = lo + RNG.nextInt(hi - lo + 1);
        swap(a, pivotIdx, hi); // move random pivot to end
        return partitionLomuto(a, lo, hi);
    }

    private static int partitionLomuto(int[] a, int lo, int hi) {
        int pivot = a[hi];
        int i = lo - 1;
        for (int j = lo; j < hi; j++) {
            if (a[j] <= pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, hi);
        return i + 1;
    }

    private static void swap(int[] a, int i, int j) { int t = a[i]; a[i] = a[j]; a[j] = t; }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5, 3, 2, 4};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
