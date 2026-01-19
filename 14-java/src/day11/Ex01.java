package day11;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        final String s = "banana";

        System.out.println(Arrays.toString(solution(s)));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            answer[i] = -1;

            for(int j = i - 1; j >= 0 ; j--){
                if(s.charAt(j) == s.charAt(i)){
                    answer[i] = i - j;
                    break;
                }
            }
        }

        return answer;

    }
}
