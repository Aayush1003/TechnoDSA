
public class pattern15 {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	
	
	  ABCDE
	  ABCD
	  ABC
	  AB
	  A
	  
	  
	  
	  *****
	  ****
	  ***
	  **
	  *
	
	
	*/
	
	
		int rows = 5;



     //System.out.println('A'+1);
     for (int i = 1; i <= rows; i++) {
           char ch='A';
		 for (int j=5;j >= i;j--) {
           
			 System.out.print(ch);
			 ch++;
         }
         System.out.println();
    }
}
}