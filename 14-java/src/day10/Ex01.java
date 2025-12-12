package day10;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex01 {
    public static void main(String[] args) {
        // 변수 선언
        int episode;

        // Scanner 클래스의 인스턴스 생성
        Scanner in = new Scanner(System.in);

        // 사용자 입력
        System.out.print("Enter the episode number to check: ");
        episode = in.nextInt();
        System.out.println();

        // 입력 스트림(input stream) 닫기
        in.close();

        // 현재 시각을 ms 단위로 저장하는 변수
        long startTime = System.nanoTime();

        // solution 메서드로 "종말의 숫자"를 구해 출력
        System.out.printf("The number included in the %dth episode title = %d\n",
                episode, solution(episode));

        // solution 메서드의 실행 시간을 출력
        System.out.printf("runtime = %.3fms\n",
                (System.nanoTime() - startTime) / 1000000.0);

        System.out.println();

        startTime = System.nanoTime();

        // solution 메서드로 "종말의 숫자"를 구해 출력
        System.out.printf("The number included in the %dth episode title = %d\n",
                episode, solution2(episode));

        // solution 메서드의 실행 시간을 출력
        System.out.printf("runtime = %.3fms\n",
                (System.nanoTime() - startTime) / 1000000.0);
    }

    /**
     * N번째 "종말의 숫자"를 구하는 메서드
     *
     * @param n 구하고자 하는 "종말의 숫자"의 순서
     * @return N번째 "종말의 숫자"
     */
    static int solution(int n) {
        // 매개 변수에 전달된 인자가 0보다 작거나 같으면 IllegalArgumentException 예외를 발생
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than zero.");
        }

        // 변수 선언
        int count = 0;          // "종말의 숫자"의 개수
        int num = 665;          // "종말의 숫자"를 찾기 위한 변수

        // do-while 구문으로 "666"이 들어간 숫자를 탐색
        do {
            // 변수 num을 증가
            num++;

            // 변수 num을 문자열로 변환해서 "666"을 포함하는지 검사
            if (Integer.toString(num).contains("666")) {
                count++;
            }

            // 찾은 "종말의 숫자"의 개수가 매개 변수 n과 같으면 반복문을 종료
        } while (count != n);

        // 찾은 "종말의 숫자"를 반환
        return num;
    }

    static int solution2(int n) {
        // 매개 변수에 전달된 인자가 0보다 작거나 같으면 IllegalArgumentException 예외를 발생
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than zero.");
        }

        // 스트림으로 N번째 "종말의 숫자"를 탐색
        return IntStream.iterate(1, i -> i + 1)
                .filter(num -> Integer.toString(num).contains("666"))
                .skip(n - 1)
                .findFirst()
                .orElse(0);
    }

}