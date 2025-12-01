package day02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two integers: ");

        n1 = in.nextInt();
        n2 = in.nextInt();
        System.out.println();

        in.close();

        if(n1 > n2){
            System.out.printf("max - min = %d\n", n1 - n2);
        }
        else{
            System.out.printf("max - min = %d\n", n2 - n1);
        }

        int max = n1 > n2 ? n1 : n2;
        int min = n1 < n2 ? n1 : n2;

        System.out.printf("max - min = %d\n", max - min);

        // Math 클래스의 max, min 메서드로 두 값 중에 큰 수와 작은 수를 확인
        max = Math.max(n1, n2);
        min = Math.min(n1, n2);

        System.out.printf("max - min = %d\n", max - min);
    }
}
