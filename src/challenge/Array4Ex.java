package challenge;

import java.util.Scanner;

public class Array4Ex {
  public static void main(String[] args) {
    /*
    * 4.
    * 다음과 같이 키보드에서 URL을 입력받은 후 'com'으로 끝나는지, 'java'를 포함하는지
    * 조사하는 프로그램을 작성하시오. 'bye'를 입력하면 프로그램은 종료된다.
    *
    * URL을 입력하세요:www.java.com
    * www.java.com은 'com'으로 끝납니다.
    * www.java.com은 'java'를 포함합니다.
    *
    * URL을 입력하세요:bye
    */
    String url;

    String s1 = "bye";
    String s2 = "com";
    String s3 = "java";

    do{
      System.out.printf("URL을 입력하세요 : (종료하려면 bye 입력)");
      Scanner sc = new Scanner(System.in);
      url = sc.next();

      if(url.endsWith(s2)) {
        System.out.println(url + "는(은)" + s2 + "로 끝납니다.");
      }
      if(url.contains(s3)) {
        System.out.println(url + "는(은)" + s3 + "를 포함합니다.");
      }
    } while (!url.equals(s1));

  }
}
