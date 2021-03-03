package chapter1.section1;

public class Exercise02 {
    public static void main(String[] args) {

        double resultA = (1 + 2.236) / 2;
        double resultB = 1 + 2 + 3 + 4.0;
        boolean resultC = 4.1 >= 4;
        String resultD = 1 + 2 + "3";

        System.out.println("a) " + ((Object) resultA).getClass() + " " + resultA);
        System.out.println("b) " + ((Object) resultB).getClass() + " " + resultB);
        System.out.println("c) " + ((Object) resultC).getClass() + " " + resultC);
        System.out.println("d) " + resultD.getClass() + " " + resultD);

    }
}
