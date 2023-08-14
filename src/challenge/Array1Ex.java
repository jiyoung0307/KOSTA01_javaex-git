package challenge;

import java.util.Scanner;

public class Array1Ex {
    /*
     * 1.
     * 문자열과 문자를 매개변수 값으로 가지는 다음 메서드가 있다.
     * 문자열 s에 포함된 문자 c의 개수를 반환하도록 이 메서드를 구현하시오.
     *
     * static int countChar(String s, char c)
     */
  static int count = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char c = sc.next().charAt(0);

    System.out.println("c = " + c);
    System.out.println("countChar(s,c)) ==> " + (countChar(s,c)));
  }

  static int countChar(String s, char c) {
    for (int i = 0; i < s.length(); i++) {
      if(s.charAt(i)==c)
        count++;
    }
    return count;
  }
}
