
public class printRecursion {
    
	// Two Program:
	
	
	// 1 to N and N to 1
	public static void main(String[] args) {
        int n = 5;
        prinlin(1,n);
		//print(n);
    }
//N to 1
    // static void print(int n){
        // if(n == 0){
			
			// return ;
		// } else {
			// System.out.println(n);
			 // print(n-1);
		// }

        
    // }
	
	//1 to N
	
	static void prinlin(int i,int n){
		

	   if(i>n) return;
            System.out.println(i);

            // Function call to print i till i increments to n.
            prinlin(i+1,n);
	}
}