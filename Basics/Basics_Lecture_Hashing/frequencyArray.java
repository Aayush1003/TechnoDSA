public class frequencyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        
        // Find the maximum element to determine array size
        int max = arr[0];
        for(int num : arr) {
            max = Math.max(max, num);
        }
        
        // Create frequency array
        int[] freq = new int[max + 1];
        
        // Count frequencies
        for(int num : arr) {
            freq[num]++;
        }
        
        // Print frequencies
        for(int i = 0; i <= max; i++) {
            if(freq[i] > 0) {
                System.out.println("Element " + i + " occurs " + freq[i] + " times");
            }
        }
    }
}