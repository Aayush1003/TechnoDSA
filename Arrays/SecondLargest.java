import java.util.*;

public class SecondLargest {
    // Returns second largest DISTINCT element, or Integer.MIN_VALUE if not present
    public static int secondLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x < max1 && x > max2) {
                max2 = x;
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{1,2,3,4})); // 3
        System.out.println(secondLargest(new int[]{4,4,4})); // Integer.MIN_VALUE
    }
}
