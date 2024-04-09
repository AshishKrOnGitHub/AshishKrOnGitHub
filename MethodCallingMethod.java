public class MethodCallingMethod {
    public static void printDetails(String name, String dob, long acc){
        System.out.print("Name: " +name);
        System.out.print(" DOB: " +dob);
        System.out.print(" Account Number: "+acc);
        System.out.print(" The Balance is: " +calculateBal(263636.23, 3544.12, 109283.1));
        System.out.println();
    }
    public static double calculateBal(double currentBal, double credit, double debit){
        return currentBal + credit - debit;
    }
    public static void main(String[] args) {
        printDetails("Ashish Kumar", "10/12/1993", 2334457);
        printDetails("Rohit Kumar", "10/05/1993", 23344571);

        
    }
}
