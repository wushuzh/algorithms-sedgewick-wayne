package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise03 {
    public static void main(String[] args) {
        int integer1 = Integer.parseInt(args[0]);
        int integer2 = Integer.parseInt(args[1]);
        int integer3 = Integer.parseInt(args[2]);

        if (isEqual(integer1, integer2, integer3))
            StdOut.println("equal");
        else
            StdOut.println("no equal");
    }

    public static boolean isEqual(int a, int b, int c) {
        return (a == b) && (b == c);
    }
}
