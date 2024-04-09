import java.util.Scanner;

public class MethodsAddNos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int FirstNo, SecondNo, ThirdNo;

        System.out.println("Enter the three numbers to perform Addition");

        System.out.println("Enter First Number: ");
        FirstNo = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        SecondNo = sc.nextInt();
        System.out.println("Enter the Third Number: ");
        ThirdNo = sc.nextInt();

        // To Perform Addition look for user defined methhod and store here in addition value
        int AdditionMain = AddMethod(FirstNo, SecondNo, ThirdNo);
        System.out.println("The Addition of the given Number is: "+ AdditionMain);

        //this can be written also as::
        //System.out.println("The Addition of the given Number is: "+ AddMethod(FirstNo, SecondNo, ThirdNo));


        sc.close();
    }
    public static int AddMethod(int a, int b, int c){

        //here copy of : FirstNo is assigned into a, SecondNo into b and ThirdNo into c
        int sum = a+b+c;
        return sum;

        //or we can write directly as
        // return a+b+c;
    }
}
