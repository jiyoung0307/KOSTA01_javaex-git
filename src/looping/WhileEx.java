package looping;

public class WhileEx {
  public static void main(String[] args) {
//    * while문
//        - 조건을 만족시키는 동안 블록 { }을 반복함
//        - 반복 횟수를 모를 때 사용

//    for(int i = 0; i < 10; i++) {
//      System.out.println("Hello world! " + (i+1));
//    }

//    int i = 0;
//    while(i < 10) {
//      System.out.println("Hello world! " + (i+1));
//      i++;
//    }

    int i = 0;
    while(true) {
      System.out.println("Hello world! " + (i+1));
      i++;
      if(i == 10) {
        break;
      }
    }
  }
}
