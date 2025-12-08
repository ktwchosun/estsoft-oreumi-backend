package day07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int korean;
        int math;
        int english;
        double average;

        Scanner in = new Scanner(System.in);


        try {
            System.out.print("Enter Korean score: ");
            korean = in.nextInt();
            System.out.print("Enter Math score: ");
            math = in.nextInt();
            System.out.print("Enter English score: ");
            english = in.nextInt();
            System.out.println();


            if (korean < 0 || math < 0 || english < 0) {
                throw new NegativeScoreException();
            }
            average = (double)(korean + math + english) / 3;

            System.out.println("Average: " + average);
        } catch (NegativeScoreException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
        } catch (InputMismatchException e) {
            System.err.println("ERROR: Invalid input entered.");
        } finally {
            in.close();
        }





    }
}
