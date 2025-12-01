package day02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter a positive integer: ");
        num = in.nextInt();
        System.out.println();

        in.close();

        for (int i = num; i > 0; i--) {
            System.out.println(i);
        }
    }
}
