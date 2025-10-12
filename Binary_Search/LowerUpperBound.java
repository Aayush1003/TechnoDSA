public class LowerUpperBound {
    public static int lowerBound(int[] a, int x) {
        int l = 0, r = a.length, ans = a.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] >= x) { ans = m; r = m; }
            else l = m + 1;
        }
        return ans;
    }
    public static int upperBound(int[] a, int x) {
        int l = 0, r = a.length, ans = a.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] > x) { ans = m; r = m; }
            else l = m + 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {1,2,2,2,3,4};
        System.out.println(lowerBound(a,2)); // 1
        System.out.println(upperBound(a,2)); // 4
    }
}
