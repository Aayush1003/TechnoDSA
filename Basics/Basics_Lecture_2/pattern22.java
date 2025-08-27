
public class pattern22 {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	
	
	    4 4 4 4 4 4
		4 3 3 3 3 4
		4 3 2 2 3 4
		4 3 2 1 2 4
		4 3 2 2 2 4
		4 3 3 3 3 4
		4 4 4 4 4 4 
	
	*/
	
	
	 int n = 4; // outermost number (controls size)

        int size = 2 * n - 1; // total rows/columns in the square

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Find minimum distance to any border
                int min = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                // Value = n - min
                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
}
}