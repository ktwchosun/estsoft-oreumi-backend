package day03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("Enter a positive integer: ");
            n = in.nextInt();

            if(n == 0) break;
            sum += n;

        }
        in.close();

        System.out.println();
        System.out.println("sum = " + sum);
    }
}
