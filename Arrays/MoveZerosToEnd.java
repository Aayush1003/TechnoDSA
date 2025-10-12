import java.util.*;

public class MoveZerosToEnd {
    public static void moveZeros(int[] arr) {
        int k = 0;
        for (int x : arr) if (x != 0) arr[k++] = x;
        while (k < arr.length) arr[k++] = 0;
    }

    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        moveZeros(a);
        System.out.println(Arrays.toString(a)); // [1, 3, 12, 0, 0]
    }
}
