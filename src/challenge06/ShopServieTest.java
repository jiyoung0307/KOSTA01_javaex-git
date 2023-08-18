package challenge06;


// chap06 클래스
// p280 18

public class ShopServieTest {
  public static void main(String[] args) {

    // new를 사용할 수 없는 경우 getInstance의 도움을 받자
    ShopService s1 = ShopService.getInstance();   // 동일 객체
    ShopService s2 = ShopService.getInstance();   // 동일 객체
    Object o1 = new Object();   // 다른 객체
    Object o2 = new Object();   // 다른 객체

// 동일 객체일 경우
//    if(s1 == s2) {
//      System.out.println("같은 ShopService 객체입니다.");
//    } else {
//      System.out.println("다른 ShopService 객체입니다");
//    }

    // 다른 객체일 경우
    if (o1 == o2) {
      System.out.println("같은 ShopService 객체입니다.");
    } else {
      System.out.println("다른 ShopService 객체입니다");
    }
  }
}
