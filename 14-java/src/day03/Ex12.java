package day03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        int count = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a positive integer: ");
            num = in.nextInt();

            if(num == 0) break;

            sum += num;
            count++;

            //if (num > max) max = num;
            max = Math.max(max, num);
            //if (num < min) min = num;
            min = Math.min(min, num);

        }

        in.close();

        System.out.println();
        if (count > 0) {
            System.out.println("The maximum number: " + max);
            System.out.println("The minimum number: " + min);
            System.out.println("The average: " + (double)sum / count);
        } else {
            System.out.println("ERROR: You must enter positive integer.");
        }

    }
}
