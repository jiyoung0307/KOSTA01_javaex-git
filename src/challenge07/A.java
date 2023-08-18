package challenge07;

public class A {
  public void method1(){
    System.out.println("A-method1()");
  }
}

class B extends A {
  // 오버라이딩
  public void method1() {
    System.out.println("B-method1()");
  }
}

class C extends A {
  public void method1(){
    System.out.println("C-method1()");
  }
  public void method2(){
    System.out.println("C-method2()");
  }
}

