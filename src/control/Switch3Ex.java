package control;

import java.util.Scanner;

public class Switch3Ex {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("동물의 이름을 입력해주세요");
    String bio = in.nextLine();
    String kind = null;

    if(bio.equals("호랑이") || bio.equals("사자")) {
      kind = "포유류";
    } else if (bio.equals("독수리") || bio.equals("참새")) {
      kind = "조류";
    }
    System.out.printf("%s는 %s입니다.\n", bio, kind);

    System.out.println("\n동물의 이름을 입력해라");
    bio = in.nextLine();

//    참조형 데이터는 초기값이 없으면 null이 들어가므로 빈 객체로 초기화를 해라
//    NullPointerException 발생
    kind = "";
    switch (bio) {
      case "호랑이":
      case "사자":
        kind = "포유류";
        break;
      case "참새":
      case "독수리":
        kind = "조류";
        break;
      default:
        kind = "해당없음";
    }
    System.out.printf("%s는 %s입니다.\n %d 글자입니다.\n", bio, kind, kind.length());
  }
}
