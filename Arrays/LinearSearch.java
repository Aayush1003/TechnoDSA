public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == target) return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {5,7,1,3};
        System.out.println(linearSearch(a, 7));  // 1
        System.out.println(linearSearch(a, 9));  // -1
    }
}
