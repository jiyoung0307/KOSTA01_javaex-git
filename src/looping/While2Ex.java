package looping;
/*
  종료를 입력할 때까지 동물의 이름을 입력 받는다.
  입력받은 동물의 종류를 출력하라.
  while문 이용
*/
import java.util.Scanner;

public class While2Ex {
  public static void main(String[] args) {
//    나의 답
    while (true) {
      System.out.println("동물을 입력해주세요");
      Scanner sc = new Scanner(System.in);
      String bio = sc.nextLine();
      String kind = null;

      if(bio.equals("종료")||bio.equals("exit")) {
        break;
      }

      if (bio.equals("호랑이") || bio.equals("사자")) {
        kind = "포유류";
      } else if (bio.equals("독수리") || bio.equals("참새")) {
        kind = "조류";
        System.out.printf("%s는 %s입니다.\n", bio, kind);
      } else {
        System.out.println("입력하신 데이터가 없습니다. 다시 입력하세요.");
      }

//      강사님 답
//      Scanner in = new Scanner(System.in);
//      String bio = "", kind ="";
//
//      while(true){
//        System.out.println("\n동물의 이름 입력하세요. (종료를 누르면 종료됩니다.)");
//        bio = in.next();
//        if(bio.equals("종료")) break;
//
//        switch (bio) {
//          case "호랑이","사자"-> kind = "포유류";
//          case "독수리","참새"-> kind = "조류";
//          default -> kind = "해당없음";
//        }
//        System.out.printf("%s는 %s입니다.\n", bio, kind);
    }
  }
}
