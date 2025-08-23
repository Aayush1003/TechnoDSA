public class patternThird {
    public static void main(String[] args) {
    // Example usage of a pattern class
    /*
	
	
	1
	12
	123
	1234
	12345
	
	
	*/
	
	
	int rows = 5;

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
}
}