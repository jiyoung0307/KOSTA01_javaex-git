package challengeCh05;

import chapter05.Grade;

import java.util.Arrays;
import java.util.Scanner;

public class EnumScoreTest {
  public static void main(String[] args) {
    int numOfStudent = 0;
//    상수 객체의 주소가 들어가야 하므로
    Grade grade;
//    int[] scores;
    Scanner in = new Scanner(System.in);
    System.out.println("학생의 수를 입력하세요 : ");
    numOfStudent = in.nextInt();

    int[] scores = new int[numOfStudent];

    for (int i = 0; i < numOfStudent; i++) {
      System.out.println("학생의 점수를 입력하세요 : ");
      scores[i] = in.nextInt();
    }
    System.out.println(Arrays.toString(scores));
    for (int i = 0; i < scores.length; i++) {
      if(scores[i] >= 90) {
        grade = Grade.A;
      } else if (scores[i] >= 80) {
        grade = Grade.B;
      } else {
        grade = Grade.C;
      }
      System.out.printf("%d 번째 학생의 점수는 %d , 등급은 %s(%s) 입니다.\n", i+1,scores[i], grade, grade.getGrade());
    }
  }
}
