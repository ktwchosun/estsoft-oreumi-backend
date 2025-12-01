package day02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int N;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: : ");
        N = in.nextInt();
        System.out.println();
        in.close();

        if(N > 20 && N < 40) {
            System.out.println("Dream comes true!");
        }
    }
}
