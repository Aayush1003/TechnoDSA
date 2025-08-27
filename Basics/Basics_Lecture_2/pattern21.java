
public class pattern21 {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	
	
	    * * * *
        *     *
		*     *
		* * * *
	
	
	   * * * * *
	   *       *
	   *       *
	   *       *
	   * * * * *
	   
	   
	   
	2 -> 2 3
	3 -> 2 3
	*/
	
	
	int rows = 4;

    for (int i = 1; i <= rows; i++) {
        for (int j = 1;j<= rows; j++) {
			if(i==1 || j==1 || i==rows || j==rows){ 
            System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
		// for (int j = 1; j <= i; j++) {
            // System.out.print(" ");
        // }
		
		
		
		
        System.out.println();
    }
}
}