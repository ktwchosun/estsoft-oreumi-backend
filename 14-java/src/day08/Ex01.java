package day08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        final int LENGTH = 6;
        final int MAX_NUM = 45;
        int [] numbers = new int[LENGTH];
        Random rand = new Random();

        for (int i = 0; i < LENGTH; i++) {
            // 1부터 45사이의 임의의 자연수를 생성
            int num = rand.nextInt(MAX_NUM) + 1;

            // 생성한 임의의 자연수가 배열 numbers에 포함되어 있는지 확인
            if (inArray(numbers, num)) {
                // 생성한 임의의 자연수가 배열 numbers에 포함되어 있으면,
                // 인덱스 변수 i를 1만큼 감소시켜 for 구문을 한 번 더 실행
                i--;
            } else  {
                numbers[i] = num;
            }
        }

        // sort 메서드로 배열 numbers 원소들을 오름차순으로 정렬
        Arrays.sort(numbers);

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println();

        System.out.print("numbers = ");

        for (int item : numbers) {
            System.out.print(" " + item);
        }
        System.out.println();
        System.out.println();

        // 배열을 문자열로 변환해서 replaceAll 메서드로 대괄호와 쉼표(,)를 제거
        String result = Arrays.toString(numbers)
                .replaceAll("[\\[\\],]", "");

        System.out.println("numbers = " + result);


    }
    public static boolean inArray(int[] array, int value) {
        for (int item : array) {
            if (item == value) return true;
        }

        return false;
    }
}
