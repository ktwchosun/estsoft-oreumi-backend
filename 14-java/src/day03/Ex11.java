package day03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int num;
        int hours;
        int minutes;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter minutes: ");
            num = in.nextInt();

            if(num == 0) break;

            hours = num / 60;
            minutes = num % 60;

            System.out.printf("%d minutes = ", num);
            /*
            if (hours == 1)
                System.out.printf("%d hour", hours);
            else if (hours > 1)
            System.out.printf("%d hours", hours);

            if (minutes == 1)
                System.out.printf("%d minute", minutes);
            else if (minutes > 1)
                System.out.printf("%d minutes", minutes);
            */

            if (hours >= 1)
                System.out.printf("%d %s ",hours, hours > 1 ? "hours" : "hour");

            if (minutes >= 1)
                System.out.printf("%d %s ",minutes, minutes > 1 ? "minutes" : "minute");

            System.out.println("\n");



        }
        System.out.println("Good bye!");

        in.close();
    }
}
