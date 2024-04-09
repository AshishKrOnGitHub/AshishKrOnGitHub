import java.util.Scanner;

public class PatternPascalTriangle1 {
     public static void main(String[] args)
   {
      int n, i, j,space, num;
      Scanner sc = new Scanner(System.in);
      n= sc.nextInt();
      for(i=0; i<n; i++)
      { 
        for(space=n; space>i+1; space--)
         {
            System.out.print(" ");
         }
         num=1;
         for(j=0; j<=i; j++)
         {
            System.out.print(num+ " ");
            num = num*(i-j)/(j+1);
         }
         System.out.print("\n");
      }
   }
}
