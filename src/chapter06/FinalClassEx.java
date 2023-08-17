package chapter06;

public class FinalClassEx {
  /*
   * final
   * final클래스는 클래스 내부의 모든 메서드를 오버라이딩할 수 없다. 특정 메서드만 오버라이딩하지 않도록 하려면 final 메서드로 선언
   */

  public static void main(String[] args) {
    new Good();
    new Best();
    new Better();
  }
}

class Good {

}

class Better extends Good {

}

final class Best extends Better {

}

/* Best는 final이므로 상속 받을 수 없음 */
//class Excellent extends Best {}
