
public class patternTen {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	
	   *
	   **
	   ***
	   ****
	   *****
	   *****
       ****
       ***
       **
       *
	
	
	*/
	
	
	int rows = 5;

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
	
	
     
	   for (int i = 1; i <= rows; i++) {
		    // int stars = 2 * (rows - i) - 1;
        for (int j = i; j <= rows; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
	
	
	
	
}
}