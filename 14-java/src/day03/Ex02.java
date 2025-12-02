package day03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        for(int i = 1 ; i <= 9 ; i++){
            for(int j = 2 ; j <= 9 ; j++){
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }
    }
}
