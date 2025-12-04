package day05;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your favorite number: ");
        num = in.nextInt();
        System.out.println();
        in.close();

        printNumber(num);
    }

    public static void printNumber(int num){
        System.out.printf("My favorite number is %d\n",num);
    }
}


