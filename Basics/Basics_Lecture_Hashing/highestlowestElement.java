public class highestlowestElement {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2, 7};
        
        // Initialize max and min with the first element of the array
        int max = arr[0];
        int min = arr[0];
        
        // Traverse the array to find the highest and lowest elements
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        
        // Print the results
        System.out.println("Highest Element: " + max);
        System.out.println("Lowest Element: " + min);
    }
}