package control;

import java.util.Scanner;

public class SimpleIf {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("숫자를 입력해주세요.");

//    ctrl + alt + v
    int num = sc.nextInt();
//    if (num % 2 == 0) {
//      System.out.println("짝수입니다.");
//    }
//
//    if (num % 2 == 1) {
//      System.out.println("홀수입니다.");
//    }

    if(num % 2 == 0) {
      System.out.println("num = " + num + "짝수입니다.");
    } else {
      System.out.println("num = " + num + "홀수입니다.");
    }

  }
}
