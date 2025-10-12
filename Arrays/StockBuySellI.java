import java.util.*;

public class StockBuySellI {
    public static int maxProfit(int[] prices) {
        int minP = Integer.MAX_VALUE, ans = 0;
        for (int p : prices) {
            if (p < minP) minP = p;
            else ans = Math.max(ans, p - minP);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4})); // 5
        System.out.println(maxProfit(new int[]{7,6,4,3,1})); // 0
    }
}
