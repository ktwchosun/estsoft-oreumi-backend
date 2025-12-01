package day02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int num = in.nextInt();

        System.out.println("num = " + num);

        System.out.print("Enter two integers: ");

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        System.out.printf("n1 = %d, n2 = %d\n", n1, n2);



        in.close();
    }
}
