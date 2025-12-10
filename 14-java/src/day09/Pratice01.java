package day09;

import java.util.Scanner;

public class Pratice01 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int gcd;
        long lcm;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter two positive integers: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        System.out.println();

        in.close();

        gcd = getGcd(n1, n2);
        lcm = (long)n1 * n2 / gcd;

        System.out.printf("The greatest common divisor of %d and %d = %d\n", n1, n2, gcd);
        System.out.printf("The least common mutiiple of %d and %d = %d\n", n1, n2, lcm);

    }

    public static int getGcd(int a, int b) {

        int r = a % b;
        return r == 0 ? b : getGcd(b,r);
    }
}
