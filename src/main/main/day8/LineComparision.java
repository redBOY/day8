package main.main.day8;
import java.util.Scanner;

public class LineComparision {

    static double getLength(double x1, double y1, double x2, double y2) {
        return (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }

    //    uc-1
    public static void main(String[] args) {
        double lengthOfline1, lengthOfline2;
        System.out.println("Welcome to Line Comparison Computation");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter values for x1,y1 and x2,y2 of line 1");
        lengthOfline1 = getLength(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Length of line1 = " + lengthOfline1);
        System.out.println(" enter values for x1,y1 and x2,y2 of line 1");
        lengthOfline2 = getLength(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        Integer l1 = (int) lengthOfline1;
        Integer l2 = (int) lengthOfline2;
        if (l1.equals(l2)) {
            System.out.println("two lines are equal");
        } else
            System.out.println("two lines are not equal");
    }
}
