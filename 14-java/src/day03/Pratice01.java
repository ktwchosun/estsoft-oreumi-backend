package day03;

import java.util.Scanner;

public class Pratice01 {
    public static void main(String[] args) {
        int num;
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer greater than 1: ");
        num = in.nextInt();
        System.out.println();

        in.close();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + "is a Prime number");
        } else {
            System.out.println(num + "is not a Prime number");
        }


        isPrime = true;
        // Math 클래스의 sqrt 메서드로 변수 num의 제곱근을 구함
        double sqrt_num = Math.sqrt(num);

        for (int i = 2; i <= sqrt_num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + "is a Prime number");
        } else {
            System.out.println(num + "is not a Prime number");
        }
    }
}
