import java.util.Scanner;

public class PatternCharacter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j =1;j<=n;j++){
                char ithChar = (char) ('A'+i-1);
                System.out.print(ithChar);
            }
            System.out.println();
        }
        sc.close();
    }
}
