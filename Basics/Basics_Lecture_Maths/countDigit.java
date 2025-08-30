import java.util.*;

public class countDigit {
    
	// Problem Statement: Given an integer N, return the number of digits in N.

// Examples
                // Example 1:
                // Input:N = 12345
               
                // Output:5
                
                // Explanation:  The number 12345 has 5 digits.
                                        
                // Example 2:
                // Input:N = 7789                
                
                // Output: 4
                
                // Explanation: The number 7789 has 4 digits.  
				
				
				
				public static void main(String args[]){
					Scanner sc =new Scanner(System.in);
					int n=sc.nextInt();
					//System.out.println(n);
					
					System.out.println("Count of number of digits in integer N");
					
					
					int count=0;
					
					// [+ - */] [~ !% @ # $ % ^ & * ( )- +] 
					
					//count=n%10;
					while(n != 0){
						n=n/10;
						count++;
					}
					
					System.out.println(count);
					
					
					
					// if(n%10==0){
						
					// }
					
					
					
					
					
					
					
					
					
					
					
					
				}
				
				
	
	
	
}
