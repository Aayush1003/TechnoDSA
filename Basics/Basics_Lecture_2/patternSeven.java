
public class patternSeven {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	
	
	    *
	  * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
	
	
	Asuume :
	
	
	There space ,* and space
	
	
	
	5 rows , 9 column --> n-i-1 , 2n+i+1 , n-i-1
	
	4 1 4
	3 3 3
	2 5 2
    1 7 1
    0 9 0	
	
	
	
	
	*/
	
	
	int rows = 5;

    for (int i = 1; i <= rows; i++) {
        for (int j = i; j < rows; j++) {
            System.out.print("  ");
        }
		for (int j = 1; j <= (2 *i-1); j++) {
            System.out.print("* ");
        }
		
		
		
        System.out.println();
    }
	
	/* 
	    int n = 5; // number of rows

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            // move to next line
            System.out.println();
        } */
}
}