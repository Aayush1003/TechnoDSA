import java.util.Scanner;

public class checkPaildrome {
                // Example 1:
                // Input:N = 4554
               
                // Output:Palindrome Number
                
                // Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number			
				public static void main(String args[]){
					
					
					Scanner sc = new Scanner(System.in);
                    int n= sc.nextInt();
					int rev=n;
					int nm=0;
				  
					while(n!=0){
						//rev=n/10;
						int rem=0;
					rem=n%10;
						nm=nm*10+rem;
						n=n/10;
					}
					
	
				   if (nm==rev){
                      System.out.println("Number is paildrome");
				   } else {
                      System.out.println("Number is not paildrome");
				   }					   
					
					
				}
	
}
