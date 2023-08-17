package chapter06;

public class Vehicle {
  String name = "탈 것";

  void whoAmI(){
    System.out.println("나는 탈 것입니다.");
  }

//  static은 상속 불가능
  static void move(){
    System.out.println("이동하다.");
  }
}

class Car extends Vehicle {
  String name = "자동차";

  void whoAmI() {
    System.out.println("나는 자동차입니다.");
  }

  static void move() {
    System.out.println("달린다.");
  }
}
  class SportsCar extends Car {
//  whoAmI 오버라이드
    void whoAmI(){
      System.out.println("나는 스포츠카 입니다.");
    }
}
