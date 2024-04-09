import java.util.*;

public class PatternHollowSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value to Create a design for hollow square pattern");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1){
                    System.out.print(j);
                }
                else if (j==n) {
                    System.out.print("2");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}