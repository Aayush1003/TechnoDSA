
public class pattern17 {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	
	
	    A
	   ABA
	  ABCBA
	 ABCDCBA
		
	
	    *
	  * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
	
	
	
	
	*/
	
	
	int rows = 5;

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= rows-i; j++) {
            System.out.print(" ");
			
        }
		char ch='A';
		for(int j=1; j<= i;j++){
			System.out.print(ch++);
		}
		ch -= 2;
		for(int j=1; j< i;j++){
			System.out.print(ch--);
		}
        System.out.println();
    }
	
	
	
	// for (int i = 1; i <= rows; i++) {
        // for (int j = i; j < rows; j++) {
            // System.out.print("  ");
        // }
		// for (int j = 1; j <= (2 *i-1); j++) {
            // System.out.print("* ");
        // }
		
		
		
        // System.out.println();
    // }
	
	
	
	
	
}
}