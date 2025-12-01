package day02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two positive integers: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        System.out.println();
        in.close();


        System.out.println("Quotient = " + n1 / n2);
        System.out.println("Remainder = " + n1 % n2);
    }
}
