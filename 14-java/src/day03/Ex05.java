package day03;

public class Ex05 {
    public static void main(String[] args) {
        int rows = 10;
        int spaces;
        int stars;

        for (int i = 1; i <= rows; i++) {
            spaces = rows - i;
            stars = i * 2 - 1;

//            for(int j = 1; j <= spaces; j++) System.out.print(" ");
//            for(int j = 1; j <= stars; j++) System.out.print("*");

            System.out.println(" ".repeat(spaces) + "*".repeat(stars));

            System.out.println();
        }
    }
}
