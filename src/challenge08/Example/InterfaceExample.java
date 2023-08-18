package challenge08.Example;

public class InterfaceExample {
  public static void main(String[] args) {
//    방법 1)
//    A a = new A();
//    B b = new B();
//    a.method1();
//    b.method1();

//  방법 2)
    InterfaceA ia = new A();  // 자식 객체를 만들어서 인터페이스 할당
    ia.method1();

    ia = new B();             // B 대입
    ia.method1();
  }
}
