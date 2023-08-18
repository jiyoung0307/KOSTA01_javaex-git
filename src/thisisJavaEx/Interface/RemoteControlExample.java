package thisisJavaEx.Interface;

public class RemoteControlExample {
  public static void main(String[] args) {
    // 인터페이스도 하나의 변수 타입이므로 null 대입 가능
    RemoteControl rc;
    rc = new Television();
    rc.turnOn();
  }
}
