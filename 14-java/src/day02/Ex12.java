package day02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        int num;
        long factorial = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        num = in.nextInt();
        System.out.println();
        in.close();
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        System.out.printf("Factorial %d = %d\n", num, factorial);
    }
}
