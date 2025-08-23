public class patternFirst {
    public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	 Pattern  -1
	 *****
	 *****
	 *****
	 *****
	 *****
	 
	 Pattern -5
	 *****
	 ****
	 ***
	 **
	 *
	 
	 
	
	*/
	
	
	
	// int rows = 5;

    // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= rows; j++) {
            // System.out.print("* ");
        // }
        // System.out.println();
    // }
	
		int row = 5;

    for (int k = 1; k <= row; k++) {
        //System.out.print("* ");
		for (int l = 5; l>= k; l--) {
            System.out.print("* ");
			//row;
        }
        System.out.println();
    }
	
	
	
	
	
	

}
}