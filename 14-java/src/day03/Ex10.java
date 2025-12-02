package day03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int treeHeight;
        int riseDay;
        int slidingNight;

        int snailHeight = 0;
        int days = 0 ;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the tree height: ");
        treeHeight = in.nextInt();
        System.out.print("Enter the height that rises during the day: ");
        riseDay = in.nextInt();
        System.out.print("Enter the sliding height at night: ");
        slidingNight = in.nextInt();
        System.out.println();

        in.close();

        if (slidingNight >= riseDay){
            System.out.println("ERROR : THE snail can never reach the top of tree.");
            return;
        }
        while (true) {
            days++;

            snailHeight += riseDay;

            if(snailHeight >= treeHeight) break;

            snailHeight -= slidingNight;
        }

        System.out.printf("It takes %d days for the snail to climb the trees.\n", days);

    }
}
