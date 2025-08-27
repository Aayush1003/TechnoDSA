
public class pattern19 {
    
     public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	
	
	   **********
	   ****  ****
	   ***    ***
	   **      **
	   *        *
	   **      **
	   ***    ***
	   ****  ****
	   **********
	
	*/
	
	
	int rows = 5;

    // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= i; j++) {
            // System.out.print("* ");
        // }
        // System.out.println();
    // }
	
	
	  // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= i; j++) {
            // System.out.print("* ");
        // }
        // System.out.println();
    // }
	
	for (int i = 0; i <= rows; i++) {
            // Left stars
            for (int j = rows; j >= i; j--) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = rows; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = rows - 1; i >= 0; i--) {
            // Left stars
            for (int j = rows; j >= i; j--) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = rows; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    
	
	
	
}
}