package chapter07.Interface;

public class TV implements Controllable, RemoteControllable {

//  구현부라도 가지고 있어야 오류가 발생하지 않음
  @Override
  public void turnOn() {
    System.out.println("TV를 켠다.");
  }

  @Override
  public void turnOff() {
    System.out.println("TV를 끈다.");
  }

  @Override
  public void RemoteOn() {
    System.out.println("리모컨으로 TV를 켠다.");
  }

  @Override
  public void RemoteOff() {
    System.out.println("리모컨으로 TV를 끈다.");
  }

  @Override
  public void repair() {
    System.out.println("TV를 수리한다.");
  }
}
