import java.util.*;

public class LeadersInArray {
    public static List<Integer> leaders(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int n = arr.length, maxRight = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                res.add(arr[i]);
                maxRight = arr[i];
            }
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(leaders(new int[]{16,17,4,3,5,2})); // [17, 5, 2]
    }
}
