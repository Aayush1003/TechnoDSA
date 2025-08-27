
public class patternFourteen {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	
	
	    A 
		AB
		ABC
		ABCD
		ABCDE
	
	
	*/
	
	
	int rows = 5;

    for (int i = 1; i <= rows; i++) {
        for (char ch='A'; ch < 'A'+i; ch++) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
}