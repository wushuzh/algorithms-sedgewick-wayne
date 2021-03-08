package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise05 {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        StdOut.println(inZeroAndOne(x, y));
    }

    public static boolean inZeroAndOne(double x, double y) {
        return ((x > 0) && (x < 1)) && ((y > 0) && (y < 1));
    }

}
