package day04;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        final int NUM = 100;
        final double SQRT_NUM = Math.sqrt(NUM);
        boolean[] isPrimes = new boolean[NUM + 1];

        for (int i =2; i < isPrimes.length; i++)
            isPrimes[i] = true;

        // 소수가 아닌 자연수들을 걸러냄
        for (int i = 2; i <=SQRT_NUM; i++) {
            if (isPrimes[i]) {
                // 변수 i가 소수이면, 변수 i를 제외한 i의 배수는 소수가 아니다.
                for (int j = i* i; j <= NUM; j += i) {
                    isPrimes[j] = false;
                }
            }
        }
        System.out.printf("Prime numbers between 2 and %d:\n",NUM);

        for (int i = 2; i < isPrimes.length; i++) {
            if (isPrimes[i]) System.out.printf("%d ", i);
        }

        System.out.println();


    }
}
