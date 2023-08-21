package thisisJavaEx.Interface;

import chapter07.A;

public class RemoteControlExample {
  public static void main(String[] args) {
    // 인터페이스도 하나의 변수 타입이므로 null 대입 가능
    RemoteControl rc;

    // rc 변수에 Television 객체 대입
    rc = new Television();
    rc.turnOn();

    // rc 변수에 Audio 객체를 대입(교체시킴)
    rc = new Audio();
    rc.turnOn();
  }
}
