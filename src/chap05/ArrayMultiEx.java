package chap05;

import java.util.Arrays;

public class ArrayMultiEx {
  public static void main(String[] args) {
    int[][] scores = { {90,100,80,70,80}, {90,100,80,70,80}, {60,60,70,80,90}};

//    객체의 배열
//    int[][] scores ;
//    scores = new int[][] { new int [5], new int [5], new int [5]};

//    초기값
    int[] sums = new int[3];
    int total = 0;

//    3번 반복
    for (int i = 0; i < scores.length ; i++) {
//      5번 반복
      for (int j = 0; j < scores[i].length; j++) {
        sums[i] += scores[i][j];
      }
        total += sums[i];
    }
    System.out.println(Arrays.toString(sums));
    System.out.println("total = " + total);
  }
}
