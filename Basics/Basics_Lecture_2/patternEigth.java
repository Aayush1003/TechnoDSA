
public class patternEigth {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	
	
	   
	  
    
  
* * * * * * * * *
  * * * * * * *
    * * * * *
	  * * *
	    *
  
	
	
	
	
	*/
	
		int rows = 6;

    for (int i = 1; i <= rows; i++) {
        for (int j = i; j < rows; j++) {
            System.out.print("*");
        }
		for (int j = 1; j <= (2 *i-1); j++) {
            System.out.print("  ");
        }
		
		
		
        System.out.println();
    }
}
}