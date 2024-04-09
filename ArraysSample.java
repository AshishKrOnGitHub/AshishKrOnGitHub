public class ArraysSample {
    public static void main(String[] args) {
        int a;
        //various formats of declaring the arrays
        int marks[] = new int[20]; // length of element 'marks' is 20
        int []marks1;
        int[] marks2;

        //assigning the data to the 0th position of Array marks[]
        marks[0] = 65;

        //different way of assigning the value
        int practicalMarks[]={56,40,45,48,47,48,75};
        System.out.println(marks[0]);
        System.out.println(practicalMarks[2]);
        System.out.println(practicalMarks.length);
        for(int i=0;i<=practicalMarks.length;i++){
            System.out.print(practicalMarks[i] + "\n");
        }


    }
}
