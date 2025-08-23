

class patternSix {
    public static void main(String[] args) {
    // Example usage of a pattern class
    int rows = 5;
     /*
	 12345
	 1234
	 123
	 12
	 1

*/

    for (int i = 1; i <= rows; i++) {
        for (int j = 5, k=1; j >= i; j--,k++) {
            System.out.print(k);
        }
        System.out.println();
    }
}
}






