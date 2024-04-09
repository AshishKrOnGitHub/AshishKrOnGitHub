import java.util.*;
public class MethodsPrintComp {
    //program to print the composite number below the specified number
    public static boolean IsPrime(int num){
        for (int Number = 2; Number<= num/2; Number++){
            if (num % Number == 0){
                return false;
            }
        }
        return true;
    }
    public static void print_composite(int n)
    {
        // write your code logic here
        for (int i = 2; i<= n; i++){
            if (! IsPrime(i)){
                System.out.println( i );
            }
        }       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int Limit = sc.nextInt();
        print_composite(Limit);
        sc.close();
    }
}
