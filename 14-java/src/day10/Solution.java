package day10;

import java.util.*;
import java.util.stream.IntStream;

class Solution {

    public int[] solution(int[] arr) {
        return IntStream.range(0, arr.length)
                .filter(i -> i == 0 || arr[i] != arr[i - 1]) // 첫 원소 또는 이전 값과 다를 때만 통과
                .map(i -> arr[i])                            // 해당 인덱스의 값 추출
                .toArray();                                  // 배열로 변환
    }

}