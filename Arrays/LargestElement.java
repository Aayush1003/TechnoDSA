import java.util.*;

public class LargestElement {
    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int x : arr) max = Math.max(max, x);
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 2};
        System.out.println(largest(arr)); // 9
    }
}
