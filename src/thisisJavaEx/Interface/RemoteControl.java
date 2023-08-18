package thisisJavaEx.Interface;

public interface RemoteControl {
  // public 추상 메소드
   void turnOn();
}

class Television implements RemoteControl {
  @Override
  public void turnOn() {
    System.out.println("TV를 킨다");
  }
}
