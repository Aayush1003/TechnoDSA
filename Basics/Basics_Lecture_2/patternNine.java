
public class patternNine {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	
	
	    *
	  * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
	  * * *
	    *
	
	
	*/
	
	
	int rows = 5;

    for (int i = 1; i <= rows; i++) {
        for (int j = i; j < rows; j++) {
            System.out.print("  ");
        }
		for (int j = 1; j <= (2 *i-1); j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
	
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