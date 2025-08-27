
public class patternTwelve {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	1      1
	12    21
	123  321
	12344321
	
	1 ->6
	2-4
	3-2
	

	
	*/
	// int rows = 4;

    // // for (int i = 1; i <= rows; i++) {
        // // for (int j = 1; j <= i; j++) {
            // // System.out.print(j);
        // // }
        // // System.out.println();
    // // }
	// for (int i = 1; i <= rows; i++) {
		
        // for (int j = 1; j <= i; j++) {	
            // System.out.print(j);
        // }
		
		// int spaces= 2 * (rows-i);
		// for (int j = 1; j <= spaces ; j--) {	
            // System.out.print(" ");
        // }
		
		
        // for (int j = i; j >= 1; j--) {
			
            // System.out.print(j);
        // }
        // System.out.println();
    // }
	
	
	
	int rows = 4;  // change this for bigger size
        for (int i = 1; i <= rows; i++) {
            
            // Left side numbers (1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Spaces in between
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // Right side numbers (i down to 1)
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println();
	
	
		}
	
	
}
}