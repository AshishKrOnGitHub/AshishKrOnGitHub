import java.util.Scanner;

public class MethodsFactorial {
    public static int fact (int n){
        int i,factorialNo=1;
        for (i=1; i<=n; i++){
                factorialNo = factorialNo*i;
        }
        return factorialNo;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        System.out.println(fact(number));
        sc.close();
    }
}
