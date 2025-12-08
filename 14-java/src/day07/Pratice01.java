package day07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pratice01 {
    public static void main(String[] args) {
        int korean, math, english;
        double average;
        Scanner in = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter Korean score: ");
                korean = in.nextInt();

                System.out.print("Enter Math score: ");
                math = in.nextInt();

                System.out.print("Enter English score: ");
                english = in.nextInt();
                System.out.println();

                if (korean < 0 || math < 0 || english < 0)
                    throw new NegativeScoreException();

                else if (korean > 100 || math > 100 || english > 100)
                    throw new InvalidScoreException();

                average = (korean + math + english) / 3.0;
                System.out.printf("Average: %.1f\n", average);
                break;

            } catch (NegativeScoreException | InvalidScoreException e) {
                System.out.println("ERROR: " + e.getMessage());
                System.out.println("Try again.");
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("ERROR: Wrong input entered.");  // e.getMessage() 가 null 로 정의되지 않았음으로 직접 출력.

                System.out.println("Try again.");
                System.out.println();
                in.nextLine();      // 버퍼를 비워야 입력되었던 오류 값이 해제됨.
            }
        }

        in.close();
    }
}