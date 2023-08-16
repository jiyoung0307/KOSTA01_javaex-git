package chapter05;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2Demo {
  public static void main(String[] args) {
    // 표준입력으로 학생의 점수를 입력 받아서 배열에 저장한다.
    // 학생의 수는 정해져 있지 않고, -1을 입력받을 때까지 배열에 저장한다.
    // -1이 입력되면, 현재 배열에 들어가 있는 점수의 총합과 평균을 구하라.
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<>();
//    int[] scores = new int[5];
    System.out.println("점수를 입력하세요");

    int sum = 0;
    int inputScore = 0;
    float avg = 0.0f;

    while (true) {
      inputScore = in.nextInt();
      if (inputScore <= 0) break;
      scores.add(inputScore);
    }

    for (int score : scores) {
      sum += score;
    }
    if (scores.size() == 0) {
      avg = 0;
    } else {
      avg = (float) sum / scores.size();
    }
    System.out.printf("sum = %d , avg = %.1f", sum, avg);
  }
}
