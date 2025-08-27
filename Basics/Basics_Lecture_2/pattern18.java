
public class pattern18 {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	
	E
	D E 
	C D E 
	B C D E
	A B C D E
	
	
	*/
	
	
	int rows = 5;
    char ch='E';
    for (int i = 1; i <= rows; i++) {
	      char z=ch;
        for (int j = 1; j <= i; j++) {
      
			System.out.print((z++)+" ");
			//ch++;
        }
	  ch--;
        System.out.println();
    }
}
}