import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> res = new ArrayList<>();
        int[] cur = intervals[0].clone();
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= cur[1]) cur[1] = Math.max(cur[1], intervals[i][1]);
            else { res.add(cur); cur = intervals[i].clone(); }
        }
        res.add(cur);
        return res.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        int[][] in = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(in))); // [[1,6],[8,10],[15,18]]
    }
}
