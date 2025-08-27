
public class pattern16 {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	
	A
	BB
	CCC
	DDDD
	EEEEE
	
	
	*
	**
	***
	****
	
	
	
	*/
	
	
	int rows = 5;

    // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= i;j++) {
            // System.out.print("* ");
			// //ch++;
        // }
        // System.out.println();
    // }

 char ch = 'A';
     for (int i = 1; i <= rows; i++) {
		
         for (int j = 1; j <= i;j++) {
             System.out.print(ch);	 
         }
		 ch++;
         System.out.println();
     }
}
}