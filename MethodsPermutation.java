import java.util.Scanner;

public class MethodsPermutation {
    //program for permutation of a given number
    public static int facto(int num){
        int fact = 1;
        for(int i=num; i>=1; i--){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        
        sc.close();

        if(n<0 || r<0){
            System.out.println("Not a Valid Number.");
            return;
        }

        int factN = facto(n);
        int factNR = facto(n-r);

        int npr = factN / factNR;
        System.out.println(npr);

    }
    
}
