package chapter07.AnonymousClass;

public class EagleTest {
  public static void main(String[] args) {
//    Eagle e = new Eagle();
//    e.fly();
    ABird ab = new ABird(){
      // 클래스의 생성과 선언을 동시에 진행(anonymous)
      void fly(){
        System.out.println("anonymous로 구현 : 독수리가 날아간다.");
      }
    };

    ab.fly();
  }
}
// 이름이 있을 때
//class Eagle extends ABird {
//  @Override
//  void fly() {
//    System.out.println("non-anonymous로 구현 : 독수리가 날아간다.");
//  }
//}
