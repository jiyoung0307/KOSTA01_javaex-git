package chapter07.NestedClass;

/* 2. 지역 클래스 */
public class LocalClassDemo {
  // 멤버 - 필드
  private String s1 = "외부";
  // 멤버 - 메서드
  void method1(){
    // 지역 변수
    int x = 1;
    // 지역 클래스

    /* 설계도 */
    class LocalClass{
      // 멤버 - 필드
      String s2 = "내부";
      // 멤버 - 메소드
      public void show() {
        System.out.println("지역 클래스");
      }
    }

    LocalClass lc = new LocalClass();
    System.out.println(lc.s2);
    lc.show();

  }
  // 멤버 - static 메소드
  public static void main(String[] args) {
    LocalClassDemo lcd = new LocalClassDemo();
    lcd.method1();

  }
}
