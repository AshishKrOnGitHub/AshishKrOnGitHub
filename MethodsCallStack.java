public class MethodsCallStack {
    public static int sum (int num1, int num2){
        System.out.println("Sum Method: ");
        return num1+num2;
    }
    public static void printSum (int c, int d){
        int add = sum(c, d);
        System.out.println(add);
    }

    public static void main(String[] args) {
        int a = 30, b= 20;
        printSum(a, b);
        System.out.println("In the main function: ");
    }
    
}
