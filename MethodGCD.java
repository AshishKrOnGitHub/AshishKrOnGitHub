import java.util.Scanner;

public class MethodGCD {
    public static int findGCD(int a, int b) {
        int i=1;
        // write the logic
        if (a>b){
            for (i=b; i>1; i--){
                if ((b%i == 0) && (a%i == 0)){
                    return i;
                } 
            }
        }
        return i;
    }
     public static void main(String [] args) {
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         int y = sc.nextInt();  
        System.out.println(findGCD(x, y));
        sc.close();
  
  }
}
