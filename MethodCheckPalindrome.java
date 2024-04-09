import java.util.*;
public class MethodCheckPalindrome {
	public static boolean palindromeNumber(int n){
        // Write your code here.
        int r,sum=0,temp;
        boolean isPalindrome = true;
        temp=n;    
        while(n>0){    
                r=n%10;  //getting remainder  
                sum=(sum*10)+r;    
                n=n/10;    
        }    
        if(temp==sum)    
            return isPalindrome; 
        else    
            isPalindrome = false;

		return isPalindrome; 
    }  

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		boolean isPalindrome = palindromeNumber(num);
		System.out.print(isPalindrome);
		s.close();
    }
}
