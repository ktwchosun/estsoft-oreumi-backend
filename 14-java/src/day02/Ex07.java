package day02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int N1;
        int N2;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two positive integers: ");
        N1 = in.nextInt();
        N2 = in.nextInt();
        System.out.println();

        in.close();

        if(N1 % N2 == 0){
            System.out.printf("%d is a multiple of %d\n", N1, N2);
        }
        else if(N2 % N1 == 0){
            System.out.printf("%d is a factor of %d\n", N1, N2);
        }
        else{
            System.out.printf("%d is neither a factor of %d nor a multiple\n", N1, N2);
        }
    }
}
