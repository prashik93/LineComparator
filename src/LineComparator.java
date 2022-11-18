import java.util.Scanner;
public class LineComparator {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program!");
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter value for starting position of a line : ");
        int x1 = scnr.nextInt();
        int y1 = scnr.nextInt();
        System.out.println("Enter value for ending position of a line : ");
        int x2 = scnr.nextInt();
        int y2 = scnr.nextInt();
        if((x1 < x2) && (y1 < y2)) {
            int lengthOfLine = (int) Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
            System.out.println("Length of a line is : " + lengthOfLine);
        } else {
            System.out.println("Starting value must be less than Ending value!");
        }
    }
}