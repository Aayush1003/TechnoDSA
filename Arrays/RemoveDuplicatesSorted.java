import java.util.*;

public class RemoveDuplicatesSorted {
    // Returns new length after in-place removal of duplicates in sorted array
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < arr.length; i++) if (arr[i] != arr[k-1]) arr[k++] = arr[i];
        return k;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,2,2,3,4,4};
        int k = removeDuplicates(a);
        System.out.println(k); // 4
        for (int i = 0; i < k; i++) System.out.print(a[i] + " "); // 1 2 3 4
    }
}
