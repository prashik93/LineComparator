import java.util.Scanner;
public class LineComparator {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program!");
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter value for First Line starting position : ");
        int x1 = scnr.nextInt();
        int y1 = scnr.nextInt();
        System.out.println("Enter value for First Line ending position : ");
        int x2 = scnr.nextInt();
        int y2 = scnr.nextInt();
        int lengthOfFirstLine = (int) Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
        String len1 = String.valueOf(lengthOfFirstLine);
        System.out.println("Length of first line : " + lengthOfFirstLine);

        System.out.println("Enter value for Second Line starting position : ");
        int x3 = scnr.nextInt();
        int y3 = scnr.nextInt();
        System.out.println("Enter value for Second Line ending position : ");
        int x4 = scnr.nextInt();
        int y4 = scnr.nextInt();
        int lengthOfSecondLine = (int) Math.sqrt(Math.pow(x4 - x3,2) + Math.pow(y4 - y3,2));
        String len2 = String.valueOf(lengthOfSecondLine);
        System.out.println("Length of second line : " + lengthOfSecondLine);

        if(len1.equals(len2)) {
            System.out.println("Lengths are equals");
        } else {
            System.out.println("Lengths are not equals");
        }
    }
}