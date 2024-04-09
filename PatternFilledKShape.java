import java.util.*;
public class PatternFilledKShape {
    public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//Loop to iterate over each row in reverse order
		for(int i=n;i>=1;i--){
			//Loop to iterate over each column of the ith row in reverse order
			for(int j=i;j>=1;j--){
				System.out.print(j+ " "); 
			}
			System.out.println();
		}
		//Printing Lower Half for n-1 rows
		//Loop to iterate over each row
		for(int i=2;i<=n;i++){
			//Loop to iterate over each column of the ith row
			for(int j=i;j>=1;j--){
				System.out.print(j+ " "); 
			}
			System.out.println();
		}

		sc.close();
	}
}
