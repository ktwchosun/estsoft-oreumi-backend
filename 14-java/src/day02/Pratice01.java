package day02;

import java.util.Scanner;

public class Pratice01 {
    public static void main(String[] args) {
        int hourlyWage;
        int hours;
        int todayWage;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the hourly wage: ");
        hourlyWage = in.nextInt();

        System.out.print("Enter the hours worked: ");
        hours = in.nextInt();
        System.out.println();

        in.close();

        if(hours > 8)
            todayWage = hourlyWage * 8 + (int)(hourlyWage * 1.5 * (hours - 8));
        else
            todayWage = hourlyWage * hours;
        System.out.printf("Today's wage is %d won.\n",todayWage);
    }
}
