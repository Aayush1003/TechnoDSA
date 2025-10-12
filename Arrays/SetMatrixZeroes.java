import java.util.*;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] a) {
        int n = a.length; if (n == 0) return; int m = a[0].length;
        boolean fr = false, fc = false;
        for (int j = 0; j < m; j++) if (a[0][j] == 0) fr = true;
        for (int i = 0; i < n; i++) if (a[i][0] == 0) fc = true;
        for (int i = 1; i < n; i++) for (int j = 1; j < m; j++) if (a[i][j] == 0) { a[i][0] = 0; a[0][j] = 0; }
        for (int i = 1; i < n; i++) if (a[i][0] == 0) for (int j = 1; j < m; j++) a[i][j] = 0;
        for (int j = 1; j < m; j++) if (a[0][j] == 0) for (int i = 1; i < n; i++) a[i][j] = 0;
        if (fr) for (int j = 0; j < m; j++) a[0][j] = 0;
        if (fc) for (int i = 0; i < n; i++) a[i][0] = 0;
    }
    public static void main(String[] args) {
        int[][] a = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(a);
        System.out.println(Arrays.deepToString(a)); // [[1,0,1],[0,0,0],[1,0,1]]
    }
}
