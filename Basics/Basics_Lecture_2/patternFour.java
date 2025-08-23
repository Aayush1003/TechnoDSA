
public class patternFour {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	
	
	1
	22
	333
	4444
	55555
	
	
	*/
	
	
	int rows = 5;

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(i);
        }
        System.out.println();
    }
}
}
