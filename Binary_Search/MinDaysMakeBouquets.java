public class MinDaysMakeBouquets {
    public static int minDays(int[] bloomDay, int m, int k) {
        long need = (long)m * k; if (need > bloomDay.length) return -1;
        int lo = Integer.MAX_VALUE, hi = 0;
        for (int d : bloomDay) { if (d < lo) lo = d; if (d > hi) hi = d; }
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (canMake(bloomDay, m, k, mid)) { ans = mid; hi = mid - 1; }
            else lo = mid + 1;
        }
        return ans;
    }
    private static boolean canMake(int[] bd, int m, int k, int day) {
        int bouquets = 0, contig = 0;
        for (int d : bd) {
            if (d <= day) {
                contig++;
                if (contig == k) { bouquets++; contig = 0; if (bouquets >= m) return true; }
            } else contig = 0;
        }
        return bouquets >= m;
    }
    public static void main(String[] args) {
        System.out.println(minDays(new int[]{1,10,3,10,2}, 3, 1)); // 3
        System.out.println(minDays(new int[]{1,10,3,10,2}, 3, 2)); // -1
    }
}
