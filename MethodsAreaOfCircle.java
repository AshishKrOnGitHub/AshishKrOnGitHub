public class MethodsAreaOfCircle {
    public static void main(String[] args) {
        //Write a Java program that calculates and returns the area of a circle given its radius.
        double AreaOfCircle = AreaMethod(2.0);
        System.out.println(AreaOfCircle);
    }
    public static double AreaMethod(double r) {
        double pi = 3.14159d;
        double area = pi * r * r;
        return area;
    }
}
