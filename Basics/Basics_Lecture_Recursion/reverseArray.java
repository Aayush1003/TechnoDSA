public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        printArray(arr, arr.length);
        
        reverse(arr, 0, arr.length - 1);
        
        System.out.println("Reversed array:");
        printArray(arr, arr.length);
    }

    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return; // Base case: when start index is greater than or equal to end index
        }
        
        // Swap the elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        // Recursive call to reverse the remaining elements
        reverse(arr, start + 1, end - 1);
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}