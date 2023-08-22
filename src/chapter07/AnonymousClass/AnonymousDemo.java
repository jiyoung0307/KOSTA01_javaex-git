package chapter07.AnonymousClass;

class AnonymousDemo {
//  익명클래스(Anonymous class) = 클래스의 선언과 객체의 생성을 동시에 하는 이름 없는 클래스(일회용)
  public static void main(String[] args) {
    // 익명 클래스는 단독 생성이 불가능하다.
    // 이름이 없는 객체는 new를 생성해서 만들 수 없다.
    // 필드를 초기화하거나 매개값으로 주거나
    // 로컬변수를 초기화할때 직접 적어서 할 수도 있다.
    Parent p = new Parent() {   // 본인의 이름이 없으니 부모의 이름을 빌려서 자식을 만들어보자

//      @Override
//      public void parent() {
//        System.out.println("익명클래스에서 구현한 메소드");
//      }
    };
    p.parent();
  }
}

//class OnlyOnce implements Parent {
//
//  @Override
//  public void parent() {
//    System.out.println("parent");
//  }
//}

// 이름이 있는 경우
//interface Parent {
//  void parent();
//}

class Parent{
  void parent(){
    System.out.println("parent");
  }
}