import java.util.*;

public class LeftRotateByOne {
    public static void rotateLeftByOne(int[] arr) {
        if (arr.length == 0) return;
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) arr[i-1] = arr[i];
        arr[arr.length-1] = first;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        rotateLeftByOne(a);
        System.out.println(Arrays.toString(a)); // [2, 3, 4, 5, 1]
    }
}
