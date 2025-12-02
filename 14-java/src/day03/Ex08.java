package day03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("Enter two integerss: ");
            n1 = in.nextInt();
            n2 = in.nextInt();

            if(n1 == 0 && n2 == 0) break;

            System.out.printf("%d + %d = %d\n\n", n1, n2, n1 + n2);
        }
        System.out.println("Good bye!");

        in.close();
    }
}
