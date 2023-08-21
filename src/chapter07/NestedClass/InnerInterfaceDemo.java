package chapter07.NestedClass;

/* 3. 중첩 인터페이스 */
public class InnerInterfaceDemo implements Icon.Touchable{
/* 설계도 */
  @Override
  public void touch() {
    System.out.println("아이콘을 터치한다.");
  }

  public static void main(String[] args) {
    Icon.Touchable it = new InnerInterfaceDemo();
    it.touch();
  }
}

class Icon {
  interface Touchable {
    void touch();
  }
}

