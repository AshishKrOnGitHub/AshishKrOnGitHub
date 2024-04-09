import java.util.Scanner;

public class PatternTriangleOfNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int p=1;

        for(int i=1;i<=n;i++){
            for(int j =n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j =0;j<i;j++){
                System.out.print(i+j);                
            }
            for(int j =2*i-2;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
