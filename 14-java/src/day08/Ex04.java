package day08;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
    public static void main(String[] args) {
        final int LENGTH = 6;
        final int MAX_NUM = 45;
        Set<Integer> set = new TreeSet<>();
        Random rand = new Random();

        while (set.size() != LENGTH) {
            set.add(rand.nextInt(MAX_NUM) + 1);
        }

        System.out.println("set = " + set);
    }
}
