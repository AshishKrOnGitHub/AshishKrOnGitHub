import java.util.Scanner;

public class MethodsPrintPrime {
    //method to check whether a number is prime or not
    public static boolean IsPrime(int num){
        for (int Number = 2; Number<= num/2; Number++){
            if (num % Number == 0){
                return false;
            }
        }
        return true;
    }
    public static void PrintPrime (int lim){
        System.out.print("Prime Nos below " + lim + " are ");
        for (int i = 2; i< lim; i++){
            if (IsPrime(i)){
                System.out.print( i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Number to Check if it is Prime or Not");
        int Limit = sc.nextInt();
        PrintPrime(Limit);
        sc.close();
    }
}
