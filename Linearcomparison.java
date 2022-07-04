public class Linecomp {

    public static void main(String arg[]) {
        System.out.println("Welcome to Line Comparison.");
        int line1 = lengthOfLine(2,1,3,2);

    }

    private static int lengthOfLine(int x1, int x2, int y1, int y2) {
        double ds;
        ds = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("distancebetween" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + ds);
        int l1 = (int) ds;
        return l1;

    }

}
