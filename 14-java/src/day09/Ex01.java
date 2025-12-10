package day09;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // 변수 선언
        int num;

        // Scanner 클래스의 인스턴스 생성
        Scanner in = new Scanner(System.in);

        // 사용자 입력
        System.out.print("Enter a positive integer greater than 1: ");
        num = in.nextInt();
        System.out.println();

        // 입력 스트림(input stream) 닫기
        in.close();

        // factorial 함수로 변수 num의 팩토리얼을 구해 출력
        System.out.printf("Factorial %d = %d\n", num, factorial(num));
    }

    public static long factorial(int n) {

        // 조건 연산자로 위 두 문장을 간단하게 작성
        return n == 1 ? 1 : n * factorial(n - 1);
    }
}