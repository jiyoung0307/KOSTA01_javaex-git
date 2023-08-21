package chapter07.Interface;

// 부모의 필드를 쓸 수 있다.
public class Coin2Demo implements Coin{
  // implements
  // 부모 객체는 선언만 하며 정의(내용)은 자식에서
  // 오버라이딩 (재정의) 해서 사용해야함
  public static void main(String[] args) {
    System.out.println("Dime은 " + DIME + "센트 입니다.");
  }
}
