import java.util.Scanner;

public class PatternCharacter3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            char nxtIthChar = (char) ('A'+i-1);
            for (int j =1;j<=n;j++){
                //char nxtChar = (char) ('A'+j);
                System.out.print(nxtIthChar);
                nxtIthChar = (char)(nxtIthChar+1);
            }
            System.out.println();
        }
        sc.close();
}
}