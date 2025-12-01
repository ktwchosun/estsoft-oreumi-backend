package day02;

public class Pratice03 {
    public static void main(String[] args) {
        final int PRINCIPAL = 50000;
        final double CS_INT_RATE = 0.05;
        final double YH_INT_RATE = 0.03;

        int cs_balance = PRINCIPAL;
        int yh_balance = PRINCIPAL;
        int year = 0;

        // do-while 구문으로 영희의 잔고가 철수의 잔고보다 작거나 같은 동안 반복문을 수행
        do {
            year++;

            cs_balance += (int)(PRINCIPAL * CS_INT_RATE);
            yh_balance += (int)(yh_balance * YH_INT_RATE);

        } while(yh_balance <= cs_balance);

        System.out.printf("after %d years, cs = %d, yh = %d\n",
                year,cs_balance,yh_balance);


    }
}
