package main.main.day8;
import java.util.Scanner;

public class LineComparision {

    public class LineComparison {
        static double getLength(double x1, double y1, double x2, double y2) {
            return (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        }

        //    uc-1
        public static void main(String[] args) {
            double lengthOfline;
            System.out.println("Welcome to Line Comparison Computation");
            Scanner scanner = new Scanner(System.in);
            System.out.println(" enter values for x1,y1 and x2,y2 of line ");
            lengthOfline = getLength(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.println("Length of line = " + lengthOfline);
            scanner.close();
        }
    }
}

