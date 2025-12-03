package day04;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        final int LENGTH = 30;
        int[] numbers = new int[LENGTH];
        int sum = 0;
        int length = 0;
        double average = 0;
        int aboveAverage = 0;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < LENGTH; i++) {
            System.out.print("Enter an integer: ");
            numbers[i] = in.nextInt();
            if(numbers[i] == 0) break;

            length++;
            sum += numbers[i];
        }

        in.close();

        average = (double)sum / length;

        for (int i = 0; i < length; i++) {
            if(numbers[i] > average) aboveAverage++;
        }

        System.out.println();
        System.out.println("average = " + average);
        System.out.printf("percentage fo number above the average = %g%%\n", (double)aboveAverage / length * 100);

    }
}
