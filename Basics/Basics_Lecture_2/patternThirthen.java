
public class patternThirthen {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	
	1
	2 3
	4 5 6
	7 8 9 10
	11 12 13 14 15
	
	
	*/
	
	
	int rows = 5;
int z=1;
    for (int i = 1; i < rows; i++) {
        for (int j = 0; j < i; j++) {
	
            System.out.print(z+" ");
			z++;
        }
        System.out.println();
    }
}
}