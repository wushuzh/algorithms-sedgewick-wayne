package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise07 {
    public static void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            StdOut.println("while left is " + Math.abs(t - 9.0 / t));
            t = (9.0 / t + t) / 2.0;
            StdOut.println("t is assigned as " + t);
        }
        StdOut.println("last while left is " + Math.abs(t - 9.0 / t));
        StdOut.printf("%.5f\n", t);
    }
}
