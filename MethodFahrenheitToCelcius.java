import java.util.*;
public class MethodFahrenheitToCelcius {
    public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format.   
		 * Taking input is handled automatically. 
		 */
		Scanner s = new Scanner(System.in);
        int fahrenheitValue = start;
        while(fahrenheitValue<=end) {
            int celciusValue = (int)((5.0/9)*(fahrenheitValue-32));
    	    System.out.println(fahrenheitValue+"\t"+celciusValue);
    	    fahrenheitValue += step;
    	}
        s.close(); 	
	}
}
