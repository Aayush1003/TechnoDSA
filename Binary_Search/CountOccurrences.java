public class CountOccurrences {
    public static int count(int[] a, int x) {
        int lb = LowerUpperBound.lowerBound(a, x);
        int ub = LowerUpperBound.upperBound(a, x);
        return (lb == a.length || a[lb] != x) ? 0 : (ub - lb);
    }
    public static void main(String[] args) {
        System.out.println(count(new int[]{1,2,2,2,3}, 2)); // 3
    }
}
