import java.util.Scanner;

public class PatternCharacter5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--)
    		{
        		for(int j=n;j>=i;j--)
        		{ 		
            			System.out.print((char)('A'+j-1));
        		} 
        	
            System.out.println();
        }
        sc.close();
}
}
