public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int max = 0; for (int p : piles) if (p > max) max = p;
        int l = 1, r = max, ans = max;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (canFinish(piles, h, m)) { ans = m; r = m - 1; }
            else l = m + 1;
        }
        return ans;
    }
    private static boolean canFinish(int[] piles, int h, int k) {
        long hours = 0;
        for (int p : piles) {
            hours += (p + k - 1) / k; // ceil(p/k)
            if (hours > h) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{3,6,7,11}, 8)); // 4
    }
}
