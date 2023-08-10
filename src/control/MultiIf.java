package control;

import java.util.Scanner;

public class MultiIf {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("점수를 입력해주세요. (0~100)");
    int score = sc.nextInt();
    String grade = "";

  if(score >= 90 && score <= 100) {
    if(score  >= 95) {
      grade = "A+";
    } else {
      grade = "A0";
    }
  } else if (score >= 80 && score < 90) {
    grade = "B";
  } else if (score >= 70 && score < 80) {
    grade = "C";
  } else if (score >= 60 && score < 70) {
    grade = "D";
  } else {
    grade = "F";
  }
    System.out.println("your grade is " + grade);

  }
}
