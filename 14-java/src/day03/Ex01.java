package day03;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int num;
        long f0 = 0;
        long f1 = 1;
        long fibo = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer greater than 1: ");
        num = in.nextInt();
        System.out.println();

        in.close();

        for(int i = 2; i<=num; i++){
            fibo = f0 + f1;
            f0 = f1;
            f1 = fibo;

        }
        System.out.printf("%dth Fibonacci number = %d\n", num, fibo);
    }
}
