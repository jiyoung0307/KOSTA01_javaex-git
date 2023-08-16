package chapter05;

import java.util.Arrays;

public class FindMax {
  public static void main(String[] args) {
    int[] numbers = {2, 10, 3, 1, 8};
    int max = numbers[0];

    /* 1부터 읽어야하므로 for문 사용 (알고리즘 사용) */
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > max) max = numbers[i];
    }
    System.out.println("max = " + max);
    System.out.println("Arrays.toString(numbers) before sort = " + Arrays.toString(numbers));

//    Array에게 정렬시킴 (생산성 good / 코딩테스트에서 선호)
    Arrays.sort(numbers);
    System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
    System.out.println("max = " + numbers[numbers.length-1]);
  }
}
