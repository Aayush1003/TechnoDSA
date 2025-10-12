public class BinarySearch {
    public static int search(int[] a, int target) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == target) return m;
            if (a[m] < target) l = m + 1; else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,5}, 4)); // 3
        System.out.println(search(new int[]{1,2,3,4,5}, 6)); // -1
    }
}
