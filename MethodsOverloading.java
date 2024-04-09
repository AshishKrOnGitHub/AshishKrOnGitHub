public class MethodsOverloading {
    /*Method Overloading allows different methods to have the same name, but different signatures where the signature can differ by 
    *the number of input parameters or type of input parameters, or a mixture of both.
    *Method overloading in Java is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding. 
    *In Method overloading compared to the parent argument, the child argument will get the highest priority.
    * Rules:
    * 1. Number of arguments should not be same in both the methods having same name
    * 2. If No. of Arguments are same then the data type must be different
    * 3. We can create as many methods overloading as we want
     */
    public static void sum (int a, int b){
        System.out.println("Sum of Two Integers");
        System.out.println(a+b);
    }
    public static void sum (int a, int b, int c){
        System.out.println("Sum of Three Integers");
        System.out.println(a+b+c);
    }
    public static void sum (double a, int b){
        System.out.println("Sum of One Doble and One Integers");
        System.out.println(a+b);
    }
    public static void sum (double a, double b){
        System.out.println("Sum of Two Dobles");
        System.out.println(a+b);
    }
     public static void main(String[] args) {
        sum(2,3);
        sum(5, 7, 9);
        sum(3.5f, 7);
        sum(3.5, 4.5);
        
    }
}
