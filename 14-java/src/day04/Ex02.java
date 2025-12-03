package day04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int a, b, r;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter two positive integers: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        System.out.println();

        in.close();

        a = Math.min(n1, n2);
        b = Math.max(n1, n2);

        while (true) {
            r = a % b;
            if (r == 0) break;

            a = b;
            b = r;
        }

        System.out.printf("The greatest common divisor of %d and %d = %d\n", n1, n2, b);
    }
}
