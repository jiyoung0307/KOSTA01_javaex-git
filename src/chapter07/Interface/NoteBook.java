package chapter07.Interface;

public class NoteBook extends Computer implements Portable {

  @Override
  public void inMyBag() {
    System.out.println("노트북이 내 가방에 있다.");
  }

  // Computer에서 turnOn과 turnOff를 오버라이딩한다.
  @Override
  public void turnOn() {
    System.out.println("노트북은 켠다.");
  }

  @Override
  public void turnOff() {
    System.out.println("노트북을 끈다.");
  }
}
