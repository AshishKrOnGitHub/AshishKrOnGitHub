import java.util.Scanner;

public class GameOfAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j =1;j<=i;j++){
                char jthChar = (char) ('A'+j-1);
                System.out.print(jthChar + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
