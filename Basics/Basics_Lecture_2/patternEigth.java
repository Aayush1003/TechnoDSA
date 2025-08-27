
public class patternEigth {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
  
  * * * * * * *
    * * * * *
	  * * *
	    *
		
		Smaller One 
		
		* * * * *
		  * * *
		    *
  
	0->7 1 -> 5 ,2 ->3 ,3->1
    5,3,1 -> 2n+1
	
	
	*/
	
		// int rows = 3;

    // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < i; j++) {
            // System.out.print("  ");
        // }
		
		// for (int j = i; j < rows; j++) {
            // System.out.print("* ");
        // }
	    // // for (int j = 0; j < i; j++) {
            // // System.out.print(" ");
        // // }
        // System.out.println();
    // }
	
	
	    int rows = 4; // adjust rows as needed

        for (int i = 0; i < rows; i++) {
            // leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  "); // 2 spaces for alignment
            }
            
            // stars
			   int stars = 2 * (rows - i) - 1;
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
	
	
	
	
	
}
}